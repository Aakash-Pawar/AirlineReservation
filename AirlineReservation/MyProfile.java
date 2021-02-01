import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Label;
import java.awt.Font;
import java.awt.TextField;
import java.awt.TextArea;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MyProfile {

	public JFrame frame;
	public JLabel newlbl;
	public TextField untxt;
	public TextField fntxt;
	public TextField lntxt;
	public TextField addtxt;
	public TextField pntxt;
	public TextField dobtxt;
	public TextField gentxt;
	public TextField cntxt;
	public TextField antxt;
	public TextField passtxt;
	public JButton btnSave;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public MyProfile() {
		initialize();
		this.frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		Label label_1 = new Label("First Name");
		label_1.setFont(new Font("Calibri", Font.BOLD, 15));
		label_1.setBounds(30, 35, 141, 49);
		frame.getContentPane().add(label_1);
		
		TextField fntxt = new TextField();
		fntxt.setEditable(false);
		fntxt.setName("fntxt");
		fntxt.setFont(new Font("Calibri", Font.PLAIN, 14));
		fntxt.setBounds(212, 48, 151, 36);
		frame.getContentPane().add(fntxt);
		
		Label label_1_1 = new Label("Address");
		label_1_1.setFont(new Font("Calibri", Font.BOLD, 15));
		label_1_1.setBounds(30, 124, 141, 49);
		frame.getContentPane().add(label_1_1);
		
		TextArea addtxt = new TextArea();
		addtxt.setEditable(false);
		addtxt.setName("addtxt");
		addtxt.setBounds(212, 100, 158, 108);
		frame.getContentPane().add(addtxt);
		
		Label label_1_2 = new Label("Gender");
		label_1_2.setFont(new Font("Calibri", Font.BOLD, 15));
		label_1_2.setBounds(30, 219, 141, 49);
		frame.getContentPane().add(label_1_2);
		
		Label label_1_3 = new Label("Passport No");
		label_1_3.setFont(new Font("Calibri", Font.BOLD, 15));
		label_1_3.setBounds(30, 296, 141, 49);
		frame.getContentPane().add(label_1_3);
		
		TextField pntxt = new TextField();
		pntxt.setEditable(false);
		pntxt.setFont(new Font("Calibri", Font.PLAIN, 14));
		pntxt.setBounds(212, 309, 151, 36);
		frame.getContentPane().add(pntxt);
		
		Label label_1_3_2 = new Label("Username");
		label_1_3_2.setFont(new Font("Calibri", Font.BOLD, 15));
		label_1_3_2.setBounds(30, 376, 141, 49);
		frame.getContentPane().add(label_1_3_2);
		
		TextField untxt = new TextField();
		untxt.setEditable(false);
		untxt.setFont(new Font("Calibri", Font.PLAIN, 14));
		untxt.setBounds(212, 389, 151, 36);
		frame.getContentPane().add(untxt);
		
		Label label_1_4 = new Label("Last Name");
		label_1_4.setFont(new Font("Calibri", Font.BOLD, 15));
		label_1_4.setBounds(450, 35, 141, 49);
		frame.getContentPane().add(label_1_4);
		
		TextField lntxt = new TextField();
		lntxt.setEditable(false);
		lntxt.setName("lntxt");
		lntxt.setFont(new Font("Calibri", Font.PLAIN, 14));
		lntxt.setBounds(632, 48, 151, 36);
		frame.getContentPane().add(lntxt);
		
		Label label_1_5 = new Label("Date Of Birth");
		label_1_5.setFont(new Font("Calibri", Font.BOLD, 15));
		label_1_5.setBounds(450, 124, 165, 49);
		frame.getContentPane().add(label_1_5);
		
		TextField dobtxt = new TextField();
		dobtxt.setEditable(false);
		dobtxt.setName("dobtxt");
		dobtxt.setFont(new Font("Calibri", Font.PLAIN, 14));
		dobtxt.setBounds(632, 141, 151, 36);
		frame.getContentPane().add(dobtxt);
		
		Label label_1_6 = new Label("Contact No");
		label_1_6.setFont(new Font("Calibri", Font.BOLD, 15));
		label_1_6.setBounds(450, 219, 141, 49);
		frame.getContentPane().add(label_1_6);
		
		TextField cntxt = new TextField();
		cntxt.setEditable(false);
		cntxt.setName("cntxt");
		cntxt.setFont(new Font("Calibri", Font.PLAIN, 14));
		cntxt.setBounds(632, 232, 151, 36);
		frame.getContentPane().add(cntxt);
		
		Label label_1_7 = new Label("Aadhar No");
		label_1_7.setFont(new Font("Calibri", Font.BOLD, 15));
		label_1_7.setBounds(450, 296, 141, 49);
		frame.getContentPane().add(label_1_7);
		
		TextField antxt = new TextField();
		antxt.setEditable(false);
		antxt.setFont(new Font("Calibri", Font.PLAIN, 14));
		antxt.setBounds(632, 309, 151, 36);
		frame.getContentPane().add(antxt);
		
		Label label_1_3_1 = new Label("Password");
		label_1_3_1.setFont(new Font("Calibri", Font.BOLD, 15));
		label_1_3_1.setBounds(450, 376, 141, 49);
		frame.getContentPane().add(label_1_3_1);
		
		TextField passtxt = new TextField();
		passtxt.setEditable(false);
		passtxt.setFont(new Font("Calibri", Font.PLAIN, 14));
		passtxt.setBounds(632, 389, 151, 36);
		frame.getContentPane().add(passtxt);
		
		TextField gentxt = new TextField();
		gentxt.setEditable(false);
		gentxt.setFont(new Font("Calibri", Font.PLAIN, 14));
		gentxt.setBounds(212, 232, 151, 36);
		frame.getContentPane().add(gentxt);
		
		JButton btnUpdate = new JButton("UPDATE");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				try
				{
					connectivity c=new connectivity();
					
					addtxt.setEditable(true);
					cntxt.setEditable(true);
					//untxt.setEditable(true);
					passtxt.setEditable(true);
					btnSave.enable();
					
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
			}
		});
		btnUpdate.setHorizontalTextPosition(SwingConstants.LEFT);
		btnUpdate.setFont(new Font("Calibri", Font.BOLD, 18));
		btnUpdate.setBounds(155, 474, 151, 40);
		frame.getContentPane().add(btnUpdate);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e)
			{
				int a;
				String un=untxt.getText();
				try
				{
					connectivity c=new connectivity();
					a = JOptionPane.showConfirmDialog(null, "Are you sure?");
	                // JOptionPane.setRootFrame(null);
	                if (a == JOptionPane.YES_OPTION) 
	                {
	                	PreparedStatement pst=c.cn.prepareStatement("delete from registration where Uname=?");
	                	pst.setString(1, un);
	                	pst.executeUpdate();
	                	JOptionPane.showMessageDialog(null,"Profile Deleted..");
	                }
	                Wlcome w1=new Wlcome();
	                w1.frame.setVisible(true);
	                frame.dispose();
				}
				catch(Exception ex)
				{
					ex.printStackTrace();
				}
			}
		});
		btnDelete.setHorizontalTextPosition(SwingConstants.LEFT);
		btnDelete.setFont(new Font("Calibri", Font.BOLD, 18));
		btnDelete.setBounds(512, 474, 151, 40);
		frame.getContentPane().add(btnDelete);
		
		newlbl = new JLabel("New label");
		newlbl.setBounds(39, 15, 49, 14);
		frame.getContentPane().add(newlbl);
		
		btnSave = new JButton("SAVE");
		btnSave.setEnabled(false);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String add,cn,pass,un;
				un=newlbl.getText();
				String un1=untxt.getText();
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
					
				
					
					JOptionPane.showMessageDialog(null,"Successfully Updated Your Profile..");
					AfterLogin af=new AfterLogin();
					af.frame.setVisible(true);

						//String un1=rs.getString("Uname");
						af.lbl.setText(un1);

						pst.executeUpdate();
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
		btnSave.setBounds(339, 474, 151, 40);
		frame.getContentPane().add(btnSave);
		
	/*	String un,fn,ln,add,dob,cn,gen,pno,ano,pass;
		un=newlbl.getText().toString();
		try
		{
			connectivity c=new connectivity();
			PreparedStatement pst=c.cn.prepareStatement("select * from registration where Uname=?");
			pst.setString(1,un);
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
				
			}
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}*/
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(153, 51, 102));
		frame.setBounds(100, 100, 807, 588);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
