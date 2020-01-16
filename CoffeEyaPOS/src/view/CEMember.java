package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Member;

import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CEMember {

	private JFrame frame;
	private Member loginUser;

	/**
	 * Create the application.
	 */
	public CEMember(Member loginUser) {
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
		
		JPanel panel = new JPanel();
		panel.setBounds(40, 160, 1100, 540);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnNewButton = new JButton("\uC0AC\uC6A9\uC790 \uC815\uBCF4 \uB4F1\uB85D");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				CEMemJoin join = new CEMemJoin(loginUser);
			}
		});
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uC0AC\uC6A9\uC790 \uC815\uBCF4 \uC218\uC815 / \uC0AD\uC81C");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CEMemModDel memmoddel = new CEMemModDel(loginUser);
			}
		});
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uCD9C\uD1F4\uADFC \uAD00\uB9AC");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CEMemCommute commute = new CEMemCommute(loginUser);
			}
		});
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\uC0AC\uC6A9\uC790 \uBCC0\uACBD");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CEMemChange change = new CEMemChange(loginUser);
			}
		});
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\uB3CC\uC544\uAC00\uAE30");
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CEMain main = new CEMain(loginUser);
				frame.dispose();
			}
		});
		btnNewButton_4.setBounds(1075, 10, 100, 100);
		frame.getContentPane().add(btnNewButton_4);
	}
}
