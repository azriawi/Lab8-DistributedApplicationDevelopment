package Exe2;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class TrackingThread implements Runnable
{
	
	
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
			reorderWord += array[(int) textArray[i]] + " ";
		}
		System.out.println(reorderWord);

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
	public void run() 
	{
		//create object Thread
		Thread ct = Thread.currentThread();		
		if (ct.getName().equals("text"))
			extTrack();
		else 
			arrayText();
	}


}
