package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.SwingConstants;

import org.knowm.xchart.BitmapEncoder;
import org.knowm.xchart.BitmapEncoder.BitmapFormat;
import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.PieChart;
import org.knowm.xchart.PieChartBuilder;
import org.knowm.xchart.style.PieStyler.AnnotationType;
import org.knowm.xchart.style.Styler.ChartTheme;
import org.knowm.xchart.style.Styler.LegendPosition;

import controller.DetailManagementService;
import controller.MemberManagementService;
import controller.ProductManagementService;
import model.Detail;
import model.Member;
import model.Ordering;
import model.OrderingDAO;
import model.Product;

import java.awt.Font;
import java.util.ArrayList;
import java.io.IOException;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;

public class CESellerAnalysis {
	DetailManagementService serviceD = new DetailManagementService();
	MemberManagementService serviceM = new MemberManagementService();

	private JFrame frame;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JTable table;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_3;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private Member loginUser;

	/**
	 * Create the application.
	 */
	public CESellerAnalysis(Member loginUser) {
		this.loginUser = loginUser;
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

		btnNewButton = new JButton("");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		btnNewButton.setBounds(1138, 10, 34, 34);
		frame.getContentPane().add(btnNewButton);

		panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(12, 54, 1160, 95);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		lblNewLabel_1 = new JLabel("\uD310\uB9E4\uC790 \uAE30\uC900");
		lblNewLabel_1.setBounds(12, 19, 1136, 57);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 26));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);

		panel_2 = new JPanel();
		panel_2.setBackground(new Color(204, 153, 102));
		panel_2.setBounds(12, 19, 1136, 57);
		panel.add(panel_2);
		panel_2.setLayout(null);

		Detail d = new Detail();

		panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(12, 159, 1160, 110);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 10, 1136, 90);
		panel_1.add(scrollPane);

		OrderingDAO daoO = new OrderingDAO();
		ArrayList<Detail> listCnt = serviceD.detailLookup();
		ArrayList<Member> MemberCnt = serviceM.memberLookup();
		int[] dataCnt = new int[MemberCnt.size()];
		for (int i = 0; i < listCnt.size(); i++) {
			d = listCnt.get(i);
			String MEM_ID = daoO.getInfoOrdering(d).getMEM_ID();
			for (int j = 0; j < MemberCnt.size(); j++) {

				if (MEM_ID.equals(MemberCnt.get(j).getMEM_ID())) {
					dataCnt[j] += d.getDE_AMOUNT();
				}

			}
		}

		// 컬럼이름 복사, 데이터 복사
		String[] columnNames = { "차트 번호", "판매자 이름", "판매 수량" };
		Object[][] data = new Object[dataCnt.length - 1][3];
		int cnt = 0;
		for (int i = 0; i < dataCnt.length; i++) {
			if (dataCnt[i] != 0) {
				data[cnt] = new Object[] { 1 + cnt++, MemberCnt.get(i).getMEM_ID(), dataCnt[i] };
			}
		}
		Object[][] data2 = new Object[cnt][2];
		for (int i = 0; i < cnt; i++) {
			data2[i] = data[i];
		}

		table = new JTable(data2, columnNames);
		scrollPane.setViewportView(table);

		panel_3 = new JPanel();
		panel_3.setBackground(Color.DARK_GRAY);
		panel_3.setBounds(12, 279, 1160, 472);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);

		CategoryChart chart = new CategoryChartBuilder().width(2000).height(800).title("판매자기준 판매비율").xAxisTitle("판매자")
				.yAxisTitle("판매 수량").theme(ChartTheme.GGPlot2).build();

		// Customize Chart
		chart.getStyler().setLegendPosition(LegendPosition.InsideNW);
		chart.getStyler().setHasAnnotations(true);

		// Series
		int cnt2 = 0;
		for (int i = 0; i < dataCnt.length; i++) {
			if (dataCnt[i] != 0) {
				cnt2++;
			}
		}
		int cnt3 = 0;
		int[] arr1 = new int[cnt2];
		int[] arr2 = new int[cnt2];
		for (int i = 0; i < dataCnt.length; i++) {
			arr1[cnt3] = cnt3 + 1;
			if (dataCnt[i] != 0) {
				arr2[cnt3++] = dataCnt[i];
			}
		}

		chart.addSeries("판매 수량", arr1, arr2);

		// save it in high-res
		try {
			BitmapEncoder.saveBitmapWithDPI(chart,
					this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//Sample_Chart2_300_DPI",
					BitmapFormat.PNG, 40);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		lblNewLabel_3 = new JLabel("");

		String imgPathChart = this.getClass().getResource(".").getPath()
				+ "..//..//CoffeEyaIMG//Sample_Chart2_300_DPI.png";
		ImageIcon iconChart = new ImageIcon(imgPathChart);
		lblNewLabel_3.setIcon(iconChart);
		lblNewLabel_3.setBounds(26, 26, 1107, 424);
		panel_3.add(lblNewLabel_3);
	}
}
