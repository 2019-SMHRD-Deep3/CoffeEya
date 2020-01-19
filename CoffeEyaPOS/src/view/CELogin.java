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
import java.awt.Color;

public class CELogin {
	private MemberManagementService service = new MemberManagementService();

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JPanel panel_1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JPanel panel;
	private JPanel panel_2;


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
		frame.setBounds(100, 100, 895, 590);
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

		panel.setBounds(0, 0, 885, 551);
		frame.getContentPane().add(panel);
		panel.setLayout(null);


		
		JLabel lblNewLabel = new JLabel("");
		
		
		String imgPath1 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//man.png";
		ImageIcon icon1 = new ImageIcon(imgPath1);
		lblNewLabel.setIcon(icon1);
		lblNewLabel.setBounds(150, 189, 190, 90);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		String imgPath2 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//pw.png";
		ImageIcon icon2 = new ImageIcon(imgPath2);
		lblNewLabel_1.setIcon(icon2);
		
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 21));
		lblNewLabel_1.setBounds(150, 288, 190, 90);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel_1);

		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.PLAIN, 20));
		textField.setBackground(new Color(250, 235, 215));
		textField.setBounds(322, 204, 380, 60);
		panel.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("굴림", Font.PLAIN, 20));
		textField_1.setBackground(new Color(250, 235, 215));
		textField_1.setBounds(321, 304, 380, 60);
		panel.add(textField_1);
		textField_1.setColumns(10);

		panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 0, 0, 0));
		panel_1.setBounds(252, 421, 380, 60);
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 20, 0));

		btnNewButton = new JButton("\uB85C\uADF8\uC778");
		btnNewButton.setForeground(SystemColor.inactiveCaptionBorder);
		btnNewButton.setBackground(new Color(19,35,93));
		btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 20));
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
		btnNewButton_1.setForeground(SystemColor.inactiveCaptionBorder);
		btnNewButton_1.setBackground(new Color(19,35,93));
		btnNewButton_1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showConfirmDialog(frame, "종료하시겠습니까?", "프로그램 종료", JOptionPane.YES_NO_OPTION);
				frame.dispose();
			}
		});
		panel_1.add(btnNewButton_1);
		
		
		String imgPath3 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//logo.png";
		ImageIcon icon3 = new ImageIcon(imgPath3);
		
		panel_2 = new JPanel(){
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(icon3.getImage(), 0, 0, panel_2.getWidth(), panel_2.getHeight(), null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		panel_2.setBounds(13, 9, 210, 210);
		panel.add(panel_2);

	}
}
