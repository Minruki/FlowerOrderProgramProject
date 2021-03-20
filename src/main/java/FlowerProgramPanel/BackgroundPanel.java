package FlowerProgramPanel;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class BackgroundPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public BackgroundPanel() {

		initialize();
	}
	private void initialize() {
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\workspace\\FlowerOrderProgramProject\\image\\flower\\heart.jpg"));
		add(lblNewLabel);
	}

}
