package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Member;
import model.Product;
import model.ProductDAO;

import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import controller.MemberManagementService;

public class CEMember {
	
	MemberManagementService service = new MemberManagementService();

	private JFrame frame;
	private Member loginUser;
	private JPanel panel_1;
	private JScrollPane scrollPane;

	private JTable table;

	/**
	 * Create the application.
	 */
	public CEMember(Member loginUser) {
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
		
		JPanel panel = new JPanel();
		panel.setBounds(702, 379, 438, 321);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton = new JButton("\uC9C1\uC6D0 \uB4F1\uB85D");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				CEMemJoin join = new CEMemJoin(loginUser);
			}
		});
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uC9C1\uC6D0 \uC218\uC815 / \uC0AD\uC81C");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CEMemModDel memmoddel = new CEMemModDel(loginUser);
			}
		});
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uC9C1\uC6D0 \uADFC\uD0DC\uAD00\uB9AC");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CEMemCommute commute = new CEMemCommute(loginUser);
			}
		});
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\uB85C\uADF8 \uC544\uC6C3");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CEReLogin reLogin = new CEReLogin();
				frame.dispose();
			}
		});
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\uB3CC\uC544\uAC00\uAE30");
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CEMain main = new CEMain(loginUser);
				frame.dispose();
			}
		});
		btnNewButton_4.setBounds(1075, 10, 100, 100);
		frame.getContentPane().add(btnNewButton_4);
		
		panel_1 = new JPanel();
		panel_1.setBounds(12, 10, 438, 293);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 438, 293);
		panel_1.add(scrollPane);
		
		memberAll();
		
	}
	
	private void memberAll() {
		String[] columnNames = { "사용자 아이디", "사용자 비밀번호", "사용자 이름", "사용자 권한" };
		ArrayList<Member> list = service.memberLookup();
		Object[][] data = new Object[list.size()][4];
		Member m = new Member();
		for (int i = 0; i < list.size(); i++) {
			m = list.get(i);
			String MEM_ID = m.getMEM_ID();
			String MEM_PW = m.getMEM_PW();
			String MEM_NAME = m.getMEM_NAME();
			String MEM_PERM = m.getMEM_PERM();
			data[i] = new Object[] { MEM_ID, MEM_PW, MEM_NAME, MEM_PERM };
		}
		table = new JTable(data, columnNames);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				int index = table.getSelectedRow();
//				textField.setText((int)table.getValueAt(index, 0) + "");
//				textField_1.setText((String) table.getValueAt(index, 1));
//				textField_2.setText((int) table.getValueAt(index, 2) + "");
			}
		});
		scrollPane.setViewportView(table);
	}
}
