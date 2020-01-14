package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.MemberManagementService;
import model.Member;

import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class CESale {

	private MemberManagementService service = new MemberManagementService();
	private Member loginUser;
	private JFrame frame;
	private JTextField txtCoffeeya;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CESale window = new CESale();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CESale() {
		initialize();
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

		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 1194, 76);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		btnNewButton.setBounds(1122, 10, 60, 53);
		panel.add(btnNewButton);
		
		txtCoffeeya = new JTextField();
		txtCoffeeya.setForeground(Color.WHITE);
		txtCoffeeya.setBackground(Color.DARK_GRAY);
		txtCoffeeya.setFont(new Font("굴림", Font.BOLD, 25));
		txtCoffeeya.setHorizontalAlignment(SwingConstants.CENTER);
		txtCoffeeya.setText("CoffeEya");
		txtCoffeeya.setBounds(12, 10, 270, 53);
		panel.add(txtCoffeeya);
		txtCoffeeya.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(741, 86, 441, 675);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(12, 531, 417, 134);
		panel_1.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 2, 5, 5));
		
		JButton btnNewButton_1 = new JButton("\uCE74\uB4DC");
		panel_3.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uD604\uAE08");
		panel_3.add(btnNewButton_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(12, 10, 417, 238);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(10, 86, 717, 675);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(12, 10, 693, 239);
		panel_2.add(panel_5);
		panel_5.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(12, 10, 463, 219);
		panel_5.add(panel_6);
		panel_6.setLayout(new CardLayout(0, 0));
		
		// 주문스크롤
		JScrollPane scrollPane = new JScrollPane();
		panel_6.add(scrollPane, "name_1462951108600");
		// 컬럼이름 복사, 데이터 복사
				String[] columnNames = { "USER_ID", "USER_NAME", "USER_AGE" };
				ArrayList<Member> list = service.memberLookup(loginUser.getMEM_ID());

				Object[][] data = new Object[list.size()][3];

				for (int i = 0; i < list.size(); i++) {
					// 각사람들의 정보를 꺼내온다.
					Member m = list.get(i);
					// 한번에 초기화하는방법, 1차원배열 > 데이터나열
					data[i] = new Object[] { m.getMEM_ID(), m.getMEM_NAME()};

				}
				table = new JTable(data, columnNames);
				scrollPane.setViewportView(table);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(487, 10, 194, 219);
		panel_5.add(panel_7);
	}
}
