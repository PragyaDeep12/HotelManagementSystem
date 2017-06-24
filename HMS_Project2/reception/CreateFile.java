package reception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class CreateFile implements Serializable {

public static  void WriteRoomIntoFile (Room room)
{try{
	String city=room.getCity();	
		
		if(city.equals("Kolkata"))
{ObjectOutputStream oin=new ObjectOutputStream(new FileOutputStream("City_Kolkata.txt",true));
oin.writeObject(room);
//System.out.println(true);
//Search.SearchForUpdate("C:\\Users\\User\\workspace\\HMS\\City_Kolkata.txt", 300);

oin.close();
ArrayList<Room> list = null;

ObjectInputStream bin=new ObjectInputStream(new FileInputStream("City_Kolkata.txt"));
list=(ArrayList<Room>)bin.readObject();
System.out.println("hellowrld");
System.out.println(list);
bin.close();}
if(city.equals("Delhi"))
{ObjectOutputStream oin=new ObjectOutputStream(new FileOutputStream("City_Delhi.txt"));
oin.writeObject(room);
oin.close();}
if(city.equals("Chennai"))
{ObjectOutputStream oin=new ObjectOutputStream(new FileOutputStream("City_Chennai.txt"));
oin.writeObject(room);
oin.close();}
if(city.equals("Bangalore"))
{ObjectOutputStream oin=new ObjectOutputStream(new FileOutputStream("City_Bangalore.txt"));
oin.writeObject(room);
oin.close();}
}

catch(Exception e)
{e.printStackTrace();}
}
public static ArrayList<Room> ReadDataFromFile(File f){
	ArrayList<Room> list = null;
	try{
ObjectInputStream oin=new ObjectInputStream(new FileInputStream(f))	;
	list=(ArrayList<Room>)oin.readObject();
	oin.close();
}

catch(Exception e){e.printStackTrace();}
	return list;}
//return list;
}