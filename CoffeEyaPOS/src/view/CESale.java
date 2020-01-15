package view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import controller.ProductManagementService;
import model.Member;
import model.Product;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CESale {

	private ProductManagementService pservice = new ProductManagementService();
	private Member loginUser;
	private Product pro;
	private JFrame frame;
	private JTextField txtCoffeeya;
	private JTable table;
	private DefaultTableModel defaultTableModel;
	private int totalMoney;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

	}

	/**
	 * Create the application.
	 * 
	 * @param loginUser
	 * @wbp.parser.entryPoint
	 */
	public CESale(Member loginUser) {
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

		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 1194, 76);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JButton btnNewButton = new JButton("");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			// 뒤로가기
			public void mouseClicked(MouseEvent e) {
				CEMain main = new CEMain(loginUser);
				frame.dispose();
			}
		});
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
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel_3.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("\uD604\uAE08");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
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
		String[] columnNames = { "상품명", "가격" };
		defaultTableModel = new DefaultTableModel(null, columnNames);
		table = new JTable(defaultTableModel);
		scrollPane.setViewportView(table);

		JPanel panel_7 = new JPanel();
		panel_7.setBounds(487, 10, 194, 219);
		panel_5.add(panel_7);

		JPanel panel_8 = new JPanel();
		panel_8.setBounds(12, 276, 693, 87);
		panel_2.add(panel_8);
		panel_8.setLayout(new CardLayout(0, 0));

		JPanel panel_9 = new JPanel();
		panel_9.setBounds(12, 373, 693, 292);
		panel_2.add(panel_9);
		panel_9.setLayout(new GridLayout(0, 5, 0, 0));

//		JButton btnNewButton_2 = new JButton("\uD604\uAE08");
//		btnNewButton_2.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//			}
//		});
//		btnNewButton_2.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
//		panel_3.add(btnNewButton_2);

		// 반복문으로 생성
		ArrayList<Product> list = pservice.productLookup();
		Object[][] data = new Object[list.size()][2];
		for (int i = 0; i < list.size(); i++) {
			Product p = list.get(i);
			data[i] = new Object[] { p.getPRO_NAME(), p.getPRO_PRICE() };
		}

		JButton[] JButton10 = new JButton[data.length];
		for (int i = 0; i < data.length; i++) {
			final int j = i;
			JButton10[i] = new JButton();
			JButton10[i].setSize(130, 80);
			panel_9.add(JButton10[i]);
			JButton btnNewButton_4 = new JButton(Arrays.deepToString(data[i]) + "");
			JButton10[i].add(btnNewButton_4);

			JButton10[i].addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					Object[] row = new Object[2];
					row[0] = data[j][0];
					row[1] = data[j][1];
					defaultTableModel.addRow(row);
				}
			});
		}
	}
}
