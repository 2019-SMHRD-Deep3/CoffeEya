package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

import controller.MemberManagementService;
import model.Member;

public class CEJoin {

	MemberManagementService service = new MemberManagementService();

	private JFrame frame;
	private JTextField id;
	private JTextField pw;
	private JTextField pw1;
	private JTextField name;
	private JTextField birth;
	private JTextField email;
	private JTextField phone;
	private JTextField address;
	private JRadioButton female;
	private JRadioButton male;
	private JRadioButton manager;
	private JRadioButton employee;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CEJoin window = new CEJoin();
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
	public CEJoin() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 550, 750);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // ȭ�� ����� ȸ������ GUI�� ������ ����
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);

		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 10, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel label = new JLabel("\uD68C\uC6D0\uAC00\uC785");
		label.setFont(new Font("����", Font.BOLD, 50));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(12, 10, 490, 90);
		panel.add(label);

		JPanel panel_1 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_1, 126, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel_1, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_1, -105, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel_1, -10, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, -6, SpringLayout.NORTH, panel_1);
		springLayout.putConstraint(SpringLayout.EAST, panel, 0, SpringLayout.EAST, panel_1);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(0, 2, 10, 10));

		JLabel lblNewLabel = new JLabel("\uC544\uC774\uB514");
		lblNewLabel.setFont(new Font("����", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lblNewLabel);

		id = new JTextField();
		panel_1.add(id);
		id.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel_1.setFont(new Font("����", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lblNewLabel_1);

		pw = new JTextField();
		panel_1.add(pw);
		pw.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		lblNewLabel_2.setFont(new Font("����", Font.BOLD, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lblNewLabel_2);

		pw1 = new JTextField();
		panel_1.add(pw1);
		pw1.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("\uC774\uB984");
		lblNewLabel_3.setFont(new Font("����", Font.BOLD, 20));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lblNewLabel_3);

		name = new JTextField();
		panel_1.add(name);
		name.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("\uC0DD\uB144\uC6D4\uC77C");
		lblNewLabel_4.setFont(new Font("����", Font.BOLD, 20));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lblNewLabel_4);

		birth = new JTextField();
		panel_1.add(birth);
		birth.setColumns(10);

		JLabel lblNewLabel_5 = new JLabel("\uC131\uBCC4");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5.setFont(new Font("����", Font.BOLD, 20));
		panel_1.add(lblNewLabel_5);

		JPanel sex = new JPanel();
		panel_1.add(sex);
		sex.setLayout(new GridLayout(0, 2, 0, 0));

		male = new JRadioButton("\uB0A8\uC790");
		male.setHorizontalAlignment(SwingConstants.CENTER);
		sex.add(male);

		female = new JRadioButton("\uC5EC\uC790");
		female.setHorizontalAlignment(SwingConstants.CENTER);
		sex.add(female);

		// ���� �� �� �ϳ��� ���õǰ� ����
		ButtonGroup group_sex = new ButtonGroup();
		group_sex.add(male);
		group_sex.add(female);

		JLabel lblNewLabel_6 = new JLabel("JOB");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_6.setFont(new Font("����", Font.BOLD, 20));
		panel_1.add(lblNewLabel_6);

		JPanel job = new JPanel();
		panel_1.add(job);
		job.setLayout(new GridLayout(0, 2, 0, 0));

		manager = new JRadioButton("\uAD00\uB9AC\uC790");
		manager.setHorizontalAlignment(SwingConstants.CENTER);
		job.add(manager);

		employee = new JRadioButton("\uC9C1\uC6D0");
		employee.setHorizontalAlignment(SwingConstants.CENTER);
		job.add(employee);

		// ���� �� �� �ϳ��� ���õǰ� ����
		ButtonGroup group_job = new ButtonGroup();
		group_job.add(manager);
		group_job.add(employee);

		JLabel lblNewLabel_7 = new JLabel("\uC774\uBA54\uC77C");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_7.setFont(new Font("����", Font.BOLD, 20));
		panel_1.add(lblNewLabel_7);

		email = new JTextField();
		panel_1.add(email);
		email.setColumns(10);

		JLabel lblNewLabel_8 = new JLabel("\uD734\uB300\uC804\uD654");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_8.setFont(new Font("����", Font.BOLD, 20));
		panel_1.add(lblNewLabel_8);

		phone = new JTextField();
		panel_1.add(phone);
		phone.setColumns(10);

		JLabel lblNewLabel_9 = new JLabel("\uC8FC\uC18C");
		lblNewLabel_9.setFont(new Font("����", Font.BOLD, 20));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lblNewLabel_9);

		address = new JTextField();
		panel_1.add(address);
		address.setColumns(10);

		JPanel panel_2 = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel_2, 6, SpringLayout.SOUTH, panel_1);
		springLayout.putConstraint(SpringLayout.WEST, panel_2, 10, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel_2, 95, SpringLayout.SOUTH, panel_1);
		springLayout.putConstraint(SpringLayout.EAST, panel_2, 524, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));

		JButton btnNewButton = new JButton("\uAC00\uC785");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// �������� > ȸ�����Կ�Ŭ�� > �ڵ鸵 > ���콺Ŭ����(ȸ������ ���)
				// �ؽ�Ʈ�� �ִ� ���������� �����;��� > DB�� ����ֱ� ���ؼ�
				// �ʵ�� �ȱ�� �����ϱ� ��������. �ؽ�Ʈ�κ�Ŭ�� > properties > ���� �� �ʵ�
				// ���̵�, ��й�ȣ, �̸�, ����, ������ ������Ʈ�κ��� �����´�.
				String infoId = id.getText();
				String infoPw = pw.getText();
				String infoName = name.getText();
				String infoBirth = birth.getText();
				String infoEmail = email.getText();
				String infoPhone = phone.getText();
				String infoAddress = address.getText();

				String infoSex = "";
				if (male.isSelected()) { // ������Ʈ, üũ�ڽ� ���ÿ���
					infoSex = "male";
				} else {
					infoSex = "female";
				}
				String infoJob = "";
				if (manager.isSelected()) { // ������Ʈ, üũ�ڽ� ���ÿ���
					infoJob = "manager";
				} else {
					infoJob = "employee";
				}

				// Member��ü������
				Member m = new Member(infoId, infoPw, infoName, infoBirth, infoSex, infoJob, infoEmail, infoPhone,
						infoAddress);
				// Controller���� ȸ������ ��û
				boolean result = service.memberJoin(m);
				if (result) {
					// ������ ������
					JOptionPane.showMessageDialog(frame, "ȸ������ ����");
					frame.dispose(); // ȭ������
				} else {
					JOptionPane.showMessageDialog(frame, "ȸ������ ����");
				}
			}
			// Ŭ�� �� ȸ�� ���� ��� �ۼ�!
		});

		panel_2.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("\uCDE8\uC18C");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
			// Ŭ�� �� ȸ������ ��� �� �α��� â���� �ٽ� �ǵ��ư�
		});
		panel_2.add(btnNewButton_1);
	}
}
