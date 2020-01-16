package view;

import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;

import model.Customer;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.CustomerManagementService;
import model.Member;

import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import java.awt.Font;

public class CECusModify {
	CustomerManagementService service = new CustomerManagementService();

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private Customer selectUser;
	private JPanel panel;

	/**
	 * Create the application.
	 */
	public CECusModify(Customer selectUser) {
		this.selectUser = selectUser;
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 1200, 800);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("\uB3CC\uC544\uAC00\uAE30");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		btnNewButton.setBounds(1075, 10, 100, 100);
		frame.getContentPane().add(btnNewButton);

		String imgPath = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//textInput2.png";
		ImageIcon icon = new ImageIcon(imgPath);
		
		panel = new JPanel(){
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, panel.getWidth(), panel.getHeight(), null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		panel.setBounds(12, 200, 1160, 400);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));

		JLabel lblNewLabel = new JLabel("\uACE0\uAC1D\uC131\uBA85 \uBCC0\uACBD");
		lblNewLabel.setFont(new Font("Yoon® 대한", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);

		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("\uACE0\uAC1D\uC804\uD654\uBC88\uD638 \uBCC0\uACBD");
		lblNewLabel_1.setFont(new Font("Yoon® 대한", Font.PLAIN, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_1);

		textField_1 = new JTextField();
		panel.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("\uACE0\uAC1D\uC0DD\uC77C \uBCC0\uACBD (\uC5EC\uC12F \uC790\uB9AC)");
		lblNewLabel_2.setFont(new Font("Yoon® 대한", Font.PLAIN, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_2);

		textField_2 = new JTextField();
		panel.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("\uACE0\uAC1D\uC131\uBCC4 \uBCC0\uACBD");
		lblNewLabel_3.setFont(new Font("Yoon® 대한", Font.PLAIN, 15));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_3);

		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));

		JRadioButton rdbtnNewRadioButton = new JRadioButton("\uB0A8\uC131");
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("\uC5EC\uC131");
		rdbtnNewRadioButton_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(rdbtnNewRadioButton_1);

		ButtonGroup perm = new ButtonGroup();
		perm.add(rdbtnNewRadioButton);
		perm.add(rdbtnNewRadioButton_1);

		JButton btnNewButton_1 = new JButton("\uC218\uC815");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int CUS_NUMBER = selectUser.getCUS_NUMBER();
				String CUS_NAME = textField.getText();
				String CUS_PHONE = textField_1.getText();
				String CUS_BIRTHDAY = textField_2.getText();
				String CUS_SEX;
				if (rdbtnNewRadioButton.isSelected()) {
					CUS_SEX = "MALE";
				} else {
					CUS_SEX = "FEMALE";
				}

				Customer c = new Customer(CUS_NUMBER, CUS_NAME, CUS_PHONE, CUS_SEX, CUS_BIRTHDAY);
				boolean result = service.customerModify(c);

				if (result) {
					JOptionPane.showMessageDialog(frame, "수정 성공");
					frame.dispose();
				} else {
					JOptionPane.showMessageDialog(frame, "수정 실패");
				}

			}
		});
		btnNewButton_1.setBounds(900, 610, 272, 141);
		frame.getContentPane().add(btnNewButton_1);
	}
}
