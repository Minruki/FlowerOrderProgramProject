package ManagePage;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class ChooseFlowers extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChooseFlowers frame = new ChooseFlowers();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ChooseFlowers() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 913, 549);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 5, 10, 20));
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(new Color(255, 240, 245));
		panel1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "1. \uC7A5\uBBF8(Rose)", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(panel1);
		panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblRose = new JLabel("");
		lblRose.setHorizontalAlignment(SwingConstants.LEFT);
		lblRose.setIcon(new ImageIcon("C:\\workspace\\FlowerOrderProgramProject\\image\\flower\\rose.png"));
		panel1.add(lblRose);
		
		JCheckBox checkbox1 = new JCheckBox("Red color");
		checkbox1.setBackground(new Color(255, 240, 245));
		panel1.add(checkbox1);
		
		JSpinner number1 = new JSpinner();
		panel1.add(number1);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(255, 240, 245));
		panel2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "2. \uB77C\uB10C\uD058\uB7EC\uC2A4(Ranunculus)", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(panel2);
		
		JLabel lblRanun = new JLabel("");
		lblRanun.setIcon(new ImageIcon("C:\\workspace\\FlowerOrderProgramProject\\image\\flower\\라넌큘러스.png"));
		lblRanun.setHorizontalAlignment(SwingConstants.LEFT);
		panel2.add(lblRanun);
		
		JCheckBox checkbox2 = new JCheckBox("HotPink color");
		checkbox1.setBackground(new Color(255, 240, 245));
		panel2.add(checkbox2);
		
		JSpinner number2 = new JSpinner();
		panel2.add(number2);
		
		JPanel panel3 = new JPanel();
		panel3.setBackground(new Color(255, 240, 245));
		panel3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "3. \uBC31\uD569(Lily)", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(panel3);
		
		JLabel lblBaby = new JLabel("");
		lblBaby.setIcon(new ImageIcon("C:\\workspace\\FlowerOrderProgramProject\\image\\flower\\릴리.png"));
		lblBaby.setHorizontalAlignment(SwingConstants.LEFT);
		panel3.add(lblBaby);
		
		JCheckBox checkbox3 = new JCheckBox("White color");
		panel3.add(checkbox3);
		
		JSpinner number3 = new JSpinner();
		panel3.add(number3);
		
		JPanel panel4 = new JPanel();
		panel4.setBackground(new Color(255, 240, 245));
		panel4.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "4. \uD2A4\uB9BD(Tulip)", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(panel4);
		
		JLabel lblTulip = new JLabel("");
		lblTulip.setIcon(new ImageIcon("C:\\workspace\\FlowerOrderProgramProject\\image\\flower\\튤립.png"));
		lblTulip.setHorizontalAlignment(SwingConstants.LEFT);
		panel4.add(lblTulip);
		
		JCheckBox checkbox4 = new JCheckBox("Various color");
		checkbox4.setBackground(new Color(255, 240, 245));
		panel4.add(checkbox4);
		
		JSpinner number4 = new JSpinner();
		panel4.add(number4);
		
		JPanel panel5 = new JPanel();
		panel5.setBackground(new Color(255, 240, 245));
		panel5.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "5. \uD574\uBC14\uB77C\uAE30(Sunflower)", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(panel5);
		
		JLabel lblSun = new JLabel("");
		lblSun.setIcon(new ImageIcon("C:\\workspace\\FlowerOrderProgramProject\\image\\flower\\해바라기.png"));
		lblSun.setHorizontalAlignment(SwingConstants.LEFT);
		panel5.add(lblSun);
		
		JCheckBox checkbox5 = new JCheckBox("Yellow color");
		checkbox5.setBackground(new Color(255, 240, 245));
		panel5.add(checkbox5);
		
		JSpinner number5 = new JSpinner();
		panel5.add(number5);
		
		JPanel panel6 = new JPanel();
		panel6.setBackground(new Color(255, 240, 245));
		panel6.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "6. \uD53C\uC624\uB2C8(Peony)", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(panel6);
		
		JLabel lblPeony = new JLabel("");
		lblPeony.setIcon(new ImageIcon("C:\\workspace\\FlowerOrderProgramProject\\image\\flower\\6.png"));
		lblPeony.setHorizontalAlignment(SwingConstants.LEFT);
		panel6.add(lblPeony);
		
		JCheckBox checkbox6 = new JCheckBox("Pink color");
		checkbox6.setBackground(new Color(255, 240, 245));
		panel6.add(checkbox6);
		
		JSpinner number6 = new JSpinner();
		panel6.add(number6);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "7. \uD504\uB9AC\uC9C0\uC544(Freesia)", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBackground(new Color(255, 240, 245));
		contentPane.add(panel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\workspace\\FlowerOrderProgramProject\\image\\flower\\프리지아.png"));
		label.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(label);
		
		JCheckBox chckbxYellowColor = new JCheckBox("Yellow color");
		chckbxYellowColor.setBackground(new Color(255, 240, 245));
		panel.add(chckbxYellowColor);
		
		JSpinner spinner = new JSpinner();
		panel.add(spinner);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "8. \uCE74\uB124\uC774\uC158(Carnation)", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBackground(new Color(255, 240, 245));
		contentPane.add(panel_1);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\workspace\\FlowerOrderProgramProject\\image\\flower\\8.png"));
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(label_1);
		
		JCheckBox chckbxRedColor = new JCheckBox("Red color");
		chckbxRedColor.setBackground(new Color(255, 240, 245));
		panel_1.add(chckbxRedColor);
		
		JSpinner spinner_1 = new JSpinner();
		panel_1.add(spinner_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "9. \uC548\uAC1C\uAF43(Gypsophila)", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBackground(new Color(255, 240, 245));
		contentPane.add(panel_2);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\workspace\\FlowerOrderProgramProject\\image\\flower\\3.png"));
		label_2.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(label_2);
		
		JCheckBox chckbxWhiteColor = new JCheckBox("White color");
		chckbxWhiteColor.setBackground(new Color(255, 240, 245));
		panel_2.add(chckbxWhiteColor);
		
		JSpinner spinner_2 = new JSpinner();
		panel_2.add(spinner_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setIcon(new ImageIcon("C:\\workspace\\FlowerOrderProgramProject\\image\\flower\\basket.png"));
		btnNewButton.setBounds(35, 117, 122, 113);
		panel_3.add(btnNewButton);
	}
}
