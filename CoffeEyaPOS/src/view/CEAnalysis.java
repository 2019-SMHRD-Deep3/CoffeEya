package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;

import controller.DetailManagementService;
import model.Detail;
import model.Member;
import model.OrderingDAO;
import model.ProductDAO;

public class CEAnalysis {
	DetailManagementService service = new DetailManagementService();

	private JFrame frame;
	private JTable table;
	private Member loginUser;

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

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(lblNewLabel);

		JButton btnNewButton = new JButton("");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				CEMain main = new CEMain(loginUser);
				frame.dispose();
			}
		});
		btnNewButton.setBounds(1138, 10, 34, 34);
		frame.getContentPane().add(btnNewButton);

		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(12, 54, 1160, 95);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
				JLabel lblNewLabel_1 = new JLabel("\uAE08\uC77C \uD310\uB9E4\uB300\uAE08");
				lblNewLabel_1.setBounds(12, 19, 195, 57);
				panel.add(lblNewLabel_1);
				lblNewLabel_1.setForeground(Color.WHITE);
				lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 26));
				lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(204, 153, 102));
		panel_2.setBounds(12, 19, 195, 57);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		
		ArrayList<Detail> listTemp = service.detailLookup();

		ProductDAO daoSum = new ProductDAO();
		for (int i = 0; i < listTemp.size(); i++) {
			Detail d = listTemp.get(i);
			int PRO_PRICE = daoSum.getInfoProduct(d).getPRO_PRICE();
			sum += PRO_PRICE *d.getDE_AMOUNT();
		}
		JLabel lblNewLabel_2 = new JLabel(Integer.toString(sum) + " 원");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 26));
		lblNewLabel_2.setBounds(249, 10, 273, 75);
		panel.add(lblNewLabel_2);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(12, 159, 1160, 253);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 10, 1136, 233);
		panel_1.add(scrollPane);

		// 컬럼이름 복사, 데이터 복사
		String[] columnNames = { "주문 번호", "상품 이름", "단일 가격", "판매 수량", "결제 수단", "판매 사원", "판매 날짜" };
		ArrayList<Detail> list = service.detailLookup();

		Object[][] data = new Object[list.size()][7];
		ProductDAO daoP = new ProductDAO();
		OrderingDAO daoO = new OrderingDAO();
		for (int i = 0; i < list.size(); i++) {
			Detail d = list.get(i);
			String PRO_NAME = daoP.getInfoProduct(d).getPRO_NAME();
			int PRO_PRICE = daoP.getInfoProduct(d).getPRO_PRICE();
			String OR_PAY = daoO.getInfoOrdering(d).getOR_PAY();
			String MEM_ID = daoO.getInfoOrdering(d).getMEM_ID();
			String OR_DATE = daoO.getInfoOrdering(d).getOR_DATE();
			data[i] = new Object[] { d.getOR_NUM(), PRO_NAME, PRO_PRICE, d.getDE_AMOUNT(), OR_PAY, MEM_ID, OR_DATE };
			sum += PRO_PRICE *d.getDE_AMOUNT();
		}
		table = new JTable(data, columnNames);
		scrollPane.setViewportView(table);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.DARK_GRAY);
		panel_3.setBounds(12, 422, 1160, 329);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);

		JLabel lblNewLabel_4 = new JLabel("\uAE30\uC900\uBCC4 \uD310\uB9E4\uBE44\uC728");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("굴림", Font.BOLD, 16));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(12, 10, 148, 40);
		panel_3.add(lblNewLabel_4);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(204, 153, 102));
		panel_4.setBounds(12, 10, 148, 40);
		panel_3.add(panel_4);
		panel_4.setLayout(null);

	}
}
