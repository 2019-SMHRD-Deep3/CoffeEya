package view;

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
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.JComboBox;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Font;

public class CEProduct {

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
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JPanel panel_3;
	private JPanel panel_2;
	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel panel_6;

	/**
	 * Create the application.
	 */
	public CEProduct(Member loginUser) {
		this.loginUser = loginUser;
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setResizable(false);
		frame.setBounds(150, 150, 684, 589);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		String imgPath3 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//bback.png";
		ImageIcon icon3 = new ImageIcon(imgPath3);
		
		panel_3 = new JPanel(){
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(icon3.getImage(), 0, 0, panel_3.getWidth(), panel_3.getHeight(), null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		panel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				CEMain main = new CEMain(loginUser);
				frame.dispose();
			}
		});
		panel_3.setBounds(560, 22, 78, 78);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);


		panel = new JPanel();
		panel.setBounds(12, 10, 512, 350);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 512, 350);
		panel.add(scrollPane);

		productAll();

		panel_1 = new JPanel();
		panel_1.setBounds(56, 378, 424, 136);
		panel_1.setBackground(new Color(255, 0, 0, 0));
		frame.getContentPane().add(panel_1);

		String imgPath = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//p_number.png";
		ImageIcon icon = new ImageIcon(imgPath);
		panel_1.setLayout(null);

		lblNewLabel = new JLabel("") {
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, lblNewLabel.getWidth(), lblNewLabel.getHeight(), null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		lblNewLabel.setBounds(0, 10, 212, 35);
		panel_1.add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(238, 10, 186, 35);
		textField.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		textField.setBackground(Color.WHITE);
		panel_1.add(textField);
		textField.setColumns(10);

		String imgPath1 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//p_name.png";
		ImageIcon icon1 = new ImageIcon(imgPath1);

		lblNewLabel_1 = new JLabel("") {
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(icon1.getImage(), 0, 0, lblNewLabel_1.getWidth(), lblNewLabel_1.getHeight(), null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		lblNewLabel_1.setBounds(0, 55, 212, 35);
		panel_1.add(lblNewLabel_1);

		textField_1 = new JTextField();
		textField_1.setBounds(238, 55, 186, 35);
		textField_1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		textField_1.setBackground(Color.WHITE);
		panel_1.add(textField_1);
		textField_1.setColumns(10);

		String imgPath2 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//p_price.png";
		ImageIcon icon2 = new ImageIcon(imgPath2);

		lblNewLabel_2 = new JLabel("") {
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(icon2.getImage(), 0, 0, lblNewLabel_2.getWidth(), lblNewLabel_2.getHeight(), null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		lblNewLabel_2.setBounds(0, 100, 212, 35);
		panel_1.add(lblNewLabel_2);

		textField_2 = new JTextField();
		textField_2.setBounds(238, 100, 186, 35);
		textField_2.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		textField_2.setBackground(Color.WHITE);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		
		String imgPath4 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//reset.png";
		ImageIcon icon4 = new ImageIcon(imgPath4);

		panel_2 = new JPanel(){
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(icon4.getImage(), 0, 0, panel_2.getWidth(), panel_2.getHeight(), null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				productAll();
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
			}
		});
		panel_2.setBounds(560, 146, 60, 60);
		frame.getContentPane().add(panel_2);
		
		String imgPath5 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//plus.png";
		ImageIcon icon5 = new ImageIcon(imgPath5);
		
		panel_4 = new JPanel() {
			protected void paintComponent(Graphics g) {
				g.drawImage(icon5.getImage(), 0, 0, panel_4.getWidth(), panel_4.getHeight(), null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		panel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
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
		panel_4.setBounds(560, 252, 60, 60);
		frame.getContentPane().add(panel_4);
		
		String imgPath6 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//repair.png";
		ImageIcon icon6 = new ImageIcon(imgPath6);
		
		panel_5 = new JPanel() {
			protected void paintComponent(Graphics g) {
				g.drawImage(icon6.getImage(), 0, 0, panel_5.getWidth(), panel_5.getHeight(), null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		panel_5.addMouseListener(new MouseAdapter() {
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
		panel_5.setBounds(560, 354, 60, 60);
		frame.getContentPane().add(panel_5);
		
		String imgPath7 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//garbage.png";
		ImageIcon icon7 = new ImageIcon(imgPath7);
		
		panel_6 = new JPanel() {
			protected void paintComponent(Graphics g) {
				g.drawImage(icon7.getImage(), 0, 0, panel_6.getWidth(), panel_6.getHeight(), null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		panel_6.addMouseListener(new MouseAdapter() {
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
		panel_6.setBounds(560, 445, 60, 60);
		frame.getContentPane().add(panel_6);
		
		JLabel lblNewLabel_3 = new JLabel("\uCD08\uAE30\uD654");
		lblNewLabel_3.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(560, 216, 57, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel label = new JLabel("\uCD94\uAC00");
		label.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(563, 322, 57, 15);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\uC218\uC815");
		label_1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(563, 420, 57, 15);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\uC0AD\uC81C");
		label_2.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(563, 515, 57, 15);
		frame.getContentPane().add(label_2);

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

		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int index = table.getSelectedRow();
				textField.setText((int) table.getValueAt(index, 0) + "");
				textField_1.setText((String) table.getValueAt(index, 1));
				textField_2.setText((int) table.getValueAt(index, 2) + "");
			}
		});
		scrollPane.setViewportView(table);
	}
}
