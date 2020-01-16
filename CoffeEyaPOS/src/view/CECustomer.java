package view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Member;

import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CECustomer {

	private JFrame frame;
	private Member loginUser;
	private JPanel panel_1;
	private JPanel panel;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;

	/**
	 * Create the application.
	 */
	public CECustomer(Member loginUser) {
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

		String imgPath = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//customers.png";
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
		panel.setLayout(null);

		String imgPath1 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//cusedit.png";
		ImageIcon icon1 = new ImageIcon(imgPath);

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
				CECusJoin cusJoin = new CECusJoin(loginUser);
			}
		});
		panel_1.setBounds(39, 283, 244, 221);
		panel.add(panel_1);

		String imgPath2 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//cusdel.png";
		ImageIcon icon2 = new ImageIcon(imgPath);

		panel_2 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(icon2.getImage(), 0, 0, panel_2.getWidth(), panel_2.getHeight(), null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CECusModDel cusModDel = new CECusModDel(loginUser);
			}
		});
		panel_2.setBounds(335, 283, 244, 221);
		panel.add(panel_2);

		String imgPath3 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//cusview.png";
		ImageIcon icon3 = new ImageIcon(imgPath);

		panel_3 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(icon3.getImage(), 0, 0, panel_3.getWidth(), panel_3.getHeight(), null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		panel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CECusSearch cusSearch = new CECusSearch(loginUser);
			}
		});
		panel_3.setBounds(619, 283, 244, 221);
		panel.add(panel_3);

		String imgPath4 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//cusback.png";
		ImageIcon icon4 = new ImageIcon(imgPath);

		panel_4 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(icon4.getImage(), 0, 0, panel_4.getWidth(), panel_4.getHeight(), null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		panel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CEMain main = new CEMain(loginUser);
				frame.dispose();
			}
		});
		panel_4.setBounds(899, 283, 244, 221);
		panel.add(panel_4);


	}
}