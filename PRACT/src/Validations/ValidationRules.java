package Validations;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Map;

import Definition.AccType;
import Definition.Account;
import Exceptions.AccountException;

public class ValidationRules {

	public static final int MINBALANCE;
	static {
		MINBALANCE = 1000;
	}

	public static Account validateAllInputs(int acctNo, String name, double balance, String createdOn, String type,
			Map<Integer, Account> Bank) throws AccountException, ParseException {

		AccType TYPE = validateAccType(type);

		validateMinBalance(balance);

		checkforDuplicate(acctNo, Bank);

		LocalDate CDATE = parsingDate(createdOn);

		return new Account(acctNo, name, balance, CDATE, TYPE);
	}

	public static AccType validateAccType(String type) {

		return AccType.valueOf(type.toUpperCase());
	}

	public static void validateMinBalance(double balance) throws AccountException {

		if (balance < MINBALANCE)
			throw new AccountException(" Minimum Balance Reached ! ");

	}

	public static void checkforDuplicate(int acctNo, Map<Integer, Account> Bank) throws AccountException {

		if (Bank.containsKey(acctNo))
			throw new AccountException(" Account No Already Exists ! ");
	}

	public static LocalDate parsingDate(String date) throws ParseException {

		LocalDate DATE = LocalDate.parse(date);
		return DATE;
	}

	/*
	 * public static void typeSeparation(String actType, Map<Integer, Account> Bank)
	 * {
	 * 
	 * AccType accType = ValidationRules.validateAccType(actType);
	 * 
	 * for (Account A : Bank.values()) { if (A.getType() == accType) {
	 * 
	 * } // if } // for
	 */

	public static void separationSI(String type, double rate, double years, Map<Integer, Account> Bank)
			throws AccountException {

		AccType type2 = ValidationRules.validateAccType(type);

		for (Account A : Bank.values()) {

			if (A.getType().name().equals(type2.name())) {

				A.simpleInterestAmount(rate, years);
			}//if
		}//for
	}//separationSImethodend
}//class
