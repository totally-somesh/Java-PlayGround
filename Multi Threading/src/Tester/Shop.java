package Tester;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static Utilities.Population.populateList;
import static Utilities.Population.populateMap;
import RunnableTasks.PriceSorting;

import Definitions.Product;
import RunnableTasks.DateSorting;
import RunnableTasks.QuantitySorting;

public class Shop {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			Map<Integer, Product> ShopMap = new HashMap<>();

			ShopMap = populateMap(populateList()); // Here, Calling 2 Methods At A Time.

			boolean exit = false;

			while (!exit) {

				System.out.println("Please Select : |1.Sort Shop By Date |2.Sort Shop By Price |3.Sort Shop By Quantity"
						+ " |0.Exit ");
				int choice = sc.nextInt();

				try {

					switch (choice) {

					case 1:

						System.out.println("Please Enter File Name To Store The Data : ");
						String fileName1 = sc.next();
						DateSorting DS = new DateSorting(fileName1, ShopMap);

						Thread T1 = new Thread(DS, "DateSorting Thread");

						T1.start(); // Starting The DateSorting Thread.

						T1.join(); // Waiting for the DateSorting Thread to complete its execution.

						System.out.println("Shop Sorted As Per Date Succesfully ! ");

						break;

					case 2:

						System.out.println("Please Enter File Name To Store The Data : ");
						String fileName2 = sc.next();

						PriceSorting PS = new PriceSorting(fileName2, ShopMap);

						Thread T2 = new Thread(PS, "PriceSorting Thread");

						T2.start();

						T2.join();

						System.out.println("Shop Sorted As Per Price Succesfully ! ");

						break;

					case 3:

						System.out.println("Please Enter File Name To Store The Data : ");
						String fileName3 = sc.next();
						QuantitySorting QS = new QuantitySorting(fileName3, ShopMap);

						Thread T3 = new Thread(QS, fileName3);

						T3.start();

						T3.join();

						System.out.println("Shop Sorted As Per Quantity Successfully ! ");

						break;

					}// switch
				} catch (InterruptedException e) {

					e.printStackTrace();
				}

			} // while

		} // try - with resources
	}

}
