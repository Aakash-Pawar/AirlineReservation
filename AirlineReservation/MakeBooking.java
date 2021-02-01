import java.awt.EventQueue;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Choice;
import org.jdatepicker.util.JDatePickerUtil;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import com.mysql.cj.xdevapi.Statement;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class MakeBooking {

	public JFrame frame;
	private JTextField totxt;
	private JTextField fromtxt;
	public JTable table;
	//public JTable jTable1;
	Object [][] data;
	String [] col;
	JScrollPane jsp;
	//ResultSetMetaData rsmt;

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
					String ffrom,fto;
					ffrom=fromtxt.getText();
			          fto=totxt.getText();
					try
					{
						connectivity c=new connectivity();
				          PreparedStatement pst=c.cn.prepareStatement("select * from flights where from_source=? and dest=?");        
				          pst.setString(1,ffrom);
				          pst.setString(2,fto);
				          ResultSet rs=pst.executeQuery();
//				          if(rs.next())
//				          {
//					          rs= c.st.executeQuery("select fno,from_source,dest,tdate,class,price,airportnm,ftime from flights");
//				        	rsmt=(ResultSetMetaData) rs.getMetaData();
//				        	int colcount=rsmt.getColumnCount();
//				        	int rowcount=0;
//				        	while(rs.next())
//				        	{
//				        		rowcount++;
//				        	}
//				        	data=new Object[rowcount][colcount];
//				        	col=new String[colcount];
//				        	int i;
//				        	for(i=1;i<=colcount;i++)
//				        	{
//				        		col[i-1]=rsmt.getColumnName(i);
//				        	}
//				        	ResultSet rs1=c.st1.executeQuery("select fno,from_source,dest,tdate,class,price,airportnm,ftime from flights");
//				        	i=0;
//				        	int j;
//				        	while(rs1.next())
//				        	{
//				        		for(j=0;j<=colcount;j++)
//				        		{
//				        			data[i][j]=rs1.getString(j+1);
//				        			DefaultTableModel dt=new DefaultTableModel(data,col);
//									table.setModel(dt);
//				        		}
//				        		i++;
//				        	}
//				        	
//				          }
				          ResultSetMetaData rsm = (ResultSetMetaData) rs.getMetaData();
				          int a;
				          a=rsm.getColumnCount();
				          DefaultTableModel df=(DefaultTableModel) table.getModel();
				          df.setRowCount(0);
				          while(rs.next())
				          {
				        	  Vector v2=new Vector();
				        	  for(int i=1;i<=a;i++)
				        	  {
				        		  v2.add(rs.getString("fno"));
				        		  v2.add(rs.getString("from_source"));
				        		  v2.add(rs.getString("dest"));
				        		  v2.add(rs.getString("tdate"));
				        		  v2.add(rs.getString("class"));
				        		  v2.add(rs.getString("price"));
				        		  v2.add(rs.getString("airportnm"));
				        		  v2.add(rs.getString("ftime"));
				        	  }
				        	  df.addRow(v2);
				        	  
				          }
				          
				          
				          }
					
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
			
			table = new JTable();
			table.setBounds(57, 262, 929, 60);
			panel.add(table);
			
			JButton btnBookFlight = new JButton("Book Flight");
			btnBookFlight.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					try
					{
						frame.dispose();
						Booking b=new Booking();
						b.frame.setVisible(true);
					}
					catch(Exception ex)
					{
						ex.printStackTrace();
					}
				}
			});
			btnBookFlight.setFont(new Font("Calibri", Font.BOLD, 25));
			btnBookFlight.setBackground(Color.LIGHT_GRAY);
			btnBookFlight.setBounds(380, 429, 229, 53);
			panel.add(btnBookFlight);
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
