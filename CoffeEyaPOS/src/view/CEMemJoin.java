package view;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

import controller.MemberManagementService;
import model.Member;
import java.awt.CardLayout;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Font;

public class CEMemJoin {

	MemberManagementService service = new MemberManagementService();

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private Member loginUser;
	private JPanel panel_4;
	private JPanel panel_3;
	private JLabel lblNewLabel;

	/**
	 * Create the application.
	 */
	public CEMemJoin(Member loginUser) {
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
		frame.setBounds(150, 150, 1200, 800);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));

		String imgPath = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//joinCoffee.jpg";
		ImageIcon icon = new ImageIcon(imgPath);

		panel_4 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, panel_4.getWidth(), panel_4.getHeight(), null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		frame.getContentPane().add(panel_4, "name_2532572478074700");
		panel_4.setLayout(null);

//		String imgPath1 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//joinCoffee.jpg";
//		ImageIcon icon1 = new ImageIcon(imgPath1);
		
		panel_3 = new JPanel();
//		{
//			@Override
//			protected void paintComponent(Graphics g) {
//				g.drawImage(icon1.getImage(), 0, 0, panel_3.getWidth(), panel_3.getHeight(), null);
//				setOpaque(false);
//				super.paintComponent(g);
//			}
//		};
		panel_3.setBackground(Color.DARK_GRAY);
		panel_3.setBounds(596, 8, 580, 712);
		panel_4.add(panel_3);
		panel_3.setLayout(null);

		String imgPath2 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//user1.png";
		ImageIcon icon2 = new ImageIcon(imgPath2);
		
		lblNewLabel = new JLabel(""){
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(icon2.getImage(), 0, 0, lblNewLabel.getWidth(), lblNewLabel.getHeight(), null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setFont(new Font("HY°ß°íµñ", Font.PLAIN, 20));
		lblNewLabel.setForeground(new Color(250, 235, 215));
		lblNewLabel.setBounds(61, 10, 469, 90);
		panel_3.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255,0,0,0));
		panel.setBounds(0, 110, 580, 507);
		panel_3.add(panel);

		String imgPath3 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//user2.png";
		ImageIcon icon3 = new ImageIcon(imgPath3);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel(""){
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(icon3.getImage(), 35, 0, 235, 80, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		lblNewLabel_1.setBounds(0, 0, 280, 84);
		lblNewLabel_1.setFont(new Font("HY°ß°íµñ", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(250, 235, 215));
		panel.add(lblNewLabel_1);

		textField = new JTextField();
		textField.setBounds(300, 21, 255, 45);
		textField.setBackground(Color.WHITE);
		panel.add(textField);
		textField.setColumns(10);

		String imgPath4 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//user3.png";
		ImageIcon icon4 = new ImageIcon(imgPath4);
		
		JLabel lblNewLabel_2 = new JLabel(""){
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(icon4.getImage(), 35, 0, 235, 80, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		lblNewLabel_2.setBounds(0, 104, 280, 84);
		lblNewLabel_2.setFont(new Font("HY°ß°íµñ", Font.PLAIN, 20));
		lblNewLabel_2.setForeground(new Color(250, 235, 215));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_2);

		textField_1 = new JTextField();
		textField_1.setBounds(300, 125, 255, 45);
		textField_1.setBackground(Color.WHITE);
		panel.add(textField_1);
		textField_1.setColumns(10);

		String imgPath5 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//user4.png";
		ImageIcon icon5 = new ImageIcon(imgPath5);
		
		JLabel lblNewLabel_3 = new JLabel(""){
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(icon5.getImage(), 35, 0, 235, 80, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		lblNewLabel_3.setBounds(0, 208, 280, 84);
		lblNewLabel_3.setFont(new Font("HY°ß°íµñ", Font.PLAIN, 20));
		lblNewLabel_3.setForeground(new Color(250, 235, 215));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_3);

		textField_2 = new JTextField();
		textField_2.setBounds(300, 226, 255, 50);
		textField_2.setBackground(Color.WHITE);
		panel.add(textField_2);
		textField_2.setColumns(10);

		String imgPath6 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//user5.png";
		ImageIcon icon6 = new ImageIcon(imgPath6);
		
		JLabel lblNewLabel_4 = new JLabel(""){
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(icon6.getImage(), 35, 0, 235, 80, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		lblNewLabel_4.setBounds(0, 312, 280, 84);
		lblNewLabel_4.setFont(new Font("HY°ß°íµñ", Font.PLAIN, 20));
		lblNewLabel_4.setForeground(new Color(250, 235, 215));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_4);

		textField_3 = new JTextField();
		textField_3.setBounds(300, 330, 255, 50);
		textField_3.setBackground(Color.WHITE);
		panel.add(textField_3);
		textField_3.setColumns(10);

		String imgPath7 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//user6.png";
		ImageIcon icon7 = new ImageIcon(imgPath7);
		
		JLabel lblNewLabel_5 = new JLabel(""){
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(icon7.getImage(), 35, 0, 235, 80, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		lblNewLabel_5.setBounds(0, 416, 280, 84);
		lblNewLabel_5.setFont(new Font("HY°ß°íµñ", Font.PLAIN, 20));
		lblNewLabel_5.setForeground(new Color(250, 235, 215));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_5);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(300, 416, 255, 84);
		panel_1.setBackground(new Color(255,0,0,0));
		panel.add(panel_1);
		panel_1.setLayout(null);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("\uAD00\uB9AC\uC790");
		rdbtnNewRadioButton.setBounds(8, 18, 110, 43);
		rdbtnNewRadioButton.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton.setFont(new Font("HY°ß°íµñ", Font.PLAIN, 20));
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton.setForeground(Color.WHITE);
		panel_1.add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("\uC9C1\uC6D0");
		rdbtnNewRadioButton_1.setBounds(135, 18, 110, 43);
		rdbtnNewRadioButton_1.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton_1.setFont(new Font("HY°ß°íµñ", Font.PLAIN, 20));
		rdbtnNewRadioButton_1.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnNewRadioButton_1.setForeground(Color.WHITE);
		panel_1.add(rdbtnNewRadioButton_1);

		ButtonGroup perm = new ButtonGroup();
		perm.add(rdbtnNewRadioButton);
		perm.add(rdbtnNewRadioButton_1);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBackground(new Color(255,0,0,0));
		panel_2.setBounds(0, 620, 580, 90);
		panel_3.add(panel_2);

		JButton btnNewButton = new JButton("\uB4F1\uB85D");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBounds(208, 27, 115, 41);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("HY°ß°íµñ", Font.PLAIN, 20));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String infoId = textField.getText();
				String infoPw = textField_1.getText();
				String infoPwCheck = textField_2.getText();
				String infoName = textField_3.getText();
				String infoPerm;
				if (rdbtnNewRadioButton.isSelected()) {
					infoPerm = "MANAGER";
				} else {
					infoPerm = "EMPLOYEE";
				}
				
				if (infoPw.equals(infoPwCheck)) {
					Member m = new Member(infoId, infoPw, infoName, infoPerm);
					boolean result = service.memberJoin(m);
					
					if (result) {
						JOptionPane.showMessageDialog(frame, "È¸¿ø °¡ÀÔ ¼º°ø");
						CEMember member = new CEMember(loginUser);
						frame.dispose(); // È­¸é Á¾·á
					} else {
						JOptionPane.showMessageDialog(frame, "È¸¿ø °¡ÀÔ ½ÇÆÐ");
					}
				} else {
					JOptionPane.showMessageDialog(frame, "È¸¿ø °¡ÀÔ ½ÇÆÐ");
				}
			}
		});
		panel_2.setLayout(null);
		panel_2.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("\uCDE8\uC18C");
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setBounds(382, 27, 122, 41);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("HY°ß°íµñ", Font.PLAIN, 20));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CEMember member = new CEMember(loginUser);
				frame.dispose();
			}
		});
		panel_2.add(btnNewButton_1);

	}
}
