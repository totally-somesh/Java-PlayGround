package Tester;

import static ValidationRules.BookValidation.validateAllBookInputs;
import static ValidationRules.TapeValidation.validateAllTapeInputs;
import static Utilities.Population.populateBookMap;
import static Utilities.IOUtils.store;
import static Utilities.IOUtils.restore;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Definitions.Book;
import Definitions.Tape;

public class Publisher {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in);) {

			

			Map<Integer, Book> BookMap = populateBookMap();
			
			
			Map<Integer, Tape> TapeMap = new HashMap<>();

			Boolean exit = false;

			while (!exit) {

				System.err.println(
						"Select : 1. Publish A Book | 2.Publish A Tape | 3.Book List(Ordered By PublishDate (Desc))"
								+ " | 4.Tape List(Ordered By PublishDate (Desc)) |5.Top 5 Publications (On Ratings) | 6. Remove Publication(5 Yrs. Old) | 7. To Restore Lastly Saved Map | 8.Exit ");

				int choice = sc.nextInt();
				try {
					switch (choice) {

					case 1:

						System.out.println("Please Enter Book Details : Id | Name | Publish Date | Price | Ratings ");
						Book newbook = validateAllBookInputs(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(),
								sc.nextInt(), BookMap);

						BookMap.put(newbook.getBook_id(), newbook);

						break;

					case 2:

						System.out.println("Please Enter Tape Details : Id | Name | Publish Date | Price | Ratings ");

						Tape newtape = validateAllTapeInputs(sc.nextInt(), sc.next(), sc.nextDouble(), sc.next(),
								sc.nextInt(), TapeMap);

						// validateAllTapeInputs(int tape_id, String tape_name, double tape_price,
						// String publishDate,
						// int rating, Map<Integer, Tape> tmap)

						TapeMap.put(newtape.getTape_id(), newtape);

						break;

					case 3:
						System.out.println(" -------- Book List -------- ");

						// BookMap.values().stream().sorted((B1,B2) ->
						// B1.getPublishDate().compareTo(B2.getPublishDate()))
						// .forEach(B -> System.out.println(B));

//						List<Book> collectedList = BookMap.values().stream()
//						.sorted((B1,B2) -> ((Integer)B2.getRatings()).compareTo(B1.getRatings()))
//						.limit(3)
//						.collect(Collectors.toList());
//						

						BookMap.values().stream()
								.sorted((B1, B2) -> ((Double) B2.getBook_price()).compareTo(B1.getBook_price()))
								.forEach(B -> System.out.println(B));

						// .forEach(B -> System.out.println(B));

//						for (Book B : BookMap.values())
//							System.out.println(B);

						break;

					case 4:
						System.out.println(" -------- Tape List -------- ");

						for (Tape T : TapeMap.values())
							System.out.println(T);
						break;

					case 7:

						System.out.println("Please Enter File Name To Store The Data : ");
						store(sc.next(), BookMap);
						System.out.println("Map Stored Succesfully ! ");
												
						break;

					case 8:

						System.out.println("Enter FileName To Restore From : ");

						String FileName = sc.next();

						Map<Integer,Book> restoredMap = restore(FileName);
						
						restoredMap.forEach((K, V) -> System.out.println(V));

						System.out.println("You've Restore The Map Succesfully : ");

						exit = true;
						break;

					}// switch
				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			} // while

		} // try
		catch (Exception e) {
			e.printStackTrace();
		} // outer catch

	}// main

}// class

//101 ABC 2010-12-12 499 5
//102 LMN 2014-12-10 999 2
//103 PQR 2022-12-01 199 4

//201 XYZ 299 2010-11-08 3

//202 LMN 299 2010-11-08 3
//203 ABC 299 2010-11-08 3
//202 LMN 2009-10-08 499 4
//201 ABC 2002-11-02 799 1