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

public class CEMain {

	private JFrame frame;
	private Member loginUser;
	private JPanel panel;


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
		
		panel = new JPanel(){
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 0, 0, panel.getWidth(), panel.getHeight(), null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		
		
		panel.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(2, 2, 100, 100));
		
		JButton btnNewButton = new JButton("\uC601\uC5C5\uB4F1\uB85D");
		
	
		btnNewButton.setBackground(new Color(139, 69, 19));
		btnNewButton.setForeground(new Color(250, 235, 215));
		btnNewButton.setFont(new Font("CookieRun Regular", Font.PLAIN, 25));
		
		String imgPath1 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//edit.png";
		ImageIcon icon1 = new ImageIcon(imgPath1);
		btnNewButton.setIcon(icon1);
	
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
		
		JButton btnNewButton_1 = new JButton("");
		
		String imgPath2 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//final.png";
		ImageIcon icon2 = new ImageIcon(imgPath2);
		btnNewButton_1.setIcon(icon2);
		
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		String imgPath3 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//view.png";
		ImageIcon icon3 = new ImageIcon(imgPath3);
		btnNewButton_2.setIcon(icon3);
		
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CEAnalysis analysis = new CEAnalysis(loginUser);
				frame.dispose();
			}
		});
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		String imgPath4 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//user.png";
		ImageIcon icon4 = new ImageIcon(imgPath4);
		btnNewButton_3.setIcon(icon4);
		
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CEMember member = new CEMember(loginUser);
				frame.dispose();
			}
		});
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("");
		String imgPath5 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//settings.png";
		ImageIcon icon5 = new ImageIcon(imgPath5);
		btnNewButton_4.setIcon(icon5);
		
		
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CESet set = new CESet(loginUser);
				frame.dispose();
			}
		});
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		String imgPath6 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//out.png";
		ImageIcon icon6 = new ImageIcon(imgPath6);
		btnNewButton_5.setIcon(icon6);
		
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		panel.add(btnNewButton_5);
	}
}
