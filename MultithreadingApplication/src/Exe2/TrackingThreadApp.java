package Exe2;

public class TrackingThreadApp 
{
		public static void main (String[] args)
		{
			//syntax to create object of Runnable
			Runnable statement1 = new TrackingThread ();
			Runnable statement2 = new TrackingThread ();
			Runnable statement3 = new TrackingThread ();
			
			//syntax to create object of Thread
			Thread word1 = new Thread (statement1, "word1");
			Thread word2 = new Thread (statement2, "word2");		
			Thread text  = new Thread (statement3, "text");		
			
			word1.start();
			word2.start();
			text.start();
		}
}
