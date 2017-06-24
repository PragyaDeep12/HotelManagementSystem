package BookingFrame;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;
import java.time.LocalDate;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

@SuppressWarnings("unused")
public class Occupied extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args0) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Occupied frame = new Occupied();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Occupied(String City) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"RoomNo", "Checkindate", "Checkoutdate", "Rate"},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"RoomNo", "Checkindate", "Checkoutdate", "Rate"
			}
		));
		table.setBounds(10, 72, 403, 128);
		getOccupied(City);
		contentPane.add(table);
		
		JLabel lblNewLabel = new JLabel("Occupancy Report"+City);
		lblNewLabel.setForeground(new Color(65, 105, 225));
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel.setBounds(52, 11, 317, 27);
		contentPane.add(lblNewLabel);
		
	
	    setVisible(true);
	}
	static int i=1;
	public void getOccupied(String City)
	{try{
			
			@SuppressWarnings("resource")
			Scanner x=new Scanner(new File("Resources/City/"+City+".txt"));
			JOptionPane.showMessageDialog(null,"File  Found!!!");
			final LocalDate today=LocalDate.now();
			 LocalDate chkin,chkout;
			while(x.hasNext())
			{
				String Rno=x.next();
				String a=null;
				int Index=Integer.parseInt(x.next());
				for(int j=0;j<3;j++)
				{ a=x.next();}
				for(int ind=0;ind<Index;ind++)
				{
					String t[]=new String [3];
					t=x.next().split(":");
					chkin=LocalDate.of(Integer.parseInt(t[0]),Integer.parseInt(t[1]),Integer.parseInt(t[2]));
					t=x.next().split(":");
					chkout=LocalDate.of(Integer.parseInt(t[0]),Integer.parseInt(t[1]),Integer.parseInt(t[2]));
					if(chkin.compareTo(today)<=0&&chkout.compareTo(today)>=0)
					{
						//JOptionPane.showMessageDialog(null,today);
					getTable(Rno,chkin,chkout,a,i);
					i++;
					}
				}
				
			}
			
	}
	catch(Exception e)
	{
		JOptionPane.showMessageDialog(null,"File Not Found!!!");
	}
	
	}
	public void getTable(String rno,LocalDate chkin,LocalDate chkout,String Rate,int i)
	{
		DefaultTableModel model=(DefaultTableModel)table.getModel();
		Object rowdata[]=new Object[4];
		rowdata[0]=rno;
		rowdata[1]=chkin;
		rowdata[2]=chkout;
		rowdata[3]=Rate;
		model.setValueAt(rowdata[0], i,0 );
		model.setValueAt(rowdata[1], i,1 );
		model.setValueAt(rowdata[2], i,2 );
		model.setValueAt(rowdata[3], i,3 );
		JOptionPane.showMessageDialog(null,"i="+i);
	}
}
