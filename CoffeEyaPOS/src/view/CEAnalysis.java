package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.SwingConstants;

import controller.DetailManagementService;
import controller.MemberManagementService;
import model.Detail;
import model.Member;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class CEAnalysis {
	DetailManagementService service = new DetailManagementService();

	private JFrame frame;
	private JTextField textField;
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

		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(12, 54, 1160, 95);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(204, 153, 102));
		panel_2.setBounds(12, 10, 238, 75);
		panel.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("\uAE08\uC77C \uD310\uB9E4\uB300\uAE08");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 26));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(12, 10, 214, 55);
		panel_2.add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(262, 23, 886, 50);
		panel.add(textField);
		textField.setColumns(10);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(12, 159, 1160, 253);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 10, 1136, 233);
		panel_1.add(scrollPane);

		// 컬럼이름 복사, 데이터 복사
		String[] columnNames = { "주문상세번호", "주문번호", "상품번호", "판매수량" };
		ArrayList<Detail> list = service.detailLookup();

		Object[][] data = new Object[list.size()][4];

		for (int i = 0; i < list.size(); i++) {
			Detail d = list.get(i);
			data[i] = new Object[] { d.getDE_NUM(), d.getOR_NUM(), d.getPRO_NUM(), d.getDE_AMOUNT() };
		}
		table = new JTable(data, columnNames);
		scrollPane.setViewportView(table);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.DARK_GRAY);
		panel_3.setBounds(12, 422, 1160, 329);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);

		JLabel lblNewLabel_4 = new JLabel("\uAE30\uC900\uBCC4 \uD310\uB9E4\uBE44\uC728");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(12, 10, 148, 40);
		panel_3.add(lblNewLabel_4);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(204, 153, 102));
		panel_4.setBounds(12, 10, 148, 40);
		panel_3.add(panel_4);
		panel_4.setLayout(null);

	}
}
