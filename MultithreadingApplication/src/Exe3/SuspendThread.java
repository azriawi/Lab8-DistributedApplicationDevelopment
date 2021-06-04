package Exe3;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class SuspendThread implements Runnable {
	
	private static boolean status = false;
	
	public void arrayText() 
	{
		//create object for random
		Random randomOrder = new Random();
		
		//store word in array
		String array[] = { "It", "is", "recommended", "to", "use", "Calendar", "class" };
		
		
		Set<Integer> set = new LinkedHashSet<Integer>();

		while (set.size() < array.length)
		{
			set.add(randomOrder.nextInt(array.length));
		}

		Object textArray[] = set.toArray();

		//reorder the sentence
		String reorderWord = "";
		for (int i = 0; i < array.length; i++)
		{
			//will be execute if status is true
			status = true;
			reorderWord += array[(int) textArray[i]] + " ";
			System.out.println(reorderWord);
		}

	}
	
	public void arrayText(String thread) 
	{
		//create object for random
		Random randomOrder = new Random();
		//store word in array
		String array[] = { "It", "is", "recommended", "to", "use", "Calendar", "class" };
		
		
		Set<Integer> set = new LinkedHashSet<Integer>();

		while (set.size() < array.length)
		{
			set.add(randomOrder.nextInt(array.length));
		}

		Object textArray[] = set.toArray();

		//reorder the sentence
		String reorderWord = "";
		System.out.print("\n");
		
		for (int i = 0; i < array.length; i++)		
		{
			reorderWord += array[(int) textArray[i]] + " ";
			try 
			{
				//will be execute if status is true
				if (status ==true)
				{
					//to suspend current thread for 5 sec
					System.out.println("\n" +thread +" is suspend\n");
					Thread.sleep(5000);
					status=false;
				}
		
			}
			catch (InterruptedException e)
			{			
				e.printStackTrace();
			}
			//display the reorder word
			System.out.println(thread + " = " +reorderWord);
		}
	
	}
	
	public void extTrack() 
	{
		
		String text = "Selamat Hari Raya";
		String temporaryText = "";
		char extractChar;
		
		//extract portions of text in 10 repetition
		for (int i = 1; i<=10; i++)
		{
			extractChar = text.charAt(i);
			temporaryText += extractChar;
			System.out.println(temporaryText);
			
		}

	}
	
	@Override
	public void run() {
		Thread thread = Thread.currentThread();
		String name = thread.getName();
		if (name.equals("text"))
			extTrack();
		else if (name.equals("word1"))
			arrayText();
		else
			arrayText(thread.getName());
	}

}
