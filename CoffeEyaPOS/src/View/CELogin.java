package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.CardLayout;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CELogin {

	private JFrame frame;
	private JTextField userID;
	private JTextField userPW;

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
		frame.getContentPane().setBackground(new Color(176, 224, 230));
		frame.setBounds(100, 100, 503, 457);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(49, 28, 392, 158);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(2, 2, 5, 5));
		
		JLabel id = new JLabel("ID");
		id.setFont(new Font("±¼¸²", Font.BOLD, 25));
		id.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(id);
		
		userID = new JTextField();
		panel.add(userID);
		userID.setColumns(10);
		
		JLabel pw = new JLabel("PW");
		pw.setFont(new Font("±¼¸²", Font.BOLD, 25));
		pw.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(pw);
		
		userPW = new JTextField();
		panel.add(userPW);
		userPW.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(49, 231, 178, 62);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));
		
		JLabel join = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		join.setFont(new Font("±¼¸²", Font.BOLD, 20));
		join.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(join, "name_2341890695008900");
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(263, 231, 178, 62);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new CardLayout(0, 0));
		
		JLabel login = new JLabel("\uB85C\uADF8\uC778");
		login.setFont(new Font("±¼¸²", Font.BOLD, 20));
		login.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String infoID = id.getText();
				String infoPW = pw.getText();
			}
		});
		login.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(login, "name_2341932295032900");
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(140, 341, 224, 48);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(new CardLayout(0, 0));
		
		JLabel logo = new JLabel("CofeEya");
		logo.setFont(new Font("±¼¸²", Font.BOLD | Font.ITALIC, 26));
		logo.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(logo, "name_2342710046826700");
	}
}
