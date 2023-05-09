package Testing;

import static Utilities.IO_Utilities.restore;
import static Utilities.IO_Utilities.store;
import static Utilities.Validation_Rules.validateAllInputs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import Definitions.Employee;

//All CRUD operations MUST happen in constant time performance.
//1. Hire new emp
//2. List all emp details
//3. Promote an emp
//4. Delete emp details
//5. Sort emps as per join date n display the same.
//6. We can add many more options here.....
//0. Exit

@SuppressWarnings("unused")
public class Testing {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Map<String, Employee> EMAP = new HashMap<>();
		Scanner sc = new Scanner(System.in);
//		System.out.println("Please Enter : ID | Name | Salary | Date Of Joining | Department");
//		Employee E = validateAllInputs(sc.next(), sc.next(), sc.nextDouble(), sc.next(), sc.next(), EMAP);
//
//		EMAP.put(E.getId(), E);
		

		try {
			
			System.out.println("Please Enter File Name : ");
			store(sc.next(), EMAP);

			System.out.println("Please Enter File Name : ");
			Map<String, Employee> map123 = restore(sc.next());

			System.out.println("Displaying All Employees : ");

			map123.forEach((k, e) -> System.out.println(e)); // out :: println
			
		}catch(

	Exception e)
	{
		e.printStackTrace();
	} // catch

}// main

}// class
//D:\CDAC\Core Java WorkSpace\File_IO_Operations\src\binary.txt
//ABC123 Virat 50000 2022-12-12 SALES