package view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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

public class CECusModDel {

	CustomerManagementService service = new CustomerManagementService();

	private JFrame frame;
	private Member loginUser;
	private JTextField textField_1;
	private JTextField textField;

	/**
	 * Create the application.
	 */
	public CECusModDel(Member loginUser) {
		this.loginUser = loginUser;
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(150, 150, 1200, 800);
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
		panel.setBounds(305, 324, 569, 78);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
				textField = new JTextField();
				textField.setBounds(124, 17, 288, 40);
				panel.add(textField);
				textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("\uC0AD\uC81C\uD560 \uC544\uC774\uB514");
		lblNewLabel.setBounds(12, 10, 100, 53);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);

		JButton button = new JButton("\uC0AD\uC81C");
		button.setBounds(447, 15, 88, 43);
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String infoId = textField.getText();
				Customer c = new Customer(infoId);
				boolean result = service.customerDelete(c);

				if (result) {
					JOptionPane.showMessageDialog(frame, "삭제 성공");
					frame.dispose(); // 화면 종료
				} else {
					JOptionPane.showMessageDialog(frame, "삭제 실패");
				}
			}
		});
		panel.add(button);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(305, 438, 569, 78);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
				JLabel lblNewLabel_1 = new JLabel("\uC218\uC815\uD560 \uC544\uC774\uB514");
				lblNewLabel_1.setBounds(12, 10, 97, 61);
				panel_1.add(lblNewLabel_1);
				lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
				
						textField_1 = new JTextField();
						textField_1.setBounds(121, 20, 289, 42);
						panel_1.add(textField_1);
						textField_1.setColumns(10);
						
								JButton button_1 = new JButton("\uC218\uC815");
								button_1.setBounds(447, 15, 91, 51);
								panel_1.add(button_1);
								button_1.addMouseListener(new MouseAdapter() {
									@Override
									public void mouseClicked(MouseEvent arg0) {
										String CUS_NUMBER = textField_1.getText();
										
										Customer c = new Customer(CUS_NUMBER);
										Customer selectCustomer2 = service.getInfoCustomer(c);

										if (selectCustomer2 == null) {
											JOptionPane.showMessageDialog(frame, "해당 고객번호가 존재하지 않습니다.");
										} else {
											JOptionPane.showMessageDialog(frame, "수정화면으로 넘어갑니다.");
											CECusModify modify = new CECusModify(selectCustomer2);
											frame.dispose();
										}

									}
								});

		textField_1 = new JTextField();
		textField_1.setColumns(10);
	}
}
