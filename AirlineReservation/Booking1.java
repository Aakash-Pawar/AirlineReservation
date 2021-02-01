import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;

public class Booking1 {

	public JFrame frame;
	public JComboBox fnocombo;
	public JComboBox ftimecombo;
	public JTextField totxt;
	public JTextField fromtxt;
	public JLabel lbl1;
	//public JTable jTable1;
	Object [][] data;
	String [] col;
	JScrollPane jsp;
	public JTextField pnmtxt;
	public JTextField cntxt;
	public JTextField pnumtxt;
	public JTextField tamttxt;
	public JTextField cardnotxt;
	public JTextField cvvtxt;
	
	public JLabel searchlbl;
	public JLabel lblNewLabel_1;
	public JLabel lblNewLabel_1_1;
	public JButton btnSearch;
	//btnBookFlight.setVisible(false);
	public JButton btnBook_1;
	public JTextField bidtxt;
	
	//ResultSetMetaData rsmt;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Booking1 window = new Booking1();
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
	public Booking1() {
		initialize();
		this.frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		try
		{
			BufferedImage bi=ImageIO.read(new File("C:/Users/AakashPawar/git/AirlineReservation/AirlineReservation/src/6.jpg"));
			
			JPanel panel = new JPanel();
			panel.setOpaque(false);
			panel.setBounds(10, 11, 1049, 604);
			frame.getContentPane().add(panel);
			panel.setLayout(null);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBounds(51, 37, 908, 547);
			panel.add(panel_1);
			panel_1.setLayout(null);
			panel_1.setVisible(false);
			
			bidtxt = new JTextField();
			bidtxt.setFont(new Font("Calibri", Font.PLAIN, 18));
			bidtxt.setColumns(10);
			bidtxt.setBounds(419, 12, 124, 35);
			panel_1.add(bidtxt);
			
			JLabel lblFlightDetails = new JLabel("Flight Details...");
			lblFlightDetails.setBounds(44, 73, 186, 38);
			lblFlightDetails.setFont(new Font("Calibri", Font.BOLD, 30));
			lblFlightDetails.setBackground(Color.LIGHT_GRAY);
			panel_1.add(lblFlightDetails);
			
			JLabel lblPassengerDetails = new JLabel("Passenger Details...");
			lblPassengerDetails.setFont(new Font("Calibri", Font.BOLD, 30));
			lblPassengerDetails.setBackground(Color.LIGHT_GRAY);
			lblPassengerDetails.setBounds(514, 69, 249, 47);
			panel_1.add(lblPassengerDetails);
			
			JLabel lblFlightNo = new JLabel("Flight No");
			lblFlightNo.setFont(new Font("Calibri", Font.PLAIN, 22));
			lblFlightNo.setBounds(20, 134, 151, 35);
			panel_1.add(lblFlightNo);
			
			JLabel fnolbl = new JLabel("From");
			fnolbl.setFont(new Font("Calibri", Font.PLAIN, 20));
			fnolbl.setBounds(240, 134, 138, 35);
			panel_1.add(fnolbl);
			
			JLabel lblSource = new JLabel("Source");
			lblSource.setFont(new Font("Calibri", Font.PLAIN, 22));
			lblSource.setBounds(20, 182, 151, 35);
			panel_1.add(lblSource);
			
			JLabel fslbl = new JLabel("From");
			fslbl.setFont(new Font("Calibri", Font.PLAIN, 20));
			fslbl.setBounds(240, 182, 138, 35);
			panel_1.add(fslbl);
			
			JLabel lblDestination = new JLabel("Destination");
			lblDestination.setFont(new Font("Calibri", Font.PLAIN, 22));
			lblDestination.setBounds(20, 228, 165, 35);
			panel_1.add(lblDestination);
			
			JLabel destlbl = new JLabel("From");
			destlbl.setFont(new Font("Calibri", Font.PLAIN, 20));
			destlbl.setBounds(240, 228, 138, 35);
			panel_1.add(destlbl);
			
			JLabel lblTravelDate = new JLabel("Travel Date");
			lblTravelDate.setFont(new Font("Calibri", Font.PLAIN, 22));
			lblTravelDate.setBounds(20, 294, 150, 35);
			panel_1.add(lblTravelDate);
			
			JLabel tdatelbl = new JLabel("From");
			tdatelbl.setFont(new Font("Calibri", Font.PLAIN, 20));
			tdatelbl.setBounds(240, 294, 138, 35);
			panel_1.add(tdatelbl);
			
			JLabel lblPrice = new JLabel("Price for Single");
			lblPrice.setFont(new Font("Calibri", Font.PLAIN, 22));
			lblPrice.setBounds(20, 354, 173, 35);
			panel_1.add(lblPrice);
			
			JLabel pricelbl = new JLabel("From");
			pricelbl.setFont(new Font("Calibri", Font.PLAIN, 20));
			pricelbl.setBounds(240, 354, 138, 35);
			panel_1.add(pricelbl);
			
			JLabel lblTime = new JLabel("Time");
			lblTime.setFont(new Font("Calibri", Font.PLAIN, 22));
			lblTime.setBounds(20, 419, 177, 35);
			panel_1.add(lblTime);
			
			JLabel ftimelbl = new JLabel("From");
			ftimelbl.setFont(new Font("Calibri", Font.PLAIN, 20));
			ftimelbl.setBounds(240, 419, 138, 35);
			panel_1.add(ftimelbl);
			
			JLabel lblAirportName = new JLabel("Airport Name");
			lblAirportName.setFont(new Font("Calibri", Font.PLAIN, 22));
			lblAirportName.setBounds(20, 482, 210, 35);
			panel_1.add(lblAirportName);
			
			JLabel anlbl = new JLabel("From");
			anlbl.setFont(new Font("Calibri", Font.PLAIN, 20));
			anlbl.setBounds(240, 482, 138, 35);
			panel_1.add(anlbl);
			
			JLabel lblPassengerName = new JLabel("Passenger Name");
			lblPassengerName.setFont(new Font("Calibri", Font.PLAIN, 22));
			lblPassengerName.setBounds(458, 138, 242, 35);
			panel_1.add(lblPassengerName);
			
			pnmtxt = new JTextField();
			pnmtxt.setFont(new Font("Calibri", Font.PLAIN, 18));
			pnmtxt.setColumns(10);
			pnmtxt.setBounds(747, 127, 124, 35);
			panel_1.add(pnmtxt);
			
			JLabel lblContactNo = new JLabel("Contact No");
			lblContactNo.setFont(new Font("Calibri", Font.PLAIN, 22));
			lblContactNo.setBounds(458, 191, 242, 35);
			panel_1.add(lblContactNo);
			
			cntxt = new JTextField();
			cntxt.setFont(new Font("Calibri", Font.PLAIN, 18));
			cntxt.setColumns(10);
			cntxt.setBounds(747, 179, 124, 35);
			panel_1.add(cntxt);
			
			JLabel lblNumberOfPassenger = new JLabel("Number of Passenger");
			lblNumberOfPassenger.setFont(new Font("Calibri", Font.PLAIN, 22));
			lblNumberOfPassenger.setBounds(458, 237, 242, 35);
			panel_1.add(lblNumberOfPassenger);
			
			pnumtxt = new JTextField();
			pnumtxt.setFont(new Font("Calibri", Font.PLAIN, 18));
			pnumtxt.setColumns(10);
			pnumtxt.setBounds(747, 237, 124, 35);
			panel_1.add(pnumtxt);
			
			connectivity c=new connectivity();
			ResultSet rs=c.st.executeQuery("select max(b_id) from booking");
			if (rs.next())
			{
				int bid=rs.getInt(1);
				bid++;
				bidtxt.setText(String.valueOf(bid));
			}
			else
			{
				bidtxt.setText("1");
			}
			
			JButton btnConfirmYourDetails = new JButton("Make Payment");
			btnConfirmYourDetails.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
					String fno,fs,dest,tdate,price,an,pnm,pnum,cn,tamt="",cardno,cvv,un;
					//int p,no,amt;
					try
					{
						connectivity c=new connectivity();
						PreparedStatement pst=c.cn.prepareStatement("insert into booking values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
						
						fno=fnolbl.getText();
						fs=fslbl.getText();
						dest=destlbl.getText();
						tdate=tdatelbl.getText();
						price=pricelbl.getText();
						an=anlbl.getText();
						pnm=pnmtxt.getText();
						pnum=pnumtxt.getText();
						cn=cntxt.getText();
						cardno=cardnotxt.getText();
						cvv=cvvtxt.getText();
						un=lbl1.getText();
						tamt=tamttxt.getText();
						
						pst.setInt(1,Integer.parseInt(bidtxt.getText()));
						pst.setString(2, fno);
						pst.setString(3, fs);
						pst.setString(4, dest);
						pst.setString(5, tdate);
						pst.setString(6, price);
						pst.setString(7, an);
						pst.setString(8, pnm);
						pst.setString(9, pnum);
						pst.setString(10, cn);
						pst.setString(11, tamt);
						pst.setString(12, cardno);
						pst.setString(13, cvv);
						pst.setString(14, un);
						
						pst.execute();
						
						JOptionPane.showMessageDialog(null,"Ticket Confirmed..\nPlease Not Your Booking Id For Future Reference..");
					
					//	MakePayment mp=new MakePayment();
					//	mp.frame.setVisible(true);
						AfterLogin al=new AfterLogin();
						al.frame.setVisible(true);
						al.lbl.setText(un);
						c.cn.close();
						frame.dispose();
						
					}
					catch(Exception ex)
					{
						ex.printStackTrace();
					}
				}
			});
			btnConfirmYourDetails.setFont(new Font("Calibri", Font.BOLD, 25));
			btnConfirmYourDetails.setBackground(Color.LIGHT_GRAY);
			btnConfirmYourDetails.setBounds(456, 483, 355, 53);
			panel_1.add(btnConfirmYourDetails);
			
