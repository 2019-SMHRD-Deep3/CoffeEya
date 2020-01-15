package view;

import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import controller.MemberManagementService;
import model.Member;
import view.CEMain;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Font;

public class CELogin {
	private MemberManagementService service = new MemberManagementService();

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JPanel panel_1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CELogin window = new CELogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CELogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		String imgPath = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//loginCoffee.jpg";
		ImageIcon icon = new ImageIcon(imgPath);

		panel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, panel.getWidth(), panel.getHeight(), null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};

		panel.setBounds(0, 0, 1200, 800);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("\uC544\uC774\uB514");
		lblNewLabel.setBounds(229, 179, 190, 90);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel_1.setBounds(229, 291, 190, 90);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_1);

		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.PLAIN, 20));
		textField.setBackground(SystemColor.inactiveCaptionBorder);
		textField.setBounds(515, 180, 380, 90);
		panel.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("굴림", Font.PLAIN, 20));
		textField_1.setBackground(SystemColor.inactiveCaptionBorder);
		textField_1.setBounds(515, 292, 380, 90);
		panel.add(textField_1);
		textField_1.setColumns(10);

		panel_1 = new JPanel();
		panel_1.setBounds(413, 465, 380, 60);
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 5, 0));

		btnNewButton = new JButton("\uB85C\uADF8\uC778");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String infoId = textField.getText();
				String infoPw = textField_1.getText();

				Member m = new Member(infoId, infoPw);
				Member loginUser = service.memberLogin(m);
				if (loginUser == null) {
					JOptionPane.showMessageDialog(frame, "로그인 실패");
				} else {
					JOptionPane.showMessageDialog(frame, "로그인 성공");
					CEMain main = new CEMain(loginUser);
					frame.dispose();
				}
			}
		});
		panel_1.add(btnNewButton);

		btnNewButton_1 = new JButton("\uC885\uB8CC");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				JOptionPane.showConfirmDialog(frame, "종료하시겠습니까?", "프로그램 종료", JOptionPane.YES_NO_OPTION);
				frame.dispose();
			}
		});
		panel_1.add(btnNewButton_1);

	}

}
