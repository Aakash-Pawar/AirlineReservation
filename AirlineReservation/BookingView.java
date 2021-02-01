import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class BookingView {

	public JFrame frame;
	public JComboBox bidcombo;

/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookingView window = new BookingView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	public BookingView() 
	{
		initialize();
		this.frame.setLocationRelativeTo(null);
	}

	private void initialize() 
	{
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 250, 205));
		frame.setBounds(100, 100, 1006, 694);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Select Your Booking Id Which You Want To View");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 25));
		lblNewLabel.setBounds(28, 124, 513, 40);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBounds(28, 11, 80, 40);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnsubmit = new JButton("Submit");
		btnsubmit.setFont(new Font("Calibri", Font.BOLD, 25));
		btnsubmit.setBounds(773, 121, 131, 46);
		frame.getContentPane().add(btnsubmit);
		
		JLabel lblfn = new JLabel("Flight Number : ");
		lblfn.setFont(new Font("Calibri", Font.PLAIN, 19));
		lblfn.setBounds(95, 231, 186, 40);
		frame.getContentPane().add(lblfn);
		
		JLabel lblsource = new JLabel("Source :");
		lblsource.setFont(new Font("Calibri", Font.PLAIN, 19));
		lblsource.setBounds(95, 282, 186, 40);
		frame.getContentPane().add(lblsource);
		
		JLabel lbltdate = new JLabel("Travel Date :");
		lbltdate.setFont(new Font("Calibri", Font.PLAIN, 19));
		lbltdate.setBounds(95, 333, 158, 40);
		frame.getContentPane().add(lbltdate);
		
		JLabel lblcn = new JLabel("Contact Number :");
		lblcn.setFont(new Font("Calibri", Font.PLAIN, 19));
		lblcn.setBounds(95, 384, 158, 40);
		frame.getContentPane().add(lblcn);
		
		JLabel lblpnum = new JLabel("Number of passengers :");
		lblpnum.setFont(new Font("Calibri", Font.PLAIN, 19));
		lblpnum.setBounds(578, 384, 186, 40);
		frame.getContentPane().add(lblpnum);
		
		JLabel lbldest = new JLabel("Destination :");
		lbldest.setFont(new Font("Calibri", Font.PLAIN, 19));
		lbldest.setBounds(578, 282, 186, 40);
		frame.getContentPane().add(lbldest);
		
		JLabel lblpnm = new JLabel("Passenger Name : ");
		lblpnm.setFont(new Font("Calibri", Font.PLAIN, 19));
		lblpnm.setBounds(578, 231, 186, 40);
		frame.getContentPane().add(lblpnm);
		
		JLabel lblan = new JLabel("Airport Name :");
		lblan.setFont(new Font("Calibri", Font.PLAIN, 19));
		lblan.setBounds(578, 333, 186, 40);
		frame.getContentPane().add(lblan);
		
		JLabel lblamt = new JLabel("Paid Amount :");
		lblamt.setFont(new Font("Calibri", Font.PLAIN, 19));
		lblamt.setBounds(95, 435, 186, 40);
		frame.getContentPane().add(lblamt);
		
		JButton btnreschedule = new JButton("Reschedule My Flight");
		btnreschedule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				RescheduleBooking rb=new RescheduleBooking();
				rb.frame.setVisible(true);
				frame.dispose();
				String bid,fn,fs,dest,tdate,an,pnm,pnum,cn,amt;
				try
				{
					bid=bidcombo.getSelectedItem().toString();
					rb.txtbid.setText(bid);
					connectivity c=new connectivity();
					PreparedStatement pst=c.cn.prepareStatement("select b_fno,b_source,b_dest,b_tdate,b_airportnm,b_pnm,b_pnum,b_contactno,b_paid_amount from booking where b_id=?");
					pst.setString(1,bid);
					ResultSet rs=pst.executeQuery();
					if(rs.next())
			          {
			        	  	fn=rs.getString("b_fno");
			        	  	fs=rs.getString("b_source");
							dest=rs.getString("b_dest");
							tdate=rs.getString("b_tdate");
							an=rs.getString("b_airportnm");
							pnm=rs.getString("b_pnm");
							pnum=rs.getString("b_pnum");
							cn=rs.getString("b_contactno");
							amt=rs.getString("b_paid_amount");
							
							rb.txtfn.setText(fn);
							rb.txtsource.setText(fs);
							rb.txtdest.setText(dest);
							rb.txttdate.setText(tdate);
							rb.txtan.setText(an);
							rb.txtpnm.setText(pnm);
							rb.txtpnum.setText(pnum);
							rb.txtcn.setText(cn);
							rb.txtamt.setText(amt);
							
							pst.execute();
			          }
					
					
				
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
				
			}
		});
		btnreschedule.setFont(new Font("Calibri", Font.BOLD, 25));
		btnreschedule.setBounds(140, 544, 273, 46);
		frame.getContentPane().add(btnreschedule);
		
		JButton btncanclebooking = new JButton("Cancle My Booking");
		btncanclebooking.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) 
			{
				int a;
				String bid=bidcombo.getSelectedItem().toString();
				try
				{
					connectivity c=new connectivity();
					a = JOptionPane.showConfirmDialog(null, "Are you sure?");
	                // JOptionPane.setRootFrame(null);
	                if (a == JOptionPane.YES_OPTION) 
	                {
	                	PreparedStatement pst=c.cn.prepareStatement("delete from booking where b_id=?");
	                	pst.setString(1, bid);
	                	pst.executeUpdate();
	                	JOptionPane.showMessageDialog(null,"Booking Cancelled..");
	                }
					
					AfterLogin al=new AfterLogin();
					al.frame.setVisible(true);
					al.lbl.setVisible(false);
				/*	PreparedStatement pst2=c.cn.prepareStatement("select Uname from booking where b_id=?");
					pst2.setString(1, bid);
					ResultSet rs=pst2.executeQuery();
					if(rs.next())
					{
						//String un=rs.getString("Uname");
						al.lbl.setVisible(false);
					}*/
	                
	                frame.dispose();
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
			}
		});
		btncanclebooking.setFont(new Font("Calibri", Font.BOLD, 25));
		btncanclebooking.setBounds(578, 544, 255, 46);
		frame.getContentPane().add(btncanclebooking);
		
		JLabel lblViewYourBooking = new JLabel("View Your Booking");
		lblViewYourBooking.setFont(new Font("Calibri", Font.BOLD, 35));
		lblViewYourBooking.setBounds(375, 24, 327, 51);
		frame.getContentPane().add(lblViewYourBooking);
		
		JLabel lblfn1 = new JLabel("");
		lblfn1.setFont(new Font("Calibri", Font.PLAIN, 19));
		lblfn1.setBounds(283, 231, 186, 40);
		frame.getContentPane().add(lblfn1);
		
		JLabel lblsource1 = new JLabel("");
		lblsource1.setFont(new Font("Calibri", Font.PLAIN, 19));
		lblsource1.setBounds(283, 282, 186, 40);
		frame.getContentPane().add(lblsource1);
		
		JLabel lbltdate1 = new JLabel("");
		lbltdate1.setFont(new Font("Calibri", Font.PLAIN, 19));
		lbltdate1.setBounds(283, 333, 186, 40);
		frame.getContentPane().add(lbltdate1);
		
		JLabel lblcn1 = new JLabel("");
		lblcn1.setFont(new Font("Calibri", Font.PLAIN, 19));
		lblcn1.setBounds(302, 384, 186, 40);
		frame.getContentPane().add(lblcn1);
		
		JLabel lblamt1 = new JLabel("");
		lblamt1.setFont(new Font("Calibri", Font.PLAIN, 19));
		lblamt1.setBounds(302, 435, 186, 40);
		frame.getContentPane().add(lblamt1);
		
		JLabel lblpnm1 = new JLabel("");
		lblpnm1.setFont(new Font("Calibri", Font.PLAIN, 19));
		lblpnm1.setBounds(792, 231, 186, 40);
		frame.getContentPane().add(lblpnm1);
		
		JLabel lbldest1 = new JLabel("");
		lbldest1.setFont(new Font("Calibri", Font.PLAIN, 19));
		lbldest1.setBounds(792, 282, 186, 40);
		frame.getContentPane().add(lbldest1);
		
		JLabel lblan1 = new JLabel("");
		lblan1.setFont(new Font("Calibri", Font.PLAIN, 19));
		lblan1.setBounds(792, 333, 186, 40);
		frame.getContentPane().add(lblan1);
		
		JLabel lblpnum1 = new JLabel("");
		lblpnum1.setFont(new Font("Calibri", Font.PLAIN, 19));
		lblpnum1.setBounds(792, 384, 186, 40);
		frame.getContentPane().add(lblpnum1);
		
		bidcombo = new JComboBox();
		bidcombo.setFont(new Font("Calibri", Font.BOLD, 20));
		bidcombo.setBounds(586, 122, 105, 46);
		frame.getContentPane().add(bidcombo);
		
			btnNewButton.addActionListener(new ActionListener() 
			{
			
			public void actionPerformed(ActionEvent e) 
			{
				frame.dispose();
				AfterLogin al=new AfterLogin();
				String bid=bidcombo.getSelectedItem().toString();
				al.frame.setVisible(true);
				try
				{
					//String bid;
				//	bid=bidcombo.getSelectedItem().toString();
					connectivity c=new connectivity();
					PreparedStatement pst2=c.cn.prepareStatement("select Uname from booking where b_id=?");
					pst2.setString(1, bid);
					ResultSet rs=pst2.executeQuery();
					if(rs.next())
					{
						String un=rs.getString("Uname");
						al.lbl.setText(un);
					}
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
			}
		});
			
			btnsubmit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
					String bid,fn,fs,dest,tdate,an,pnm,pnum,cn,amt;
					bid=bidcombo.getSelectedItem().toString();
					try
					{
						connectivity c=new connectivity();
						PreparedStatement pst=c.cn.prepareStatement("select b_fno,b_source,b_dest,b_tdate,b_airportnm,b_pnm,b_pnum,b_contactno,b_paid_amount from booking where b_id=?");        
				          pst.setString(1,bid);
				          ResultSet rs=pst.executeQuery();
				          if(rs.next())
				          {
				        	  	fn=rs.getString("b_fno");
				        	  	fs=rs.getString("b_source");
								dest=rs.getString("b_dest");
								tdate=rs.getString("b_tdate");
								an=rs.getString("b_airportnm");
								pnm=rs.getString("b_pnm");
								pnum=rs.getString("b_pnum");
								cn=rs.getString("b_contactno");
								amt=rs.getString("b_paid_amount");
								
								lblfn1.setText(fn);
								lblsource1.setText(fs);
								lbldest1.setText(dest);
								lbltdate1.setText(tdate);
								lblan1.setText(an);
								lblpnm1.setText(pnm);
								lblpnum1.setText(pnum);
								lblcn1.setText(cn);
								lblamt1.setText(amt);
				
								pst.execute();
								
				          }
					}
					catch(Exception ex)
					{
						ex.printStackTrace();
					}
				}
			});
	}

}
