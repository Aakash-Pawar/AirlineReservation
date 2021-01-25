import java.awt.EventQueue;
import java.awt.image.BufferedImage;
import java.awt.*;
import java.io.*;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Wlcome {

	public JFrame frame;
	private JTextField untxt;
	private JTextField passtxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Wlcome window = new Wlcome();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Wlcome() {
		initialize();
		this.frame.setLocationRelativeTo(null);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1108, 658);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1084, 610);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		try {
			BufferedImage bi=ImageIO.read(new File("C:/Users/AakashPawar/git/AirlineReservation/AirlineReservation/src/6.jpg"));
			
			JPanel panel_1 = new JPanel();
			panel_1.setOpaque(false);
			panel_1.setBorder(null);
			panel_1.setBounds(735, 75, 308, 460);
			panel.add(panel_1);
			panel_1.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Login Here...");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 30));
			lblNewLabel.setBounds(10, 7, 298, 66);
			panel_1.add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("Username");
			lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD, 22));
			lblNewLabel_1.setBounds(10, 150, 124, 35);
			panel_1.add(lblNewLabel_1);
			
			JLabel lblNewLabel_1_1 = new JLabel("Password");
			lblNewLabel_1_1.setFont(new Font("Calibri", Font.BOLD, 22));
			lblNewLabel_1_1.setBounds(10, 223, 124, 35);
			panel_1.add(lblNewLabel_1_1);
			
			untxt = new JTextField();
			untxt.setFont(new Font("Calibri", Font.PLAIN, 20));
			untxt.setBounds(144, 150, 132, 35);
			panel_1.add(untxt);
			untxt.setColumns(10);
			
			passtxt = new JTextField();
			passtxt.setFont(new Font("Calibri", Font.PLAIN, 20));
			passtxt.setColumns(10);
			passtxt.setBounds(144, 223, 132, 35);
			panel_1.add(passtxt);
			
			JButton loginbtn = new JButton("Login");
			loginbtn.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) 
				{
					String ur,ps;
					ur=untxt.getText();
			          ps=passtxt.getText();
					try 
					{	
				          connectivity c=new connectivity();
				          PreparedStatement pst=c.cn.prepareStatement("select * from registration where Uname=?");        
				          pst.setString(1,ur);
				          ResultSet rs=pst.executeQuery();
				          if(rs.next())
				          {
				          PreparedStatement pst1=c.cn.prepareStatement("select * from registration where Uname=? and Pass=?");
				          pst1.setString(1,ur);
				          pst1.setString(2,ps);
				          ResultSet rs1=pst1.executeQuery();
				          if(rs1.next())
				          {
						frame.dispose();
						AfterLogin af = new AfterLogin(ur);
						af.frame.setTitle("Welcome");
						af.frame.setVisible(true);
				          }
				          else
				          {
				          JOptionPane.showMessageDialog(null,"Invalid Password");
				          passtxt.setText("");
				          }
				          }
				          else
				          {
				          JOptionPane.showMessageDialog(null,"Invalid Username");
				          untxt.setText("");
				          }
						
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
			});
			loginbtn.setFont(new Font("Calibri", Font.BOLD, 20));
			loginbtn.setBackground(Color.LIGHT_GRAY);
			loginbtn.setBounds(91, 312, 113, 40);
			panel_1.add(loginbtn);
			
			JLabel lblNewLabel_2 = new JLabel("Forget Password.?");
			lblNewLabel_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
				}
			});
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblNewLabel_2.setBounds(72, 380, 174, 26);
			panel_1.add(lblNewLabel_2);
			
			JLabel lblNewLabel_2_1 = new JLabel("Register Here..");
			lblNewLabel_2_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) 
				{
					try
					{
						frame.dispose();
						
						MainFrame mf=new MainFrame();
						mf.frame.setVisible(true);
					}
					catch(Exception ex)
					{
						ex.printStackTrace();
					}
				}
			});
			lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
			lblNewLabel_2_1.setBounds(82, 417, 150, 32);
			panel_1.add(lblNewLabel_2_1);
			JLabel lblimage = new JLabel(new ImageIcon(bi));
			lblimage.setBounds(0, 0, 1084, 610);
			panel.add(lblimage);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