			JLabel lblTotalAmount = new JLabel("Total Amount");
			lblTotalAmount.setFont(new Font("Calibri", Font.PLAIN, 22));
			lblTotalAmount.setBounds(458, 298, 151, 35);
			panel_1.add(lblTotalAmount);
			
			tamttxt = new JTextField();
			tamttxt.setFont(new Font("Calibri", Font.PLAIN, 18));
			tamttxt.setColumns(10);
			tamttxt.setBounds(747, 298, 124, 35);
			panel_1.add(tamttxt);
			
			JButton btnNewButton = new JButton("Calculate");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					int p,no,amt;
					String price,pnum;
					price=pricelbl.getText();
					//an=anlbl.getText();
					//pnm=pnmtxt.getText();
					pnum=pnumtxt.getText();
					//cn=cntxt.getText();
					
					p=(Integer.parseInt(price));
					no=(Integer.parseInt(pnum));
					amt=p*no;
					
					
					tamttxt.setText(String.valueOf(amt));
				}
			});
			btnNewButton.setBounds(611, 303, 89, 23);
			panel_1.add(btnNewButton);
			
			JLabel lblEnterYourCard = new JLabel("Enter Your Card No");
			lblEnterYourCard.setFont(new Font("Calibri", Font.PLAIN, 22));
			lblEnterYourCard.setBounds(458, 358, 242, 35);
			panel_1.add(lblEnterYourCard);
			
			JLabel lblCvv = new JLabel("CVV");
			lblCvv.setFont(new Font("Calibri", Font.PLAIN, 22));
			lblCvv.setBounds(458, 423, 242, 35);
			panel_1.add(lblCvv);
			
			cardnotxt = new JTextField();
			cardnotxt.setFont(new Font("Calibri", Font.PLAIN, 18));
			cardnotxt.setColumns(10);
			cardnotxt.setBounds(747, 358, 124, 35);
			panel_1.add(cardnotxt);
			
			cvvtxt = new JTextField();
			cvvtxt.setFont(new Font("Calibri", Font.PLAIN, 18));
			cvvtxt.setColumns(10);
			cvvtxt.setBounds(747, 423, 124, 35);
			panel_1.add(cvvtxt);
			
			JButton btnNewButton_1 = new JButton("Back");
			btnNewButton_1.setBounds(20, 11, 89, 23);
			panel_1.add(btnNewButton_1);
			
			JLabel lblBookingId = new JLabel("Booking Id");
			lblBookingId.setFont(new Font("Calibri", Font.PLAIN, 22));
			lblBookingId.setBounds(248, 15, 173, 35);
			panel_1.add(lblBookingId);
			
		
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					totxt.setText("");
					fromtxt.setText("");
					fnocombo.addItem("");
					fnocombo.removeAll();
					ftimecombo.removeAll();
					fnocombo.addItem("--SELECT--");
					ftimecombo.addItem("--SELECT--");
					
					btnBook_1.setVisible(true);
					
					panel_1.setVisible(false);
					searchlbl.setVisible(true);
					lblNewLabel_1.setVisible(true);
					lblNewLabel_1_1.setVisible(true);
					totxt.setVisible(true);
					fromtxt.setVisible(true);
					fnocombo.setVisible(true);
					ftimecombo.setVisible(true);
					btnSearch.setVisible(true);
					//btnBookFlight.setVisible(false);
					
				//	panel_1.setVisible(true);
					
					
				}
			});
			
			lblNewLabel_1 = new JLabel("From");
			lblNewLabel_1.setBounds(41, 150, 95, 35);
			lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 25));
			panel.add(lblNewLabel_1);
			
			lblNewLabel_1_1 = new JLabel("To");
			lblNewLabel_1_1.setFont(new Font("Calibri", Font.BOLD, 25));
			lblNewLabel_1_1.setBounds(500, 145, 124, 45);
			panel.add(lblNewLabel_1_1);
			
			searchlbl = new JLabel("Search Flights");
			searchlbl.setHorizontalAlignment(SwingConstants.CENTER);
			searchlbl.setFont(new Font("Calibri", Font.BOLD, 30));
			searchlbl.setBounds(10, 25, 484, 60);
			panel.add(searchlbl);
			
			btnSearch = new JButton("Search");
			btnSearch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
					String fsource,dest;
					fsource=fromtxt.getText();
					dest=totxt.getText();
					try
					{
					connectivity c=new connectivity();
			          PreparedStatement pst=c.cn.prepareStatement("select fno,tdate,price,airportnm,ftime from flights where from_source=? and dest=?");        
			          pst.setString(1,fsource);
			          pst.setString(2,dest);
			         // pst.setString(2,dest);
			          ResultSet rs=pst.executeQuery();
			         // if(rs.next())
			         // {
			        	  //PreparedStatement pst1=c.cn.prepareStatement("select * from flights where from_source=? and dest=?");
			          //pst1.setString(1,fsource);
			          //pst1.setString(2,dest);
			          //ResultSet rs1=pst1.executeQuery();
			         //if(rs1.next())
			          //{
			          fnocombo.addItem("--SELECT--");
			          ftimecombo.addItem("--SELECT--");
			        	  while(rs.next())
			        	  {
			        	  fnocombo.addItem(rs.getString("fno"));
			        	  ftimecombo.addItem(rs.getString("ftime"));
			        	  }
			         //}
			          }
			         // else
			          //{
			        	//  System.out.println("No flights found..");
			          //}
					//}
					catch(Exception ex)
					{
						ex.printStackTrace();
					}
				}
			});
			btnSearch.setFont(new Font("Calibri", Font.BOLD, 25));
			btnSearch.setBackground(Color.LIGHT_GRAY);
			btnSearch.setBounds(872, 141, 124, 53);
			panel.add(btnSearch);
			
			totxt = new JTextField();
			totxt.setFont(new Font("Calibri", Font.BOLD, 15));
			totxt.setColumns(10);
			totxt.setBounds(619, 150, 124, 35);
			panel.add(totxt);
			
			fromtxt = new JTextField();
			fromtxt.setFont(new Font("Calibri", Font.BOLD, 15));
			fromtxt.setColumns(10);
			fromtxt.setBounds(187, 152, 124, 35);
			panel.add(fromtxt);
			
			fnocombo = new JComboBox();
			fnocombo.setBounds(262, 312, 209, 45);
			panel.add(fnocombo);
			
			JLabel lblNewLabel_1_2 = new JLabel("Flight No");
			lblNewLabel_1_2.setFont(new Font("Calibri", Font.BOLD, 25));
			lblNewLabel_1_2.setBounds(68, 317, 166, 35);
			panel.add(lblNewLabel_1_2);
			
			JLabel lblNewLabel_1_2_1 = new JLabel("Time");
			lblNewLabel_1_2_1.setFont(new Font("Calibri", Font.BOLD, 25));
			lblNewLabel_1_2_1.setBounds(572, 312, 166, 35);
			panel.add(lblNewLabel_1_2_1);
			
			ftimecombo = new JComboBox();
			ftimecombo.setBounds(718, 312, 209, 45);
			panel.add(ftimecombo);
			
			btnBook_1 = new JButton("Book Flight");
			btnBook_1.setBounds(447, 451, 166, 53);
			panel.add(btnBook_1);
			btnBook_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
					searchlbl.setVisible(false);
					lblNewLabel_1.setVisible(false);
					lblNewLabel_1_1.setVisible(false);
					totxt.setVisible(false);
					fromtxt.setVisible(false);
					fnocombo.setVisible(false);
					ftimecombo.setVisible(false);
					btnSearch.setVisible(false);
					//btnBookFlight.setVisible(false);
					btnBook_1.setVisible(false);
					panel_1.setVisible(true);
					
					String fno="",fs="",dest,tdate,price,an,ftime;
					
					fno=fnocombo.getSelectedItem().toString();
					
					try
					{
						connectivity c=new connectivity();
						PreparedStatement pst=c.cn.prepareStatement("select from_source,dest,tdate,price,airportnm,ftime from flights where fno=?");
						pst.setString(1, fno);
						fnolbl.setText(fno);
						ResultSet rs=pst.executeQuery();
						if(rs.next())
						{
							
							fs=rs.getString("from_source").toString();
							dest=rs.getString("dest");
							tdate=rs.getString("tdate");
							price=rs.getString("price");
							an=rs.getString("airportnm");
							ftime=rs.getString("ftime");
							
							fslbl.setText(fs);
							destlbl.setText(dest);
							tdatelbl.setText(tdate);
							pricelbl.setText(price);
							anlbl.setText(an);
							ftimelbl.setText(ftime);
							
							//fb.setfromsource(fs);
							//fb.setdest(dest);
							//fb.settdate(tdate);
						//	pst.executeUpdate();
							
						}
						
					}
					catch(Exception ex)
					{
						ex.printStackTrace();
					}
					
					
				}
			});
			btnBook_1.setFont(new Font("Calibri", Font.BOLD, 25));
			btnBook_1.setBackground(Color.LIGHT_GRAY);
			
			lbl1 = new JLabel("New label");
			lbl1.setVisible(false);
			lbl1.setBounds(10, 63, 49, 14);
			panel.add(lbl1);
			
			JLabel lblimage = new JLabel(new ImageIcon(bi));
			lblimage.setBounds(0, 0, 1056, 639);
			frame.getContentPane().add(lblimage);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1070, 687);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
