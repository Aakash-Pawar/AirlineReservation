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
	private JTextField totxt;
	private JTextField fromtxt;
	//public JTable jTable1;
	Object [][] data;
	String [] col;
	JScrollPane jsp;
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
			panel.setBounds(31, 11, 1028, 565);
			frame.getContentPane().add(panel);
			panel.setLayout(null);
			
			JLabel lblNewLabel_1 = new JLabel("From");
			lblNewLabel_1.setBounds(41, 150, 95, 35);
			lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 25));
			panel.add(lblNewLabel_1);
			
			JLabel lblNewLabel_1_1 = new JLabel("To");
			lblNewLabel_1_1.setFont(new Font("Calibri", Font.BOLD, 25));
			lblNewLabel_1_1.setBounds(500, 145, 124, 45);
			panel.add(lblNewLabel_1_1);
			
			JLabel lblNewLabel_1_3 = new JLabel("Search Flights");
			lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_3.setFont(new Font("Calibri", Font.BOLD, 30));
			lblNewLabel_1_3.setBounds(10, 25, 484, 60);
			panel.add(lblNewLabel_1_3);
			
			JButton btnSearch = new JButton("Search");
			btnSearch.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
					String fsource,dest;
					fsource=fromtxt.getText();
					dest=totxt.getText();
					try
					{
					connectivity c=new connectivity();
			          PreparedStatement pst=c.cn.prepareStatement("select * from flights where from_source=? and dest=?");        
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
			
			JButton btnBookFlight = new JButton("Book Flight");
			btnBookFlight.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
					FlightBooking fb=new FlightBooking();
					fb.setFlightNo(fnocombo.getSelectedItem().toString());
					String fno="",fs,dest,tdate,price,an,ftime;
					try
					{
						connectivity c=new connectivity();
						PreparedStatement pst=c.cn.prepareStatement("select from_source,dest,tdate,price,airportnm,ftime from flights where fno=?");
						pst.setString(1, fno);
						ResultSet rs=pst.executeQuery();
						if(rs.next())
						{
							
							fs=rs.getString("from_source");
							dest=rs.getString("dest");
							tdate=rs.getString("tdate");
							price=rs.getString("price");
							an=rs.getString("airportnm");
							ftime=rs.getString("ftime");
							
							fb.setfromsource(fs);
							fb.setdest(dest);
							fb.settdate(tdate);
							
						}
						fb.frame.setVisible(true);
					}
					catch(Exception ex)
					{
						ex.printStackTrace();
					}
				}
			});
			btnBookFlight.setFont(new Font("Calibri", Font.BOLD, 25));
			btnBookFlight.setBackground(Color.LIGHT_GRAY);
			btnBookFlight.setBounds(465, 442, 166, 53);
			panel.add(btnBookFlight);
			
			JLabel lblimage = new JLabel(new ImageIcon(bi));
			lblimage.setBounds(0, 0, 1085, 587);
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
		frame.setBounds(100, 100, 1159, 679);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
