package RunnableTasks;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static Utilities.IOUtilities.store;

import Definitions.Product;

public class PriceSorting implements Runnable {

	private String fileName;
	private Map<Integer, Product> map;
	
	public PriceSorting(String fileName, Map<Integer, Product> map) {
		
	this.fileName = fileName;
	this.map = map;
	
	}// constructor
	
	@Override
	public void run() {
		
		try
		{
			System.out.println("Accessing : " +Thread.currentThread().getName());
			
			//Here, We're converting Map --> Collection --> Stream --> Collector
			List<Product> sortedList = map.values().stream()
			.sorted((P1,P2) -> ((Double)P1.getPrice()).compareTo(P2.getPrice()))
			.collect(Collectors.toList());
			
			store(fileName, sortedList);
			
			System.out.println(" ");
			
		}//try block
		catch(Exception e) {
			
			System.out.println("Error In PriceSorting Thread : " +e);
		}
		
		
	}
	
	
	

}
