import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.TextField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Panel;

public class FlightBooking {

	public JFrame frame;
	public JLabel fnolbl;
	public JLabel fslbl;
	public JLabel destlbl;
	public JLabel tdatelbl;
	public JLabel pricelbl;
	public JLabel anlbl;
	public JLabel ftimelbl;
	private JLabel lblFlightNo;
	private JLabel lblSource;
	private JLabel lblDestination;
	private JLabel lblTravelDate;
	private JLabel lblTime;
	private JLabel lblPrice;
	private JLabel lblAirportName;
	private JLabel lblFlightDetails;
	private JLabel lblPassengerDetails;
	private JLabel lblPassengerName;
	private JLabel lblContactNo;
	private JLabel lblNumberOfPassenger;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FlightBooking window = new FlightBooking();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public FlightBooking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(153, 51, 153));
		frame.setBounds(100, 100, 1098, 654);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		fnolbl = new JLabel("From");
		fnolbl.setFont(new Font("Calibri", Font.BOLD, 25));
		fnolbl.setBounds(299, 94, 95, 35);
		frame.getContentPane().add(fnolbl);
		
		fslbl = new JLabel("From");
		fslbl.setFont(new Font("Calibri", Font.BOLD, 25));
		fslbl.setBounds(299, 142, 95, 35);
		frame.getContentPane().add(fslbl);
		
		destlbl = new JLabel("From");
		destlbl.setFont(new Font("Calibri", Font.BOLD, 25));
		destlbl.setBounds(299, 211, 95, 35);
		frame.getContentPane().add(destlbl);
		
		tdatelbl = new JLabel("From");
		tdatelbl.setFont(new Font("Calibri", Font.BOLD, 25));
		tdatelbl.setBounds(299, 277, 95, 35);
		frame.getContentPane().add(tdatelbl);
		
		pricelbl = new JLabel("From");
		pricelbl.setFont(new Font("Calibri", Font.BOLD, 25));
		pricelbl.setBounds(299, 354, 95, 35);
		frame.getContentPane().add(pricelbl);
		
		anlbl = new JLabel("From");
		anlbl.setFont(new Font("Calibri", Font.BOLD, 25));
		anlbl.setBounds(299, 488, 95, 35);
		frame.getContentPane().add(anlbl);
		
		ftimelbl = new JLabel("From");
		ftimelbl.setFont(new Font("Calibri", Font.BOLD, 25));
		ftimelbl.setBounds(299, 422, 95, 35);
		frame.getContentPane().add(ftimelbl);
		
		lblFlightNo = new JLabel("Flight No");
		lblFlightNo.setFont(new Font("Calibri", Font.BOLD, 25));
		lblFlightNo.setBounds(36, 94, 151, 35);
		frame.getContentPane().add(lblFlightNo);
		
		lblSource = new JLabel("Source");
		lblSource.setFont(new Font("Calibri", Font.BOLD, 25));
		lblSource.setBounds(36, 142, 151, 35);
		frame.getContentPane().add(lblSource);
		
		lblDestination = new JLabel("Destination");
		lblDestination.setFont(new Font("Calibri", Font.BOLD, 25));
		lblDestination.setBounds(36, 211, 165, 35);
		frame.getContentPane().add(lblDestination);
		
		lblTravelDate = new JLabel("Travel Date");
		lblTravelDate.setFont(new Font("Calibri", Font.BOLD, 25));
		lblTravelDate.setBounds(36, 277, 150, 35);
		frame.getContentPane().add(lblTravelDate);
		
		lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Calibri", Font.BOLD, 25));
		lblTime.setBounds(36, 422, 177, 35);
		frame.getContentPane().add(lblTime);
		
		lblPrice = new JLabel("Price for Single");
		lblPrice.setFont(new Font("Calibri", Font.BOLD, 25));
		lblPrice.setBounds(36, 354, 173, 35);
		frame.getContentPane().add(lblPrice);
		
		lblAirportName = new JLabel("Airport Name");
		lblAirportName.setFont(new Font("Calibri", Font.BOLD, 25));
		lblAirportName.setBounds(36, 488, 210, 35);
		frame.getContentPane().add(lblAirportName);
		
		lblFlightDetails = new JLabel("Flight Details...");
		lblFlightDetails.setBackground(Color.LIGHT_GRAY);
		lblFlightDetails.setFont(new Font("Calibri", Font.BOLD, 30));
		lblFlightDetails.setBounds(50, 24, 196, 47);
		frame.getContentPane().add(lblFlightDetails);
		
		lblPassengerDetails = new JLabel("Passenger Details...");
		lblPassengerDetails.setFont(new Font("Calibri", Font.BOLD, 30));
		lblPassengerDetails.setBackground(Color.LIGHT_GRAY);
		lblPassengerDetails.setBounds(545, 24, 249, 47);
		frame.getContentPane().add(lblPassengerDetails);
		
		lblPassengerName = new JLabel("Passenger Name");
		lblPassengerName.setFont(new Font("Calibri", Font.BOLD, 25));
		lblPassengerName.setBounds(545, 112, 242, 35);
		frame.getContentPane().add(lblPassengerName);
		
		lblContactNo = new JLabel("Contact No");
		lblContactNo.setFont(new Font("Calibri", Font.BOLD, 25));
		lblContactNo.setBounds(545, 188, 242, 35);
		frame.getContentPane().add(lblContactNo);
		
		lblNumberOfPassenger = new JLabel("Number of Passenger");
		lblNumberOfPassenger.setFont(new Font("Calibri", Font.BOLD, 25));
		lblNumberOfPassenger.setBounds(545, 265, 242, 35);
		frame.getContentPane().add(lblNumberOfPassenger);
		
		textField = new JTextField();
		textField.setFont(new Font("Calibri", Font.BOLD, 15));
		textField.setColumns(10);
		textField.setBounds(834, 101, 124, 35);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Calibri", Font.BOLD, 15));
		textField_1.setColumns(10);
		textField_1.setBounds(834, 176, 124, 35);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Calibri", Font.BOLD, 15));
		textField_2.setColumns(10);
		textField_2.setBounds(834, 265, 124, 35);
		frame.getContentPane().add(textField_2);
		
		JButton btnConfirmYourDetails = new JButton("Confirm Your Details");
		btnConfirmYourDetails.setFont(new Font("Calibri", Font.BOLD, 25));
		btnConfirmYourDetails.setBackground(Color.LIGHT_GRAY);
		btnConfirmYourDetails.setBounds(568, 454, 355, 53);
		frame.getContentPane().add(btnConfirmYourDetails);
	}

	public void setFlightNo(String i) 
	{
		// TODO Auto-generated method stub
		fnolbl.setText(String.valueOf(i));
		
	}

	public void setfromsource(String i) 
	{
		// TODO Auto-generated method stub
		fslbl.setText(String.valueOf(i));
		
	}

	public void setdest(String i) {
		// TODO Auto-generated method stub
		destlbl.setText(String.valueOf(i));
		
	}

	public void settdate(String i) {
		// TODO Auto-generated method stub
		tdatelbl.setText(String.valueOf(i));
		
	}
}
