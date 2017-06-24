package reception;

import java.awt.BorderLayout;
import java.awt.Container;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Search extends JFrame {
public Search() {
	// TODO Auto-generated constructor stub
}
public static void SearchForUpdate(File f,String roomno)
{
	
	ArrayList <Room>list;
try{list=CreateFile.ReadDataFromFile(f);
String data[][]=new String[list.size()][];
for(Room room:list)
	{if(room.getRoomNo().equals(roomno))
	{
		JOptionPane.showMessageDialog(null,"found");
		
	}
	
	
	}

}
catch(Exception e){e.printStackTrace();}
	}



public void SearchRoom(File f,String cindate){
	ArrayList<Room>list;
	try{int r=0;
		FileInputStream fin=new FileInputStream(f);
		ObjectInputStream oin=new ObjectInputStream(fin);
		list=(ArrayList<Room>)oin.readObject();
		String data[][]=new String[list.size()][15];
		for(Room room:list)
		{if(room.CheckOccupied(cindate)==0)
		{
			data[r][0]=room.getRoomNo();
			data[r][1]=room.getType();
			data[r][2]=room.getBeds();
			data[r][3]=room.getRate();
		}
		r++;	
			
		}
 Container con=new Container();
		String heading[]={"RoomNo","Type","Beds","Rate"};
		con.setLayout(new BorderLayout());
		JTable datatable=new JTable(data,heading);
		JScrollPane jsp=new JScrollPane(datatable);
		con.add(new JLabel("AVAILABLE ROOM LIST"), BorderLayout.NORTH);
		con.add(jsp,BorderLayout.CENTER);
		setSize(850,300);
		setLocation(200,200);
		setVisible(true);
		oin.close();
		}
	catch(Exception e)
	{e.printStackTrace();}
	}
	public static void main(String args[])
	{
			}
	
}


