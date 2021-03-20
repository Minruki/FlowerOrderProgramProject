package ManagePage;

import java.awt.BorderLayout;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import FlowerProgramPanel.CustomerPanel;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import javax.swing.ImageIcon;
import FlowerProgramPanel.BackgroundPanel;
import java.awt.Color;
import java.awt.SystemColor;

@SuppressWarnings("serial")
public class CustomerInfo extends JFrame {

	private JPanel contentPane;


	public CustomerInfo() {
		initialize();
	}
	private void initialize() {
		setTitle("customer information");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 637, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel label = new JLabel("");
		contentPane.setLayout(null);
		
		CustomerPanel panel = new CustomerPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(262, 63, 310, 222);
		contentPane.add(panel);
		
		JButton btnOpen = new JButton("Open");
		panel.add(btnOpen);
		
		JButton btnModify = new JButton("Modify");
		panel.add(btnModify);
		
		JButton btnSave = new JButton("Save");
		panel.add(btnSave);
		
		JButton btnDel = new JButton("Delete");
		panel.add(btnDel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\workspace\\FlowerOrderProgramProject\\image\\flower\\copy-space-roses-flowers_23-2148860032.jpg"));
		lblNewLabel.setBounds(0, -187, 1002, 735);
		contentPane.add(lblNewLabel);
	}	
}
