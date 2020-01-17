package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;

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
import javax.swing.JTextField;

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
	private JPanel panel_4;
	private JLabel label;
	private JPanel panel_5;
	private JLabel lblNewLabel_2;
	private JLabel label_1;
	private JTextField textField;
	private JTextField textField_1;

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

		lblNewLabel_1 = new JLabel("\uB0A0\uC9DC \uAE30\uC900");
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
			String OR_DATE = daoO.getInfoOrdering(d).getOR_DATE().substring(0,10);
			data[i] = new Object[] { OR_DATE, d.getOR_NUM(), PRO_NAME, PRO_PRICE, d.getDE_AMOUNT() };
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
		panel_3.setBounds(618, 159, 554, 592);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		panel_3.setBackground(Color.DARK_GRAY);

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
		
		panel_5 = new JPanel();
		panel_5.setBackground(Color.GRAY);
		panel_5.setBounds(117, 213, 339, 129);
		panel_3.add(panel_5);
		panel_5.setLayout(null);
		
		lblNewLabel_2 = new JLabel("\uB144\uB3C4");
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 22));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(12, 10, 115, 49);
		panel_5.add(lblNewLabel_2);
		
		label_1 = new JLabel("\uC6D4");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("굴림", Font.BOLD, 22));
		label_1.setBounds(12, 73, 115, 49);
		panel_5.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(127, 14, 171, 38);
		panel_5.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(127, 77, 171, 42);
		panel_5.add(textField_1);
		
				button = new JButton("\uCC28\uD2B8 \uD655\uC778");
				button.setBackground(Color.GRAY);
				button.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						String infoYear = textField.getText();
						String infoMonth = textField_1.getText();
						CEMonthCalendarAnalysis monthCalendarAnalysis = new CEMonthCalendarAnalysis(loginUser, infoYear, infoMonth);
					}
				});
				button.setFont(new Font("굴림", Font.BOLD, 26));
				button.setBounds(204, 370, 172, 47);
				panel_3.add(button);

	}
}
