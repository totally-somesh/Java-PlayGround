package tester;

import java.util.stream.IntStream;

public class EvenThread implements Runnable {

	private int begin;
	private int end;

	public EvenThread(int begin, int end) {
		super();
		this.begin = begin;
		this.end = end;
	}

	@Override
	public void run() {

		// EvenThread ET = new EvenThread(begin, end);
		try {
			IntStream.range(begin, end).filter(i -> i % 2 == 0)
					.forEach(i -> System.out.println(Thread.currentThread().getName() + " Printed Even No : " + i));
		} // try
		catch (Exception e) {

			System.out.println(e);
		}
	}// run
}// class
