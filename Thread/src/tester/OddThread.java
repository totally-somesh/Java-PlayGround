package tester;

import java.util.stream.IntStream;

public class OddThread implements Runnable {

	private int begin;
	private int end;

	public OddThread(int begin, int end) {
		super();
		this.begin = begin;
		this.end = end;
	}

	@Override
	public void run() {

		// OddThread ET = new OddThread(begin, end);
		try {
			IntStream.range(begin, end).filter(i -> i % 2 == 1)
					.forEach(i -> System.out.println(Thread.currentThread().getName() + " Printed Odd No : " + i));
		} // try
		catch (Exception e) {

			System.out.println(e);
		}
	}// run

}// class
