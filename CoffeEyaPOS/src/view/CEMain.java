
package  view;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import model.Member;

public class CEMain {

	private JFrame frame;


	/**
	 * Create the application.
	 */
	public CEMain(Member loginUser) {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 907, 766);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("POS \uBA54\uC778\uD654\uBA74");
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 46));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(276, 28, 314, 63);
		frame.getContentPane().add(lblNewLabel);

		JSeparator separator = new JSeparator();
		separator.setBounds(12, 101, 867, 2);
		frame.getContentPane().add(separator);

		JButton btnNewButton = new JButton("\uD310\uB9E4 \uAC1C\uC2DC");
		btnNewButton.setFont(new Font("±¼¸²", Font.PLAIN, 38));
		btnNewButton.setBounds(634, 113, 225, 83);
		frame.getContentPane().add(btnNewButton);

		JButton button = new JButton("\uB9E4\uCD9C \uC870\uD68C");
		button.setFont(new Font("±¼¸²", Font.PLAIN, 38));
		button.setBounds(634, 206, 225, 83);
		frame.getContentPane().add(button);

		JButton button_1 = new JButton("\uB9E4\uCD9C \uC815\uC0B0");
		button_1.setFont(new Font("±¼¸²", Font.PLAIN, 38));
		button_1.setBounds(634, 299, 225, 83);
		frame.getContentPane().add(button_1);

		JButton button_2 = new JButton("\uD68C\uC6D0 \uAD00\uB9AC");
		button_2.setFont(new Font("±¼¸²", Font.PLAIN, 38));
		button_2.setBounds(634, 392, 225, 83);
		frame.getContentPane().add(button_2);

		JButton btnPos = new JButton("POS \uC885\uB8CC");
		btnPos.setFont(new Font("±¼¸²", Font.PLAIN, 38));
		btnPos.setBounds(634, 485, 225, 83);
		frame.getContentPane().add(btnPos);
	}
}
