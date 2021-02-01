import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Menu;

import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.Component;
import java.awt.ComponentOrientation;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import java.awt.Panel;
import java.awt.Label;
import java.awt.TextField;
import java.awt.TextArea;

/**
 * 
 * @author AkashPawar
 * Made changes for demo
 *
 */
public class AfterLogin {

	public JFrame frame;
	public JLabel lbl1;
	public JLabel ulbl;
	public JLabel lbl;
	public String mpun;
	public JButton btnSave;
	

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public AfterLogin() {
		initialize();
		this.frame.setLocationRelativeTo(null);
	}




	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		//frame.getContentPane().setBackground(new Color(153, 51, 102));
		frame.getContentPane().setLayout(null);
		
		try
		{
			BufferedImage bi=ImageIO.read(new File("C:/Users/AakashPawar/git/AirlineReservation/AirlineReservation/src/3.jpg"));
			
			//Wlcome w=new Wlcome();
			//String a=w.untxt.getText();
			//lblNewLabel_1.setText(a);
			
			
			JLabel lblNewLabel = new JLabel("Sign Out");
			lblNewLabel.addMouseListener(new MouseAdapter() 
			{
				
				@Override
				public void mouseClicked(MouseEvent e) 
				{
					int a;
					try
					{
						a = JOptionPane.showConfirmDialog(lblNewLabel, "Are you sure?");
		                // JOptionPane.setRootFrame(null);
		                if (a == JOptionPane.YES_OPTION) 
		                {
						frame.dispose();
						Wlcome w=new Wlcome();
						w.frame.setVisible(true);
		                }
					}
					catch(Exception ex)
					{
						ex.printStackTrace();
					}
				}
			});
			
			Panel panel_1 = new Panel();
			panel_1.setVisible(false);
			panel_1.setBackground(new Color(255, 248, 220));
			panel_1.setBounds(22, 75, 967, 520);
			frame.getContentPane().add(panel_1);
			panel_1.setLayout(null);
			
			Label label_1 = new Label("First Name");
			label_1.setFont(new Font("Calibri", Font.BOLD, 15));
			label_1.setBounds(111, 10, 141, 49);
			panel_1.add(label_1);
			
			TextField fntxt = new TextField();
			fntxt.setName("fntxt");
			fntxt.setFont(new Font("Calibri", Font.PLAIN, 14));
			fntxt.setEditable(false);
			fntxt.setBounds(293, 23, 151, 36);
			panel_1.add(fntxt);
			
			Label label_1_1 = new Label("Address");
			label_1_1.setFont(new Font("Calibri", Font.BOLD, 15));
			label_1_1.setBounds(111, 99, 141, 49);
			panel_1.add(label_1_1);
			
			TextArea addtxt = new TextArea();
			addtxt.setName("addtxt");
			addtxt.setEditable(false);
			addtxt.setBounds(293, 75, 158, 108);
			panel_1.add(addtxt);
			
			Label label_1_2 = new Label("Gender");
			label_1_2.setFont(new Font("Calibri", Font.BOLD, 15));
			label_1_2.setBounds(111, 194, 141, 49);
			panel_1.add(label_1_2);
			
			TextField gentxt = new TextField();
			gentxt.setFont(new Font("Calibri", Font.PLAIN, 14));
			gentxt.setEditable(false);
			gentxt.setBounds(293, 207, 151, 36);
			panel_1.add(gentxt);
			
			Label label_1_3 = new Label("Passport No");
			label_1_3.setFont(new Font("Calibri", Font.BOLD, 15));
			label_1_3.setBounds(111, 271, 141, 49);
			panel_1.add(label_1_3);
			
			TextField pntxt = new TextField();
			pntxt.setFont(new Font("Calibri", Font.PLAIN, 14));
			pntxt.setEditable(false);
			pntxt.setBounds(293, 284, 151, 36);
			panel_1.add(pntxt);
			
			Label label_1_3_2 = new Label("Username");
			label_1_3_2.setFont(new Font("Calibri", Font.BOLD, 15));
			label_1_3_2.setBounds(111, 351, 141, 49);
			panel_1.add(label_1_3_2);
			
			TextField untxt = new TextField();
			untxt.setFont(new Font("Calibri", Font.PLAIN, 14));
			untxt.setEditable(false);
			untxt.setBounds(293, 364, 151, 36);
			panel_1.add(untxt);
			
			Label label_1_4 = new Label("Last Name");
			label_1_4.setFont(new Font("Calibri", Font.BOLD, 15));
			label_1_4.setBounds(531, 10, 141, 49);
			panel_1.add(label_1_4);
			
			TextField lntxt = new TextField();
			lntxt.setName("lntxt");
			lntxt.setFont(new Font("Calibri", Font.PLAIN, 14));
			lntxt.setEditable(false);
			lntxt.setBounds(713, 23, 151, 36);
			panel_1.add(lntxt);
			
			Label label_1_5 = new Label("Date Of Birth");
			label_1_5.setFont(new Font("Calibri", Font.BOLD, 15));
			label_1_5.setBounds(531, 99, 165, 49);
			panel_1.add(label_1_5);
			
			TextField dobtxt = new TextField();
			dobtxt.setName("dobtxt");
			dobtxt.setFont(new Font("Calibri", Font.PLAIN, 14));
			dobtxt.setEditable(false);
			dobtxt.setBounds(713, 116, 151, 36);
			panel_1.add(dobtxt);
			
			Label label_1_6 = new Label("Contact No");
			label_1_6.setFont(new Font("Calibri", Font.BOLD, 15));
			label_1_6.setBounds(531, 194, 141, 49);
			panel_1.add(label_1_6);
			
			TextField cntxt = new TextField();
			cntxt.setName("cntxt");
			cntxt.setFont(new Font("Calibri", Font.PLAIN, 14));
			cntxt.setEditable(false);
			cntxt.setBounds(713, 207, 151, 36);
			panel_1.add(cntxt);
			
			Label label_1_7 = new Label("Aadhar No");
			label_1_7.setFont(new Font("Calibri", Font.BOLD, 15));
			label_1_7.setBounds(531, 271, 141, 49);
			panel_1.add(label_1_7);
			
			TextField antxt = new TextField();
			antxt.setFont(new Font("Calibri", Font.PLAIN, 14));
			antxt.setEditable(false);
			antxt.setBounds(713, 284, 151, 36);
			panel_1.add(antxt);
			
			Label label_1_3_1 = new Label("Password");
			label_1_3_1.setFont(new Font("Calibri", Font.BOLD, 15));
			label_1_3_1.setBounds(531, 351, 141, 49);
			panel_1.add(label_1_3_1);
			
			TextField passtxt = new TextField();
			passtxt.setFont(new Font("Calibri", Font.PLAIN, 14));
			passtxt.setEditable(false);
			passtxt.setBounds(713, 364, 151, 36);
			panel_1.add(passtxt);
			
			JButton btnUpdate = new JButton("UPDATE");
			btnUpdate.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
					try
					{
						connectivity c=new connectivity();
						
					//	btnSave.enable();
						addtxt.setEditable(true);
						cntxt.setEditable(true);
						//untxt.setEditable(true);
						passtxt.setEditable(true);
						
						
					}
					catch(Exception ex)
					{
						ex.printStackTrace();
					}
				}
			});
			btnUpdate.setHorizontalTextPosition(SwingConstants.LEFT);
			btnUpdate.setFont(new Font("Calibri", Font.BOLD, 18));
			btnUpdate.setBounds(236, 449, 151, 40);
			panel_1.add(btnUpdate);
			
			btnSave = new JButton("SAVE");
			btnSave.setEnabled(true);
			btnSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) 
				{
					String add,cn,pass,un;
					un=untxt.getText();
					try
					{
						connectivity c=new connectivity();
						PreparedStatement pst=c.cn.prepareStatement("update registration set Address=?,Contactno=?,Pass=? where Uname=?");
						
					//	fn=fntxt.getText();
					//	ln=lntxt.getText();
						add=addtxt.getText();
					//	dob=dobtxt.getText();
					//	gen=gentxt.getText();
						cn=cntxt.getText();
						//pno=pntxt.getText();
						//ano=antxt.getText();
						//un=untxt.getText();
						pass=passtxt.getText();
						
						pst.setString(1,add);
						pst.setString(2,cn);
						pst.setString(3,pass);
						pst.setString(4,un);
						
						pst.executeUpdate();
						
						JOptionPane.showMessageDialog(null,"Successfully Updated Your Profile..");
						AfterLogin af=new AfterLogin();
						af.frame.setVisible(true);
						c.cn.close();
						frame.dispose();
						
					}
					catch(Exception ex)
					{
						System.out.println(ex);
						
					}
				}
			});
			btnSave.setHorizontalTextPosition(SwingConstants.LEFT);
			btnSave.setFont(new Font("Calibri", Font.BOLD, 18));
			btnSave.setBounds(420, 449, 151, 40);
			panel_1.add(btnSave);
			
			JButton btnDelete = new JButton("DELETE");
			btnDelete.setHorizontalTextPosition(SwingConstants.LEFT);
			btnDelete.setFont(new Font("Calibri", Font.BOLD, 18));
			btnDelete.setBounds(593, 449, 151, 40);
			panel_1.add(btnDelete);
			
			JLabel lblNewLabel_1 = new JLabel("Welcome To Airline Reservation System");
			lblNewLabel_1.setFont(new Font("Sylfaen", Font.BOLD, 30));
			lblNewLabel_1.setBounds(107, 106, 561, 62);
			frame.getContentPane().add(lblNewLabel_1);
			
			lbl = new JLabel("New label");
			lbl.setFont(new Font("Sylfaen", Font.BOLD, 30));
			lbl.setBounds(663, 106, 220, 62);
			frame.getContentPane().add(lbl);
			
			JLabel ulbl = new JLabel("");
			ulbl.setBounds(79, 195, 187, 58);
			frame.getContentPane().add(ulbl);
			
			JPanel panel = new JPanel();
			panel.setBackground(Color.LIGHT_GRAY);
			panel.setBounds(0, 11, 523, 40);
			frame.getContentPane().add(panel);
			panel.setLayout(null);
			
			JButton btnNewButton = new JButton("MY PROFILE");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					lblNewLabel_1.setVisible(false);
					lbl.setVisible(false);
					panel_1.setVisible(true);
					
					
					String un,fn,ln,add,dob,cn,gen,pno,ano,pass;
					
					try
					{
						//frame.dispose();
						//MyProfile mp = new MyProfile();
						//mp.setUsername(ulbl.getText());
						//mp.frame.setVisible(true);
						mpun=lbl.getText();
						//mp.newlbl.setText(mpun);
						
						connectivity c=new connectivity();
						PreparedStatement pst=c.cn.prepareStatement("select * from registration where Uname=?");
						pst.setString(1,mpun);
						ResultSet rs=pst.executeQuery();
						if(rs.next())
						{
							fn=rs.getString("Fname");
							ln=rs.getString("Lname");
							add=rs.getString("Address");
							dob=rs.getString("DOB");
							gen=rs.getString("Gender");
							cn=rs.getString("Contactno");
							pno=rs.getString("Passportno");
							ano=rs.getString("Aadharno");
							pass=rs.getString("Pass");
							
							fntxt.setText(fn);
							lntxt.setText(ln);
							addtxt.setText(add);
							dobtxt.setText(dob);
							gentxt.setText(gen);
							cntxt.setText(cn);
							pntxt.setText(pno);
							antxt.setText(ano);
							passtxt.setText(pass);
							untxt.setText(mpun);
					}
						c.cn.close();
						rs.close();
					}
					
					catch(Exception ex)
					{
						ex.printStackTrace();
					}
				}
			});
			btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
			btnNewButton.setHorizontalTextPosition(SwingConstants.LEFT);
			btnNewButton.setFont(new Font("Calibri", Font.BOLD, 18));
			btnNewButton.setBounds(0, 0, 151, 40);
			panel.add(btnNewButton);
			
			JButton btnMakeBookings = new JButton("TICKET BOOKINGS");
			btnMakeBookings.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) 
				{
					try
					{
						Booking1 b=new Booking1();
						b.frame.setVisible(true);
						String un=lbl.getText().toString();
						b.lbl1.setText(un);
						frame.dispose();
					}
					catch(Exception ex)
					{
						ex.printStackTrace();
					}
				}
			});
			btnMakeBookings.setHorizontalTextPosition(SwingConstants.LEFT);
			btnMakeBookings.setHorizontalAlignment(SwingConstants.LEFT);
			btnMakeBookings.setFont(new Font("Calibri", Font.BOLD, 18));
			btnMakeBookings.setBounds(143, 0, 201, 40);
			panel.add(btnMakeBookings);
			
			JButton btnViewBokking = new JButton("VIEW BOOKINGS");
			btnViewBokking.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

					BookingView bv=new BookingView();
					bv.frame.setVisible(true);
					frame.dispose();
					String un,bid;
					un=lbl.getText().toString();
					try
					{
						connectivity c=new connectivity();
						PreparedStatement pst=c.cn.prepareStatement("select b_id from booking where Uname=?");
						pst.setString(1,un);
						ResultSet rs=pst.executeQuery();
						bv.bidcombo.addItem("--Select--");
						while(rs.next())
						{
							bv.bidcombo.addItem(rs.getString("b_id"));
						}
						
						
					}
					catch(Exception ex)
					{
						ex.printStackTrace();
					}
				
					
					
				}
			});
			btnViewBokking.setHorizontalTextPosition(SwingConstants.LEFT);
			btnViewBokking.setHorizontalAlignment(SwingConstants.LEFT);
			btnViewBokking.setFont(new Font("Calibri", Font.BOLD, 18));
			btnViewBokking.setBounds(337, 0, 187, 40);
			panel.add(btnViewBokking);
			lblNewLabel.setForeground(Color.BLACK);
			lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 23));
			lblNewLabel.setBackground(Color.LIGHT_GRAY);
			lblNewLabel.setBounds(895, 11, 116, 46);
			frame.getContentPane().add(lblNewLabel);
			JLabel lblimage = new JLabel(new ImageIcon(bi));
			lblimage.setBounds(0, 0, 1011, 614);
			frame.getContentPane().add(lblimage);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		
		
		frame.setBounds(100, 100, 1035, 652);
		//frame.menuBar.add("HOME");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}




	public void setuname(String string) 
	{
		// TODO Auto-generated method stub
		
	}
}
