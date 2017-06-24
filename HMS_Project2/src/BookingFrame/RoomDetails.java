/*package BookingFrame;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RoomDetails extends JFrame{
	
	String Roomno,RoomType,Bed,Rate;
	String a,b,c,d;
	public RoomDetails(String Roomno,String RoomType,String Bed,String Rate)
	{
	this.Roomno=Roomno;
	this.RoomType=RoomType;
	this.Bed=Bed;
	this.Rate=Rate;
	}

	
	

	public RoomDetails(String string) {
		Readfile(string+".txt");
		// TODO Auto-generated constructor stub
	}




	public ArrayList ListRooms()
	{
		ArrayList<RoomDetails> list= new ArrayList<RoomDetails>();
	    RoomDetails room=new RoomDetails(a,b,c,d);
	    list.add(room);
	    return list;
	}
	
	public void Readfile(String City)
	{
		
		Scanner x=null;
		int n=5;
		
		String data[]=new String[n];
		try{
			
			x=new Scanner(new File(City+".txt"));
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,"Couldnt find a file named... "+City+".txt");
		}
		
			while(x.hasNext())
			{
				
				data[0]=x.next();
				this.a=data[0];
				data[1]=x.next();
				this.b=data[1];
				data[2]=x.next();
				this.c=data[2];
				data[3]=x.next();
				this.d=data[3];
				System.out.printf("%s %s %s %s\n",data[0],data[1],data[2],data[3]);
			}
		
		
		
		
	}
	
	
	
	
	public void RoomTable()
	{
		DefaultTableModel model=(DefaultTableModel)table.getModel();
		ArrayList<RoomDetails> list=ListRooms();
		Object rowData[]=new Object[4];
		for(int i=0;i<list.size();i++)
		{
			rowData[0]=list.get(i).a;
			rowData[1]=list.get(i).b;
			rowData[2]=list.get(i).c;
			rowData[3]=list.get(i).d;
			model.addRow(rowData);
			
		}
	}

	

}
*/