package view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.MemberManagementService;
import model.Member;

public class CELogin {
	private MemberManagementService service = new MemberManagementService();
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
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(176, 224, 230));
		frame.setBounds(100, 100, 503, 457);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(49, 28, 392, 158);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(2, 2, 5, 5));

		JLabel id = new JLabel("ID");
		id.setFont(new Font("굴림", Font.BOLD, 25));
		id.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(id);

		userID = new JTextField();
		panel.add(userID);
		userID.setColumns(10);

		JLabel pw = new JLabel("PW");
		pw.setFont(new Font("굴림", Font.BOLD, 25));
		pw.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(pw);

		userPW = new JTextField();
		panel.add(userPW);
		userPW.setColumns(10);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(49, 231, 178, 62);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));

		JButton joinBtn = new JButton("\uD68C\uC6D0\uAC00\uC785");
		joinBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		joinBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// join클릭시 이동
				CEJoin join = new CEJoin();
			}
		});
		joinBtn.setFont(new Font("굴림", Font.BOLD, 20));
		panel_1.add(joinBtn, "name_2352430932658600");

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(263, 231, 178, 62);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new CardLayout(0, 0));

		JButton logoinBtn = new JButton("\uB85C\uADF8\uC778");
		logoinBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// 로그인
				String infoId = userID.getText();
				String infoPw = userPW.getText();

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
		logoinBtn.setFont(new Font("굴림", Font.BOLD, 20));
		panel_2.add(logoinBtn, "name_2352508316499700");

		JPanel panel_3 = new JPanel();
		panel_3.setBounds(140, 341, 224, 48);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(new CardLayout(0, 0));

		JLabel logo = new JLabel("CofeEya");
		logo.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 26));
		logo.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(logo, "name_2342710046826700");
	}
}
