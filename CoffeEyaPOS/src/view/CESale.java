package view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.ProductManagementService;
import model.Member;
import model.Product;

public class CESale {

	private ProductManagementService pservice = new ProductManagementService();
	private Member loginUser;
	private Product pro;
	private JFrame frame;
	private JTextField txtCoffeeya;
	private JTable table;

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
		String[] columnNames = { "상품명", "가격" };
		ArrayList<Product> list = pservice.productLookup();
		
		Object[][] data = new Object[list.size()][2];
		for (int i = 0; i < list.size(); i++) {
			Product p = list.get(i);
			data[i] = new Object[] { p.getPRO_NAME(), p.getPRO_PRICE() };
		}
		
		table = new JTable(data, columnNames);
		scrollPane.setViewportView(table);

		JPanel panel_7 = new JPanel();
		panel_7.setBounds(487, 10, 194, 219);
		panel_5.add(panel_7);

		JPanel panel_8 = new JPanel();
		panel_8.setBounds(12, 276, 693, 87);
		panel_2.add(panel_8);

		JPanel panel_9 = new JPanel();
		panel_9.setBounds(12, 373, 693, 292);
		panel_2.add(panel_9);
		panel_9.setLayout(null);

		JPanel panel_10 = new JPanel();
		panel_10.setBounds(12, 10, 158, 89);
		panel_9.add(panel_10);
		panel_10.setLayout(new CardLayout(0, 0));

		JButton americano = new JButton("\uC544\uBA54\uB9AC\uCE74\uB178 3500\uC6D0");
		americano.addMouseListener(new MouseAdapter() {
			// 아메리카노 클릭시, 주문표에 올라감
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int infoNum = 1;
				 = pro.getPRO_NAME();
				
			}
		});
		americano.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_10.add(americano, "name_58620837806200");

		JPanel panel_11 = new JPanel();
		panel_11.setBounds(182, 10, 158, 89);
		panel_9.add(panel_11);
		panel_11.setLayout(new CardLayout(0, 0));

		JButton button = new JButton("\uC5D0\uC2A4\uD504\uB808\uC18C 2500\uC6D0");
		button.addMouseListener(new MouseAdapter() {
			// 에스프레소 클릭
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		panel_11.add(button, "name_61217660927000");

		JPanel panel_12 = new JPanel();
		panel_12.setBounds(352, 10, 158, 89);
		panel_9.add(panel_12);
		panel_12.setLayout(new CardLayout(0, 0));

		JButton btnNewButton_4 = new JButton("\uCE74\uD398\uB77C\uB5BC 3500\uC6D0");
		panel_12.add(btnNewButton_4, "name_61235236927400");

		JPanel panel_13 = new JPanel();
		panel_13.setBounds(522, 10, 159, 89);
		panel_9.add(panel_13);
		panel_13.setLayout(new CardLayout(0, 0));

		JButton button_1 = new JButton("\uCE74\uD398\uBAA8\uCE74 4500\uC6D0");
		panel_13.add(button_1, "name_61258732782000");

		JPanel panel_14 = new JPanel();
		panel_14.setBounds(12, 109, 158, 89);
		panel_9.add(panel_14);
		panel_14.setLayout(new CardLayout(0, 0));

		JButton btnNewButton_5 = new JButton("\uD654\uC774\uD2B8\uBAA8\uCE74 5500\uC6D0");
		panel_14.add(btnNewButton_5, "name_61331636810600");
	}
}
