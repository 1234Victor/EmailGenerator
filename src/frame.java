import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;

public class frame extends JFrame {

	private JPanel contentPane;
	private JTextField txtTutor;
	private JLabel lblTutee;
	private JTextField txtTutee;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtEmail;
	private JTextField txtSubject;
	private JTextField txtStartHour;
	private JTextField txtEndHour;
	private JTextField txtStartMinute;
	private JTextField txtEndMinute;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final Action action = new SwingAction();
	String[] monthGroup = {"Jan.", "Feb.","Mar.","Apr.","May.","Jun.","Jul.","Aug.","Sep.","Oct.","Nov.","Dec."};
	String[] dateGroup = {"1st","2nd","3rd","4th","5th","6th","7th","8th","9th","10th","11th","12th","13th","14th","15th","16th","17th","18th","19th","20th","21st","22nd","23rd","24th","25th","26th","27th","28th","29th","30th","31st"};
	private JRadioButton btnPairing;
	private JTextField txtVolunteerHour;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame frame = new frame();
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
	public frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 710, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtTutor = new JTextField();
		txtTutor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtTutor.setBounds(54, 11, 161, 25);
		contentPane.add(txtTutor);
		txtTutor.setColumns(10);
		
		JLabel lbl1 = new JLabel("Tutor:");
		lbl1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbl1.setBounds(10, 14, 46, 14);
		contentPane.add(lbl1);
		
		lblTutee = new JLabel("Tutee:");
		lblTutee.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTutee.setBounds(225, 14, 212, 14);
		contentPane.add(lblTutee);
		
		txtTutee = new JTextField();
		txtTutee.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtTutee.setColumns(10);
		txtTutee.setBounds(273, 11, 151, 25);
		contentPane.add(txtTutee);
		
		JRadioButton btnTutorLong = new JRadioButton("Tutor Long-term");
		buttonGroup.add(btnTutorLong);
		btnTutorLong.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnTutorLong.setBounds(53, 66, 134, 23);
		contentPane.add(btnTutorLong);
		btnTutorLong.setSelected(true);
		
		JRadioButton btnTuteeLong = new JRadioButton("Tutee Long-term");
		buttonGroup.add(btnTuteeLong);
		btnTuteeLong.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnTuteeLong.setBounds(53, 104, 134, 23);
		contentPane.add(btnTuteeLong);
		
		JRadioButton btnTutorFirst = new JRadioButton("Tutor First Time");
		buttonGroup.add(btnTutorFirst);
		btnTutorFirst.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnTutorFirst.setBounds(225, 66, 134, 23);
		contentPane.add(btnTutorFirst);
		
		JRadioButton btnTuteeFirst = new JRadioButton("Tutee First Time");
		buttonGroup.add(btnTuteeFirst);
		btnTuteeFirst.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnTuteeFirst.setBounds(225, 104, 134, 23);
		contentPane.add(btnTuteeFirst);
		
		JRadioButton btnReminder = new JRadioButton("Reminder");
		buttonGroup.add(btnReminder);
		btnReminder.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnReminder.setBounds(391, 66, 109, 23);
		contentPane.add(btnReminder);
		
