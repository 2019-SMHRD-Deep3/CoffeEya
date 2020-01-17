package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Member;
import model.Product;
import model.ProductDAO;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
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
		frame.setBounds(100, 100, 1200, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton_4 = new JButton("\uB3CC\uC544\uAC00\uAE30");
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CEMain main = new CEMain(loginUser);
				frame.dispose();
			}
		});
		btnNewButton_4.setBounds(1075, 10, 100, 100);
		frame.getContentPane().add(btnNewButton_4);
		
		panel_1 = new JPanel();
		panel_1.setBounds(12, 10, 438, 293);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 438, 293);
		panel_1.add(scrollPane);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(462, 10, 438, 293);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel = new JLabel("\uC544\uC774\uB514");
		panel_2.add(lblNewLabel);
		
		lblNewLabel_5 = new JLabel("\uC0AC\uC6A9\uC790 \uC120\uD0DD");
		panel_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		panel_2.add(lblNewLabel_1);
		
		textField = new JTextField();
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		panel_2.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\uC774\uB984");
		panel_2.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("\uAD8C\uD55C");
		panel_2.add(lblNewLabel_4);
		
		JPanel panel_3 = new JPanel();
		panel_2.add(panel_3);
		panel_3.setLayout(new GridLayout(1, 0, 0, 0));
		
		
		
		rdbtnNewRadioButton = new JRadioButton("\uAD00\uB9AC\uC790");
		panel_3.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("\uC9C1\uC6D0");
		panel_3.add(rdbtnNewRadioButton_1);

	
		
		ButtonGroup perm = new ButtonGroup();
		perm.add(rdbtnNewRadioButton);
		perm.add(rdbtnNewRadioButton_1);
		
		
		JPanel panel_4 = new JPanel();
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
		panel_4.setBounds(462, 313, 100, 100);
		frame.getContentPane().add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CEMemJoin join = new CEMemJoin(loginUser);
				frame.dispose();
			}
		});
		panel_5.setBounds(574, 313, 100, 100);
		frame.getContentPane().add(panel_5);
		
		JPanel panel_6 = new JPanel();
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
		panel_6.setBounds(686, 313, 100, 100);
		frame.getContentPane().add(panel_6);
		
		JPanel panel_7 = new JPanel();
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
		panel_7.setBounds(800, 313, 100, 100);
		frame.getContentPane().add(panel_7);
		
		JButton btnNewButton_2 = new JButton("\uCD9C\uACB0 \uAD00\uB9AC");
		btnNewButton_2.setBounds(837, 584, 284, 110);
		frame.getContentPane().add(btnNewButton_2);
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CEMemCommute commute = new CEMemCommute(loginUser);
			}
		});
		
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
				lblNewLabel_5.setText((String)table.getValueAt(index, 0));
				textField.setText((String)table.getValueAt(index, 1));
				textField_2.setText((String) table.getValueAt(index, 2));
				if (((String) table.getValueAt(index, 3)).equals("MANAGER")) {
					rdbtnNewRadioButton.setSelected(true);
					rdbtnNewRadioButton_1.setSelected(false);
				} else if (((String) table.getValueAt(index, 3)).equals("EMPLOYEE")) {
					rdbtnNewRadioButton.setSelected(false);
					rdbtnNewRadioButton_1.setSelected(true);
				}
			}
		});
		scrollPane.setViewportView(table);
	}
}
