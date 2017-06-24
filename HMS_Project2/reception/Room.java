package reception;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Room implements Serializable{
	private int i;
private String roomno,type,city,beds,rate;
private String dates[][];
private boolean occupied;
public Room() {
	// TODO Auto-generated constructor stub
}
public Room(String roomno,String type,String city,String beds,String rate){
	super();
	this.roomno=roomno;
	this.type=type;
	//this.checkin=checkin;
	//this.checkout=checkout;
	this.city=city;
	this.beds=beds;
	this.rate=rate;
	occupied=false;
	i=0;

CreateFile.WriteRoomIntoFile(this);

//System.out.println(this.occupied);
}
public int  CheckOccupied(String cindate,String coutdate)
{if (dates[0][0]==null){return 1;}
else{ 
	int flag=0;
	for(int x=0;x<=i;x++){

	String t[]=new String[3];
t=cindate.split(":");

final LocalDate lastday,firstday,checkindate,checkoutdate;	
firstday=LocalDate.of(Integer.parseInt(t[2]),Integer.parseInt(t[1]),Integer.parseInt(t[0]));
t= dates[x][0].split(":");
checkindate=LocalDate.of(Integer.parseInt(t[2]),Integer.parseInt(t[1]),Integer.parseInt(t[0]));
t=dates[x][1].split(":");
checkoutdate=LocalDate.of(Integer.parseInt(t[2]),Integer.parseInt(t[1]),Integer.parseInt(t[0]));
t=coutdate.split(":");
lastday=LocalDate.of(Integer.parseInt(t[2]),Integer.parseInt(t[1]),Integer.parseInt(t[0]));

if((firstday.compareTo(checkindate)>0&&firstday.compareTo(checkoutdate)<0)&&(lastday.compareTo(checkindate)>0&&lastday.compareTo(checkoutdate)<0))
	flag=1;
else flag=0;}
if(flag==1)
	return 1;
else return 0;
}}

public String getRate()
{return rate;}

public String getType()
{return type;}
public boolean getOccupied()
{return occupied;}
//public String getCheckOut()
//{return checkout;}
//public String getCheckIn()
//{return checkin;}
public String getCity()
{return city;}
public String getBeds()
{return beds;}
public String getRoomNo() {
	return roomno;
}
public void setRoomNo(String roomno)
{this.roomno=roomno;
	}
public void setType(String Type)
{this.type=type;
	}
public void setRate(String rate)
{
this.rate=rate;	}
public void setCheckIn_Checkout(String checkin,String checkout)
{
	dates[i][0]=checkin;
	dates[i][1]=checkout;
i++;
}
}

