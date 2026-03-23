

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

import javax.swing.WindowConstants;


/** It Provides Full GUI for User to Perform Hiding and Unhiding
 */
public class StegoStick extends javax.swing.JFrame {

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

	private JLabel titleLabel;
	private JPanel unhidingPanel;
	private JPanel hidingPanel;
	private JTabbedPane containerPane;


    // Main Method
	public static void main(String[] args) {


	    StegoStick inst = new StegoStick();
		inst.setVisible(true);
	}

	public StegoStick() {
		super("Video Stegnography Using LSB");

		setLocation(300,300);
		setResizable(false);
		initGUI();
	}

	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(null);
			{
				titleLabel = new JLabel();
				getContentPane().add(titleLabel);
				titleLabel.setText("Video Stegnography Using LSB");
				titleLabel.setFont(new java.awt.Font("Baskerville Old Face",1,20));
				titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
				titleLabel.setBounds(0, 0, 595, 49);
			}
			{
				containerPane = new JTabbedPane();
				getContentPane().add(containerPane);
				containerPane.setBounds(0, 49, 595, 371);
				containerPane.setTabPlacement(JTabbedPane.LEFT);
				containerPane.setFont(new java.awt.Font("Corbel",0,16));
				
				{
					hidingPanel = new HideGUI();
					containerPane.addTab("Hiding", null, hidingPanel, null);
					hidingPanel.setPreferredSize(new java.awt.Dimension(459,371));
					hidingPanel.setOpaque(false);
             	
					unhidingPanel = new UnhideGUI();
					containerPane.addTab("UnHiding", null, unhidingPanel, null);
					unhidingPanel.setOpaque(false);
				}

			}
			pack();
			this.setSize(610, 461);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}