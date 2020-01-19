package view;

import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Member;
import model.Product;
import model.ProductDAO;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import controller.MemberManagementService;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.Font;

public class CEMember {

	MemberManagementService service = new MemberManagementService();

	private JFrame frame;
	private Member loginUser;
	private JPanel panel_1;
	private JScrollPane scrollPane;

	private JTable table;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblNewLabel_5;
	private JTextField textField;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JLabel lblNewLabel;
	private JPanel panel;
	private JPanel panel_4;
	private JLabel lblNewLabel_6;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;

	/**
	 * Create the application.
	 */
	public CEMember(Member loginUser) {
		this.loginUser = loginUser;
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(250, 235, 215));
		frame.setBounds(100, 100, 613, 712);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		String imgPath5 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//bback2.png";
		ImageIcon icon5 = new ImageIcon(imgPath5);

		panel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(icon5.getImage(), 0, 0, panel.getWidth(), panel.getHeight(), null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CEMain main = new CEMain(loginUser);
				frame.dispose();
			}
		});
		panel.setBounds(495, 10, 67, 67);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		panel_1 = new JPanel();
		panel_1.setBackground(new Color(250, 235, 215));
		panel_1.setBounds(12, 10, 438, 123);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 438, 526);
		panel_1.add(scrollPane);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(250, 235, 215));
		panel_2.setBounds(12, 209, 438, 389);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new GridLayout(0, 2, 0, 0));

		String imgPath = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//man.png";
		ImageIcon icon = new ImageIcon(imgPath);

		lblNewLabel = new JLabel("") {
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(icon.getImage(), 55, 20, 45, 45, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel);

		lblNewLabel_5 = new JLabel("\uC0AC\uC6A9\uC790 \uC120\uD0DD");
		lblNewLabel_5.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblNewLabel_5.setBackground(new Color(255, 218, 185));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_5);

		String imgPath1 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//pw.png";
		ImageIcon icon1 = new ImageIcon(imgPath1);

		JLabel lblNewLabel_1 = new JLabel("") {
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(icon1.getImage(), 55, 20, 45, 45, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_1);

		textField = new JTextField();
		textField.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		textField.setBackground(new Color(255, 218, 185));
		panel_2.add(textField);
		textField.setColumns(10);

		String imgPath2 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//pw.png";
		ImageIcon icon2 = new ImageIcon(imgPath2);

		JLabel lblNewLabel_2 = new JLabel("") {
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(icon1.getImage(), 55, 20, 45, 45, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_2);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		textField_1.setBackground(new Color(255, 218, 185));
		panel_2.add(textField_1);
		textField_1.setColumns(10);

		String imgPath3 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//name.png";
		ImageIcon icon3 = new ImageIcon(imgPath3);

		JLabel lblNewLabel_3 = new JLabel("") {
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(icon3.getImage(), 55, 20, 45, 45, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_3);

		textField_2 = new JTextField();
		textField_2.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		textField_2.setBackground(new Color(255, 218, 185));
		panel_2.add(textField_2);
		textField_2.setColumns(10);

		String imgPath4 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//power.png";
		ImageIcon icon4 = new ImageIcon(imgPath4);

		JLabel lblNewLabel_4 = new JLabel("") {
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(icon4.getImage(), 55, 20, 45, 45, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel_4);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(250, 235, 215));
		panel_2.add(panel_3);
		panel_3.setLayout(new GridLayout(1, 0, 0, 0));

		rdbtnNewRadioButton = new JRadioButton("\uAD00\uB9AC\uC790");
		rdbtnNewRadioButton.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		rdbtnNewRadioButton.setBackground(new Color(250, 235, 215));
		rdbtnNewRadioButton.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(rdbtnNewRadioButton);

		rdbtnNewRadioButton_1 = new JRadioButton("\uC9C1\uC6D0");
		rdbtnNewRadioButton_1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		rdbtnNewRadioButton_1.setBackground(new Color(250, 235, 215));
		rdbtnNewRadioButton_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(rdbtnNewRadioButton_1);

		ButtonGroup perm = new ButtonGroup();
		perm.add(rdbtnNewRadioButton);
		perm.add(rdbtnNewRadioButton_1);

		String imgPath6 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//reset.png";
		ImageIcon icon6 = new ImageIcon(imgPath6);

		panel_4 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(icon6.getImage(), 35, 25, 45, 45, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		panel_4.setToolTipText("");
		panel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				memberAll();
				lblNewLabel_5.setText("사용자 선택");
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				perm.clearSelection();
			}
		});
		panel_4.setBounds(480, 132, 100, 100);
		frame.getContentPane().add(panel_4);

		String imgPath7 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//plus.png";
		ImageIcon icon7 = new ImageIcon(imgPath7);

		JPanel panel_5 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(icon7.getImage(), 35, 30, 45, 45, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		panel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CEMemJoin join = new CEMemJoin(loginUser);
				frame.dispose();
			}
		});
		panel_5.setBounds(480, 271, 100, 100);
		frame.getContentPane().add(panel_5);

		String imgPath8 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//repair.png";
		ImageIcon icon8 = new ImageIcon(imgPath8);

		JPanel panel_6 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(icon8.getImage(), 35, 30, 45, 45, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		panel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String infoId = lblNewLabel_5.getText();
				String infoPw = textField.getText();
				String infoPwCheck = textField_1.getText();
				String infoName = textField_2.getText();
				String infoPerm;
				if (rdbtnNewRadioButton.isSelected()) {
					infoPerm = "MANAGER";
				} else {
					infoPerm = "EMPLOYEE";
				}

				if (infoPw.equals(infoPwCheck)) {
					Member m = new Member(infoId, infoPw, infoName, infoPerm);
					boolean result = service.memberModify(m);

					if (result) {
						JOptionPane.showMessageDialog(frame, "수정 성공");
						memberAll();
					} else {
						JOptionPane.showMessageDialog(frame, "수정 실패");
					}
				} else {
					JOptionPane.showMessageDialog(frame, "수정 실패");
				}
			}
		});
		panel_6.setBounds(480, 416, 100, 100);
		frame.getContentPane().add(panel_6);

		String imgPath9 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//garbage.png";
		ImageIcon icon9 = new ImageIcon(imgPath9);

		JPanel panel_7 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(icon9.getImage(), 35, 35, 45, 45, null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		panel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String infoId = lblNewLabel_5.getText();
				Member m = new Member(infoId);
				boolean result = service.memberDelete(m);

				if (result) {
					JOptionPane.showMessageDialog(frame, "삭제 성공");
					memberAll();
				} else {
					JOptionPane.showMessageDialog(frame, "삭제 실패");
				}
			}
		});
		panel_7.setBounds(480, 551, 100, 100);
		frame.getContentPane().add(panel_7);

		lblNewLabel_6 = new JLabel("\uCD08\uAE30\uD654");
		lblNewLabel_6.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(505, 230, 57, 15);
		frame.getContentPane().add(lblNewLabel_6);

		label = new JLabel("\uCD94\uAC00");
		label.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(505, 371, 57, 15);
		frame.getContentPane().add(label);

		label_1 = new JLabel("\uC218\uC815");
		label_1.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(505, 515, 57, 15);
		frame.getContentPane().add(label_1);

		label_2 = new JLabel("\uC0AD\uC81C");
		label_2.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(505, 649, 57, 15);
		frame.getContentPane().add(label_2);

		memberAll();

	}

	public void memberAll() {
		String[] columnNames = { "사용자 아이디", "사용자 비밀번호", "사용자 이름", "사용자 권한" };
		ArrayList<Member> list = service.memberLookup();
		Object[][] data = new Object[list.size()][4];
		Member m = new Member();
		for (int i = 0; i < list.size(); i++) {
			m = list.get(i);
			String MEM_ID = m.getMEM_ID();
			String MEM_PW = m.getMEM_PW();
			String MEM_NAME = m.getMEM_NAME();
			String MEM_PERM = m.getMEM_PERM();
			data[i] = new Object[] { MEM_ID, MEM_PW, MEM_NAME, MEM_PERM };
		}
		table = new JTable(data, columnNames);
		scrollPane.setViewportView(table);
		// DefaultTableCellHeaderRenderer 생성 (가운데 정렬을 위한)
		DefaultTableCellRenderer tScheduleCellRenderer = new DefaultTableCellRenderer();

		// DefaultTableCellHeaderRenderer의 정렬을 가운데 정렬로 지정
		tScheduleCellRenderer.setHorizontalAlignment(SwingConstants.CENTER);

		// 정렬할 테이블의 ColumnModel을 가져옴
		TableColumnModel tcmSchedule = table.getColumnModel();

		// 반복문을 이용하여 테이블을 가운데 정렬로 지정
		for (int i = 0; i < tcmSchedule.getColumnCount(); i++) {
			tcmSchedule.getColumn(i).setCellRenderer(tScheduleCellRenderer);
		}

		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int index = table.getSelectedRow();
				lblNewLabel_5.setText((String) table.getValueAt(index, 0));
				textField.setText((String) table.getValueAt(index, 1));
				textField_2.setText((String) table.getValueAt(index, 2));
				if (((String) table.getValueAt(index, 3)).equals("MANAGER")
						|| ((String) table.getValueAt(index, 3)).equals("manager")) {
					rdbtnNewRadioButton.setSelected(true);
					rdbtnNewRadioButton_1.setSelected(false);
				} else if (((String) table.getValueAt(index, 3)).equals("EMPLOYEE")
						|| ((String) table.getValueAt(index, 3)).equals("employee")) {
					rdbtnNewRadioButton.setSelected(false);
					rdbtnNewRadioButton_1.setSelected(true);
				}
			}
		});
		scrollPane.setViewportView(table);
	}
}
