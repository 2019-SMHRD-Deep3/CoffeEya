package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import model.Member;
import java.awt.GridLayout;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CEDeadline {

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
		frame.setBounds(100, 100, 1200, 800);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 400, 60);
		frame.getContentPane().add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JLabel lblNewLabel = new JLabel("\uC601\uC5C5 \uC2DC\uAC04");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel, 0, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel, 60, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel, 150, SpringLayout.WEST, panel);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uB0A0\uC9DC \uCD9C\uB825");
		
		SimpleDateFormat dateTime = new SimpleDateFormat("YYYY-MM-DD");
		Date time = new Date();
		String deadLineTime = dateTime.format(time);
		lblNewLabel_1.setText(deadLineTime);
		
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 0, SpringLayout.NORTH, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_1, 6, SpringLayout.EAST, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, 0, SpringLayout.SOUTH, lblNewLabel);
		sl_panel.putConstraint(SpringLayout.EAST, lblNewLabel_1, 0, SpringLayout.EAST, panel);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 162, 400, 589);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 5, 10));
		
		JLabel lblNewLabel_2 = new JLabel("\uACF5\uAE09\uAC00\uC561");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\uBD80\uAC00\uC138\uC561");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\uD569\uACC4 \uAE08\uC561");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("\uD604\uAE08");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("\uC2E0\uC6A9\uCE74\uB4DC");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lblNewLabel_11);
		
		JLabel lblNewLabel_14 = new JLabel("\uC601\uC5C5 \uC900\uBE44\uAE08");
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("New label");
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_1.add(lblNewLabel_15);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(12, 80, 400, 60);
		frame.getContentPane().add(panel_2);
		SpringLayout sl_panel_2 = new SpringLayout();
		panel_2.setLayout(sl_panel_2);
		
		JLabel lblNewLabel_12 = new JLabel("\uB9E4\uCD9C\uC561");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblNewLabel_12, 0, SpringLayout.NORTH, panel_2);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblNewLabel_12, 0, SpringLayout.WEST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.SOUTH, lblNewLabel_12, 60, SpringLayout.NORTH, panel_2);
		sl_panel_2.putConstraint(SpringLayout.EAST, lblNewLabel_12, 150, SpringLayout.WEST, panel_2);
		panel_2.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("\uB9E4\uCD9C\uC561 \uCD9C\uB825");
		
		
		
		sl_panel_2.putConstraint(SpringLayout.EAST, lblNewLabel_13, 0, SpringLayout.EAST, panel_2);
		lblNewLabel_13.setHorizontalAlignment(SwingConstants.RIGHT);
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblNewLabel_13, 0, SpringLayout.NORTH, panel_2);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblNewLabel_13, 6, SpringLayout.EAST, lblNewLabel_12);
		sl_panel_2.putConstraint(SpringLayout.SOUTH, lblNewLabel_13, 0, SpringLayout.SOUTH, lblNewLabel_12);
		panel_2.add(lblNewLabel_13);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 150, 400, 2);
		frame.getContentPane().add(separator);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(424, 162, 400, 400);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(new GridLayout(0, 3, 5, 10));
		
		JLabel lblNewLabel_24 = new JLabel("");
		lblNewLabel_24.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("\uB9E4\uC218");
		lblNewLabel_25.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_25);
		
		JLabel lblNewLabel_26 = new JLabel("\uC6D0");
		lblNewLabel_26.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_26);
		
		JLabel lblNewLabel_16 = new JLabel("\uC624\uB9CC\uC6D0");
		lblNewLabel_16.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_16);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_17 = new JLabel("\uB9CC\uC6D0");
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_17);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_3.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_18 = new JLabel("\uC624\uCC9C\uC6D0");
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_18);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_3.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_19 = new JLabel("\uCC9C\uC6D0");
		lblNewLabel_19.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_19);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_3.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_20 = new JLabel("\uC624\uBC31\uC6D0");
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_20);
		
		textField_8 = new JTextField();
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_3.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_21 = new JLabel("\uBC31\uC6D0");
		lblNewLabel_21.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_21);
		
		textField_10 = new JTextField();
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_3.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblNewLabel_22 = new JLabel("\uC624\uC2ED\uC6D0");
		lblNewLabel_22.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_22);
		
		textField_12 = new JTextField();
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_3.add(textField_13);
		textField_13.setColumns(10);
		
		JLabel lblNewLabel_23 = new JLabel("\uC2ED\uC6D0");
		lblNewLabel_23.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_23);
		
		textField_14 = new JTextField();
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_3.add(textField_15);
		textField_15.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(424, 572, 400, 179);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel_27 = new JLabel("\uB3C8\uD1B5 \uAE08\uC561");
		lblNewLabel_27.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_27);
		
		JLabel lblNewLabel_29 = new JLabel("\uB3C8\uD1B5 \uAE08\uC561 \uC785\uB825");
		lblNewLabel_29.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_4.add(lblNewLabel_29);
		
		JLabel lblNewLabel_28 = new JLabel("\uD604\uAE08 \uB9E4\uCD9C \uCD1D \uAE08\uC561");
		lblNewLabel_28.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_28);
		
		JLabel lblNewLabel_30 = new JLabel("\uD604\uAE08 \uB9E4\uCD9C \uCD1D \uAE08\uC561 \uC785\uB825");
		lblNewLabel_30.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_4.add(lblNewLabel_30);
		
		JLabel lblNewLabel_31 = new JLabel("\uCC28\uC561");
		lblNewLabel_31.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel_31);
		
		JLabel lblNewLabel_32 = new JLabel("\uCC28\uC561 \uC785\uB825");
		lblNewLabel_32.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_4.add(lblNewLabel_32);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(836, 162, 336, 400);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(new GridLayout(0, 3, 5, 5));
		
		JButton btnNewButton = new JButton("7");
		panel_5.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		panel_5.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("9");
		panel_5.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		panel_5.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		panel_5.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		panel_5.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("1");
		panel_5.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("2");
		panel_5.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("3");
		panel_5.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("0");
		panel_5.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("00");
		panel_5.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("000");
		panel_5.add(btnNewButton_11);
		
		JButton btnClear = new JButton("\u2190");
		panel_5.add(btnClear);
		
		JButton btnClear_1 = new JButton("Clear");
		panel_5.add(btnClear_1);
		
		JButton btnEnter = new JButton("Enter");
		panel_5.add(btnEnter);
	}
}
