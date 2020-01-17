package view;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Member;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;

public class CEMain {

	private JFrame frame;
	private Member loginUser;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel panel_6;
	private JPanel panel_3;
	private JLabel lblNewLabel;

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

		String imgPath = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//mainCoffee.jpg";
		ImageIcon icon = new ImageIcon(imgPath);

		panel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, panel.getWidth(), panel.getHeight(), null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};

		panel.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(panel);

		String imgPath1 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//edit.png";
		ImageIcon icon1 = new ImageIcon(imgPath1);
		panel.setLayout(null);

		panel_1 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(icon1.getImage(), 0, 0, panel_1.getWidth(), panel_1.getHeight(), null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};

		panel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CESale sale = new CESale(loginUser);
				frame.dispose();
			}
		});
		panel_1.setBounds(69, 75, 262, 217);
		panel.add(panel_1);
		panel_1.setLayout(null);

		String imgPath2 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//final.png";
		ImageIcon icon2 = new ImageIcon(imgPath2);

		panel_2 = new JPanel() {
			protected void paintComponent(Graphics g) {
				g.drawImage(icon2.getImage(), 0, 0, panel_2.getWidth(), panel_2.getHeight(), null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}
		});
		panel_2.setLayout(null);
		panel_2.setBounds(470, 75, 262, 217);
		panel.add(panel_2);

		String imgPath4 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//user.png";
		ImageIcon icon4 = new ImageIcon(imgPath4);

		panel_4 = new JPanel() {
			protected void paintComponent(Graphics g) {
				g.drawImage(icon4.getImage(), 0, 0, panel_4.getWidth(), panel_4.getHeight(), null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		panel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CEMember member = new CEMember(loginUser);
				frame.dispose();
			}
		});

		String imgPath3 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//view.png";
		ImageIcon icon3 = new ImageIcon(imgPath3);

		panel_3 = new JPanel() {
			protected void paintComponent(Graphics g) {
				g.drawImage(icon3.getImage(), 0, 0, panel_3.getWidth(), panel_3.getHeight(), null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		panel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CEAnalysis analysis = new CEAnalysis(loginUser);
				frame.dispose();
			}
		});
		panel_3.setLayout(null);
		panel_3.setBounds(854, 75, 262, 217);
		panel.add(panel_3);
		panel_4.setBounds(69, 451, 262, 217);
		panel.add(panel_4);
		panel_4.setLayout(null);

		String imgPath5 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//settings.png";
		ImageIcon icon5 = new ImageIcon(imgPath5);

		panel_5 = new JPanel() {
			protected void paintComponent(Graphics g) {
				g.drawImage(icon5.getImage(), 0, 0, panel_5.getWidth(), panel_5.getHeight(), null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		panel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CESetProduct setProduct = new CESetProduct(loginUser);
				frame.dispose();
			}
		});
		panel_5.setLayout(null);
		panel_5.setBounds(470, 451, 262, 217);
		panel.add(panel_5);

		String imgPath6 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//client.png";
		ImageIcon icon6 = new ImageIcon(imgPath6);

		panel_6 = new JPanel() {
			protected void paintComponent(Graphics g) {
				g.drawImage(icon6.getImage(), 0, 0, panel_6.getWidth(), panel_6.getHeight(), null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		panel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CECustomer customer = new CECustomer(loginUser);
				frame.dispose();
			}
		});
		panel_6.setLayout(null);
		panel_6.setBounds(854, 451, 262, 217);
		panel.add(panel_6);

		lblNewLabel = new JLabel("직급 : " + loginUser.getMEM_PERM() + "    사용자 : " + loginUser.getMEM_NAME());
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(827, 10, 345, 37);
		panel.add(lblNewLabel);

	}
}
