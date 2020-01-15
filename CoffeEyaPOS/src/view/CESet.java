package view;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

import model.Member;

public class CESet {

	private JFrame frame;
	private Member loginUser;

	/**
	 * Create the application.
	 */
	public CESet(Member loginUser) {
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
		frame.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("\uB3CC\uC544\uAC00\uAE30");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CEMain main = new CEMain(loginUser);
				frame.dispose();
			}
		});
		btnNewButton.setBounds(1075, 10, 100, 100);
		frame.getContentPane().add(btnNewButton);
	}

}
