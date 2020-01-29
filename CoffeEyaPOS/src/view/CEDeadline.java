package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import controller.OrderingManagementService;
import controller.VaultCashManagermentService;
import model.Member;
import model.Ordering;
import model.VaultCash;

import java.awt.GridLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.SystemColor;

public class CEDeadline {

	OrderingManagementService oService = new OrderingManagementService();
	VaultCashManagermentService vService = new VaultCashManagermentService();

	private JFrame frame;
	private Member loginUser;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;

	private SimpleDateFormat dateTime = new SimpleDateFormat("YYYY-MM-DD");
	private Date time = new Date();
	private String deadLineTime = dateTime.format(time);
	private String deadLineTime2;
	private int orderingSum;
	private int orderingCashSum;
	private int orderingCardSum;
	private int vaultCashSum = vService.vaultCashLookup();
	private int[] vaultCashData = vService.vaultCashLookup2();

	/**
	 * Create the application.
	 */
	public CEDeadline(Member loginUser) {
		this.loginUser = loginUser;
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 1200, 800);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(12, 10, 400, 60);
		frame.getContentPane().add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);

		JLabel lblNewLabel = new JLabel("\uC601\uC5C5 \uC2DC\uAC04");
		lblNewLabel.setBackground(new Color(204, 153, 102));
		lblNewLabel.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel, 0, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel, 60, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel, 150, SpringLayout.WEST, panel);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("\uB0A0\uC9DC \uCD9C\uB825");
		lblNewLabel_1.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));

		lblNewLabel_1.setText(deadLineTime);
		deadLineTime2 = lblNewLabel_1.getText();
		orderingSum = oService.OrderingSum(deadLineTime2);

		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 0, SpringLayout.NORTH, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_1, 6, SpringLayout.EAST, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, 0, SpringLayout.SOUTH, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_1, 0, SpringLayout.EAST, panel);
		panel.add(lblNewLabel_1);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(12, 162, 400, 589);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 5, 10));

		JLabel lblNewLabel_2 = new JLabel("\uACF5\uAE09\uAC00\uC561");
		lblNewLabel_2.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel(String.valueOf((int) (orderingSum / 1.1)));
		lblNewLabel_3.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("\uBD80\uAC00\uC138\uC561");
		lblNewLabel_4.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel(String.valueOf(orderingSum - (int) (orderingSum / 1.1)));
		lblNewLabel_5.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("\uD569\uACC4 \uAE08\uC561");
		lblNewLabel_6.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel(
				String.valueOf(((int) (orderingSum / 1.1)) + (orderingSum - (int) (orderingSum / 1.1))));
		lblNewLabel_7.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_7);

		JLabel lblNewLabel_8 = new JLabel("\uD604\uAE08 \uACB0\uC81C\uC561");
		lblNewLabel_8.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_8);

		orderingCashSum = oService.OrderingCashSum(deadLineTime2);
		JLabel lblNewLabel_9 = new JLabel(String.valueOf(orderingCashSum));
		lblNewLabel_9.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_9);

		JLabel lblNewLabel_10 = new JLabel("\uC2E0\uC6A9\uCE74\uB4DC \uACB0\uC81C\uC561");
		lblNewLabel_10.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_10);

		orderingCardSum = oService.OrderingCardSum(deadLineTime2);
		JLabel lblNewLabel_11 = new JLabel(String.valueOf(orderingCardSum));
		lblNewLabel_11.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_11);

		JLabel lblNewLabel_14 = new JLabel("\uC2DC\uC7AC\uAE08");
		lblNewLabel_14.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_14);

		JLabel lblNewLabel_15 = new JLabel(String.valueOf(vaultCashSum));
		lblNewLabel_15.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_15);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(204, 153, 102));
		panel_2.setBounds(12, 80, 400, 60);
		frame.getContentPane().add(panel_2);
		SpringLayout sl_panel_2 = new SpringLayout();
		panel_2.setLayout(sl_panel_2);

		JLabel lblNewLabel_12 = new JLabel("\uB9E4\uCD9C\uC561");
		lblNewLabel_12.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblNewLabel_12, 0, SpringLayout.NORTH, panel_2);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblNewLabel_12, 0, SpringLayout.WEST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.SOUTH, lblNewLabel_12, 60, SpringLayout.NORTH, panel_2);
		sl_panel_2.putConstraint(SpringLayout.EAST, lblNewLabel_12, 150, SpringLayout.WEST, panel_2);
		panel_2.add(lblNewLabel_12);

		JLabel lblNewLabel_13 = new JLabel(String.valueOf(orderingSum));
		lblNewLabel_13.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		sl_panel_2.putConstraint(SpringLayout.EAST, lblNewLabel_13, 0, SpringLayout.EAST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.EAST, lblNewLabel_13, 0, SpringLayout.EAST, panel_2);
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.CENTER);
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblNewLabel_13, 0, SpringLayout.NORTH, panel_2);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblNewLabel_13, 6, SpringLayout.EAST, lblNewLabel_12);
		sl_panel_2.putConstraint(SpringLayout.SOUTH, lblNewLabel_13, 0, SpringLayout.SOUTH, lblNewLabel_12);
		panel_2.add(lblNewLabel_13);

		JSeparator separator = new JSeparator();
		separator.setBounds(12, 150, 400, 2);
		frame.getContentPane().add(separator);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.LIGHT_GRAY);
		panel_3.setBounds(424, 162, 400, 400);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(new GridLayout(0, 3, 5, 10));

		JLabel lblNewLabel_24 = new JLabel("");
		lblNewLabel_24.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_24);

		JLabel lblNewLabel_25 = new JLabel("\uB9E4\uC218");
		lblNewLabel_25.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 15));
		lblNewLabel_25.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_25);

		JLabel lblNewLabel_26 = new JLabel("\uC6D0");
		lblNewLabel_26.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 15));
		lblNewLabel_26.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_26);

		JLabel lblNewLabel_16 = new JLabel("\uC624\uB9CC\uC6D0");
		lblNewLabel_16.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_16);

		textField = new JTextField(
				String.valueOf(vaultCashData[0] + (Integer.parseInt(lblNewLabel_9.getText()) / 50000)));
		textField.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField(String.valueOf(Integer.parseInt(textField.getText()) * 50000));
		textField_1.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_17 = new JLabel("\uB9CC\uC6D0");
		lblNewLabel_17.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_17);

		textField_2 = new JTextField(
				String.valueOf(vaultCashData[1] + (Integer.parseInt(lblNewLabel_9.getText()) % 50000 / 10000)));
		textField_2.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField(String.valueOf(Integer.parseInt(textField_2.getText()) * 10000));
		textField_3.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblNewLabel_18 = new JLabel("\uC624\uCC9C\uC6D0");
		lblNewLabel_18.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_18);

		textField_4 = new JTextField(
				String.valueOf(vaultCashData[2] + (Integer.parseInt(lblNewLabel_9.getText()) % 10000 / 5000)));
		textField_4.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField(String.valueOf(Integer.parseInt(textField_4.getText()) * 5000));
		textField_5.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(textField_5);
		textField_5.setColumns(10);

		JLabel lblNewLabel_19 = new JLabel("\uCC9C\uC6D0");
		lblNewLabel_19.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		lblNewLabel_19.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_19);

		textField_6 = new JTextField(
				String.valueOf(vaultCashData[3] + (Integer.parseInt(lblNewLabel_9.getText()) % 5000 / 1000)));
		textField_6.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(textField_6);
		textField_6.setColumns(10);

		textField_7 = new JTextField(String.valueOf(Integer.parseInt(textField_6.getText()) * 1000));
		textField_7.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(textField_7);
		textField_7.setColumns(10);

		JLabel lblNewLabel_20 = new JLabel("\uC624\uBC31\uC6D0");
		lblNewLabel_20.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_20);

		textField_8 = new JTextField(
				String.valueOf(vaultCashData[4] + (Integer.parseInt(lblNewLabel_9.getText()) % 1000 / 500)));
		textField_8.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(textField_8);
		textField_8.setColumns(10);

		textField_9 = new JTextField(String.valueOf(Integer.parseInt(textField_8.getText()) * 500));
		textField_9.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(textField_9);
		textField_9.setColumns(10);

		JLabel lblNewLabel_21 = new JLabel("\uBC31\uC6D0");
		lblNewLabel_21.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		lblNewLabel_21.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_21);

		textField_10 = new JTextField(
				String.valueOf(vaultCashData[5] + (Integer.parseInt(lblNewLabel_9.getText()) % 500 / 100)));
		textField_10.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(textField_10);
		textField_10.setColumns(10);

		textField_11 = new JTextField(String.valueOf(Integer.parseInt(textField_10.getText()) * 100));
		textField_11.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(textField_11);
		textField_11.setColumns(10);

		JLabel lblNewLabel_22 = new JLabel("\uC624\uC2ED\uC6D0");
		lblNewLabel_22.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		lblNewLabel_22.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_22);

		textField_12 = new JTextField(
				String.valueOf(vaultCashData[6] + (Integer.parseInt(lblNewLabel_9.getText()) % 100 / 50)));
		textField_12.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(textField_12);
		textField_12.setColumns(10);

		textField_13 = new JTextField(String.valueOf(Integer.parseInt(textField_12.getText()) * 50));
		textField_13.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(textField_13);
		textField_13.setColumns(10);

		JLabel lblNewLabel_23 = new JLabel("\uC2ED\uC6D0");
		lblNewLabel_23.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		lblNewLabel_23.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_23);

		textField_14 = new JTextField(
				String.valueOf(vaultCashData[7] + (Integer.parseInt(lblNewLabel_9.getText()) % 50 / 10)));
		textField_14.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(textField_14);
		textField_14.setColumns(10);

		textField_15 = new JTextField(String.valueOf(Integer.parseInt(textField_14.getText()) * 10));
		textField_15.setFont(new Font("¸¼Àº °íµñ", Font.PLAIN, 15));
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(textField_15);
		textField_15.setColumns(10);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(204, 153, 102));
		panel_4.setBounds(424, 572, 400, 179);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(new GridLayout(0, 2, 0, 0));

		JLabel lblNewLabel_27 = new JLabel("\uB3C8\uD1B5 \uAE08\uC561");
		lblNewLabel_27.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		lblNewLabel_27.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_27);

		JLabel lblNewLabel_29 = new JLabel(
				String.valueOf(Integer.parseInt(textField_1.getText()) + Integer.parseInt(textField_3.getText())
						+ Integer.parseInt(textField_5.getText()) + Integer.parseInt(textField_7.getText())
						+ Integer.parseInt(textField_9.getText()) + Integer.parseInt(textField_11.getText())
						+ Integer.parseInt(textField_13.getText()) + Integer.parseInt(textField_15.getText())));
		lblNewLabel_29.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		lblNewLabel_29.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_29);

		JLabel lblNewLabel_28 = new JLabel("\uC2DC\uC7AC\uAE08");
		lblNewLabel_28.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		lblNewLabel_28.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_28);

		JLabel lblNewLabel_30 = new JLabel(lblNewLabel_15.getText());
		lblNewLabel_30.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		lblNewLabel_30.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_30);

		JLabel lblNewLabel_31 = new JLabel("\uD604\uAE08 \uB9E4\uCD9C \uCD1D \uAE08\uC561");
		lblNewLabel_31.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		lblNewLabel_31.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_31);

		JLabel lblNewLabel_32 = new JLabel(String
				.valueOf(Integer.parseInt(lblNewLabel_29.getText()) - Integer.parseInt(lblNewLabel_30.getText())));
		lblNewLabel_32.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		lblNewLabel_32.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_32);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.LIGHT_GRAY);
		panel_5.setBounds(836, 162, 336, 400);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(new GridLayout(0, 3, 5, 5));

		JButton btnNewButton = new JButton("7");
		btnNewButton.setForeground(SystemColor.inactiveCaptionBorder);
		btnNewButton.setBackground(new Color(19,35,93));
		btnNewButton.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		panel_5.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.setForeground(SystemColor.inactiveCaptionBorder);
		btnNewButton_1.setBackground(new Color(19,35,93));
		btnNewButton_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		panel_5.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("9");
		btnNewButton_2.setForeground(SystemColor.inactiveCaptionBorder);
		btnNewButton_2.setBackground(new Color(19,35,93));
		btnNewButton_2.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		panel_5.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.setForeground(SystemColor.inactiveCaptionBorder);
		btnNewButton_3.setBackground(new Color(19,35,93));
		btnNewButton_3.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		panel_5.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.setForeground(SystemColor.inactiveCaptionBorder);
		btnNewButton_4.setBackground(new Color(19,35,93));
		btnNewButton_4.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		panel_5.add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.setForeground(SystemColor.inactiveCaptionBorder);
		btnNewButton_5.setBackground(new Color(19,35,93));
		btnNewButton_5.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		panel_5.add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("1");
		btnNewButton_6.setForeground(SystemColor.inactiveCaptionBorder);
		btnNewButton_6.setBackground(new Color(19,35,93));
		btnNewButton_6.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		panel_5.add(btnNewButton_6);

		JButton btnNewButton_7 = new JButton("2");
		btnNewButton_7.setForeground(SystemColor.inactiveCaptionBorder);
		btnNewButton_7.setBackground(new Color(19,35,93));
		btnNewButton_7.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		panel_5.add(btnNewButton_7);

		JButton btnNewButton_8 = new JButton("3");
		btnNewButton_8.setForeground(SystemColor.inactiveCaptionBorder);
		btnNewButton_8.setBackground(new Color(19,35,93));
		btnNewButton_8.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		panel_5.add(btnNewButton_8);

		JButton btnNewButton_9 = new JButton("0");
		btnNewButton_9.setForeground(SystemColor.inactiveCaptionBorder);
		btnNewButton_9.setBackground(new Color(19,35,93));
		btnNewButton_9.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		panel_5.add(btnNewButton_9);

		JButton btnNewButton_10 = new JButton("00");
		btnNewButton_10.setForeground(SystemColor.inactiveCaptionBorder);
		btnNewButton_10.setBackground(new Color(19,35,93));
		btnNewButton_10.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		panel_5.add(btnNewButton_10);

		JButton btnNewButton_11 = new JButton("000");
		btnNewButton_11.setForeground(SystemColor.inactiveCaptionBorder);
		btnNewButton_11.setBackground(new Color(19,35,93));
		btnNewButton_11.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		panel_5.add(btnNewButton_11);

		JButton btnClear = new JButton("Del");
		btnClear.setForeground(SystemColor.inactiveCaptionBorder);
		btnClear.setBackground(new Color(19,35,93));
		btnClear.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		panel_5.add(btnClear);

		JButton btnClear_1 = new JButton("Clear");
		btnClear_1.setForeground(SystemColor.inactiveCaptionBorder);
		btnClear_1.setBackground(new Color(19,35,93));
		btnClear_1.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		btnClear_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textField.setText("0");
				textField_2.setText("0");
				textField_4.setText("0");
				textField_6.setText("0");
				textField_8.setText("0");
				textField_10.setText("0");
				textField_12.setText("0");
				textField_14.setText("0");

				textField_1.setText(String.valueOf(Integer.parseInt(textField.getText()) * 50000));
				textField_3.setText(String.valueOf(Integer.parseInt(textField_2.getText()) * 10000));
				textField_5.setText(String.valueOf(Integer.parseInt(textField_4.getText()) * 5000));
				textField_7.setText(String.valueOf(Integer.parseInt(textField_6.getText()) * 1000));
				textField_9.setText(String.valueOf(Integer.parseInt(textField_8.getText()) * 500));
				textField_11.setText(String.valueOf(Integer.parseInt(textField_10.getText()) * 100));
				textField_13.setText(String.valueOf(Integer.parseInt(textField_12.getText()) * 50));
				textField_15.setText(String.valueOf(Integer.parseInt(textField_14.getText()) * 10));

				lblNewLabel_29.setText(
						String.valueOf(Integer.parseInt(textField_1.getText()) + Integer.parseInt(textField_3.getText())
								+ Integer.parseInt(textField_5.getText()) + Integer.parseInt(textField_7.getText())
								+ Integer.parseInt(textField_9.getText()) + Integer.parseInt(textField_11.getText())
								+ Integer.parseInt(textField_13.getText()) + Integer.parseInt(textField_15.getText())));
				lblNewLabel_32.setText(String.valueOf(
						Integer.parseInt(lblNewLabel_29.getText()) - Integer.parseInt(lblNewLabel_30.getText())));
			}
		});
		panel_5.add(btnClear_1);

		JButton btnEnter = new JButton("Enter");
		btnEnter.setForeground(SystemColor.inactiveCaptionBorder);
		btnEnter.setBackground(new Color(19,35,93));
		btnEnter.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		panel_5.add(btnEnter);

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.GRAY);
		panel_6.setBounds(836, 10, 336, 130);
		frame.getContentPane().add(panel_6);
		panel_6.setLayout(new GridLayout(0, 2, 10, 0));
		
		JButton btnNewButton_12 = new JButton("\uC815\uC0B0");
		btnNewButton_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JOptionPane.showMessageDialog(frame, "Á¤»êÀÌ ¿Ï·áµÇ¾ú½À´Ï´Ù.");
				CEMain main = new CEMain(loginUser);
				frame.dispose();
			}
		});
		btnNewButton_12.setForeground(SystemColor.inactiveCaptionBorder);
		btnNewButton_12.setBackground(new Color(19,35,93));
		btnNewButton_12.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 30));
		panel_6.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("\u2190");
		btnNewButton_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				CEMain main = new CEMain(loginUser);
				frame.dispose();
			}
		});
		btnNewButton_13.setBackground(SystemColor.activeCaption);
		btnNewButton_13.setBackground(new Color(19,35,93));
		btnNewButton_13.setForeground(SystemColor.inactiveCaptionBorder);
		btnNewButton_13.setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 30));
		panel_6.add(btnNewButton_13);
		
	
		btnEnter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textField_1.setText(String.valueOf(Integer.parseInt(textField.getText()) * 50000));
				textField_3.setText(String.valueOf(Integer.parseInt(textField_2.getText()) * 10000));
				textField_5.setText(String.valueOf(Integer.parseInt(textField_4.getText()) * 5000));
				textField_7.setText(String.valueOf(Integer.parseInt(textField_6.getText()) * 1000));
				textField_9.setText(String.valueOf(Integer.parseInt(textField_8.getText()) * 500));
				textField_11.setText(String.valueOf(Integer.parseInt(textField_10.getText()) * 100));
				textField_13.setText(String.valueOf(Integer.parseInt(textField_12.getText()) * 50));
				textField_15.setText(String.valueOf(Integer.parseInt(textField_14.getText()) * 10));

				lblNewLabel_29.setText(
						String.valueOf(Integer.parseInt(textField_1.getText()) + Integer.parseInt(textField_3.getText())
								+ Integer.parseInt(textField_5.getText()) + Integer.parseInt(textField_7.getText())
								+ Integer.parseInt(textField_9.getText()) + Integer.parseInt(textField_11.getText())
								+ Integer.parseInt(textField_13.getText()) + Integer.parseInt(textField_15.getText())));
				lblNewLabel_32.setText(String.valueOf(
						Integer.parseInt(lblNewLabel_29.getText()) - Integer.parseInt(lblNewLabel_30.getText())));
			}
		});

	}
}
