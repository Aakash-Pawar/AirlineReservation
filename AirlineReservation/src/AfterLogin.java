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
import java.awt.Component;
import java.awt.ComponentOrientation;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 
 * @author AkashPawar
 * Made changes for demo
 *
 */
public class AfterLogin {

	public JFrame frame;
	public JLabel lbl1;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public AfterLogin(String unm) {
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
			
			JPanel panel = new JPanel();
			panel.setBackground(Color.LIGHT_GRAY);
			panel.setBounds(0, 24, 519, 40);
			frame.getContentPane().add(panel);
			panel.setLayout(null);
			
			JButton btnNewButton = new JButton("MY PROFILE");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					try
					{
						frame.dispose();
						MyProfile mp = new MyProfile();
						mp.frame.setVisible(true);
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
			
			JButton btnMakeBookings = new JButton("MAKE BOOKINGS");
			btnMakeBookings.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) 
				{
					try
					{
						MakeBooking mb=new MakeBooking();
						mb.frame.setVisible(true);
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
			
			JButton btnViewBookings = new JButton("VIEW BOOKINGS");
			btnViewBookings.setHorizontalTextPosition(SwingConstants.LEFT);
			btnViewBookings.setHorizontalAlignment(SwingConstants.LEFT);
			btnViewBookings.setFont(new Font("Calibri", Font.BOLD, 18));
			btnViewBookings.setBounds(333, 0, 187, 40);
			panel.add(btnViewBookings);
			lblNewLabel.setForeground(Color.BLACK);
			lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 23));
			lblNewLabel.setBackground(Color.LIGHT_GRAY);
			lblNewLabel.setBounds(895, 24, 116, 46);
			frame.getContentPane().add(lblNewLabel);
			JLabel lblimage = new JLabel(new ImageIcon(bi));
			lblimage.setBounds(0, 0, 1011, 610);
			frame.getContentPane().add(lblimage);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		
		
		frame.setBounds(100, 100, 1035, 618);
		//frame.menuBar.add("HOME");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
