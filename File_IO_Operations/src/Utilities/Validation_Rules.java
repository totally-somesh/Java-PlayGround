package Utilities;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.util.Map;

import Definitions.Employee;
import Definitions.department;
import Exception.Emp_Exception;

public class Validation_Rules {

	public static Employee validateAllInputs(String id, String name, double salary, String doj, String dept,
			Map<String, Employee> map1) throws Emp_Exception, ParseException {

		LocalDate DATE = parseAndValidateDOJ(doj);

		department DEPT = parseDepartment(dept);

		duplicateId(id, map1);

		return new Employee(id, name, salary, DATE, DEPT);
	}

	public static void duplicateId(String id, Map<String, Employee> map) throws Emp_Exception {

		if (map.containsKey(id))
			throw new Emp_Exception("Employee ID Already Exists.");
	}

	public static LocalDate parseAndValidateDOJ(String date) throws Emp_Exception, ParseException {

		LocalDate DATE = LocalDate.parse(date);
		int difference = Period.between(DATE, LocalDate.now()).getYears();

		if (difference > 3)
			throw new Emp_Exception("Date Of Joining Is Invalid.");

		return DATE;
	}// DateParsing

	public static department parseDepartment(String dept) throws ParseException, IllegalArgumentException {

		department dept123 = department.valueOf(dept.toUpperCase());

		return dept123;
	}

}// class
