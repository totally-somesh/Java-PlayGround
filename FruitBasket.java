package TestP;

import java.util.Scanner;

import P1.Fruit;
import P1.Mango;
import P1.Apple;
import P1.Orange;

import static java.lang.System.*;
import static P1.Mango.getmangoqty;
import static P1.Orange.getorangeqty;
import static P1.Apple.getappleqty;

public class FruitBasket {

	public static void main(String[] args) {

		Scanner sc = new Scanner(in);
		System.out.println(" --- Welcome To The Fruit Market --- ");
		System.out.println("Please Enter Size Of Basket : ");
		int basketsize = sc.nextInt();
		Fruit[] Basket = new Fruit[basketsize];
		int choice = 0;
		int counter = 0;

		do {
			System.out.println("Press : 1.Add A Mango  | 2.Add An Apple | 3.Add An Orange "
					+ "| 4.Display Fruit Names | 5.Display All Fruit Details | 6.To Mark A Fruit Stale "
					+ "| 7.To Mark All Fruits Stale "
					+ "| 8.To Check Specialized Functionalities | 9: To Check Quantities Per Fruit Type "
					+ "| 10.To Check Taste All Fruits | 11. To Check Out From Fruit Market");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				if (counter < basketsize) {
					out.println("Enter : Name | Colour | Weight Of Mango ");
					Basket[counter++] = new Mango(sc.next(), sc.next(), sc.nextDouble());
					System.out.println("Fresh Mango Added To The Basket.");
				} else
					System.out.println("Basket Is Full.");
				break;

			case 2:

				if (counter < basketsize) {
					out.println("Enter : Name | Colour | Weight Of Apple ");
					Basket[counter++] = new Apple(sc.next(), sc.next(), sc.nextDouble());
					System.out.println("Fresh Apple Added To The Basket.");
				} else
					System.out.println("Basket Is Full.");

				break;

			case 3:
				if (counter < basketsize) {
					out.println("Enter : Name | Colour | Weight Of Orange ");
					Basket[counter++] = new Orange(sc.next(), sc.next(), sc.nextDouble());
					System.out.println("Fresh Orange Added To The Basket.");
				} else
					System.out.println("Basket Is Full.");

				break;

			case 4:
				System.out.println("Displaying All Fruit Names : ");
				for (Fruit F : Basket) {
					if (F != null)
						out.println(F.getName());
				}

				break;

			case 5:
				System.out.println("Displaying All Details Of Fresh Fruits : ");
				for (Fruit F : Basket) {
					if (F != null && F.getFresh() == true) {
						out.println(F);
					} else {
						out.println(F);
					}
				}

				break;

			case 6:
				boolean flag = false;
				System.out.println("Enter Index Of Stale Fruit : ");
				int index = sc.nextInt();
				for (int i = 0; i < counter; i++) {
					if (index <= counter && index == Basket[i].getid()) {
						Basket[i].setFresh();
						flag = true;
						break;
					}
				}
				if (flag)
					System.out.println("Fruit Marked As Stale.");
				else
					System.out.println("Index Not Found.");
				break;

			case 7:
				out.println(" -: Its Been 7 Days Now, To All Fruits Stale Press 'stale' :- ");
				String str = sc.next().toLowerCase();

				if (str.equals("stale")) {
					for (Fruit F : Basket) {
						F.setFresh();
					}
					out.println(" -: Marked All Fruits As Stale :- ");
				}
				break;

			case 8:
				out.println(" -: Invoking Special Functionalities :- ");
				for (Fruit F : Basket) {
					if (F instanceof Mango) {
						((Mango) F).pulp();
					} else if (F instanceof Apple) {
						((Apple) F).jam();
					} else if (F instanceof Orange) {
						((Orange) F).juice();
					}
				}

				break;

			case 9:
				System.out.println("Check Quantities Per Fruit");
				System.out.println("Mango : " + getmangoqty());
				System.out.println("Apple : " + getappleqty());
				System.out.println("Orange : " + getorangeqty());

				int totalqty = +getmangoqty() + getappleqty() + getorangeqty();
				System.out.println("So, Total Quantity Of Fruits You Bought : " + totalqty);
				break;

			case 10:
				System.out.println(" -: Tastes Of All Fruits :- ");
				for (Fruit F : Basket) {
					if (F instanceof Mango)
						out.println("Mangoes Are : " + F.taste());
					else if (F instanceof Apple)
						out.println("Apples Are : " + F.taste());
					else if (F instanceof Orange)
						out.println("Oranges Are : " + F.taste());
				}

				break;

			}// switch
		} while (choice != 11);

		System.out.println("Thank You ! Visit Again !");
	}

}
