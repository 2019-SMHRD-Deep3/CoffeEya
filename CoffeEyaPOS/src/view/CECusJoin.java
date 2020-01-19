package view;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.CustomerManagementService;
import model.Customer;
import model.Member;

import java.awt.CardLayout;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JRadioButton;

public class CECusJoin {
   
   CustomerManagementService service = new CustomerManagementService();
   
   private JFrame frame;
   private JTextField textField;
   private JTextField textField_1;
   private JTextField textField_2;
   private Member loginUser;
   private JPanel panel_4;
   private JTextField textField_4;
   private JPanel panel_3;
   private JLabel lblNewLabel;
   private JLabel lblNewLabel_1;
   private JLabel lblNewLabel_2;
   private JLabel lblNewLabel_3;
   private JLabel lblNewLabel_4;
   private JLabel lblNewLabel_5;
   private JPanel panel_1;
   private JPanel panel;
   

   /**
    * Create the application.
    */
   public CECusJoin(Member loginUser) {
      this.loginUser = loginUser;
      initialize();
      frame.setVisible(true);
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize() {
      frame = new JFrame();
      frame.setResizable(false);

      frame.setBounds(100, 100, 1200, 800);
      frame.setBounds(150, 150, 1200, 800);
      frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      frame.getContentPane().setLayout(new CardLayout(0, 0));
      
      String imgPath = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//joinCoffee.jpg";
      ImageIcon icon = new ImageIcon(imgPath);
      
      panel_4 = new JPanel(){
         @Override
         protected void paintComponent(Graphics g) {
            g.drawImage(icon.getImage(), 0, 0, panel_4.getWidth(), panel_4.getHeight(), null);
            setOpaque(false);
            super.paintComponent(g);
         }
      };
      frame.getContentPane().add(panel_4, "name_2532572478074700");
      panel_4.setLayout(null);
      
      String imgPath1 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//blur.png";
      ImageIcon icon1 = new ImageIcon(imgPath1);
      
      panel_3 = new JPanel(){
          @Override
          protected void paintComponent(Graphics g) {
             g.drawImage(icon1.getImage(), 0, 0, panel_3.getWidth(), panel_3.getHeight(), null);
             setOpaque(false);
             super.paintComponent(g);
          }
       };
      panel_3.setBackground(Color.WHITE);
      panel_3.setBounds(565, 0, 619, 750);
      panel_4.add(panel_3);
      panel_3.setLayout(null);
      
      String imgPath2 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//cus1.png";
      ImageIcon icon2 = new ImageIcon(imgPath2);
      
      lblNewLabel = new JLabel(""){
          @Override
          protected void paintComponent(Graphics g) {
             g.drawImage(icon2.getImage(), 0, 0, lblNewLabel.getWidth(), lblNewLabel.getHeight(), null);
             setOpaque(false);
             super.paintComponent(g);
          }
       };
      lblNewLabel.setBackground(new Color(240, 240, 240));
      lblNewLabel.setFont(new Font("HY°ß°íµñ", Font.PLAIN, 20));
      lblNewLabel.setForeground(new Color(250, 235, 215));
      lblNewLabel.setBounds(185, 10, 265, 67);
      panel_3.add(lblNewLabel);
      lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
      
      String imgPath9 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//bg_sky.png";
      ImageIcon icon9 = new ImageIcon(imgPath9);
      
      panel = new JPanel(){
          @Override
          protected void paintComponent(Graphics g) {
             g.drawImage(icon9.getImage(), 0, 0, panel.getWidth(), panel.getHeight(), null);
             setOpaque(false);
             super.paintComponent(g);
          }
       };
      panel.setBackground(Color.WHITE);
      panel.setBounds(0, 87, 619, 523);
      panel_3.add(panel);
      
      String imgPath3 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//cus2.png";
      ImageIcon icon3 = new ImageIcon(imgPath3);
      panel.setLayout(null);
      
      lblNewLabel_1 = new JLabel(""){
          @Override
          protected void paintComponent(Graphics g) {
             g.drawImage(icon3.getImage(), 0, 0, lblNewLabel_1.getWidth(), lblNewLabel_1.getHeight(), null);
             setOpaque(false);
             super.paintComponent(g);
          }
       };
      lblNewLabel_1.setBounds(61, 38, 165, 46);
      lblNewLabel_1.setFont(new Font("HY°ß°íµñ", Font.PLAIN, 20));
      lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
      lblNewLabel_1.setForeground(new Color(250, 235, 215));
      panel.add(lblNewLabel_1);
      
      textField = new JTextField();
      textField.setBounds(300, 38, 280, 46);
      textField.setBackground(SystemColor.inactiveCaptionBorder);
      panel.add(textField);
      textField.setColumns(10);
      
      String imgPath4 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//cus3.png";
      ImageIcon icon4 = new ImageIcon(imgPath4);
      
      
      lblNewLabel_2 = new JLabel(""){
          @Override
          protected void paintComponent(Graphics g) {
             g.drawImage(icon4.getImage(), 0, 0, lblNewLabel_2.getWidth(), lblNewLabel_2.getHeight(), null);
             setOpaque(false);
             super.paintComponent(g);
          }
       };
      lblNewLabel_2.setBounds(61, 142, 165, 46);
      lblNewLabel_2.setFont(new Font("HY°ß°íµñ", Font.PLAIN, 20));
      lblNewLabel_2.setForeground(new Color(250, 235, 215));
      lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
      panel.add(lblNewLabel_2);
      
      textField_1 = new JTextField();
      textField_1.setBounds(300, 142, 280, 46);
      textField_1.setBackground(SystemColor.inactiveCaptionBorder);
      panel.add(textField_1);
      textField_1.setColumns(10);
      
      String imgPath5 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//cus4.png";
      ImageIcon icon5 = new ImageIcon(imgPath5);
      
      
      lblNewLabel_3 = new JLabel(""){
          @Override
          protected void paintComponent(Graphics g) {
             g.drawImage(icon5.getImage(), 0, 0, lblNewLabel_3.getWidth(), lblNewLabel_3.getHeight(), null);
             setOpaque(false);
             super.paintComponent(g);
          }
       };
      lblNewLabel_3.setBounds(61, 246, 165, 46);
      lblNewLabel_3.setFont(new Font("HY°ß°íµñ", Font.PLAIN, 20));
      lblNewLabel_3.setForeground(new Color(250, 235, 215));
      lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
      panel.add(lblNewLabel_3);
      
      textField_2 = new JTextField();
      textField_2.setBounds(300, 246, 280, 46);
      textField_2.setBackground(SystemColor.inactiveCaptionBorder);
      panel.add(textField_2);
      textField_2.setColumns(10);
      
      String imgPath6 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//cus5.png";
      ImageIcon icon6 = new ImageIcon(imgPath6);
      
      lblNewLabel_4 = new JLabel(""){
          @Override
          protected void paintComponent(Graphics g) {
             g.drawImage(icon6.getImage(), 0, 0, lblNewLabel_4.getWidth(), lblNewLabel_4.getHeight(), null);
             setOpaque(false);
             super.paintComponent(g);
          }
       };
      lblNewLabel_4.setBounds(61, 348, 165, 46);
      lblNewLabel_4.setFont(new Font("HY°ß°íµñ", Font.PLAIN, 20));
      lblNewLabel_4.setForeground(new Color(250, 235, 215));
      lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
      panel.add(lblNewLabel_4);
      
      String imgPath7 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//cus6.png";
      ImageIcon icon7 = new ImageIcon(imgPath7);
      
      lblNewLabel_5 = new JLabel(""){
          @Override
          protected void paintComponent(Graphics g) {
             g.drawImage(icon7.getImage(), 0, 0, lblNewLabel_5.getWidth(), lblNewLabel_5.getHeight(), null);
             setOpaque(false);
             super.paintComponent(g);
          }
       };
      lblNewLabel_5.setBounds(61, 446, 165, 46);
      lblNewLabel_5.setFont(new Font("HY°ß°íµñ", Font.PLAIN, 20));
      lblNewLabel_5.setForeground(new Color(250, 235, 215));
      lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
      panel.add(lblNewLabel_5);
      
      textField_4 = new JTextField();
      textField_4.setBounds(300, 454, 280, 46);
      textField_4.setFont(new Font("±¼¸²", Font.PLAIN, 12));
      textField_4.setBackground(SystemColor.inactiveCaptionBorder);
      panel.add(textField_4);
      textField_4.setColumns(10);
      
      
      panel_1 = new JPanel();
      panel_1.setBounds(321, 352, 247, 54);
      panel_1.setBackground(SystemColor.inactiveCaptionBorder);
      panel.add(panel_1);
      panel_1.setLayout(null);
      
      JRadioButton rdbtnNewRadioButton = new JRadioButton("\uB0A8\uC790");
      rdbtnNewRadioButton.setFont(new Font("HY°ß°íµñ", Font.PLAIN, 12));
      rdbtnNewRadioButton.setBackground(SystemColor.inactiveCaptionBorder);
      rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
      rdbtnNewRadioButton.setBounds(35, 18, 75, 33);
      panel_1.add(rdbtnNewRadioButton);
      
      JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("\uC5EC\uC790");
      rdbtnNewRadioButton_1.setFont(new Font("HY°ß°íµñ", Font.PLAIN, 12));
      rdbtnNewRadioButton_1.setBackground(SystemColor.inactiveCaptionBorder);
      rdbtnNewRadioButton_1.setHorizontalAlignment(SwingConstants.CENTER);
      rdbtnNewRadioButton_1.setBounds(139, 18, 75, 33);
      panel_1.add(rdbtnNewRadioButton_1);
      
      JButton btnNewButton_1 = new JButton("\uCDE8\uC18C");
      btnNewButton_1.setBounds(343, 654, 100, 40);
      panel_3.add(btnNewButton_1);
      btnNewButton_1.setFont(new Font("HY°ß°íµñ", Font.PLAIN, 20));
      
      JButton btnNewButton = new JButton("\uB4F1\uB85D");
      btnNewButton.setBounds(185, 654, 100, 40);
      panel_3.add(btnNewButton);
      btnNewButton.setFont(new Font("HY°ß°íµñ", Font.PLAIN, 20));
      btnNewButton.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
            String infoNumber = textField.getText();
            String infoName = textField_1.getText();
            String infoPhone = textField_2.getText();
            String infoSex;
            if (rdbtnNewRadioButton.isSelected()) {
               infoSex = "MALE";
            } else {
               infoSex = "FEMALE";
            }
            String infoBirthday = textField_4.getText();
            Customer c = new Customer(infoNumber, infoName, infoPhone, infoSex, infoBirthday);
            
            boolean result = service.customerJoin(c);
            if (result) {
               JOptionPane.showMessageDialog(frame, "È¸¿ø °¡ÀÔ ¼º°ø");
               CECustomer customer = new CECustomer(loginUser);
               frame.dispose(); // È­¸é Á¾·á
            } else{
               JOptionPane.showMessageDialog(frame, "È¸¿ø °¡ÀÔ ½ÇÆÐ");
            }
         }
      });
      btnNewButton_1.addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
        	 CECustomer customer = new CECustomer(loginUser);
             frame.dispose();
         }
      });
      ButtonGroup perm = new ButtonGroup();
   }
}