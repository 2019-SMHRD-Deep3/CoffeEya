package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import model.Detail;
import model.DetailDAO;

public class CEAnalysis {

	private JFrame frame;
	private JTextField textField;

	String[] colName = { "ÁÖ¹®»ó¼¼¹øÈ£", "ÁÖ¹®¹øÈ£", "»óÇ°¹øÈ£", "ÁÖ¹®¼ö·®" };
	DefaultTableModel tableModel = new DefaultTableModel(colName, 0);
	private JTable table=new JTable(tableModel);
	JScrollPane sp = new JScrollPane(table);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CEAnalysis window = new CEAnalysis();
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
	public CEAnalysis() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(lblNewLabel);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 153, 102));
		panel.setBounds(12, 45, 1160, 58);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(12, 10, 305, 38);
		panel.add(panel_1);

		JLabel lblNewLabel_1 = new JLabel("\uAE08\uC77C \uCD1D \uB9E4\uCD9C");
		lblNewLabel_1.setForeground(Color.WHITE);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("±¼¸²", Font.BOLD, 26));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setToolTipText("");

		textField = new JTextField();
		textField.setBounds(329, 10, 819, 38);
		panel.add(textField);
		textField.setColumns(10);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(204, 153, 102));
		panel_3.setLayout(null);
		panel_3.setBounds(12, 113, 1160, 58);
		frame.getContentPane().add(panel_3);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.DARK_GRAY);
		panel_4.setBounds(12, 10, 146, 38);
		panel_3.add(panel_4);

		JLabel label_1 = new JLabel("\uC8FC\uBB38 \uBC88\uD638");
		label_1.setToolTipText("");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("±¼¸²", Font.BOLD, 26));
		label_1.setBackground(Color.WHITE);
		panel_4.add(label_1);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.DARK_GRAY);
		panel_5.setBounds(170, 10, 146, 38);
		panel_3.add(panel_5);

		JLabel label_2 = new JLabel("\uC0C1\uD488\uBA85");
		label_2.setToolTipText("");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("±¼¸²", Font.BOLD, 26));
		label_2.setBackground(Color.WHITE);
		panel_5.add(label_2);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.DARK_GRAY);
		panel_2.setBounds(328, 10, 188, 38);
		panel_3.add(panel_2);

		JLabel label = new JLabel("\uC0C1\uD488 \uB2E8\uC77C\uAC00\uACA9");
		label.setToolTipText("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("±¼¸²", Font.BOLD, 26));
		label.setBackground(Color.WHITE);
		panel_2.add(label);

		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.DARK_GRAY);
		panel_6.setBounds(528, 10, 146, 38);
		panel_3.add(panel_6);

		JLabel label_3 = new JLabel("\uC8FC\uBB38 \uC218\uB7C9");
		label_3.setToolTipText("");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("±¼¸²", Font.BOLD, 26));
		label_3.setBackground(Color.WHITE);
		panel_6.add(label_3);

		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.DARK_GRAY);
		panel_7.setBounds(686, 10, 146, 38);
		panel_3.add(panel_7);

		JLabel label_4 = new JLabel("\uACB0\uC81C \uBC29\uBC95");
		label_4.setToolTipText("");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("±¼¸²", Font.BOLD, 26));
		label_4.setBackground(Color.WHITE);
		panel_7.add(label_4);

		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.DARK_GRAY);
		panel_8.setBounds(844, 10, 146, 38);
		panel_3.add(panel_8);

		JLabel label_5 = new JLabel("\uC8FC\uBB38 \uC2DC\uAC01");
		label_5.setToolTipText("");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("±¼¸²", Font.BOLD, 26));
		label_5.setBackground(Color.WHITE);
		panel_8.add(label_5);

		JPanel panel_9 = new JPanel();
		panel_9.setBackground(Color.DARK_GRAY);
		panel_9.setBounds(1002, 10, 146, 38);
		panel_3.add(panel_9);

		JLabel label_6 = new JLabel("\uD310\uB9E4 \uC0AC\uC6D0");
		label_6.setToolTipText("");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("±¼¸²", Font.BOLD, 26));
		label_6.setBackground(Color.WHITE);
		panel_9.add(label_6);

		DetailDAO dao = new DetailDAO();

		CEAnalysis m = new CEAnalysis();
		ArrayList<Detail> list = dao.getDetail();

		for (Detail v : list) {
			int de_num = v.getDe_num();
			int or_num = v.getOr_num();
			int pro_num = v.getPro_num();
			int de_amount = v.getDe_amount();

			Object str[] = { de_num, or_num, pro_num, de_amount };
			m.tableModel.addRow(str);
		}

		table.setBounds(12, 181, 1160, 215);
		frame.getContentPane().add(table);

		JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.WHITE);
		panel_10.setBounds(12, 406, 1160, 345);
		frame.getContentPane().add(panel_10);
		panel_10.setLayout(null);

		JPanel panel_11 = new JPanel();
		panel_11.setBackground(Color.DARK_GRAY);
		panel_11.setBounds(156, 58, 146, 38);
		panel_10.add(panel_11);

		JLabel label_7 = new JLabel("\uC0C1\uD488 \uBD84\uB958");
		label_7.setToolTipText("");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setForeground(Color.WHITE);
		label_7.setFont(new Font("±¼¸²", Font.BOLD, 26));
		label_7.setBackground(Color.WHITE);
		panel_11.add(label_7);

		JPanel panel_12 = new JPanel();
		panel_12.setBackground(Color.DARK_GRAY);
		panel_12.setBounds(505, 58, 146, 38);
		panel_10.add(panel_12);

		JLabel label_8 = new JLabel("\uACB0\uC81C \uBD84\uB958");
		label_8.setToolTipText("");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setForeground(Color.WHITE);
		label_8.setFont(new Font("±¼¸²", Font.BOLD, 26));
		label_8.setBackground(Color.WHITE);
		panel_12.add(label_8);

		JPanel panel_13 = new JPanel();
		panel_13.setBackground(Color.DARK_GRAY);
		panel_13.setBounds(869, 58, 146, 38);
		panel_10.add(panel_13);

		JLabel label_9 = new JLabel("\uC2DC\uAC01 \uBD84\uB958");
		label_9.setToolTipText("");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setForeground(Color.WHITE);
		label_9.setFont(new Font("±¼¸²", Font.BOLD, 26));
		label_9.setBackground(Color.WHITE);
		panel_13.add(label_9);

		JPanel panel_14 = new JPanel();
		panel_14.setBackground(Color.DARK_GRAY);
		panel_14.setBounds(12, 10, 1136, 38);
		panel_10.add(panel_14);

		JLabel label_10 = new JLabel("\uD310\uB9E4 \uBE44\uC728");
		label_10.setToolTipText("");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setForeground(Color.WHITE);
		label_10.setFont(new Font("±¼¸²", Font.BOLD, 26));
		label_10.setBackground(Color.WHITE);
		panel_14.add(label_10);

		JPanel panel_15 = new JPanel();
		panel_15.setBounds(1143, 10, 29, 29);
		frame.getContentPane().add(panel_15);

		JLabel label_11 = new JLabel("\uB4A4\uB85C\uAC00\uAE30");
		panel_15.add(label_11);
	}
}
