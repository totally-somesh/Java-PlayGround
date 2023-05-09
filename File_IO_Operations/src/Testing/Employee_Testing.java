package Testing;

import static Utilities.Validation_Rules.validateAllInputs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static Utilities.IO_Utilities.store;
import static Utilities.IO_Utilities.restore;

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
public class Employee_Testing {

	public static void main(String[] args) {

		Map<String, Employee> EMAP = new HashMap<>();

		try (Scanner sc = new Scanner(System.in)) {
			boolean exit = false;
			while(!exit){
			System.out.println("Select : | 1.Hire Employee | 2.Display All Employees ");

			switch (sc.nextInt()) {

			case 1:

				System.out.println("Please Enter : ID | Name | Salary | Date Of Joining | Department");
				Employee E = validateAllInputs(sc.next(), sc.next(), sc.nextDouble(), sc.next(), sc.next(), EMAP);

				EMAP.put(E.getId(), E);
				System.out.println("Please Enter File Name : ");
				store(sc.next(), EMAP);

				break;

			case 2:

				System.out.println("Please Enter File Name : ");
				Map<String, Employee> map123 = restore(sc.next());
				
				System.out.println("Displaying All Employees : ");

				map123.forEach((k,e) -> System.out.println(e)); // out :: println

				break;

			case 3 : 
				exit = true;
				break;
			}}// switch
		} catch (Exception e) {
			e.printStackTrace();
		} // catch

	}// main

}// class
//D:\CDAC\Core Java WorkSpace\File_IO_Operations\src\binary.txt
//ABC123 Virat 50000 2022-12-12 SALES