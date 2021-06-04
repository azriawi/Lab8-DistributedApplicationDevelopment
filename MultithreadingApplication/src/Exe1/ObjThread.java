package Exe1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ObjThread extends Thread 
{
	public void printNum (String currentThreadObj)
	{
		//syntax to create time format
		DateTimeFormatter timeformat = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalTime time = LocalTime.now();
	    String TimeFormat = time.format(timeformat);
	    
	    //to display the current time and thread name in 10 repetition
	    
		for(int i=0 ; i<10 ;i++)
		{
			System.out.println(i + " : " + currentThreadObj + " on " + TimeFormat );
		}
	}
	
	public void run ()
	{
		//create object to get current thread
		Thread ct = Thread.currentThread();
				
		//print the thread
		printNum(ct.getName());
	}
	
}
