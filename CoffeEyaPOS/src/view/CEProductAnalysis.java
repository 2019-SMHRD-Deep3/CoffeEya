package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;

import org.knowm.xchart.BitmapEncoder;
import org.knowm.xchart.BitmapEncoder.BitmapFormat;
import org.knowm.xchart.PieChart;
import org.knowm.xchart.PieChartBuilder;
import org.knowm.xchart.style.PieStyler.AnnotationType;
import org.knowm.xchart.style.Styler.ChartTheme;

import controller.DetailManagementService;
import controller.ProductManagementService;
import model.Detail;
import model.Member;
import model.OrderingDAO;
import model.Product;
import model.ProductDAO;

import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.IOException;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;

public class CEProductAnalysis {
	DetailManagementService service = new DetailManagementService();
	ProductManagementService serviceP = new ProductManagementService();

	private JFrame frame;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JTable table;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_3;
	private JScrollPane scrollPane;
	private Member loginUser;
	private JPanel panel_4;

	/**
	 * Create the application.
	 */
	public CEProductAnalysis(Member loginUser) {
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

		lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(0, 0, 1184, 761);
		frame.getContentPane().add(lblNewLabel);

		panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(12, 10, 1160, 86);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		lblNewLabel_1 = new JLabel("\uC0C1\uD488 \uAE30\uC900");
		lblNewLabel_1.setBounds(12, 10, 1058, 66);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("����", Font.BOLD, 26));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);

		panel_2 = new JPanel();
		panel_2.setBackground(new Color(204, 153, 102));
		panel_2.setBounds(12, 10, 1058, 66);
		panel.add(panel_2);
		panel_2.setLayout(null);

		String imgPath3 = this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//bback.png";
		ImageIcon icon3 = new ImageIcon(imgPath3);

		panel_4 = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				g.drawImage(icon3.getImage(), 0, 0, panel_4.getWidth(), panel_4.getHeight(), null);
				setOpaque(false);
				super.paintComponent(g);
			}
		};
		panel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.dispose();
			}
		});
		panel_4.setBounds(1082, 10, 66, 66);
		panel.add(panel_4);

		Detail d = new Detail();

		panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(12, 106, 406, 645);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 25, 382, 542);
		panel_1.add(scrollPane);

		ArrayList<Detail> listCnt = service.detailLookup();
		ArrayList<Product> ProductCnt = serviceP.productLookup();
		int[] dataCnt = new int[ProductCnt.size()];
		for (int i = 0; i < listCnt.size(); i++) {
			d = listCnt.get(i);
			for (int j = 0; j < ProductCnt.size(); j++) {

				if (d.getPRO_NUM() == j + 1) {
					dataCnt[j] += d.getDE_AMOUNT();
				}

			}
		}

		// �÷��̸� ����, ������ ����
		String[] columnNames = { "��ǰ �̸�", "�Ǹ� ����" };
		Object[][] data = new Object[dataCnt.length][2];
		int cnt = 0;

		for (int i = 0; i < dataCnt.length; i++) {
			if (dataCnt[i] != 0) {
				data[cnt++] = new Object[] { ProductCnt.get(i).getPRO_NAME(), dataCnt[i] };
			}
		}
		Object[][] data2 = new Object[cnt][2];
		for (int i = 0; i < cnt; i++) {
			data2[i] = data[i];
		}

		table = new JTable(data2, columnNames);
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
		panel_3.setBounds(430, 106, 742, 645);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);

		PieChart chart = new PieChartBuilder().width(1200).height(2400).title("��ǰ���� �Ǹź���").theme(ChartTheme.GGPlot2)
				.build();

		// Customize Chart
		chart.getStyler().setLegendVisible(false);
		chart.getStyler().setAnnotationType(AnnotationType.LabelAndPercentage);
		chart.getStyler().setAnnotationDistance(1.15);
		chart.getStyler().setPlotContentSize(.7);
		chart.getStyler().setStartAngleInDegrees(90);

		// Series
		for (int i = 0; i < dataCnt.length; i++) {
			if (dataCnt[i] != 0) {
				chart.addSeries(ProductCnt.get(i).getPRO_NAME(), dataCnt[i]);
			}
		}

		// save it in high-res
		try {
			BitmapEncoder.saveBitmapWithDPI(chart,
					this.getClass().getResource(".").getPath() + "..//..//CoffeEyaIMG//Sample_Chart_300_DPI",
					BitmapFormat.PNG, 38);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);

		String imgPathChart = this.getClass().getResource(".").getPath()
				+ "..//..//CoffeEyaIMG//Sample_Chart_300_DPI.png";
		ImageIcon iconChart = new ImageIcon(imgPathChart);
		lblNewLabel_3.setIcon(iconChart);
		lblNewLabel_3.setBounds(12, 25, 718, 539);
		panel_3.add(lblNewLabel_3);
	}
}
