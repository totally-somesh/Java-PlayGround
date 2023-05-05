package Testing;

import java.text.ParseException;
import java.util.Map;
import java.util.Scanner;

import Definition.AccType;
import Definition.Account;
import Exceptions.AccountException;
import Utilities.Populate;
import Validations.ValidationRules;

public class Bank {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws AccountException, ParseException {
		try (Scanner sc = new Scanner(System.in)) {

			Map<Integer, Account> Bank = Populate.populateMap();

			boolean exit = false;

			while (!exit) {
				System.out.println("Select : | 1. Create Account | 2. Display All Accounts | 3. Transfer Amount"
						+ "| 4. Close The Account | 5. Specific Account Details | 6. Simple Interest | 7. Exit ");

				try {
					switch (sc.nextInt()) {

					case 1:
						System.out.println(" Please Enter : AcctNo | Name | Balance | CDATE | TYPE ");

						Account Act = ValidationRules.validateAllInputs(sc.nextInt(), sc.next(), sc.nextDouble(),
								sc.next(), sc.next(), Bank);

						Bank.put(Act.getAcctNo(), Act);

						System.out.println("Account Created Succesfully. ");
						break;

					case 2:

						System.out.println("--- Displaying All Account ---");
						for (Account A : Bank.values()) {
							System.out.println(A);
						}

						break;

					case 3:

						System.out.println("Please Enter Source Account No & Destination Account Number"
								+ "And Amount To Be Transfer : ");
						Account SRC = Bank.get(sc.nextInt());
						Account DEST = Bank.get(sc.nextInt());
						double AMOUNT = sc.nextDouble();

						SRC.transfer(DEST, AMOUNT);

						System.out.println("Amount Transferred Succesfully ! ");

						break;

					case 4:

						System.out.println("Please Enter Account No. To Close : ");
						int actno = sc.nextInt();

						Bank.remove(actno);

						System.out.println("Account Closed Succesfully ! ");

						break;

					case 5:

						System.out.println("Enter The Type Of Account To See : ");
						String actType = sc.next();

						AccType accType = ValidationRules.validateAccType(actType);

						for (Account A : Bank.values()) {
							if (A.getType() == accType) {
								System.out.println(A);
							} // if
						} // for

						break;

					case 6:

						System.out.println("Enter : Account Type | Rate | Years");
						ValidationRules.separationSI(sc.next(), sc.nextDouble(), sc.nextDouble(), Bank);

						break;

					case 7:
						exit = true;
						System.out.println(" Thank You ! Have A Nice Day ! ");
						break;
					}// switch
				} // inner try
				catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			} // while

		} // try-with resources

	}// main

}// class
