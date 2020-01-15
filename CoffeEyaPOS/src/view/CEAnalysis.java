package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;

import org.knowm.xchart.BitmapEncoder;
import org.knowm.xchart.BitmapEncoder.BitmapFormat;
import org.knowm.xchart.PieChart;
import org.knowm.xchart.PieChartBuilder;
import org.knowm.xchart.style.PieStyler.AnnotationType;
import org.knowm.xchart.style.Styler.ChartTheme;

import controller.DetailManagementService;
import controller.ProductManagementService;
//github.com/zz962123/CoffeEya.git
import model.Detail;
import model.Member;
import model.OrderingDAO;
import model.Product;
import model.ProductDAO;

public class CEAnalysis {
	DetailManagementService service = new DetailManagementService();
	ProductManagementService serviceP = new ProductManagementService();

	private JFrame frame;
	private JPanel panel;
	private JPanel panel_5;
	private JTable table;
	private Member loginUser;

	/**
	 * Create the application.
	 */
	public CEAnalysis(Member loginUser) {
		this.loginUser = loginUser;
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		int sum = 0;
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(lblNewLabel);

		JButton btnNewButton = new JButton("");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CEMain main = new CEMain(loginUser);
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

		JLabel lblNewLabel_1 = new JLabel("\uAE08\uC77C \uD310\uB9E4\uB300\uAE08");
		lblNewLabel_1.setBounds(12, 19, 195, 57);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 26));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(204, 153, 102));
		panel_2.setBounds(12, 19, 195, 57);
		panel.add(panel_2);
		panel_2.setLayout(null);

		ArrayList<Detail> listTemp = service.detailLookup();

		ProductDAO daoSum = new ProductDAO();
		for (int i = 0; i < listTemp.size(); i++) {
			Detail d = listTemp.get(i);
			int PRO_PRICE = daoSum.getInfoProduct(d).getPRO_PRICE();
			sum += PRO_PRICE * d.getDE_AMOUNT();
		}
		JLabel lblNewLabel_2 = new JLabel(Integer.toString(sum) + " 원");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 26));
		lblNewLabel_2.setBounds(249, 10, 273, 75);
		panel.add(lblNewLabel_2);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(12, 159, 594, 592);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 23, 536, 542);
		panel_1.add(scrollPane);

		// 컬럼이름 복사, 데이터 복사
		String[] columnNames = { "주문 번호", "상품 이름", "단일 가격", "판매 수량", "결제 수단", "판매 사원", "판매 날짜" };
		ArrayList<Detail> list = service.detailLookup();

		Object[][] data = new Object[list.size()][7];
		ProductDAO daoP = new ProductDAO();
		OrderingDAO daoO = new OrderingDAO();
		for (int i = 0; i < list.size(); i++) {
			Detail d = list.get(i);
			String PRO_NAME = daoP.getInfoProduct(d).getPRO_NAME();
			int PRO_PRICE = daoP.getInfoProduct(d).getPRO_PRICE();
			String OR_PAY = daoO.getInfoOrdering(d).getOR_PAY();
			String MEM_ID = daoO.getInfoOrdering(d).getMEM_ID();
			String OR_DATE = daoO.getInfoOrdering(d).getOR_DATE();
			data[i] = new Object[] { d.getOR_NUM(), PRO_NAME, PRO_PRICE, d.getDE_AMOUNT(), OR_PAY, MEM_ID, OR_DATE };
			sum += PRO_PRICE * d.getDE_AMOUNT();
		}
		table = new JTable(data, columnNames);
		scrollPane.setViewportView(table);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.DARK_GRAY);
		panel_3.setBounds(618, 159, 554, 592);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);

		ArrayList<Detail> listCnt = service.detailLookup();
		ArrayList<Product> ProductCnt = serviceP.productLookup();

		int[] dataCnt = new int[ProductCnt.size()];
		for (int i = 0; i < listCnt.size(); i++) {
			Detail d = listCnt.get(i);
			for (int j = 0; j < ProductCnt.size(); j++) {

				if (d.getPRO_NUM() == j + 1) {
					dataCnt[j] += d.getDE_AMOUNT();
				}

			}
		}

		PieChart chart = new PieChartBuilder().width(900).height(900).title("상품별 판매비율").theme(ChartTheme.GGPlot2)
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
					BitmapFormat.PNG, 40);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		JLabel lblNewLabel_3 = new JLabel("");

		String imgPathChart = this.getClass().getResource(".").getPath()
				+ "..//..//CoffeEyaIMG//Sample_Chart_300_DPI.png";
		ImageIcon iconChart = new ImageIcon(imgPathChart);
		lblNewLabel_3.setIcon(iconChart);
		lblNewLabel_3.setBounds(23, 25, 509, 539);
		panel_3.add(lblNewLabel_3);
	}
}
