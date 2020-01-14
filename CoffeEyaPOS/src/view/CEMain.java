package view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Member;

public class CEMain {

	private JFrame frame;
	private Member loginUser;


	/**
	 * Create the application.
	 */
	public CEMain(Member loginUser) {
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
		panel.setBounds(40, 40, 1100, 680);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 2, 100, 100));
		
		JButton btnNewButton = new JButton("\uC601\uC5C5 \uB4F1\uB85D");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CESale sale = new CESale(loginUser);
				frame.dispose();
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uB9C8\uAC10 \uC815\uC0B0");
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uB9E4\uCD9C \uC870\uD68C");
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\uC0AC\uC6A9\uC790");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CEMember member = new CEMember(loginUser);
				frame.dispose();
			}
		});
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\uC124\uC815");
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("\uC885\uB8CC");
		panel.add(btnNewButton_5);
	}
}
