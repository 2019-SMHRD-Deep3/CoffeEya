package view;

import java.awt.EventQueue;

import javax.swing.JFrame;

import model.Detail;
import model.Member;
import model.OrderingDAO;
import model.Product;
import model.ProductDAO;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import controller.ProductManagementService;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CESetProduct {

	ProductManagementService service = new ProductManagementService();

	private JFrame frame;
	private Member loginUser;
	private JPanel panel;
	private JScrollPane scrollPane;

	private JTable table;
	private JPanel panel_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;

	/**
	 * Create the application.
	 */
	public CESetProduct(Member loginUser) {
		this.loginUser = loginUser;
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(150, 150, 1200, 800);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		JButton btnNewButton = new JButton("\uB3CC\uC544\uAC00\uAE30");
		btnNewButton.setBounds(1075, 10, 100, 100);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.dispose();
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnNewButton);

		panel = new JPanel();
		panel.setBounds(12, 10, 512, 350);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 512, 350);
		panel.add(scrollPane);

		String[] columnNames = { "상품 번호", "상품 이름", "상품 가격" };
		ArrayList<Product> list = service.productLookup();
		Object[][] data = new Object[list.size()][3];
		ProductDAO daoP = new ProductDAO();
		Product p = new Product();
		for (int i = 0; i < list.size(); i++) {
			p = list.get(i);
			int PRO_NUM = p.getPRO_NUM();
			String PRO_NAME = p.getPRO_NAME();
			int PRO_PRICE = p.getPRO_PRICE();
			data[i] = new Object[] { PRO_NUM, PRO_NAME, PRO_PRICE };
		}
		table = new JTable(data, columnNames);
		scrollPane.setViewportView(table);

		panel_1 = new JPanel();
		panel_1.setBounds(536, 10, 527, 350);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));

		JLabel lblNewLabel = new JLabel("\uC0C1\uD488 \uBC88\uD638");
		panel_1.add(lblNewLabel);

		textField = new JTextField();
		panel_1.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("\uC0C1\uD488 \uC774\uB984");
		panel_1.add(lblNewLabel_1);

		textField_1 = new JTextField();
		panel_1.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("\uC0C1\uD488 \uAC00\uACA9");
		panel_1.add(lblNewLabel_2);

		textField_2 = new JTextField();
		panel_1.add(textField_2);
		textField_2.setColumns(10);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(536, 370, 527, 100);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new GridLayout(1, 0, 50, 0));

		btnNewButton_1 = new JButton("\uCD94\uAC00");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int infoPNum = Integer.parseInt(textField.getText());
				String infoPName = textField_1.getText();
				int infoPPrice = Integer.parseInt(textField_2.getText());

				Product p = new Product();
				p.setPRO_NUM(infoPNum);
				p.setPRO_NAME(infoPName);
				p.setPRO_PRICE(infoPPrice);

				boolean result = service.productJoin(p);
				if (result) {
					JOptionPane.showMessageDialog(frame, "상품 추가 성공");
				} else {
					JOptionPane.showMessageDialog(frame, "상품 추가 실패");
				}
				
			}
		});
		panel_2.add(btnNewButton_1);

		btnNewButton_2 = new JButton("\uC218\uC815");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int infoPNum = Integer.parseInt(textField.getText());
				String infoPName = textField_1.getText();
				int infoPPrice = Integer.parseInt(textField_2.getText());
				
				Product p = new Product();
				p.setPRO_NUM(infoPNum);
				p.setPRO_NAME(infoPName);
				p.setPRO_PRICE(infoPPrice);
				
				boolean result = service.productModify(p);
				if (result == false) {
					JOptionPane.showMessageDialog(frame, "해당 상품이 존재하지 않습니다.");
				} else {
					JOptionPane.showMessageDialog(frame, "수정 완료");
				}
			}
		});
		panel_2.add(btnNewButton_2);

		btnNewButton_3 = new JButton("\uC0AD\uC81C");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int infoPNum = Integer.parseInt(textField.getText());
				Product p = new Product();
				p.setPRO_NUM(infoPNum);

				boolean result = service.productDelete(p);

				if (result) {
					JOptionPane.showMessageDialog(frame, "삭제 성공");
				} else {
					JOptionPane.showMessageDialog(frame, "삭제 실패");
				}
			}
		});
		panel_2.add(btnNewButton_3);

	}
}
