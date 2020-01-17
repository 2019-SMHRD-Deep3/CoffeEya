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

import java.io.IOException;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;

public class CEAnalysis {
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
	private JLabel lblNewLabel_2;
	private JScrollPane scrollPane;
	private Member loginUser;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton button;
	private JButton button_1;
	private JPanel panel_4;
	private JLabel lblNewLabel_3;

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

		lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(lblNewLabel);

		panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(12, 54, 1160, 95);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		lblNewLabel_1 = new JLabel("\uAE08\uC77C \uD310\uB9E4\uB300\uAE08");
		lblNewLabel_1.setBounds(12, 19, 322, 57);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 26));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);

		panel_2 = new JPanel();
		panel_2.setBackground(new Color(204, 153, 102));
		panel_2.setBounds(12, 19, 322, 57);
		panel.add(panel_2);
		panel_2.setLayout(null);

		ArrayList<Detail> listTemp = service.detailLookup();
		ProductDAO daoSum = new ProductDAO();
		Detail d = new Detail();
		for (int i = 0; i < listTemp.size(); i++) {
			d = listTemp.get(i);
			int PRO_PRICE = daoSum.getInfoProduct(d).getPRO_PRICE();
			sum += PRO_PRICE * d.getDE_AMOUNT();
		}
		lblNewLabel_2 = new JLabel(Integer.toString(sum) + " 원");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 26));
		lblNewLabel_2.setBounds(346, 10, 273, 75);
		panel.add(lblNewLabel_2);

		panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(12, 159, 771, 592);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 23, 715, 542);
		panel_1.add(scrollPane);

		// 컬럼이름 복사, 데이터 복사
		String[] columnNames = { "주문 번호", "상품 이름", "단일 가격", "판매 수량", "결제 수단", "판매 사원", "판매 날짜" };
		ArrayList<Detail> list = service.detailLookup();
		Object[][] data = new Object[list.size()][7];
		ProductDAO daoP = new ProductDAO();
		OrderingDAO daoO = new OrderingDAO();
		for (int i = 0; i < list.size(); i++) {
			d = list.get(i);
			String PRO_NAME = daoP.getInfoProduct(d).getPRO_NAME();
			int PRO_PRICE = daoP.getInfoProduct(d).getPRO_PRICE();
			String OR_PAY = daoO.getInfoOrdering(d).getOR_PAY();
			String MEM_ID = daoO.getInfoOrdering(d).getMEM_ID();
			String OR_DATE = daoO.getInfoOrdering(d).getOR_DATE().substring(0, 10);
			data[i] = new Object[] { d.getOR_NUM(), PRO_NAME, PRO_PRICE, d.getDE_AMOUNT(), OR_PAY, MEM_ID, OR_DATE };
		}
		table = new JTable(data, columnNames);
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
		panel_3.setBounds(795, 159, 377, 592);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);

		btnNewButton = new JButton("\uC0C1\uD488 \uAE30\uC900");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CEProductAnalysis productAnalysis = new CEProductAnalysis(loginUser);
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 26));
		btnNewButton.setBounds(85, 168, 220, 77);
		panel_3.add(btnNewButton);

		button = new JButton("\uD310\uB9E4\uC790 \uAE30\uC900");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CESellerAnalysis sellerAnalysis = new CESellerAnalysis(loginUser);
			}
		});
		button.setFont(new Font("굴림", Font.BOLD, 26));
		button.setBounds(85, 301, 220, 77);
		panel_3.add(button);

		button_1 = new JButton("\uB0A0\uC9DC \uAE30\uC900");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CECalendarAnalysis calendarAnalysis = new CECalendarAnalysis(loginUser);
			}
		});
		button_1.setFont(new Font("굴림", Font.BOLD, 26));
		button_1.setBounds(85, 440, 220, 77);
		panel_3.add(button_1);

		panel_4 = new JPanel();
		panel_4.setBackground(new Color(204, 153, 102));
		panel_4.setBounds(12, 47, 353, 69);
		panel_3.add(panel_4);
		panel_4.setLayout(null);

		lblNewLabel_3 = new JLabel("\uC2DC\uAC01\uD654\uBA74 \uC120\uD0DD");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 28));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(0, 10, 353, 49);
		panel_4.add(lblNewLabel_3);

		btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CEMain main = new CEMain(loginUser);
				frame.dispose();
			}
		});
		btnNewButton_1.setBounds(1139, 10, 33, 31);
		frame.getContentPane().add(btnNewButton_1);
	}
}
