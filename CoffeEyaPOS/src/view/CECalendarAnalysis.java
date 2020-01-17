package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.SwingConstants;

import controller.DetailManagementService;
import controller.MemberManagementService;
import model.Detail;
import model.Member;
import model.OrderingDAO;
import model.ProductDAO;

import java.awt.Font;
import java.util.ArrayList;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class CECalendarAnalysis {
	DetailManagementService serviceD = new DetailManagementService();
	MemberManagementService serviceM = new MemberManagementService();

	private JFrame frame;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JTable table;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private Member loginUser;
	private JPanel panel_3;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JPanel panel_4;
	private JLabel label;

	/**
	 * Create the application.
	 */
	public CECalendarAnalysis(Member loginUser) {
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
		lblNewLabel.setBounds(104, 10, 1184, 761);
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
		panel_1.setBounds(12, 159, 594, 592);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 47, 536, 502);
		panel_1.add(scrollPane);

		// 컬럼이름 복사, 데이터 복사
		String[] columnNames = { "판매 날짜", "주문 번호", "상품 이름", "단일 가격", "판매 수량" };
		ArrayList<Detail> list = serviceD.detailLookup();
		Object[][] data = new Object[list.size()][5];
		ProductDAO daoP = new ProductDAO();
		OrderingDAO daoO = new OrderingDAO();
		for (int i = 0; i < list.size(); i++) {
			d = list.get(i);
			String PRO_NAME = daoP.getInfoProduct(d).getPRO_NAME();
			int PRO_PRICE = daoP.getInfoProduct(d).getPRO_PRICE();
			String OR_DATE = daoO.getInfoOrdering(d).getOR_DATE();
			data[i] = new Object[] { OR_DATE, d.getOR_NUM(), PRO_NAME, PRO_PRICE, d.getDE_AMOUNT() };
		}
		table = new JTable(data, columnNames);
		scrollPane.setViewportView(table);

		panel_3 = new JPanel();
		panel_3.setBounds(618, 159, 554, 592);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		panel_3.setBackground(Color.DARK_GRAY);

		button = new JButton("\uC5F0\uAC04 \uD310\uB9E4\uBCC0\uB3D9");
		button.setFont(new Font("굴림", Font.BOLD, 26));
		button.setBounds(88, 165, 373, 77);
		panel_3.add(button);

		button_1 = new JButton("\uC6D4\uAC04 \uD310\uB9E4\uBCC0\uB3D9");
		button_1.setFont(new Font("굴림", Font.BOLD, 26));
		button_1.setBounds(88, 305, 373, 77);
		panel_3.add(button_1);

		button_2 = new JButton("\uAE08\uC77C \uC2DC\uAC04\uAE30\uC900 \uD310\uB9E4\uC218\uB7C9");
		button_2.setFont(new Font("굴림", Font.BOLD, 26));
		button_2.setBounds(88, 442, 373, 77);
		panel_3.add(button_2);

		panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(new Color(204, 153, 102));
		panel_4.setBounds(12, 27, 530, 69);
		panel_3.add(panel_4);

		label = new JLabel("\uC2DC\uAC01\uD654\uBA74 \uC120\uD0DD");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("굴림", Font.BOLD, 28));
		label.setBounds(12, 10, 506, 49);
		panel_4.add(label);

	}
}
