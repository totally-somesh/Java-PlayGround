package ListTesting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AL {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Integer> AList = new ArrayList<>();

		int[] Numbers = { 12, 1, 45, 99, 10, 56, 22, 7, 78, 66 };

		for (int i : Numbers) {
			AList.add(i);
		}
		System.out.println("ArrayList : " + AList);

		System.out.println("");

		System.out.println(" Q.1 : Is The Above List Empty ? ");
		String emptiness = AList.isEmpty() ? "YES" : "NO";
		System.out.println(" A.1 : " + emptiness);

		System.out.println("");
		
		System.out.println(" Q.2 : To Display The 1st Occurrence Of The Element ");
		System.out.println("");
		System.out.println("Please Enter An Element To Search : ");
		int key = sc.nextInt();
		if (AList.indexOf(key) == -1) {
			System.out.println("Element Is Absent In The ArraList.");
		} else
			System.out.println("Entered Element Is Present At : " + AList.indexOf(key) + " Index.");

		System.out.println("");
		
		System.out.println(" Q.3 : To Double The Elements Which Are Above 20 ");
		for (int i = 0; i < AList.size(); i++) {
			if (AList.get(i) > 20)
				AList.set(i, AList.get(i) * 2);
		}
		System.out.println("ArrayList After Updation Of Elements Above 20 : " + AList);

		System.out.println("");
		
		System.out.println(" Q.4 : To Remove The Element By Index ");
		System.out.println("Please Enter Index To Remove The Element ( 0 - 9 ): ");
		int index = sc.nextInt();
		AList.remove(index);
		System.out.println("ArrayList After Removing The Element : " + AList);

		System.out.println("");
		
		System.out.println(" Q.5 : To Remove The Element Without Index ");
		System.out.println("Enter Element To Remove : ");
		Integer element1 = sc.nextInt();
		boolean result1 = AList.remove(element1);
		if (result1 = true)
			System.out.println("Element Removed Successfully.");
		else
			System.out.println("Element Not Removed.");
		System.out.println("ArrayList After Removing The Element : " + AList);
	}// main
}// class
