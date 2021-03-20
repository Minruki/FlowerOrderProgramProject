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

public class OrderPage extends JFrame {

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
	private JScrollBar scrollBar;
	private JComboBox comboBox;
	private JTextField textField_2;
	private JTextField textField_4;
	private JPanel panel_8;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel lblChoice;
	private JLabel label_8;
	private JLabel lblNewLabel_5;
	private JPanel panel_4;
	private JPanel panel_9;
	private JPanel panel_10;
	private JButton btnNewButton;
	private JTextField textField_5;
	private TextField textField_6;


	public OrderPage() {
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
		
		lblflower_code = new JLabel("꽃 코드");
		lblflower_code.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(lblflower_code);
		
		lblorder_count = new JLabel("주문수량");
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
		
		textField_6 = new TextField();
		panel_2.add(textField_6);
		

		
		textField_1 = new JTextField();
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		panel_7 = new JPanel();
		panel_2.add(panel_7);
		panel_7.setLayout(new BoxLayout(panel_7, BoxLayout.X_AXIS));
		
		textField_2 = new JTextField();
		panel_7.add(textField_2);
		textField_2.setColumns(10);
		
		comboBox = new JComboBox();
		panel_7.add(comboBox);
		
		panel_6 = new JPanel();
		panel_2.add(panel_6);
		panel_6.setLayout(new BoxLayout(panel_6, BoxLayout.X_AXIS));
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_6.add(textField_4);
		textField_4.setColumns(10);
		
		scrollBar = new JScrollBar();
		panel_6.add(scrollBar);
		
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
		panel_3.setLayout(new GridLayout(0, 1, 10, 10));
		
		lblNewLabel_5 = new JLabel("");
		panel_3.add(lblNewLabel_5);
		
		label_1 = new JLabel("");
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_3.add(label_1);
		
		label_2 = new JLabel("");
		label_2.setHorizontalAlignment(SwingConstants.LEFT);
		panel_3.add(label_2);
		
		label_3 = new JLabel("");
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		panel_3.add(label_3);
		
		label_4 = new JLabel("");
		label_4.setHorizontalAlignment(SwingConstants.LEFT);
		panel_3.add(label_4);
		
		label_5 = new JLabel("");
		label_5.setHorizontalAlignment(SwingConstants.LEFT);
		panel_3.add(label_5);
		
		label_6 = new JLabel("");
		label_6.setHorizontalAlignment(SwingConstants.LEFT);
		panel_3.add(label_6);
		
		lblChoice = new JLabel("");
		lblChoice.setHorizontalAlignment(SwingConstants.LEFT);
		panel_3.add(lblChoice);
		
		label_8 = new JLabel("");
		label_8.setHorizontalAlignment(SwingConstants.LEFT);
		panel_3.add(label_8);
		
		panel_10 = new JPanel();
		panel_10.setBackground(Color.PINK);
		panel_3.add(panel_10);
		
		label = new JLabel("");
		panel_3.add(label);
		
		panel_8 = new JPanel();
		contentPane.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		lblNewLabel = new JLabel("");
		panel_8.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("c:\\workspace\\FlowerOrderProgramProject\\image\\flower\\IMG_0006.JPG"));
	}

}
