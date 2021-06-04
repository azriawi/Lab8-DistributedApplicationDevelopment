package Exe3;

public class SuspendThreadApp {
	

	public static void main(String[] args) {

		//syntax to create object of Runnable
		Runnable statement1 = new SuspendThread();
		Runnable statement2 = new SuspendThread();
		Runnable statement3 = new SuspendThread();

		//syntax to create object of Thread
		Thread word1 = new Thread(statement1, "word1");
		Thread word2 = new Thread(statement2, "word2");
		Thread text = new Thread(statement3, "text");

		word1.start();
		text.start();
		word2.start();

	}
}
