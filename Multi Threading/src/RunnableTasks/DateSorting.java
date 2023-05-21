package RunnableTasks;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static Utilities.IOUtilities.store;

import Definitions.Product;

public class DateSorting implements Runnable {

	private String fileName;
	private Map<Integer, Product> map;

	public DateSorting(String fileName, Map<Integer, Product> map) {

		this.fileName = fileName;
		this.map = map;
	}// constructor

	@Override
	public void run() {
		
		try{
			
			System.out.println("Accessing : " +Thread.currentThread().getName());
			// Conversion : Map --> Collection --> Stream --> Sorting --> Collector
			
			List<Product> sortedList = map.values().stream()
			.sorted((P1,P2) -> P1.getManufactureDate().compareTo(P2.getManufactureDate()))
			.collect(Collectors.toList());
			
			store(fileName, sortedList); //Calling Method for storing the sortedList into a TextFIle.
			
			System.out.println(" ");
			
		}// try
		catch(Exception e) {
			
			System.out.println("Error In Date Sorting : " + e);	
		}// catch
		
		
	}

}// class