		JLabel lblEmail = new JLabel("E-Mail:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmail.setBounds(10, 151, 46, 14);
		contentPane.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(75, 148, 378, 25);
		contentPane.add(txtEmail);
		
		JLabel lblSubject = new JLabel("Subject:");
		lblSubject.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSubject.setBounds(10, 201, 77, 14);
		contentPane.add(lblSubject);
		
		txtSubject = new JTextField();
		txtSubject.setColumns(10);
		txtSubject.setBounds(75, 198, 378, 25);
		contentPane.add(txtSubject);
		
		JTextPane txtText = new JTextPane();
		txtText.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtText.setBounds(10, 247, 665, 384);
		contentPane.add(txtText);
		
		JComboBox cbMonth = new JComboBox(monthGroup);
		cbMonth.setBounds(502, 138, 63, 22);
		contentPane.add(cbMonth);
		
		JComboBox cbDate = new JComboBox(dateGroup);
		cbDate.setBounds(582, 138, 63, 22);
		contentPane.add(cbDate);
		
		JRadioButton btnAM = new JRadioButton("AM");
		buttonGroup_1.add(btnAM);
		btnAM.setBounds(639, 168, 109, 23);
		contentPane.add(btnAM);
		
		JRadioButton btnPM = new JRadioButton("PM");
		buttonGroup_1.add(btnPM);
		btnPM.setBounds(639, 200, 109, 23);
		contentPane.add(btnPM);
		btnPM.setSelected(true);
		
		JRadioButton btnVolunteerHour = new JRadioButton("Volunteer Hour");
		buttonGroup.add(btnVolunteerHour);
		btnVolunteerHour.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnVolunteerHour.setBounds(502, 104, 106, 23);
		contentPane.add(btnVolunteerHour);
		
		JButton btnCreate = new JButton("Creat");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String tutorName = txtTutor.getText();
				String tuteeName = txtTutee.getText();
				String startTime = txtStartHour.getText() +":"+txtStartMinute.getText();
				String endTime = txtEndHour.getText()+":"+txtEndMinute.getText();
				String date = cbMonth.getSelectedItem() + " "+cbDate.getSelectedItem();
				String ma = "";
				if(btnAM.isSelected()){
					 ma= "AM";
				}
				else{
					 ma = "PM";
				}
				txtSubject.setText("");
				txtEmail.setText("");
				if(btnTutorLong.isSelected()) {
					tutor tutor = listManager.findTutor(tutorName);
					if(tutor == null) {
						JOptionPane.showMessageDialog(null,"Tutor not Found", "Error", JOptionPane.ERROR_MESSAGE);
					}
					else {
						txtTutor.setText(tutor.getName());
					}
					txtSubject.setText("("+date+")Semi Online Study Circle(Tutor-Long Term)");
					int classTime = (Integer.parseInt(txtEndHour.getText())-Integer.parseInt(txtStartHour.getText()))*60+(Integer.parseInt(txtEndMinute.getText())-Integer.parseInt(txtStartMinute.getText()));
					int rewardTime = (int) (classTime * 0.5);
					txtText.setText(function.printTextTutorLong(tutorName, tuteeName, startTime, endTime, ma, date,classTime, rewardTime));
					txtEmail.setText(tutor.getEmail());
				}
				
				else if(btnTuteeLong.isSelected()) {
					tutee tutee = listManager.findTutee(tuteeName);
					if(tutee == null) {
						JOptionPane.showMessageDialog(null,"Tutee not Found", "Error", JOptionPane.ERROR_MESSAGE);
					}
					else {
						txtTutee.setText(tutee.getName());
					}
					txtSubject.setText("("+date+")Semi Online Study Circle(Tutee-Long Term)");
					txtText.setText(function.printTextTuteeLong(tutorName, tuteeName, startTime, endTime, ma, date));
					txtEmail.setText(tutee.getEmail());
				}
				
				else if(btnTutorFirst.isSelected()) {
					txtSubject.setText("("+date+")Semi Online Study Circle(Tutor)");
					int classTime = (Integer.parseInt(txtEndHour.getText())-Integer.parseInt(txtStartHour.getText()))*60+(Integer.parseInt(txtEndMinute.getText())-Integer.parseInt(txtStartMinute.getText()));
					int rewardTime = (int) (classTime * 0.5);
					txtText.setText(function.printTextTutorFirst(tutorName, tuteeName, startTime, endTime, ma, date,classTime, rewardTime));
				}
				else if(btnTuteeFirst.isSelected()) {
					txtSubject.setText("("+date+")Semi Online Study Circle(Tutee)");
					txtText.setText(function.printTextTuteeFirst(tutorName, tuteeName, startTime, endTime, ma, date));
				}
				else if(btnTuteeFirst.isSelected()) {
					txtSubject.setText("("+date+")Semi Online Study Circle(Tutee)");
					txtText.setText(function.printTextTuteeFirst(tutorName, tuteeName, startTime, endTime, ma, date));
				}
				else if(btnReminder.isSelected()) {
					txtText.setText("[This is a reminder that you will have a session tomorrow]\r\n" + 
							"We suggest you come 5 minutes early.\r\n" + 
							"Thank you\r\n" + 
							"");
				}
				else if(btnPairing.isSelected()) {
					tutor tutor = listManager.findTutor(tutorName);
					if(tutor == null) {
						JOptionPane.showMessageDialog(null,"Tutor not Found", "Error", JOptionPane.ERROR_MESSAGE);
					}
					else {
						txtTutor.setText(tutor.getName());
					}
					tutee tutee = listManager.findTutee(tuteeName);
					if(tutee == null) {
						JOptionPane.showMessageDialog(null,"Tutee not Found", "Error", JOptionPane.ERROR_MESSAGE);
						txtText.setText(function.printPairing(tuteeName,"......"));
					}
					else {
						txtText.setText(function.printPairing(tuteeName, tutee.getEmail()));
						txtTutor.setText(tutor.getName());
					}
					txtEmail.setText(tutor.getEmail());
					
				}
				else if(btnVolunteerHour.isSelected()) {
					tutor tutor = listManager.findTutor(tutorName);
					if(tutor == null) {
						JOptionPane.showMessageDialog(null,"Tutor not Found", "Error", JOptionPane.ERROR_MESSAGE);
					}
					else {
						txtTutor.setText(tutor.getName());
					}
					txtSubject.setText("Semi Study Circle Tutor Progress Report (2020-2021)");
					txtText.setText(function.printVolunteerHour(tutorName,txtVolunteerHour.getText()));
					txtVolunteerHour.setText("");
					txtEmail.setText(tutor.getEmail());
				}
			}
		});
		btnCreate.setAction(action);
		btnCreate.setBounds(508, 11, 106, 61);
		contentPane.add(btnCreate);
		
		JLabel lblNewLabel = new JLabel("Date:");
		lblNewLabel.setBounds(463, 135, 37, 29);
		contentPane.add(lblNewLabel);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Start Time:");
		lblNewLabel_1.setBounds(463, 175, 63, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("End Time:");
		lblNewLabel_1_1.setBounds(463, 203, 63, 14);
		contentPane.add(lblNewLabel_1_1);
		
		txtStartHour = new JTextField();
		txtStartHour.setText("4");
		txtStartHour.setBounds(537, 173, 32, 20);
		contentPane.add(txtStartHour);
		txtStartHour.setColumns(10);
		
		txtEndHour = new JTextField();
		txtEndHour.setText("5");
		txtEndHour.setColumns(10);
		txtEndHour.setBounds(537, 201, 32, 20);
		contentPane.add(txtEndHour);
		
		txtStartMinute = new JTextField();
		txtStartMinute.setText("00");
		txtStartMinute.setColumns(10);
		txtStartMinute.setBounds(579, 173, 54, 20);
		contentPane.add(txtStartMinute);
		
		txtEndMinute = new JTextField();
		txtEndMinute.setText("00");
		txtEndMinute.setColumns(10);
		txtEndMinute.setBounds(579, 201, 54, 20);
		contentPane.add(txtEndMinute);
		
		JLabel lblNewLabel_2 = new JLabel(":");
		lblNewLabel_2.setBounds(571, 176, 16, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel(":");
		lblNewLabel_2_1.setBounds(571, 204, 16, 14);
		contentPane.add(lblNewLabel_2_1);
		
		btnPairing = new JRadioButton("Pairing");
		buttonGroup.add(btnPairing);
		btnPairing.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnPairing.setBounds(391, 104, 109, 23);
		contentPane.add(btnPairing);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(75, 424, 166, 73);
		contentPane.add(textArea);
		
		
		txtVolunteerHour = new JTextField();
		txtVolunteerHour.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtVolunteerHour.setColumns(10);
		txtVolunteerHour.setBounds(614, 101, 46, 25);
		contentPane.add(txtVolunteerHour);
		
		JLabel lblNewLabel_3 = new JLabel("hr");
		lblNewLabel_3.setBounds(670, 108, 46, 14);
		contentPane.add(lblNewLabel_3);
		
	
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Create");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
