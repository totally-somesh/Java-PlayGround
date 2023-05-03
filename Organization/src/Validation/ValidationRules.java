package Validation;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import Definition.Customer;
import Definition.ServicePlan;
import Exception.CustomerValidationException;

public class ValidationRules {

	public static Customer validateAllInputs(String name, String email, String password, double regAmount, String DOB,
			String plan, List<Customer> organization) throws CustomerValidationException, ParseException {

		LocalDate Date = validateDOB(DOB);

		validateEmail(email, organization);

		ServicePlan servicePlan = validateServicePlanAndRegAmount(plan, regAmount);

		return new Customer(name, email, password, regAmount, Date, servicePlan);

	}

	// Checking Age Limit ( Above 21 Years ) :-
	public static LocalDate validateDOB(String DOB) throws CustomerValidationException, ParseException {
		LocalDate Date = LocalDate.parse(DOB);

		LocalDate Today = LocalDate.now();

		int Years = Period.between(Date, Today).getYears();

		if (Years < 21)
			throw new CustomerValidationException(" Age Below 21 Years. ");
		else {
			System.out.println("You're Eligible As Your Age Is : " + Years + " Which Is Above 21 Years. ");
			return Date;
		}

	}

	// Checking Duplicate Email :-
	public static void validateEmail(String email, List<Customer> organization) throws CustomerValidationException {

		Customer newCustomer = new Customer(email);

		if (organization.contains(newCustomer))
			throw new CustomerValidationException("Username Already Exists.");
		System.out.println("Email ID Is Unique.");
	}

	// Checking Validate Plan & Registration Amount :-
	public static ServicePlan validateServicePlanAndRegAmount(String plan, double amount)
			throws CustomerValidationException, IllegalArgumentException {
		ServicePlan servicePlan = ServicePlan.valueOf(plan.toUpperCase());

		if (servicePlan.getPlancost() == amount)
			return servicePlan;

		else
			throw new CustomerValidationException("Invalid Plan");

	}

	public static void validateLoginDetails(String email, String password, List<Customer> organization)
			throws CustomerValidationException {

		Customer newCustomerMail = new Customer(email);

		int index = organization.indexOf(newCustomerMail);

		if (index == -1) {
			throw new CustomerValidationException("Email Does Not Exist.");
		}
		if (organization.get(index).getPassword().equals(password)) {
			System.out.println("Welcome. Succesfully Login. ");
		} else
			throw new CustomerValidationException("Invalid Password.");

	}

	public static void toChangePassword(String email, String password, List<Customer> organization) throws CustomerValidationException {

		Customer newCustomerMail = new Customer(email);
		Scanner sc = new Scanner(System.in);
		int index = organization.indexOf(newCustomerMail);

		if (index == -1) {
			throw new CustomerValidationException("Email Does Not Exist.");
		}
		if (organization.get(index).getPassword().equals(password)) {
			System.out.println("Welcome. Succesfully Login. ");

			System.out.println("Please Enter New Password : ");
			String newPassword = sc.next();
			organization.get(index).setPassword(newPassword);
			System.out.println("Password Changed Succesfully. Your New Password Is : " + newPassword);
		}
	}

	public static void unsubscribe(String email, String password, List<Customer> organization)
			throws CustomerValidationException {

		Iterator<Customer> itr1 = organization.iterator();

		Customer newCustomerMail = new Customer(email);
		Scanner sc = new Scanner(System.in);
		int index = organization.indexOf(newCustomerMail);

		if (index == -1) {
			throw new CustomerValidationException("Email Does Not Exist.");
		}
		if (organization.get(index).getPassword().equals(password)) {
			System.out.println("Welcome. Succesfully Login. ");
			
			System.out.println(" Are You Sure To Unsubscribe : Y / N ");
			String yes = sc.next().toLowerCase();

			char s = yes.charAt(0);
			
			if(s == 'y') {
			while (itr1.hasNext()) {
				itr1.next();
				itr1.remove();
				break;
			}//while
			System.out.println("Unsubscribed Succesfully."); }
			else if(s == 'n')
				System.out.println("Okay. You're Still A User. Thank You For Continuing Our Services.");
			else
				System.out.println("Invalid Input.");
		}

	}

}
