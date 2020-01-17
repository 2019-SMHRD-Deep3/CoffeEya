package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;

import model.Detail;
import model.Member;
import model.OrderingDAO;
import model.Product;
import model.ProductDAO;

import javax.swing.ImageIcon;
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
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;

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
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btnNewButton = new JButton("\uB3CC\uC544\uAC00\uAE30");
		btnNewButton.setBounds(1075, 10, 100, 100);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				CEMain main = new CEMain(loginUser);
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

		productAll();

		panel_1 = new JPanel();
		panel_1.setBounds(536, 42, 527, 278);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));

		String imgPath = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//p_number.png";
		ImageIcon icon = new ImageIcon(imgPath);
		
		panel_3 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, panel_3.getWidth(), panel_3.getHeight(), null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		panel_1.add(panel_3);

			
		textField = new JTextField();
		panel_1.add(textField);
		textField.setColumns(10);
		
		String imgPath1 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//p_name.png";
		ImageIcon icon1 = new ImageIcon(imgPath1);
		
		
		panel_4 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(icon1.getImage(), 0, 0, panel_4.getWidth(), panel_4.getHeight(), null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		panel_1.add(panel_4);

		textField_1 = new JTextField();
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		String imgPath2 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//p_price.png";
		ImageIcon icon2 = new ImageIcon(imgPath2);
		
		panel_5 = new JPanel(){
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(icon2.getImage(), 0, 0, panel_5.getWidth(), panel_5.getHeight(), null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		panel_1.add(panel_5);

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
					productAll();
				} else {
					JOptionPane.showMessageDialog(frame, "상품 추가 실패");
				}
				
			}
		});
		
		JButton btnNewButton_4 = new JButton("\uCD08\uAE30\uD654");
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				productAll();
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
			}
		});
		panel_2.add(btnNewButton_4);
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
					productAll();
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
					productAll();
				} else {
					JOptionPane.showMessageDialog(frame, "삭제 실패");
				}
			}
		});
		panel_2.add(btnNewButton_3);

	}

	private void productAll() {
		String[] columnNames = { "상품 번호", "상품 이름", "상품 가격" };
		ArrayList<Product> list = service.productLookup();
		Object[][] data = new Object[list.size()][3];
		Product p = new Product();
		for (int i = 0; i < list.size(); i++) {
			p = list.get(i);
			int PRO_NUM = p.getPRO_NUM();
			String PRO_NAME = p.getPRO_NAME();
			int PRO_PRICE = p.getPRO_PRICE();
			data[i] = new Object[] { PRO_NUM, PRO_NAME, PRO_PRICE };
		}
		table = new JTable(data, columnNames);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int index = table.getSelectedRow();
				textField.setText((int)table.getValueAt(index, 0) + "");
				textField_1.setText((String) table.getValueAt(index, 1));
				textField_2.setText((int) table.getValueAt(index, 2) + "");
			}
		});
		scrollPane.setViewportView(table);
	}
}
