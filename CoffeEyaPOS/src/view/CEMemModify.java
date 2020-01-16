package view;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.MemberManagementService;
import model.Member;

import javax.swing.JRadioButton;

public class CEMemModify {
	
	MemberManagementService service = new MemberManagementService();

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private Member selectUser;

	/**
	 * Create the application.
	 */
	public CEMemModify(Member selectUser) {
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
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 200, 1160, 400);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel = new JLabel("\uBE44\uBC00\uBC88\uD638 \uBCC0\uACBD");
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\uBE44\uBC00\uBC88\uD638 \uBCC0\uACBD \uD655\uC778");
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\uC774\uB984 \uC218\uC815");
		panel.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\uAD8C\uD55C \uC218\uC815");
		panel.add(lblNewLabel_3);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("\uAD00\uB9AC\uC790");
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("\uC9C1\uC6D0");
		panel_1.add(rdbtnNewRadioButton_1);
		
		ButtonGroup perm = new ButtonGroup();
		perm.add(rdbtnNewRadioButton);
		perm.add(rdbtnNewRadioButton_1);
		
		JButton btnNewButton_1 = new JButton("\uC218\uC815");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String infoId = selectUser.getMEM_ID();
				String infoPw = textField.getText();
				String infoPwCheck = textField_1.getText();
				String infoName = textField_2.getText();
				String infoPerm;
				if (rdbtnNewRadioButton.isSelected()) {
					infoPerm = "MANAGER";
				} else {
					infoPerm = "EMPLOYEE";
				}
				
				if (infoPw.equals(infoPwCheck)) {
					Member m = new Member(infoId, infoPw, infoName, infoPerm);					
					boolean result = service.memberModify(m);
					
					if (result) {
						JOptionPane.showMessageDialog(frame, "수정 성공");
						frame.dispose();
					} else {
						JOptionPane.showMessageDialog(frame, "수정 실패");
					}
				} else {
					JOptionPane.showMessageDialog(frame, "수정 실패");
				}
			}
		});
		btnNewButton_1.setBounds(900, 610, 272, 141);
		frame.getContentPane().add(btnNewButton_1);
	}
}
