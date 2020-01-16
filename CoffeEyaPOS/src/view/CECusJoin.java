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
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.CustomerManagementService;
import model.Customer;
import model.Member;

import java.awt.CardLayout;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JRadioButton;

public class CECusJoin {
	
	CustomerManagementService service = new CustomerManagementService();
	
	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private Member loginUser;
	private JPanel panel_4;
	private JTextField textField_4;
	

	/**
	 * Create the application.
	 */
	public CECusJoin(Member loginUser) {
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
		frame.setBounds(150, 150, 1200, 800);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		String imgPath = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//joinCoffee.jpg";
		ImageIcon icon = new ImageIcon(imgPath);
		
		panel_4 = new JPanel(){
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, panel_4.getWidth(), panel_4.getHeight(), null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		frame.getContentPane().add(panel_4, "name_2532572478074700");
		panel_4.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(139, 69, 19));
		panel_3.setBounds(565, 10, 619, 740);
		panel_4.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uACE0\uAC1D \uB4F1\uB85D");
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setFont(new Font("HY°ß°íµñ", Font.PLAIN, 20));
		lblNewLabel.setForeground(new Color(250, 235, 215));
		lblNewLabel.setBounds(0, 0, 580, 100);
		panel_3.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(139, 69, 19));
		panel.setBounds(0, 110, 580, 500);
		panel_3.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("\uACE0\uAC1D \uBC88\uD638");
		lblNewLabel_1.setBounds(0, 0, 280, 84);
		lblNewLabel_1.setFont(new Font("HY°ß°íµñ", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(250, 235, 215));
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(300, 0, 280, 84);
		textField.setBackground(SystemColor.inactiveCaptionBorder);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\uACE0\uAC1D \uC131\uBA85");
		lblNewLabel_2.setBounds(0, 104, 280, 84);
		lblNewLabel_2.setFont(new Font("HY°ß°íµñ", Font.PLAIN, 20));
		lblNewLabel_2.setForeground(new Color(250, 235, 215));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(300, 104, 280, 84);
		textField_1.setBackground(SystemColor.inactiveCaptionBorder);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\uC804\uD654 \uBC88\uD638");
		lblNewLabel_3.setBounds(0, 208, 280, 84);
		lblNewLabel_3.setFont(new Font("HY°ß°íµñ", Font.PLAIN, 20));
		lblNewLabel_3.setForeground(new Color(250, 235, 215));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(300, 208, 280, 84);
		textField_2.setBackground(SystemColor.inactiveCaptionBorder);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("\uC131\uBCC4");
		lblNewLabel_4.setBounds(0, 312, 280, 84);
		lblNewLabel_4.setFont(new Font("HY°ß°íµñ", Font.PLAIN, 20));
		lblNewLabel_4.setForeground(new Color(250, 235, 215));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("\uC0DD\uB144 \uC6D4\uC77C(\uC5EC\uC12F \uC790\uB9AC)");
		lblNewLabel_5.setBounds(0, 416, 280, 84);
		lblNewLabel_5.setFont(new Font("HY°ß°íµñ", Font.PLAIN, 20));
		lblNewLabel_5.setForeground(new Color(250, 235, 215));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(300, 416, 280, 84);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(300, 312, 280, 84);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("\uB0A8\uC790");
		rdbtnNewRadioButton.setBounds(61, 22, 75, 33);
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("\uC5EC\uC790");
		rdbtnNewRadioButton_1.setBounds(172, 27, 49, 23);
		panel_1.add(rdbtnNewRadioButton_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(139, 69, 19));
		panel_2.setBounds(99, 632, 446, 78);
		panel_3.add(panel_2);
		panel_2.setLayout(new GridLayout(1, 0, 20, 0));
		
		JButton btnNewButton = new JButton("\uB4F1\uB85D");
		btnNewButton.setFont(new Font("HY°ß°íµñ", Font.PLAIN, 20));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int infoNumber = Integer.parseInt(textField.getText());
				String infoName = textField_1.getText();
				String infoPhone = textField_2.getText();
				String infoSex;
				if (rdbtnNewRadioButton.isSelected()) {
					infoSex = "MALE";
				} else {
					infoSex = "FEMALE";
				}
				String infoBirthday = textField_4.getText();
				Customer c = new Customer(infoNumber, infoName, infoPhone, infoSex, infoBirthday);
				
				boolean result = service.customerJoin(c);
				if (result) {
					JOptionPane.showMessageDialog(frame,
						    "È¸¿ø °¡ÀÔ ¼º°ø");
					frame.dispose(); // È­¸é Á¾·á
				} else{
					JOptionPane.showMessageDialog(frame,
						    "È¸¿ø °¡ÀÔ ½ÇÆÐ");
				}
			}
		});
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uCDE8\uC18C");
		btnNewButton_1.setFont(new Font("HY°ß°íµñ", Font.PLAIN, 20));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		panel_2.add(btnNewButton_1);
		ButtonGroup perm = new ButtonGroup();
	}
}
