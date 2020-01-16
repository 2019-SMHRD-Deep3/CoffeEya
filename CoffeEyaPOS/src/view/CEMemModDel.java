package view;

import java.awt.EventQueue;

import javax.swing.JFrame;

import model.Member;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.MemberManagementService;

public class CEMemModDel { // 사용자 정보 수정 / 삭제

	MemberManagementService service = new MemberManagementService();
	
	private JFrame frame;
	private Member loginUser;
	private JTextField textField;
	private JTextField textField_1;


	/**
	 * Create the application.
	 */
	public CEMemModDel(Member loginUser) {
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
		panel.setBounds(12, 500, 1160, 251);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblNewLabel = new JLabel("\uC0AD\uC81C\uD560 \uC544\uC774\uB514");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("\uC0AD\uC81C");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String infoId = textField.getText();
				Member m = new Member(infoId);
				boolean result = service.memberDelete(m);
				
				if (result) {
					JOptionPane.showMessageDialog(frame, "삭제 성공");
					frame.dispose(); // 화면 종료
				} else {
					JOptionPane.showMessageDialog(frame, "삭제 실패");
				}
			}
		});
		panel.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 198, 1160, 251);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("\uC218\uC815\uD560 \uC544\uC774\uB514");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JButton button = new JButton("\uC218\uC815");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String infoId = textField_1.getText();
				
				Member m = new Member(infoId);
				Member selectUser = service.memberSelect(m);
				if (selectUser == null) {
					JOptionPane.showMessageDialog(frame, "해당 아이디가 존재하지 않습니다.");
				} else {
					JOptionPane.showMessageDialog(frame, "수정화면으로 넘어갑니다.");
					CEMemModify modify = new CEMemModify(selectUser);
					frame.dispose();
				}

			}
		});
		panel_1.add(button);
	}
}
