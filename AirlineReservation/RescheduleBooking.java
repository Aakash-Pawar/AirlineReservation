import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class RescheduleBooking {

	public JFrame frame;
	public JTextField txtbid;
	public JTextField txtsource;
	public JTextField txttdate;
	public JTextField txtcn;
	public JTextField txtamt;
	public JTextField txtfn;
	public JTextField txtpnm;
	public JTextField txtdest;
	public JTextField txtan;
	public JTextField txtpnum;


/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RescheduleBooking window = new RescheduleBooking();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	public RescheduleBooking() 
	{
		initialize();
		this.frame.setLocationRelativeTo(null);
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 250, 205));
		frame.setBounds(100, 100, 1003, 704);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblBookingId = new JLabel("Booking Id :");
		lblBookingId.setFont(new Font("Calibri", Font.PLAIN, 19));
		lblBookingId.setBounds(81, 176, 186, 40);
		frame.getContentPane().add(lblBookingId);
		
		JLabel lblpnm = new JLabel("Passenger Name : ");
		lblpnm.setFont(new Font("Calibri", Font.PLAIN, 19));
		lblpnm.setBounds(561, 227, 186, 40);
		frame.getContentPane().add(lblpnm);
		
		JLabel lblsource = new JLabel("Source :");
		lblsource.setFont(new Font("Calibri", Font.PLAIN, 19));
		lblsource.setBounds(81, 227, 186, 40);
		frame.getContentPane().add(lblsource);
		
		JLabel lbldest = new JLabel("Destination :");
		lbldest.setFont(new Font("Calibri", Font.PLAIN, 19));
		lbldest.setBounds(561, 278, 186, 40);
		frame.getContentPane().add(lbldest);
		
		JLabel lbltdate = new JLabel("Travel Date :");
		lbltdate.setFont(new Font("Calibri", Font.PLAIN, 19));
		lbltdate.setBounds(81, 278, 158, 40);
		frame.getContentPane().add(lbltdate);
		
		JLabel lblcn = new JLabel("Contact Number :");
		lblcn.setFont(new Font("Calibri", Font.PLAIN, 19));
		lblcn.setBounds(81, 329, 158, 40);
		frame.getContentPane().add(lblcn);
		
		JLabel lblamt = new JLabel("Paid Amount :");
		lblamt.setFont(new Font("Calibri", Font.PLAIN, 19));
		lblamt.setBounds(81, 380, 186, 40);
		frame.getContentPane().add(lblamt);
		
		JLabel lblan = new JLabel("Airport Name :");
		lblan.setFont(new Font("Calibri", Font.PLAIN, 19));
		lblan.setBounds(561, 329, 186, 40);
		frame.getContentPane().add(lblan);
		
		JLabel lblpnum = new JLabel("Number of passengers :");
		lblpnum.setFont(new Font("Calibri", Font.PLAIN, 19));
		lblpnum.setBounds(561, 380, 186, 40);
		frame.getContentPane().add(lblpnum);
		
		JButton btnreschedule = new JButton("Reschedule My Flight");
		btnreschedule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				txttdate.setEditable(true);
				txtan.setEditable(true);
			}
		});
		btnreschedule.setFont(new Font("Calibri", Font.BOLD, 25));
		btnreschedule.setBounds(186, 540, 273, 46);
		frame.getContentPane().add(btnreschedule);
		
		JButton btncanclebooking = new JButton("Confirm Reschedule");
		btncanclebooking.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e)
			{
				String bid,tdate,an;
				bid=txtbid.getText();
				try
				{
					connectivity c=new connectivity();
					PreparedStatement pst=c.cn.prepareStatement("update booking set b_tdate=?,b_airportnm=? where b_id=?");
					
					tdate=txttdate.getText();
					an=txtan.getText();
					
					pst.setString(1,tdate);
					pst.setString(2,an);
					pst.setString(3,bid);
					
					pst.executeUpdate();
					
					JOptionPane.showMessageDialog(null,"Your Booking Reschedule is Confirmed..");
					AfterLogin af=new AfterLogin();
					af.frame.setVisible(true);
					PreparedStatement pst2=c.cn.prepareStatement("select Uname from booking where b_id=?");
					pst2.setString(1, bid);
					ResultSet rs=pst2.executeQuery();
					if(rs.next())
					{
						String un=rs.getString("Uname");
						af.lbl.setText(un);
					}
					c.cn.close();
					
					frame.dispose();
					
				}
				catch(Exception ex)
				{
					System.out.println(ex);
					
				}
			}
		});
		btncanclebooking.setFont(new Font("Calibri", Font.BOLD, 25));
		btncanclebooking.setBounds(561, 540, 255, 46);
		frame.getContentPane().add(btncanclebooking);
		
		JLabel lblRescheduleYourBooking = new JLabel("Reschedule Your Booking");
		lblRescheduleYourBooking.setHorizontalAlignment(SwingConstants.CENTER);
		lblRescheduleYourBooking.setFont(new Font("Calibri", Font.BOLD, 35));
		lblRescheduleYourBooking.setBounds(10, 33, 969, 51);
		frame.getContentPane().add(lblRescheduleYourBooking);
		
		JLabel lblFlightNo = new JLabel("Flight No :");
		lblFlightNo.setFont(new Font("Calibri", Font.PLAIN, 19));
		lblFlightNo.setBounds(561, 176, 186, 40);
		frame.getContentPane().add(lblFlightNo);
		
		txtbid = new JTextField();
		txtbid.setEditable(false);
		txtbid.setFont(new Font("Calibri", Font.PLAIN, 17));
		txtbid.setBounds(267, 176, 170, 35);
		frame.getContentPane().add(txtbid);
		txtbid.setColumns(10);
		
		txtsource = new JTextField();
		txtsource.setEditable(false);
		txtsource.setFont(new Font("Calibri", Font.PLAIN, 17));
		txtsource.setColumns(10);
		txtsource.setBounds(267, 227, 170, 35);
		frame.getContentPane().add(txtsource);
		
		txttdate = new JTextField();
		txttdate.setEditable(false);
		txttdate.setFont(new Font("Calibri", Font.PLAIN, 17));
		txttdate.setColumns(10);
		txttdate.setBounds(267, 278, 170, 35);
		frame.getContentPane().add(txttdate);
		
		txtcn = new JTextField();
		txtcn.setEditable(false);
		txtcn.setFont(new Font("Calibri", Font.PLAIN, 17));
		txtcn.setColumns(10);
		txtcn.setBounds(267, 329, 170, 35);
		frame.getContentPane().add(txtcn);
		
		txtamt = new JTextField();
		txtamt.setEditable(false);
		txtamt.setFont(new Font("Calibri", Font.PLAIN, 17));
		txtamt.setColumns(10);
		txtamt.setBounds(267, 380, 170, 35);
		frame.getContentPane().add(txtamt);
		
		txtfn = new JTextField();
		txtfn.setEditable(false);
		txtfn.setFont(new Font("Calibri", Font.PLAIN, 17));
		txtfn.setColumns(10);
		txtfn.setBounds(757, 176, 170, 35);
		frame.getContentPane().add(txtfn);
		
		txtpnm = new JTextField();
		txtpnm.setEditable(false);
		txtpnm.setFont(new Font("Calibri", Font.PLAIN, 17));
		txtpnm.setColumns(10);
		txtpnm.setBounds(757, 227, 170, 35);
		frame.getContentPane().add(txtpnm);
		
		txtdest = new JTextField();
		txtdest.setEditable(false);
		txtdest.setFont(new Font("Calibri", Font.PLAIN, 17));
		txtdest.setColumns(10);
		txtdest.setBounds(757, 278, 170, 35);
		frame.getContentPane().add(txtdest);
		
		txtan = new JTextField();
		txtan.setEditable(false);
		txtan.setFont(new Font("Calibri", Font.PLAIN, 17));
		txtan.setColumns(10);
		txtan.setBounds(757, 329, 170, 35);
		frame.getContentPane().add(txtan);
		
		txtpnum = new JTextField();
		txtpnum.setEditable(false);
		txtpnum.setFont(new Font("Calibri", Font.PLAIN, 17));
		txtpnum.setColumns(10);
		txtpnum.setBounds(757, 380, 170, 35);
		frame.getContentPane().add(txtpnum);
	}
}
