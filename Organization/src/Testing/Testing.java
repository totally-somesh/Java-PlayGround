package Testing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import Definition.Customer;
import Validation.ValidationRules;;

public class Testing {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			List<Customer> Organization = new ArrayList<>();

			boolean exit = false;

			while (!exit) {
				System.out.println("Select : | 1.Sign Up | 2.Sign In | 3.Change Password | 4.Unsubscribe "
						+ "| 5.Display All Users | 6.Exit ");

				try {
					switch (sc.nextInt()) {

					case 1:

						System.out
								.println(" Please Enter : Name | Email | Password | Registration Amount | DOB | Plan ");
						Customer newCustomer = ValidationRules.validateAllInputs(sc.next(), sc.next(), sc.next(),
								sc.nextDouble(), sc.next(), sc.next(), Organization);

						Organization.add(newCustomer);

						System.out.println("Congratulations. User Created Succesfully.");

						break;

					case 2:
						System.out.println("Enter Email & Password : ");
						ValidationRules.validateLoginDetails(sc.next(), sc.next(), Organization);
						
						break;

					case 3:
						
						System.out.println("Enter Email & Password To Login : ");
						ValidationRules.toChangePassword(sc.next(), sc.next(), Organization);
						
						break;

					case 4:
						
						System.out.println("Enter Email & Password To Login : ");
						ValidationRules.unsubscribe(sc.next(), sc.next(), Organization);

						break;

					case 5:

						Iterator<Customer> itr = Organization.iterator();
						System.out.println(" -: Showing All Users Of Our Organization :- ");
						while (itr.hasNext()) {

							System.out.println(itr.next());
						}

						break;

					case 6:

						exit = true;

						break;
					}// switch
				} // inner try block
				catch (Exception e) {

					e.printStackTrace();
					sc.nextLine();
				}
			} // while

		} // try - with resources

	}// main

}// class

//Omkar omkar123@gmail.com omkar111 1000 1999-12-18 SILVER
//Somesh somesh123@gmail.com somesh111 1000 1994-12-12 SILVER