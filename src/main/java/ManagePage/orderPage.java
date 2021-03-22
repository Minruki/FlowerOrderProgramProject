package ManagePage;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.TextField;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextArea;

public class orderPage extends JFrame {

	private JPanel contentPane;
	private JPanel panel_1;
	private JPanel panel;
	private JPanel panel_2;
	private JPanel panel_3;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblono;
	private JLabel lblorder_number;
	private JLabel lblorder_date;
	private JLabel lblid;
	private JLabel lblflower_code;
	private JLabel lblsale_price;
	private JLabel lblNewLabel_9;
	private JLabel lblorder_count;
	private JLabel lblchoice;
	private JLabel lblNewLabel_3;
	private JTextField textField;

	private JTextField textField_1;
	private JTextField textField_3;
	private JLabel lblNewLabel_4;
	private JPanel panel_5;
	private JRadioButton rdbtn01;
	private JRadioButton rdbtnNewRadioButton_1;
	private JPanel panel_6;
	private JPanel panel_7;
	private JTextField textField_2;
	private JPanel panel_8;
	private JPanel panel_4;
	private JPanel panel_9;
	private JButton btnNewButton;
	private JTextField textField_5;
	private JList list;
	private JDateChooser dateChooser;
	private JTextArea textArea;


	public orderPage() {
		initialize();
	}
	private void initialize() {
		setTitle("OrderProgramMain");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(300, 300, 900, 500);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 5, 0, 0));
		
		panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.X_AXIS));
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("c:\\workspace\\FlowerOrderProgramProject\\image\\flower\\IMG_0006.JPG"));
		panel_1.add(lblNewLabel_1);
		
		panel = new JPanel();
		panel.setBackground(Color.PINK);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 1, 10, 10));
		
		lblNewLabel_2 = new JLabel("");
		panel.add(lblNewLabel_2);
		
		lblono = new JLabel("No.");
		lblono.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(lblono);
		
		lblorder_number = new JLabel("주문번호");
		lblorder_number.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(lblorder_number);
		
		lblorder_date = new JLabel("주문날짜");
		lblorder_date.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(lblorder_date);
		
		lblid = new JLabel("회원ID");
		lblid.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(lblid);
		
		lblflower_code = new JLabel("꽃 선택");
		lblflower_code.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(lblflower_code);
		
		lblorder_count = new JLabel("주문내역");
		lblorder_count.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(lblorder_count);
		
		lblchoice = new JLabel("구분");
		lblchoice.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(lblchoice);
		
		lblsale_price = new JLabel("판매가");
		lblsale_price.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(lblsale_price);
		
		panel_4 = new JPanel();
		panel_4.setBackground(Color.PINK);
		panel.add(panel_4);
		
		lblNewLabel_9 = new JLabel("");
		panel.add(lblNewLabel_9);
		
		panel_2 = new JPanel();
		panel_2.setBackground(Color.PINK);
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 10, 10));
		
		lblNewLabel_3 = new JLabel("");
		panel_2.add(lblNewLabel_3);
		
		textField = new JTextField();
		panel_2.add(textField);
		textField.setColumns(10);
		
		textField_3 = new JTextField();
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		dateChooser = new JDateChooser();
		panel_2.add(dateChooser);
		

		
		textField_1 = new JTextField();
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		panel_7 = new JPanel();
		panel_2.add(panel_7);
		panel_7.setLayout(new BoxLayout(panel_7, BoxLayout.X_AXIS));
		
		textField_2 = new JTextField();
		panel_7.add(textField_2);
		textField_2.setColumns(10);
		
		panel_6 = new JPanel();
		panel_2.add(panel_6);
		panel_6.setLayout(new BoxLayout(panel_6, BoxLayout.X_AXIS));
		
		list = new JList();
		panel_6.add(list);
		
		textArea = new JTextArea();
		panel_6.add(textArea);
		
		panel_5 = new JPanel();
		panel_5.setBackground(Color.PINK);
		panel_2.add(panel_5);
		panel_5.setLayout(new GridLayout(0, 2, 0, 0));
		
		rdbtn01 = new JRadioButton("꽃다발");
		rdbtn01.setBackground(Color.PINK);
		panel_5.add(rdbtn01);
		
		rdbtnNewRadioButton_1 = new JRadioButton("꽃바구니");
		rdbtnNewRadioButton_1.setBackground(Color.PINK);
		panel_5.add(rdbtnNewRadioButton_1);
		
		textField_5 = new JTextField();
		panel_2.add(textField_5);
		textField_5.setColumns(10);
		
		panel_9 = new JPanel();
		panel_9.setBackground(Color.PINK);
		panel_2.add(panel_9);
		
		btnNewButton = new JButton("SAVE");
		panel_9.add(btnNewButton);
		
		lblNewLabel_4 = new JLabel("");
		panel_2.add(lblNewLabel_4);
		
		panel_3 = new JPanel();
		panel_3.setBackground(Color.PINK);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(0, 214, 47, 32);
		panel_3.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				chooseFlowers frame = new chooseFlowers();
				frame.setVisible(true);
				
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\workspace\\FlowerOrderProgramProject\\image\\flower\\icon2.png"));
		
		panel_8 = new JPanel();
		contentPane.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		lblNewLabel = new JLabel("");
		panel_8.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("c:\\workspace\\FlowerOrderProgramProject\\image\\flower\\IMG_0006.JPG"));
	}
}
