package view;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JFrame;

import model.Customer;
import model.Member;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import controller.CustomerManagementService;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.JRadioButton;
import java.awt.Color;

public class CECustomer {

	CustomerManagementService service = new CustomerManagementService();

	private JFrame frame;
	private Member loginUser;
	private JTable table;
	private JScrollPane scrollPane;
	private JPanel panel_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField textField;
	private JPanel panel_2;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPanel panel_reflash2;
	private JPanel panel_add;
	private JPanel panel_rename;
	private JPanel panel_del;
	private JLabel lblNewLabel_6;
	private JTextField textField_3;
	private JPanel panel_3;

	/**
	 * Create the application.
	 */
	public CECustomer(Member loginUser) {
		this.loginUser = loginUser;
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(250, 235, 215));
		frame.setBounds(100, 100, 860, 624);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 700, 300);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 700, 300);
		panel.add(scrollPane);

		String imgPath3 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//bback.png";
		ImageIcon icon3 = new ImageIcon(imgPath3);

		panel_1 = new JPanel();
		panel_1.setBackground(new Color(250, 235, 215));
		panel_1.setBounds(80, 320, 541, 252);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 70, 5));

		String imgPath = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//cus2.png";
		ImageIcon cus2 = new ImageIcon(imgPath);

		lblNewLabel = new JLabel() {
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(cus2.getImage(), 0, 0, lblNewLabel.getWidth(), lblNewLabel.getHeight(), null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		panel_1.add(lblNewLabel);

		lblNewLabel_5 = new JLabel("\uACE0\uAC1D \uBC88\uD638 \uC120\uD0DD");
		panel_1.add(lblNewLabel_5);

		String imgPath2 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//cus3.png";
		ImageIcon cus3 = new ImageIcon(imgPath2);

		lblNewLabel_1 = new JLabel("") {
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(cus3.getImage(), 0, 0, lblNewLabel_1.getWidth(), lblNewLabel_1.getHeight(), null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		panel_1.add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBackground(new Color(255, 218, 185));
		panel_1.add(textField);
		textField.setColumns(10);

		String imgPath4 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//cus4.png";
		ImageIcon cus5 = new ImageIcon(imgPath4);

		lblNewLabel_2 = new JLabel() {
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(cus5.getImage(), 0, 0, lblNewLabel_2.getWidth(), lblNewLabel_2.getHeight(), null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		panel_1.add(lblNewLabel_2);

		textField_1 = new JTextField();
		textField_1.setBackground(new Color(255, 218, 185));
		panel_1.add(textField_1);
		textField_1.setColumns(10);

		String imgPath11 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//cus5.png";
		ImageIcon cus11 = new ImageIcon(imgPath11);

		lblNewLabel_3 = new JLabel("") {
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(cus11.getImage(), 0, 0, lblNewLabel_3.getWidth(), lblNewLabel_3.getHeight(), null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		panel_1.add(lblNewLabel_3);

		panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 0, 0, 0));
		panel_1.add(panel_2);
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));

		rdbtnNewRadioButton = new JRadioButton("\uB0A8\uC790");
		rdbtnNewRadioButton.setBackground(new Color(250, 235, 215));
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(rdbtnNewRadioButton);

		rdbtnNewRadioButton_1 = new JRadioButton("\uC5EC\uC790");
		rdbtnNewRadioButton_1.setBackground(new Color(250, 235, 215));
		rdbtnNewRadioButton_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(rdbtnNewRadioButton_1);

		ButtonGroup sex = new ButtonGroup();
		sex.add(rdbtnNewRadioButton);
		sex.add(rdbtnNewRadioButton_1);

		String imgPath12 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//cus6.png";
		ImageIcon cus12 = new ImageIcon(imgPath12);

		lblNewLabel_4 = new JLabel("") {
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(cus12.getImage(), 0, 0, lblNewLabel_4.getWidth(), lblNewLabel_4.getHeight(), null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		panel_1.add(lblNewLabel_4);

		textField_2 = new JTextField();
		textField_2.setBackground(new Color(255, 218, 185));
		panel_1.add(textField_2);
		textField_2.setColumns(10);

		String imgPath13 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//cus8.png";
		ImageIcon cus13 = new ImageIcon(imgPath13);
		lblNewLabel_6 = new JLabel("") {
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(cus13.getImage(), 0, 0, lblNewLabel_6.getWidth(), lblNewLabel_6.getHeight(), null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		panel_1.add(lblNewLabel_6);

		textField_3 = new JTextField();
		textField_3.setBackground(new Color(255, 218, 185));
		panel_1.add(textField_3);
		textField_3.setColumns(10);

		String imgPath5 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//reset.png";
		ImageIcon icon4 = new ImageIcon(imgPath5);

		panel_reflash2 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(icon4.getImage(), 0, 0, panel_reflash2.getWidth(), panel_reflash2.getHeight(), null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		panel_reflash2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				customerAll();
				lblNewLabel_5.setText("고객 번호 선택");
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				sex.clearSelection();
			}
		});
		panel_reflash2.setBounds(747, 168, 67, 67);
		frame.getContentPane().add(panel_reflash2);

		String imgPath10 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//plus.png";
		ImageIcon icon5 = new ImageIcon(imgPath10);

		panel_add = new JPanel() {
			protected void paintComponent(Graphics g) {
				g.drawImage(icon5.getImage(), 0, 0, panel_add.getWidth(), panel_add.getHeight(), null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		panel_add.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CECusJoin sale = new CECusJoin(loginUser);
				frame.dispose();
			}
		});
		panel_add.setBounds(747, 265, 67, 67);
		frame.getContentPane().add(panel_add);

		String imgPath6 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//repair.png";
		ImageIcon icon6 = new ImageIcon(imgPath6);

		panel_rename = new JPanel() {
			protected void paintComponent(Graphics g) {
				g.drawImage(icon6.getImage(), 0, 0, panel_rename.getWidth(), panel_rename.getHeight(), null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		panel_rename.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String CUS_NUMBER = lblNewLabel_5.getText();
				String CUS_NAME = textField.getText();
				String CUS_PHONE = textField_1.getText();
				String CUS_SEX;
				if (rdbtnNewRadioButton.isSelected()) {
					CUS_SEX = "MALE";
				} else {
					CUS_SEX = "FEMALE";
				}
				String CUS_BIRTHDAY = textField_2.getText();
				int CUS_POINT = Integer.parseInt(textField_3.getText());

				Customer c = new Customer(CUS_NUMBER, CUS_NAME, CUS_PHONE, CUS_SEX, CUS_BIRTHDAY, CUS_POINT);
				boolean result = service.customerModify(c);

				if (result) {
					JOptionPane.showMessageDialog(frame, "수정 성공");
					customerAll();
				} else {
					JOptionPane.showMessageDialog(frame, "수정 실패");
				}
			}
		});
		panel_rename.setBounds(747, 362, 67, 67);
		frame.getContentPane().add(panel_rename);

		String imgPath7 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//garbage.png";
		ImageIcon icon7 = new ImageIcon(imgPath7);

		panel_del = new JPanel() {
			protected void paintComponent(Graphics g) {
				g.drawImage(icon7.getImage(), 0, 0, panel_del.getWidth(), panel_del.getHeight(), null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		panel_del.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String infoId = lblNewLabel_5.getText();
				Customer c = new Customer(infoId);
				boolean result = service.customerDelete(c);

				if (result) {
					JOptionPane.showMessageDialog(frame, "삭제 성공");
					customerAll();
				} else {
					JOptionPane.showMessageDialog(frame, "삭제 실패");
				}
			}
		});
		panel_del.setBounds(747, 459, 67, 67);
		frame.getContentPane().add(panel_del);

		panel_3 = new JPanel() {
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
		panel_3.setBounds(741, 23, 75, 74);
		frame.getContentPane().add(panel_3);

		JLabel lblNewLabel_7 = new JLabel("\uCD08\uAE30\uD654");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(753, 240, 57, 15);
		frame.getContentPane().add(lblNewLabel_7);

		JLabel label = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(754, 337, 57, 15);
		frame.getContentPane().add(label);

		JLabel label_1 = new JLabel("\uC815\uBCF4\uC218\uC815");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(752, 434, 57, 15);
		frame.getContentPane().add(label_1);

		JLabel label_2 = new JLabel("\uD68C\uC6D0\uC0AD\uC81C");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(753, 532, 57, 15);
		frame.getContentPane().add(label_2);

		customerAll();

	}

	public void customerAll() {
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
				lblNewLabel_5.setText((String) table.getValueAt(index, 0));
				textField.setText((String) table.getValueAt(index, 1));
				textField_1.setText((String) table.getValueAt(index, 2));
				textField_2.setText((String) table.getValueAt(index, 4));
				textField_3.setText((int) table.getValueAt(index, 5) + "");
				if (((String) table.getValueAt(index, 3)).equals("MALE")) {
					rdbtnNewRadioButton.setSelected(true);
					rdbtnNewRadioButton_1.setSelected(false);
				} else if (((String) table.getValueAt(index, 3)).equals("FEMALE")) {
					rdbtnNewRadioButton.setSelected(false);
					rdbtnNewRadioButton_1.setSelected(true);
				}
			}
		});
		scrollPane.setViewportView(table);
	}
}
