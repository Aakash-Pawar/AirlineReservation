import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Label;
import java.awt.Font;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import java.awt.ComponentOrientation;
import java.awt.Point;
import java.awt.TextField;
import java.awt.TextArea;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JRadioButton;
import java.awt.Dimension;
import java.sql.*;

public class MainFrame
{
	private JPanel panel;
	private JFrame frame;
	private TextField fntxt;
	private TextField lntxt;
	private TextField pntxt;
	private TextField untxt;
	private TextField passtxt;
	private TextField antxt;
	private TextField cntxt;
	private TextField dobtxt;
	private JRadioButton mrb;
	private JRadioButton frb;
	private TextArea addtxt;

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() 
			{
				try {
					MainFrame window = new MainFrame();
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
	public MainFrame() 
	{
		initialize();
	}
	
	public void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 980, 671);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(147, 112, 219));
		panel.setBounds(59, 24, 893, 599);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		Label label = new Label("Register Here...");
		label.setFont(new Font("Algerian", Font.BOLD, 18));
		label.setBounds(10, 5, 820, 59);
		panel.add(label);
		
		Label label_1 = new Label("First Name");
		label_1.setFont(new Font("Calibri", Font.BOLD, 15));
		label_1.setBounds(52, 94, 141, 49);
		panel.add(label_1);
		
		Label label_1_1 = new Label("Address");
		label_1_1.setFont(new Font("Calibri", Font.BOLD, 15));
		label_1_1.setBounds(52, 183, 141, 49);
		panel.add(label_1_1);
		
		Label label_1_2 = new Label("Gender");
		label_1_2.setFont(new Font("Calibri", Font.BOLD, 15));
		label_1_2.setBounds(52, 278, 141, 49);
		panel.add(label_1_2);
		
		Label label_1_3 = new Label("Passport No");
		label_1_3.setFont(new Font("Calibri", Font.BOLD, 15));
		label_1_3.setBounds(52, 355, 141, 49);
		panel.add(label_1_3);
		
		Label label_1_4 = new Label("Last Name");
		label_1_4.setFont(new Font("Calibri", Font.BOLD, 15));
		label_1_4.setBounds(472, 94, 141, 49);
		panel.add(label_1_4);
		
		Label label_1_5 = new Label("Date Of Birth");
		label_1_5.setFont(new Font("Calibri", Font.BOLD, 15));
		label_1_5.setBounds(472, 183, 165, 49);
		panel.add(label_1_5);
		
		Label label_1_6 = new Label("Contact No");
		label_1_6.setFont(new Font("Calibri", Font.BOLD, 15));
		label_1_6.setBounds(472, 278, 141, 49);
		panel.add(label_1_6);
		
		Label label_1_7 = new Label("Aadhar No");
		label_1_7.setFont(new Font("Calibri", Font.BOLD, 15));
		label_1_7.setBounds(472, 355, 141, 49);
		panel.add(label_1_7);
		
		Label label_1_3_1 = new Label("Password");
		label_1_3_1.setFont(new Font("Calibri", Font.BOLD, 15));
		label_1_3_1.setBounds(472, 435, 141, 49);
		panel.add(label_1_3_1);
		
		Label label_1_3_2 = new Label("Username");
		label_1_3_2.setFont(new Font("Calibri", Font.BOLD, 15));
		label_1_3_2.setBounds(52, 435, 141, 49);
		panel.add(label_1_3_2);
		
		TextField fntxt = new TextField();
		fntxt.setName("fntxt");
		fntxt.setFont(new Font("Calibri", Font.PLAIN, 14));
		fntxt.setBounds(234, 107, 151, 36);
		panel.add(fntxt);
		
		TextField lntxt = new TextField();
		lntxt.setName("lntxt");
		lntxt.setFont(new Font("Calibri", Font.PLAIN, 14));
		lntxt.setBounds(654, 107, 151, 36);
		panel.add(lntxt);
		
		TextField pntxt = new TextField();
		pntxt.setFont(new Font("Calibri", Font.PLAIN, 14));
		pntxt.setBounds(234, 368, 151, 36);
		panel.add(pntxt);
		
		TextField untxt = new TextField();
		untxt.setFont(new Font("Calibri", Font.PLAIN, 14));
		untxt.setBounds(234, 448, 151, 36);
		panel.add(untxt);
		
		TextField passtxt = new TextField();
		passtxt.setFont(new Font("Calibri", Font.PLAIN, 14));
		passtxt.setBounds(654, 448, 151, 36);
		panel.add(passtxt);
		
		TextField antxt = new TextField();
		antxt.setFont(new Font("Calibri", Font.PLAIN, 14));
		antxt.setBounds(654, 368, 151, 36);
		panel.add(antxt);
		
		TextField cntxt = new TextField();
		cntxt.setName("cntxt");
		cntxt.setFont(new Font("Calibri", Font.PLAIN, 14));
		cntxt.setBounds(654, 291, 151, 36);
		panel.add(cntxt);
		
		TextField dobtxt = new TextField();
		dobtxt.setName("dobtxt");
		dobtxt.setFont(new Font("Calibri", Font.PLAIN, 14));
		dobtxt.setBounds(654, 200, 151, 36);
		panel.add(dobtxt);
		
		TextArea addtxt = new TextArea();
		addtxt.setName("addtxt");
		addtxt.setBounds(234, 159, 158, 108);
		panel.add(addtxt);
		
		JRadioButton mrb = new JRadioButton("Male");
		mrb.setName("mrb");
		mrb.setFont(new Font("Calibri", Font.BOLD, 14));
		mrb.setBounds(237, 297, 69, 36);
		panel.add(mrb);
		
		JRadioButton frb = new JRadioButton("Female");
		frb.setName("frb");
		frb.setFont(new Font("Calibri", Font.BOLD, 14));
		frb.setBounds(327, 297, 69, 36);
		panel.add(frb);
		
		Button registerbtn = new Button("Register");
		registerbtn.setPreferredSize(new Dimension(100, 100));
		registerbtn.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) 
			{
				
				String fn,ln,add,dob,gen,cn,pno,ano,un,pass;
				try
				{
					connectivity c=new connectivity();
					PreparedStatement pst=c.cn.prepareStatement("insert into registration values (?,?,?,?,?,?,?,?,?,?)");
					
					fn=fntxt.getText();
					ln=lntxt.getText();
					add=addtxt.getText();
					dob=dobtxt.getText();
					cn=cntxt.getText();
					pno=pntxt.getText();
					ano=antxt.getText();
					un=untxt.getText();
					pass=passtxt.getText();
					
					pst.setString(1,fn);
					pst.setString(2,ln);
					pst.setString(3,add);
					pst.setString(4,dob);
					if(mrb.isSelected())
					{
						pst.setString(5,"Male");
					}
					else
					{
						pst.setString(5,"Female");
					}
					pst.setString(6,cn);
					pst.setString(7,pno);
					pst.setString(8,ano);
					pst.setString(9,un);
					pst.setString(10,pass);
					
					pst.executeUpdate();
					
					JOptionPane.showMessageDialog(null,"Registration Done..");
					c.cn.close();
					frame.dispose();
					
				}
				catch(Exception ex)
				{
					System.out.println(ex);
					
				}
				
			}
		});
		registerbtn.setLocation(new Point(10, 0));
		registerbtn.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 16));
		registerbtn.setBackground(Color.LIGHT_GRAY);
		registerbtn.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		registerbtn.setBounds(245, 506, 417, 59);
		panel.add(registerbtn);
		
		
	}
}
