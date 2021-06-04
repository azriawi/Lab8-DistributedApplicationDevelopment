package Exe1;

public class ThreadApp
{
	
	public static void main(String[] args) 
	{
		System.out.print("\n");
		System.out.print("	        HH:mm:ss \n");
		//Syntax to create objects of thread
		Thread Thread1 = new ObjThread();
		Thread THread2 = new ObjThread();

		// Named the thread
		Thread1.setName("Thread 1");
		THread2.setName("Thread 2");
			
		// Execute threads
		Thread1.start();
		THread2.start();

	}

}

