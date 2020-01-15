package view;

import java.awt.EventQueue;

import javax.swing.JFrame;

import model.Member;

public class CEChange { // 사용자 변경

	private JFrame frame;
	private Member loginUser;

	/**
	 * Create the application.
	 */
	public CEChange(Member loginUser) {
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
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
