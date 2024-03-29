package create.gui;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.Component;
import javax.swing.Box;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;
import javax.swing.JMenu;

public class ActivityFrame extends JFrame 
{	
	private StringPanel currentPanel;
	
	public boolean nextTextBox = false;
			
	public int answer = 0;
	
	public String opperand = "";
	private JTextField textField;
	private JTextField textField_1;
	private final Action action = new SwingAction();
	private JTextField txtWorkHours;
	private JTextField txtSleepHours;
	private JTextField txtCardioInMinutes;
	private JTextField txtStrengthTraining;
	private JTextField txtBloodSugar;
	private JTextField txtPulseRate;
	private JTextField txtCalorieIntake;
	private JTextField txtWeight;
	private JTextField txtSystolic;
	private JTextField txtDiastolic;
	
	
	public ActivityFrame() 
	{
		getContentPane().setLayout(null);
		
		JLabel lblWorkHours = new JLabel("Work Hours");
		lblWorkHours.setBounds(30, 72, 114, 14);
		getContentPane().add(lblWorkHours);
		
		JLabel lblSleepHours = new JLabel("Sleep Hours");
		lblSleepHours.setBounds(30, 102, 114, 14);
		getContentPane().add(lblSleepHours);
		
		JLabel lblCardioInMinutes = new JLabel("Cardio in minutes");
		lblCardioInMinutes.setBounds(30, 132, 114, 14);
		getContentPane().add(lblCardioInMinutes);
		
		JLabel lblStrengthTraining = new JLabel("Strength Training");
		lblStrengthTraining.setBounds(30, 162, 130, 14);
		getContentPane().add(lblStrengthTraining);
		
		JLabel lblPulseRate = new JLabel("Blood Sugar");
		lblPulseRate.setBounds(30, 309, 96, 14);
		getContentPane().add(lblPulseRate);
		
		JLabel lblCalorieIntake = new JLabel("Pulse Rate");
		lblCalorieIntake.setBounds(30, 339, 96, 14);
		getContentPane().add(lblCalorieIntake);
		
		JLabel lblWeight = new JLabel("Calorie Intake");
		lblWeight.setBounds(30, 369, 96, 14);
		getContentPane().add(lblWeight);
		
		txtWorkHours = new JTextField();
		txtWorkHours.setBounds(144, 69, 86, 20);
		getContentPane().add(txtWorkHours);
		txtWorkHours.setColumns(10);
		
		txtSleepHours = new JTextField();
		txtSleepHours.setBounds(145, 99, 86, 20);
		txtSleepHours.setColumns(10);
		getContentPane().add(txtSleepHours);
		
		txtCardioInMinutes = new JTextField();
		txtCardioInMinutes.setBounds(145, 129, 86, 20);
		txtCardioInMinutes.setColumns(10);
		getContentPane().add(txtCardioInMinutes);
		
		txtStrengthTraining = new JTextField();
		txtStrengthTraining.setBounds(144, 159, 86, 20);
		txtStrengthTraining.setColumns(10);
		getContentPane().add(txtStrengthTraining);
		
		txtBloodSugar = new JTextField();
		txtBloodSugar.setBounds(144, 306, 86, 20);
		txtBloodSugar.setColumns(10);
		getContentPane().add(txtBloodSugar);
		
		txtPulseRate = new JTextField();
		txtPulseRate.setBounds(145, 336, 86, 20);
		txtPulseRate.setColumns(10);
		getContentPane().add(txtPulseRate);
		
		txtCalorieIntake = new JTextField();
		txtCalorieIntake.setBounds(144, 366, 86, 20);
		txtCalorieIntake.setColumns(10);
		getContentPane().add(txtCalorieIntake);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBounds(393, 32, 28, 23);
		getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox checkBox = new JCheckBox("");
		checkBox.setBounds(393, 72, 28, 23);
		getContentPane().add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("");
		checkBox_1.setBounds(393, 112, 28, 23);
		getContentPane().add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("");
		checkBox_2.setBounds(393, 152, 28, 23);
		getContentPane().add(checkBox_2);
		
		JLabel label = new JLabel("Work Hours");
		label.setBounds(291, 35, 96, 14);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Sleep Hours");
		label_1.setBounds(291, 75, 96, 14);
		getContentPane().add(label_1);
		
		JLabel lblCardio = new JLabel("Cardio");
		lblCardio.setBounds(291, 115, 47, 14);
		getContentPane().add(lblCardio);
		
		JLabel lblStrength = new JLabel("Strength");
		lblStrength.setBounds(291, 155, 58, 14);
		getContentPane().add(lblStrength);
		
		JLabel lblBloodPressure_1 = new JLabel("Blood Pressure");
		lblBloodPressure_1.setBounds(291, 259, 96, 14);
		getContentPane().add(lblBloodPressure_1);
		
		JLabel lblBloodSugar = new JLabel("Blood Sugar");
		lblBloodSugar.setBounds(291, 299, 96, 14);
		getContentPane().add(lblBloodSugar);
		
		JLabel lblPulseRate_1 = new JLabel("Pulse Rate");
		lblPulseRate_1.setBounds(291, 339, 78, 14);
		getContentPane().add(lblPulseRate_1);
		
		JLabel lblCalorieIntake_1 = new JLabel("Calorie Intake");
		lblCalorieIntake_1.setBounds(291, 379, 96, 14);
		getContentPane().add(lblCalorieIntake_1);
		
		JCheckBox checkBox_3 = new JCheckBox("");
		checkBox_3.setBounds(394, 376, 28, 23);
		getContentPane().add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("");
		checkBox_4.setBounds(394, 336, 28, 23);
		getContentPane().add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("");
		checkBox_5.setBounds(394, 296, 28, 23);
		getContentPane().add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("");
		checkBox_6.setBounds(394, 256, 28, 23);
		getContentPane().add(checkBox_6);
		
		txtWeight = new JTextField();
		txtWeight.setBounds(144, 396, 86, 20);
		txtWeight.setColumns(10);
		getContentPane().add(txtWeight);
		
		JLabel label_6 = new JLabel("Weight");
		label_6.setBounds(30, 396, 76, 14);
		getContentPane().add(label_6);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Day");
		rdbtnNewRadioButton.setBounds(285, 414, 47, 23);
		getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnMonth = new JRadioButton("Month");
		rdbtnMonth.setBounds(397, 414, 65, 23);
		getContentPane().add(rdbtnMonth);
		
		JRadioButton rdbtnWeek = new JRadioButton("Week");
		rdbtnWeek.setBounds(337, 414, 58, 23);
		getContentPane().add(rdbtnWeek);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalStrut.setBounds(254, -16, 12, 524);
		getContentPane().add(verticalStrut);
		
		JRadioButton radioButton = new JRadioButton("Day");
		radioButton.setBounds(285, 188, 47, 23);
		getContentPane().add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Week");
		radioButton_1.setBounds(337, 188, 58, 23);
		getContentPane().add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("Month");
		radioButton_2.setBounds(397, 188, 65, 23);
		getContentPane().add(radioButton_2);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setBounds(260, 225, 350, 12);
		getContentPane().add(horizontalStrut);
		
		JLabel lblNewLabel_2 = new JLabel("Health Indicators");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblNewLabel_2.setBounds(30, 233, 130, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblActivities = new JLabel("Activities");
		lblActivities.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		lblActivities.setBounds(30, 31, 76, 14);
		getContentPane().add(lblActivities);
		
		txtSystolic = new JTextField();
		txtSystolic.setColumns(10);
		txtSystolic.setBounds(144, 275, 40, 20);
		getContentPane().add(txtSystolic);
		
		txtDiastolic = new JTextField();
		txtDiastolic.setColumns(10);
		txtDiastolic.setBounds(190, 275, 40, 20);
		getContentPane().add(txtDiastolic);
		
		JLabel label_2 = new JLabel("Blood Pressure");
		label_2.setBounds(30, 278, 96, 14);
		getContentPane().add(label_2);
		
		JLabel lblSys = new JLabel("Sys");
		lblSys.setBounds(154, 258, 28, 14);
		getContentPane().add(lblSys);
		
		JLabel lblDia = new JLabel("Dia");
		lblDia.setBounds(197, 259, 28, 14);
		getContentPane().add(lblDia);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("   File");
		menuBar.add(mnNewMenu);
		
		JMenuItem submitAllMenuItem = new JMenuItem("  Submit All");
		
		
		
		
		
		
		submitAllMenuItem.addActionListener(new ActionListener() {
			
			
			
			
			public void actionPerformed(ActionEvent arg0) 
			{// action to submit data
				
				JOptionPane.showMessageDialog ( 
						   null, "You have successfully submitted all of your data." ); 
			
				// This variable is used to know which user is currently logged in 
				// for writing the data to the correct users text file.
				String userLoggedIn = SignInFrame.getUserCurrentlyLoggedIN();
			
				
				SubmitData newSubmitDataObject = new SubmitData( userLoggedIn ,
						                                       123, 
						                                    checkString(txtDiastolic),
						                       				checkString(txtSystolic),
						                       				checkString(txtBloodSugar),
						                       				checkString(txtPulseRate),
						                       				checkString(txtCalorieIntake),
						                       				checkString(txtWeight),
						                       				checkString(txtWorkHours),
						                       				checkString(txtSleepHours),
						                       				checkString(txtCardioInMinutes),
						                       				checkString(txtStrengthTraining) );
				// send this record to DataBase
			
				System.out.println(newSubmitDataObject);
			}
			
			
			
			
			
			
			
		});
		mnNewMenu.add(submitAllMenuItem);
		
		JMenuItem graphActivitiesMenuItem = new JMenuItem("  Graph Activities");
		mnNewMenu.add(graphActivitiesMenuItem);
		
		JMenuItem graphHealthIndicatorsMenuItem = new JMenuItem("  Graph Health Indicators");
		mnNewMenu.add(graphHealthIndicatorsMenuItem);
		
		JMenuItem printPreviewMenuItem = new JMenuItem("  Print Preview");
		printPreviewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PrintPreviewFrame preview = new PrintPreviewFrame();
				preview.start();
			}
		});
		printPreviewMenuItem.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		mnNewMenu.add(printPreviewMenuItem);
		
		JMenuItem signOutMenuItem = new JMenuItem("  Sign Out");
		signOutMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				SignInFrame.setUserCurrentlyLoggedIN("");
				
				SignInFrame newFrame = new SignInFrame();
				newFrame.start();
				
				dispose();
			}
		});
		mnNewMenu.add(signOutMenuItem);
		
		JMenuItem menuItem = new JMenuItem("");
		menuBar.add(menuItem);
		
		currentPanel = new StringPanel();
	}
	
	public void start()
	{
		this.setLocation(300, 150);
		this.setSize(595,529);
		this.setVisible(true);
	}
	
	public double checkString(JTextField fieldSent){
		double blank = -1.0;
		if(fieldSent.getText().equals("")) {
	        return blank;
	    }else {
	    	
	    	try {
	    		return Double.parseDouble( fieldSent.getText() );
	    	} catch (NumberFormatException e) {
	    	    
	    	    return -1;
	    	}
	    	
	    }
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
