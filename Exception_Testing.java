package Testing;

import java.util.Scanner;

import Definition.LicenseExpiry;
import Definition.VehicleValidation;

import static Definition.VehicleValidation.SpeedLimit;

@SuppressWarnings("unused")
public class Exception_Testing {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice = 0;

		try {
			
			System.out.println("Select | 1.To Check Speed Limit" + " | 2.To Check License Expiry  | 3:To Exit ");
			choice = sc.nextInt();

			switch (choice) {

			case 1:

				System.out.println("Enter Your Speed : ");
				VehicleValidation.SpeedLimit(sc.nextInt());

				break;

			case 2:

				System.out.println("Enter Your License Expiry Date : ");
				System.out.println("Your License Is Expiring On : " + VehicleValidation.LicenseExpiry(sc.next()));

				break;

			}// switch
			
			sc.close();
			System.out.println(" Thank You ! Please Visit Again ! ");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
