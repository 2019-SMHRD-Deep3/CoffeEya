package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;

import controller.DetailManagementService;
import controller.ProductManagementService;
import model.Detail;
import model.Member;
import model.Ordering;
import model.OrderingDAO;
import model.Product;
import model.ProductDAO;

public class CEAnalysis {
	DetailManagementService service = new DetailManagementService();
	ProductManagementService serviceP = new ProductManagementService();
	ProductDAO productdao = new ProductDAO();
	OrderingDAO orderingdao = new OrderingDAO();
	Product pro = new Product();
	Ordering ord = new Ordering();

	private JFrame frame;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JTable table;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JScrollPane scrollPane;
	private Member loginUser;
	private JButton btnNewButton;
	private JButton button;
	private JButton button_1;
	private JPanel panel_4;
	private JLabel lblNewLabel_3;
	private JPanel panel_5;

	/**
	 * Create the application.
	 */
	public CEAnalysis(Member loginUser) {
		this.loginUser = loginUser;
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		int sum = 0;
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(lblNewLabel);

		panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(12, 10, 1160, 95);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		lblNewLabel_1 = new JLabel("\uAE08\uC77C \uD310\uB9E4\uB300\uAE08");
		lblNewLabel_1.setBounds(12, 19, 322, 57);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("����", Font.BOLD, 26));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);

		panel_2 = new JPanel();
		panel_2.setBackground(new Color(204, 153, 102));
		panel_2.setBounds(12, 19, 322, 57);
		panel.add(panel_2);
		panel_2.setLayout(null);

		ArrayList<Detail> listTemp = service.detailLookup();
//		ProductDAO daoSum = new ProductDAO();
		Detail d = new Detail();
		for (int i = 0; i < listTemp.size(); i++) {
			d = listTemp.get(i);
			int PRO_PRICE = productdao.getInfoProduct(d).getPRO_PRICE();
			sum += PRO_PRICE * d.getDE_AMOUNT();
		}
		lblNewLabel_2 = new JLabel(Integer.toString(sum) + " ��");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("����", Font.BOLD, 26));
		lblNewLabel_2.setBounds(346, 10, 273, 75);
		panel.add(lblNewLabel_2);
		
		String imgPath3 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//bback.png";
		ImageIcon icon3 = new ImageIcon(imgPath3);
		
		panel_5 = new JPanel(){
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(icon3.getImage(), 0, 0, panel_5.getWidth(), panel_5.getHeight(), null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		panel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				CEMain main = new CEMain(loginUser);
				frame.dispose();
			}
		});
		panel_5.setBounds(1082, 10, 66, 66);
		panel.add(panel_5);

		
		panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(12, 115, 771, 636);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 23, 715, 582);
		panel_1.add(scrollPane);

		// �÷��̸� ����, ������ ����
		String[] columnNames = { "�ֹ� ��ȣ", "��ǰ �̸�", "���� ����", "�Ǹ� ����", "���� ����", "�Ǹ� ���", "�Ǹ� ��¥" };
		ArrayList<Detail> list = service.detailLookup();
		Object[][] data = new Object[list.size()][7];
//		ProductDAO daoP = new ProductDAO();
//		OrderingDAO daoO = new OrderingDAO();
		for (int i = 0; i < list.size(); i++) {
			d = list.get(i);
			pro = productdao.getInfoProduct(d);
			ord = orderingdao.getInfoOrdering(d);

			String PRO_NAME = pro.getPRO_NAME();
			int PRO_PRICE = pro.getPRO_PRICE();
			String OR_PAY = ord.getOR_PAY();
			String MEM_ID = ord.getMEM_ID();
			String OR_DATE = ord.getOR_DATE().substring(0, 10);
			data[i] = new Object[] { d.getOR_NUM(), PRO_NAME, PRO_PRICE, d.getDE_AMOUNT(), OR_PAY, MEM_ID, OR_DATE };
		}
		table = new JTable(data, columnNames);
		scrollPane.setViewportView(table);
		// DefaultTableCellHeaderRenderer ���� (��� ������ ����)
		DefaultTableCellRenderer tScheduleCellRenderer = new DefaultTableCellRenderer();

		// DefaultTableCellHeaderRenderer�� ������ ��� ���ķ� ����
		tScheduleCellRenderer.setHorizontalAlignment(SwingConstants.CENTER);

		// ������ ���̺��� ColumnModel�� ������
		TableColumnModel tcmSchedule = table.getColumnModel();

		// �ݺ����� �̿��Ͽ� ���̺��� ��� ���ķ� ����
		for (int i = 0; i < tcmSchedule.getColumnCount(); i++) {
			tcmSchedule.getColumn(i).setCellRenderer(tScheduleCellRenderer);
		}

		panel_3 = new JPanel();
		panel_3.setBackground(Color.DARK_GRAY);
		panel_3.setBounds(795, 115, 377, 636);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);

		btnNewButton = new JButton("\uC0C1\uD488 \uAE30\uC900");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CEProductAnalysis productAnalysis = new CEProductAnalysis(loginUser);
			}
		});
		btnNewButton.setFont(new Font("����", Font.BOLD, 26));
		btnNewButton.setBounds(85, 143, 220, 77);
		panel_3.add(btnNewButton);

		button = new JButton("\uD310\uB9E4\uC790 \uAE30\uC900");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CESellerAnalysis sellerAnalysis = new CESellerAnalysis(loginUser);
			}
		});
		button.setFont(new Font("����", Font.BOLD, 26));
		button.setBounds(85, 283, 220, 77);
		panel_3.add(button);

		button_1 = new JButton("\uB0A0\uC9DC \uAE30\uC900");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CECalendarAnalysis calendarAnalysis = new CECalendarAnalysis(loginUser);
			}
		});
		button_1.setFont(new Font("����", Font.BOLD, 26));
		button_1.setBounds(85, 422, 220, 77);
		panel_3.add(button_1);

		panel_4 = new JPanel();
		panel_4.setBackground(new Color(204, 153, 102));
		panel_4.setBounds(12, 10, 353, 69);
		panel_3.add(panel_4);
		panel_4.setLayout(null);

		lblNewLabel_3 = new JLabel("\uC2DC\uAC01\uD654\uBA74 \uC120\uD0DD");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("����", Font.BOLD, 28));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(0, 10, 353, 49);
		panel_4.add(lblNewLabel_3);
	}
}
