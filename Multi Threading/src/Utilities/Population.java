package Utilities;

import static Definitions.Category.BISCUITS;
import static Definitions.Category.BREAD;
import static Definitions.Category.FRUITS;
import static Definitions.Category.GRAIN;
import static Definitions.Category.OIL;
import static Definitions.Category.SPICES;
import static java.time.LocalDate.parse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Definitions.Product;

public class Population {

	public static List<Product> populateList() {

		List<Product> populatedList = new ArrayList<>();

		// public Product(int productID, String name, String description, int quantity,
		// double price,
		// Category productCategory, LocalDate manufactureDate)

		Product P1 = new Product(101, "Brown Bread", "Fresh & Healthy", 5, 45.00, BREAD, parse("2023-05-20"));
		Product P2 = new Product(102, "Krack Jack", "Crunchy & Buttery", 10, 20.00, BISCUITS, parse("2023-01-02"));
		Product P3 = new Product(103, "Olive Oil", "Healthy", 10, 750.00, OIL, parse("2023-01-01"));
		Product P4 = new Product(104, "Bajara", "Green & Eco Friendly", 20, 40.00, GRAIN, parse("2022-04-22"));
		Product P5 = new Product(105, "Garam Masala", "Tasty", 15, 40.00, SPICES, parse("2022-10-12"));
		Product P6 = new Product(106, "Mangoes", "Fresh & Juicy", 10, 1000.00, FRUITS, parse("2023-02-20"));

		populatedList.add(P1);
		populatedList.add(P2);
		populatedList.add(P3);
		populatedList.add(P4);
		populatedList.add(P5);
		populatedList.add(P6);

		return populatedList;

	}// populateList Method

	public static Map<Integer, Product> populateMap(List<Product> populatedList) {

		Map<Integer, Product> populatedMap = new HashMap<>();

		populatedList.forEach(P -> populatedMap.put(P.getProductID(), P));

		return populatedMap;

	}// populateMap Method

}// Population Class
