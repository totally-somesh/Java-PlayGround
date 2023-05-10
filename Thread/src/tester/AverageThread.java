package tester;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class AverageThread implements Runnable {

	private int begin;
	private int end;

	public AverageThread(int begin, int end) {
		super();
		this.begin = begin;
		this.end = end;
	}

	@Override
	public void run() {

		//AverageThread ET = new AverageThread(begin, end);

		OptionalDouble average = IntStream.range(begin, end).average();
		
		System.out.println(Thread.currentThread().getName()+ " Printed Average : " +average);
		
		
//		int sumEven = 0;
//		int sumOdd = 0;
//
//		for (int i = begin; i < end; i++) {
//
//			if (i % 2 == 0) {
//				sumEven += i;
//				System.out.println(sumEven);
//			}
//		}

	}

}
