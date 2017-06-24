package BookingFrame;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Scanner;

public class SystemRefresh {
	public static void Refresh_Backup(LocalDate refDate,String City)
	{
		File Backup=new File("Resources/Backup/Backup"+refDate+".txt");
		File Clone=new File("Resources/City/City_"+City+".txt");
		File Original=new File("Resources/City/"+City+".txt");
		try{
			PrintWriter d=new PrintWriter(new FileWriter(Clone) );
			d.close();
			Update.copyFile(Original, Clone);
			Scanner x=new Scanner(Clone);
			PrintWriter g1=new PrintWriter(new FileWriter(Original,true)) ;
			PrintWriter g2=new PrintWriter(new FileWriter(Backup)) ;
			while(x.hasNext())
			{
				String rno=x.next();
				g1.print(rno+" ");
				g2.print(rno+" ");
				int index=Integer.parseInt(x.next());
				String Details=null;
				for(int i=0;i<3;i++)
					{if(i==0)
					{
						Details=x.next()+" ";
					}
					else
					{
						Details=Details+" "+x.next();
					}
					}
				int IndexB=0;
				int IndexO=0;
				String date1=" ";
				String date2=" ";
				LocalDate cout;
				String t[]=new String[3]; 
			
				String chkin,chkout;
				for(int i=0;i<index;i++)
					{
						chkin=x.next();					
						chkout=x.next();
						t=chkout.split(":");
						cout=LocalDate.of(Integer.parseInt(t[0]), Integer.parseInt(t[1]), Integer.parseInt(t[2]));
						if(cout.compareTo(refDate)<=0)
							{if(IndexB==0)
							{
								date2=chkin+" "+chkout;
							}
							else
							{
							date2=date2+" "+chkin+" "+chkout;
							}
							IndexB++;
							}
						else
						{
							if(IndexO==0)
							{
								date1=chkin+" "+chkout;
							}
							else
							{
							date1=date1+" "+chkin+" "+chkout;
							}
							IndexO++;
						}
					
					}
				
				g1.println(IndexO+" "+Details+" "+date1+" ");
				g2.println(IndexB+" "+Details+" "+date2+" ");
				
			}
			g1.close();
			g2.close();
		x.close();
		
		Clone.delete();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

}
