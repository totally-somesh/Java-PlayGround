package RunnableTasks;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import Definitions.Product;

import static Utilities.IOUtilities.store;

public class QuantitySorting implements Runnable {

	private String fileName;
	private Map<Integer, Product> map;

	public QuantitySorting(String fileName, Map<Integer, Product> map) {

		this.fileName = fileName;
		this.map = map;

	}// constructor

	@Override
	public void run() {

		try {

			// Here, We're Converting : Map --> COllection --> Stream --> Collector

			List<Product> sortedList = map.values().stream()
					.sorted((P1, P2) -> ((Integer) P1.getQuantity()).compareTo(P2.getQuantity()))
					.collect(Collectors.toList());

			store(fileName, sortedList);

			System.out.println(" ");

		} // try block
		catch (Exception e) {

			System.out.println("Error In Quantity Thread : " + e);

		} // catch block

	}

}
