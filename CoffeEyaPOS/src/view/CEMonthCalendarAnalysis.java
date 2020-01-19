package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.SwingConstants;

import org.knowm.xchart.BitmapEncoder;
import org.knowm.xchart.BitmapEncoder.BitmapFormat;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;
import org.knowm.xchart.XYSeries.XYSeriesRenderStyle;
import org.knowm.xchart.style.Styler.ChartTheme;
import org.knowm.xchart.style.Styler.LegendPosition;

import controller.DetailManagementService;
import controller.MemberManagementService;
import model.Detail;
import model.Member;
import model.Ordering;
import model.OrderingDAO;

import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import java.io.IOException;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

import javax.swing.JButton;
import javax.swing.ImageIcon;

public class CEMonthCalendarAnalysis {
	DetailManagementService serviceD = new DetailManagementService();
	MemberManagementService serviceM = new MemberManagementService();

	private JFrame frame;
	private JPanel panel;
	private JPanel panel_2;
	private JPanel panel_3;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_3;
	private Member loginUser;
	private String infoYear;
	private String infoMonth;
	private JPanel panel_1;

	/**
	 * Create the application.
	 */
	public CEMonthCalendarAnalysis(Member loginUser, String infoYear, String infoMonth) {
		this.loginUser = loginUser;
		this.infoYear = infoYear;
		this.infoMonth = infoMonth;
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(lblNewLabel);

		panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(12, 10, 1160, 92);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		lblNewLabel_1 = new JLabel("\uB0A0\uC9DC \uAE30\uC900");
		lblNewLabel_1.setBounds(12, 19, 1058, 57);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 26));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);

		panel_2 = new JPanel();
		panel_2.setBackground(new Color(204, 153, 102));
		panel_2.setBounds(12, 19, 1058, 57);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		String imgPath3 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//bback.png";
		ImageIcon icon3 = new ImageIcon(imgPath3);
		panel_1 = new JPanel(){
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(icon3.getImage(), 0, 0, panel_1.getWidth(), panel_1.getHeight(), null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.dispose();
			}
		});
		
		panel_1.setBounds(1092, 19, 56, 57);
		panel.add(panel_1);

		OrderingDAO daoO = new OrderingDAO();
		ArrayList<Detail> listCnt = serviceD.detailLookup();
		Detail d = new Detail();
		Ordering o = new Ordering();
		int[] dataCnt = new int[31];
		int cnt = 0;
		for (int i = 0; i < listCnt.size(); i++) {
			// 모든 거래상세정보
			d = listCnt.get(i);
			// 모든 거래상세정보에서 주문정보로 가져오기
			o = daoO.getInfoOrdering(d);

			String OR_DATE = o.getOR_DATE();
			String dateYear = OR_DATE.substring(0, 4);
			String dateMonth = OR_DATE.substring(5, 7);
			if (dateYear.equals(infoYear) && dateMonth.equals(infoMonth)) {
				int date = Integer.parseInt(OR_DATE.substring(8, 10)) - 1;
				dataCnt[date] += d.getDE_AMOUNT();
			}
			cnt++;
		}

		panel_3 = new JPanel();
		panel_3.setBackground(Color.DARK_GRAY);
		panel_3.setBounds(12, 112, 1160, 639);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);

		XYChart chart = new XYChartBuilder().width(2000).height(800).title("날짜기준 판매비율").xAxisTitle("월일")
				.yAxisTitle("판매 수량").theme(ChartTheme.GGPlot2).build();

		// Customize Chart
		chart.getStyler().setLegendPosition(LegendPosition.InsideNE);
		chart.getStyler().setAxisTitlesVisible(false);
		chart.getStyler().setDefaultSeriesRenderStyle(XYSeriesRenderStyle.Area);

		// Series
		double[] dbleDataCnt = new double[31];
		for (int i = 0; i < 31; i++) {
			dbleDataCnt[i] = (double) dataCnt[i];
		}

		chart.addSeries("판매 수량", new double[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
				21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31 }, dbleDataCnt);

		// save it in high-res
		try {
			BitmapEncoder.saveBitmapWithDPI(chart,
					this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//Sample_Chart3_300_DPI",
					BitmapFormat.PNG, 40);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);

		String imgPathChart = this.getClass().getResource(".").getPath()
				+ "..//..//CoffeEyaIMG//Sample_Chart3_300_DPI.png";
		ImageIcon iconChart = new ImageIcon(imgPathChart);
		lblNewLabel_3.setIcon(iconChart);
		lblNewLabel_3.setBounds(26, 10, 1107, 619);
		panel_3.add(lblNewLabel_3);
	}
}
