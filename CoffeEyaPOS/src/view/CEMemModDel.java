package view;

import java.awt.EventQueue;

import javax.swing.JFrame;

import model.Member;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CEMemModDel { // 사용자 정보 수정 / 삭제

	private JFrame frame;
	private Member loginUser;


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
	}
}
