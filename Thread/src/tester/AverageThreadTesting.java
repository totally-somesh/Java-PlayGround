package tester;

import java.util.Scanner;

public class AverageThreadTesting {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please Enter Range Of Numbers : Begin | End ");

			int begin = sc.nextInt();
			int end = sc.nextInt();

			Thread ET = new Thread(new EvenThread(begin, end), "EvenThread");

			Thread OT = new Thread(new OddThread(begin, end), "OddThread");

			Thread AT = new Thread(new AverageThread(begin, end), "AverageThread");

			ET.start();	// Start of Even Thread
			OT.start();	// Start of Odd Thread
			

			ET.join();	// End of Even Thread
			OT.join();	// End of Odd Thread
			
			AT.start(); // Here, We're starting average thread lately purposefully, so as to
						// execute it at the end of other thread's execution. 
			
			AT.join();	// End of Average Thread

		} // try
		catch (Exception e) {

			System.out.println(e);
		}
	}

}
