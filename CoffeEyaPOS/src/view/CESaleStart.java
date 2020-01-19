package view;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import model.Member;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;
import javax.swing.JSeparator;

public class CESaleStart {

	private JFrame frame;
	private Member loginUser;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	
	private Date selectedDate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CESaleStart window = new CESaleStart();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
//	public CESaleStart(Member loginUser) {
	public CESaleStart() {
//		this.loginUser = loginUser;
		initialize();
//		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(290, 10, 280, 341);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel = new JLabel("\uAE08\uC561");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_9 = new JLabel("\uB9E4\uC218");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_1 = new JLabel("\uC624\uB9CC\uC6D0");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField("2");
		textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\uB9CC\uC6D0");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_2);
		
		textField_2 = new JTextField("10");
		textField_2.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\uC624\uCC9C\uC6D0");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_3);
		
		textField_3 = new JTextField("10");
		textField_3.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("\uCC9C\uC6D0");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_4);
		
		textField_4 = new JTextField("30");
		textField_4.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("\uC624\uBC31\uC6D0");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_5);
		
		textField_5 = new JTextField("20");
		textField_5.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("\uBC31\uC6D0");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_6);
		
		textField_6 = new JTextField("100");
		textField_6.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("\uC624\uC2ED\uC6D0");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_7);
		
		textField_7 = new JTextField("0");
		textField_7.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("\uC2ED\uC6D0");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_8);
		
		textField_8 = new JTextField("0");
		textField_8.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("\uC2DC\uC7AC\uAE08 \uCD1D\uC561");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel(String.valueOf((Integer.parseInt(textField_1.getText()) * 50000) + (Integer.parseInt(textField_2.getText()) * 10000) + (Integer.parseInt(textField_3.getText()) * 5000) + (Integer.parseInt(textField_4.getText()) * 1000) + (Integer.parseInt(textField_5.getText()) * 500) + (Integer.parseInt(textField_6.getText()) * 100) + (Integer.parseInt(textField_7.getText()) * 50) + (Integer.parseInt(textField_8.getText()) * 10)));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(lblNewLabel_11);
		
		JButton btnNewButton = new JButton("\u2190");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				textField_1.setText("0");
				textField_2.setText("0");
				textField_3.setText("0");
				textField_4.setText("0");
				textField_5.setText("0");
				textField_6.setText("0");
				textField_7.setText("0");
				textField_8.setText("0");
			}
		});
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Enter");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_11.setText(String.valueOf((Integer.parseInt(textField_1.getText()) * 50000) + (Integer.parseInt(textField_2.getText()) * 10000) + (Integer.parseInt(textField_3.getText()) * 5000) + (Integer.parseInt(textField_4.getText()) * 1000) + (Integer.parseInt(textField_5.getText()) * 500) + (Integer.parseInt(textField_6.getText()) * 100) + (Integer.parseInt(textField_7.getText()) * 50) + (Integer.parseInt(textField_8.getText()) * 10)));
			}
		});
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uC601\uC5C5 \uC2DC\uC791");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				CESale sale = new CESale(loginUser);
				frame.dispose();
			}
		});
		btnNewButton_2.setBounds(12, 251, 266, 100);
		frame.getContentPane().add(btnNewButton_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 10, 266, 33);
		frame.getContentPane().add(panel_1);

		UtilDateModel model = new UtilDateModel();
		JDatePanelImpl datePanel = new JDatePanelImpl(model);
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);
		 
		panel_1.add(datePicker);
		
		selectedDate = (Date) datePicker.getModel().getValue();
	}
}