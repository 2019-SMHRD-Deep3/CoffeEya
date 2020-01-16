package view;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;

import model.Customer;
import model.Detail;
import model.Member;
import model.OrderingDAO;
import model.ProductDAO;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import controller.CustomerManagementService;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CECusSearch {

	private JFrame frame;
	private JTable table;
	private Member loginUser;
	CustomerManagementService service = new CustomerManagementService();

	/**
	 * Create the application.
	 */
	public CECusSearch(Member loginUser) {
		this.loginUser = loginUser;
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 1200, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 102, 1170, 659);
		frame.getContentPane().add(scrollPane);

		String[] columnNames = { "고객 번호", "고객 이름", "고객 전화번호", "고객 성별", "고객 생년월일", "고객 적립포인트" };
		ArrayList<Customer> list = service.customerLookup();
		Object[][] data = new Object[list.size()][6];
		Customer c = null;
		for (int i = 0; i < list.size(); i++) {
			c = list.get(i);
			String CUS_NUMBER = c.getCUS_NUMBER();
			String CUS_NAME = c.getCUS_NAME();
			String CUS_PHONE = c.getCUS_PHONE();
			String CUS_SEX = c.getCUS_SEX();
			String CUS_BIRTHDAY = c.getCUS_BIRTHDAY();
			int CUS_POINT = c.getCUS_POINT();
			data[i] = new Object[] { CUS_NUMBER, CUS_NAME, CUS_PHONE, CUS_SEX, CUS_BIRTHDAY, CUS_POINT };
		}
		table = new JTable(data, columnNames);
		scrollPane.setViewportView(table);

		JButton btnNewButton = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.dispose();
			}
		});
		btnNewButton.setBounds(1093, 10, 80, 80);
		frame.getContentPane().add(btnNewButton);
	}
}
