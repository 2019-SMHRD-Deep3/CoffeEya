package view;

import java.awt.EventQueue;

import javax.swing.JFrame;

import model.Member;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CEAnalysis {

	private JFrame frame;
	private Member loginUser;

	/**
	 * Create the application.
	 */
	public CEAnalysis(Member loginUser) {
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

		JButton btnNewButton = new JButton("\uC0C1\uD488 \uAE30\uC900");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CEProductAnalysis productAnalysis = new CEProductAnalysis(loginUser);
			}
		});
		btnNewButton.setFont(new Font("±¼¸²", Font.BOLD, 26));
		btnNewButton.setBounds(121, 186, 260, 260);
		frame.getContentPane().add(btnNewButton);

		JButton button = new JButton("\uD310\uB9E4\uC218\uB2E8 \uAE30\uC900");
		button.setFont(new Font("±¼¸²", Font.BOLD, 26));
		button.setBounds(469, 186, 260, 260);
		frame.getContentPane().add(button);

		JButton button_1 = new JButton("\uB0A0\uC9DC \uAE30\uC900");
		button_1.setFont(new Font("±¼¸²", Font.BOLD, 26));
		button_1.setBounds(801, 186, 260, 260);
		frame.getContentPane().add(button_1);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CEMain main = new CEMain(loginUser);
				frame.dispose();
			}
		});
		btnNewButton_1.setBounds(1112, 10, 60, 60);
		frame.getContentPane().add(btnNewButton_1);
	}

}
