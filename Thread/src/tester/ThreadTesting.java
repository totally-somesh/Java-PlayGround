package tester;

import java.util.Scanner;

public class ThreadTesting {

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
			AT.start(); // Start of Average Thread

			ET.join();	// End of Even Thread
			OT.join();	// End of Odd Thread
			AT.join();	// End of Average Thread

		} // try
		catch (Exception e) {

			System.out.println(e);
		}
	}

}
