package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;

import org.knowm.xchart.BitmapEncoder;
import org.knowm.xchart.BitmapEncoder.BitmapFormat;
import org.knowm.xchart.PieChart;
import org.knowm.xchart.PieChartBuilder;
import org.knowm.xchart.style.PieStyler.AnnotationType;
import org.knowm.xchart.style.Styler.ChartTheme;

import controller.DetailManagementService;
import controller.ProductManagementService;
import model.Detail;
import model.Member;
import model.OrderingDAO;
import model.Product;
import model.ProductDAO;

import java.awt.Font;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.IOException;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;

public class CEProductAnalysis {
	DetailManagementService service = new DetailManagementService();
	ProductManagementService serviceP = new ProductManagementService();

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
	public CEProductAnalysis(Member loginUser) {
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

		lblNewLabel_1 = new JLabel("\uC0C1\uD488 \uAE30\uC900");
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
		panel_1.setBounds(12, 159, 406, 592);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 25, 382, 542);
		panel_1.add(scrollPane);

		ArrayList<Detail> listCnt = service.detailLookup();
		ArrayList<Product> ProductCnt = serviceP.productLookup();
		int[] dataCnt = new int[ProductCnt.size()];
		for (int i = 0; i < listCnt.size(); i++) {
			d = listCnt.get(i);
			for (int j = 0; j < ProductCnt.size(); j++) {

				if (d.getPRO_NUM() == j + 1) {
					dataCnt[j] += d.getDE_AMOUNT();
				}

			}
		}

		// 컬럼이름 복사, 데이터 복사
		String[] columnNames = { "상품 이름", "판매 수량" };
		Object[][] data = new Object[dataCnt.length][2];
		int cnt = 0;
		
		for (int i = 0; i < dataCnt.length; i++) {
			if (dataCnt[i] != 0) {
				data[cnt++] = new Object[] { ProductCnt.get(i).getPRO_NAME(), dataCnt[i] };
			}
		}
		Object[][] data2 = new Object[cnt][2];
		for(int i=0; i<cnt;i++) {
			data2[i] = data[i];
		}

		table = new JTable(data2, columnNames);
		scrollPane.setViewportView(table);
		// DefaultTableCellHeaderRenderer 생성 (가운데 정렬을 위한)
		DefaultTableCellRenderer tScheduleCellRenderer = new DefaultTableCellRenderer();

		// DefaultTableCellHeaderRenderer의 정렬을 가운데 정렬로 지정
		tScheduleCellRenderer.setHorizontalAlignment(SwingConstants.CENTER);

		// 정렬할 테이블의 ColumnModel을 가져옴
		TableColumnModel tcmSchedule = table.getColumnModel();

		// 반복문을 이용하여 테이블을 가운데 정렬로 지정
		for (int i = 0; i < tcmSchedule.getColumnCount(); i++) {
		tcmSchedule.getColumn(i).setCellRenderer(tScheduleCellRenderer);
		}

		panel_3 = new JPanel();
		panel_3.setBackground(Color.DARK_GRAY);
		panel_3.setBounds(430, 159, 742, 592);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);

		PieChart chart = new PieChartBuilder().width(1200).height(2400).title("상품기준 판매비율").theme(ChartTheme.GGPlot2)
				.build();

		// Customize Chart
		chart.getStyler().setLegendVisible(false);
		chart.getStyler().setAnnotationType(AnnotationType.LabelAndPercentage);
		chart.getStyler().setAnnotationDistance(1.15);
		chart.getStyler().setPlotContentSize(.7);
		chart.getStyler().setStartAngleInDegrees(90);

		// Series
		for (int i = 0; i < dataCnt.length; i++) {
			if (dataCnt[i] != 0) {
				chart.addSeries(ProductCnt.get(i).getPRO_NAME(), dataCnt[i]);
			}
		}

		// save it in high-res
		try {
			BitmapEncoder.saveBitmapWithDPI(chart,
					this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//Sample_Chart_300_DPI",
					BitmapFormat.PNG, 38);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);

		String imgPathChart = this.getClass().getResource(".").getPath()
				+ "..//..//CoffeEyaIMG//Sample_Chart_300_DPI.png";
		ImageIcon iconChart = new ImageIcon(imgPathChart);
		lblNewLabel_3.setIcon(iconChart);
		lblNewLabel_3.setBounds(12, 25, 718, 539);
		panel_3.add(lblNewLabel_3);
	}
}
