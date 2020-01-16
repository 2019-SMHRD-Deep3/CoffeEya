package view;

import java.awt.EventQueue;

import javax.swing.JFrame;

import model.Member;

public class CECusSearch {

	private JFrame frame;
	private Member loginUser;


	/**
	 * Create the application.
	 */
	public CECusSearch(Member loginUser) {
		this.loginUser = loginUser;
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
