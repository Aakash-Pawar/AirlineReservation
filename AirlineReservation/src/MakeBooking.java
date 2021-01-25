import java.awt.EventQueue;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Choice;
import org.jdatepicker.util.JDatePickerUtil;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MakeBooking {

	public JFrame frame;
	private JTextField totxt;
	private JTextField fromtxt;

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MakeBooking window = new MakeBooking();
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
	public MakeBooking() 
	{
		initialize();
		this.frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		try
		{
			BufferedImage bi=ImageIO.read(new File("C:/Users/AakashPawar/git/AirlineReservation/AirlineReservation/src/6.jpg"));
			
			JPanel panel = new JPanel();
			panel.setOpaque(false);
			panel.setBounds(529, 85, 504, 447);
			frame.getContentPane().add(panel);
			panel.setLayout(null);
			
			JLabel lblNewLabel_1 = new JLabel("From");
			lblNewLabel_1.setBounds(41, 150, 95, 35);
			lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 25));
			panel.add(lblNewLabel_1);
			
			JLabel lblNewLabel_1_1 = new JLabel("To");
			lblNewLabel_1_1.setFont(new Font("Calibri", Font.BOLD, 25));
			lblNewLabel_1_1.setBounds(41, 221, 124, 45);
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
					try
					{
						SearchFlight sf=new SearchFlight();
						sf.frame.setVisible(true);
					}
					catch(Exception ex)
					{
						ex.printStackTrace();
					}
				}
			});
			btnSearch.setFont(new Font("Calibri", Font.BOLD, 25));
			btnSearch.setBackground(Color.LIGHT_GRAY);
			btnSearch.setBounds(196, 372, 124, 53);
			panel.add(btnSearch);
			
			JLabel lblNewLabel_1_2 = new JLabel("Travel Date");
			lblNewLabel_1_2.setFont(new Font("Calibri", Font.BOLD, 25));
			lblNewLabel_1_2.setBounds(41, 309, 124, 35);
			panel.add(lblNewLabel_1_2);
			
			totxt = new JTextField();
			totxt.setFont(new Font("Calibri", Font.BOLD, 15));
			totxt.setColumns(10);
			totxt.setBounds(294, 233, 124, 35);
			panel.add(totxt);
			
			fromtxt = new JTextField();
			fromtxt.setFont(new Font("Calibri", Font.BOLD, 15));
			fromtxt.setColumns(10);
			fromtxt.setBounds(294, 150, 124, 35);
			panel.add(fromtxt);
			JLabel lblimage = new JLabel(new ImageIcon(bi));
			lblimage.setBounds(0, 0, 1085, 587);
			frame.getContentPane().add(lblimage);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1099, 624);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
