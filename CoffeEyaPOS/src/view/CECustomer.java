package view;

import java.awt.EventQueue;
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
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.JRadioButton;

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
	private JPanel panel_add;
	private JPanel panel_reflash;
	private JPanel panel_rename;
	private JPanel panel_del;
	private JLabel lblNewLabel_6;
	private JTextField textField_3;

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
		
		JButton button = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CEMain main = new CEMain(loginUser);
				frame.dispose();
			}
		});
		button.setBounds(735, 25, 80, 80);
		frame.getContentPane().add(button);
		
		panel_1 = new JPanel();
		panel_1.setBounds(80, 320, 541, 252);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 0, 0));
		
		lblNewLabel = new JLabel("\uACE0\uAC1D \uBC88\uD638");
		panel_1.add(lblNewLabel);
		
		lblNewLabel_5 = new JLabel("\uACE0\uAC1D \uBC88\uD638 \uC120\uD0DD");
		panel_1.add(lblNewLabel_5);
		
		lblNewLabel_1 = new JLabel("\uACE0\uAC1D \uC774\uB984");
		panel_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		panel_1.add(textField);
		textField.setColumns(10);
		
		lblNewLabel_2 = new JLabel("\uACE0\uAC1D \uC804\uD654\uBC88\uD638");
		panel_1.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel_3 = new JLabel("\uACE0\uAC1D \uC131\uBCC4");
		panel_1.add(lblNewLabel_3);
		
		panel_2 = new JPanel();
		panel_1.add(panel_2);
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));
		
		rdbtnNewRadioButton = new JRadioButton("\uB0A8\uC790");
		panel_2.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("\uC5EC\uC790");
		panel_2.add(rdbtnNewRadioButton_1);
		
		ButtonGroup sex = new ButtonGroup();
		sex.add(rdbtnNewRadioButton);
		sex.add(rdbtnNewRadioButton_1);
		
		lblNewLabel_4 = new JLabel("\uACE0\uAC1D \uC0DD\uB144\uC6D4\uC77C");
		panel_1.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		lblNewLabel_6 = new JLabel("\uACE0\uAC1D \uC801\uB9BD\uD3EC\uC778\uD2B8");
		panel_1.add(lblNewLabel_6);
		
		textField_3 = new JTextField();
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		panel_add = new JPanel();
		panel_add.addMouseListener(new MouseAdapter() {
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
		panel_add.setBounds(724, 252, 100, 100);
		frame.getContentPane().add(panel_add);
		
		panel_reflash = new JPanel();
		panel_reflash.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CECusJoin join = new CECusJoin(loginUser);
				frame.dispose();
			}
		});
		panel_reflash.setBounds(724, 142, 100, 100);
		frame.getContentPane().add(panel_reflash);
		
		panel_rename = new JPanel();
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
		panel_rename.setBounds(724, 472, 100, 100);
		frame.getContentPane().add(panel_rename);
		
		panel_del = new JPanel();
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
		panel_del.setBounds(724, 362, 100, 100);
		frame.getContentPane().add(panel_del);

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
				lblNewLabel_5.setText((String)table.getValueAt(index, 0));
				textField.setText((String)table.getValueAt(index, 1));
				textField_1.setText((String)table.getValueAt(index, 2));
				textField_2.setText((String) table.getValueAt(index, 4));
				textField_3.setText((int)table.getValueAt(index, 5) + "");
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
