package FlowerOrderProjectUI;
 
import javax.swing.JFrame;
import javax.swing.JPanel;

import ManagePage.ChooseFlowers;
import ManagePage.CustomerInfo;
import ManagePage.Detailview;
import ManagePage.OrderPage;
import ManagePage.SearchPage;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Color;


import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

// 로그인 성공 후 메인 화면
 
@SuppressWarnings("serial")
public class FlowerFrm extends JFrame implements ActionListener{
	private JButton btnOrder;
	private JButton btnCI;
    public FlowerFrm() {
    	initialize();
    }
    private void initialize() {
    	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    	setSize(1139, 478);
    	setVisible(true);
    	getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
    	
    	JPanel panel = new JPanel();
    	getContentPane().add(panel);
    	
    	JPanel panel_1 = new JPanel();
    	panel_1.setAlignmentX(Component.LEFT_ALIGNMENT);
    	panel_1.setBackground(Color.WHITE);
    	
    	btnOrder = new JButton("Order");
    	btnOrder.addActionListener(this);
    	panel_1.setLayout(new GridLayout(0, 1, 10, 10));
    	btnOrder.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 20));
    	panel_1.add(btnOrder);
    	
    	btnCI = new JButton("Customer Info");
    	btnCI.addActionListener(this);
    	btnCI.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 20));
    	panel_1.add(btnCI);
    	
    	JButton btnFs = new JButton("Manage Flowers");
    	btnFs.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			Detailview frame = new Detailview();
				frame.setVisible(true);
    			
    		}
    	});
    	panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
    	
    	
    		
    		
    	
    	
    
    	btnFs.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 20));
    	panel_1.add(btnFs);
    	
    	JButton btnSD = new JButton("View All");
    	btnSD.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			SearchPage frame = new SearchPage();
				frame.setVisible(true);
    		}
    		
    	});
    	btnSD.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 20));
    	panel_1.add(btnSD);
    	
    	JButton btnLog = new JButton("LogOut");
    	btnLog.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 20));
    	panel_1.add(btnLog);
    	panel.add(panel_1);
    	
    	JLabel lblNewLabel = new JLabel("");
    	lblNewLabel.setIcon(new ImageIcon("C:\\workspace_java\\FlowerOrderProgramProject\\image\\flower\\flowershop.jpg"));
    	panel.add(lblNewLabel);
    }
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCI) {
			actionPerformedBtn02(e);
		}
		if (e.getSource() == btnOrder) {
			actionPerformedBtn01(e);
		}
	}
	protected void actionPerformedBtn01(ActionEvent e) {
		OrderPage frame = new OrderPage();
		frame.setVisible(true);
		
	}
	protected void actionPerformedBtn02(ActionEvent e) {
		CustomerInfo frame = new CustomerInfo();
		frame.setVisible(true);
		
	}
}
