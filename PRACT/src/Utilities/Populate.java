package Utilities;

import static Validations.ValidationRules.validateAllInputs;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

import Definition.Account;
import Exceptions.AccountException;

public class Populate {
	
	public static Map<Integer, Account> populateMap() throws AccountException, ParseException
	{
		Map<Integer, Account> map=new HashMap<>();
		
		System.out.println(map.put(102, validateAllInputs(102, "Virat Kohli", 50000.0, "2020-02-10", "SAVING", map)));
		System.out.println(map.put(152, validateAllInputs(152, "Hardik Pandya", 40000.0, "2022-04-10", "DMAT", map)));
		System.out.println(map.put(114, validateAllInputs(114, "M S Dhoni", 100000.0, "2019-12-10", "CURRENT", map)));
		System.out.println(map.put(107, validateAllInputs(107, "R Ashwin", 20000.0, "2010-12-10", "SAVING", map)));
		System.out.println(map.put(109, validateAllInputs(109, "R Jadeja", 50000.0, "2022-12-17", "DMAT", map)));
		System.out.println(map.put(156, validateAllInputs(156, "M Shami", 10000.0, "2020-09-10", "SAVING", map)));
		System.out.println(map.put(122, validateAllInputs(122, "Ishan Kishan", 20000.0, "2021-10-10", "CURRENT", map)));
		System.out.println(map.put(111, validateAllInputs(111, "Rohit Sharma", 40000.0, "2022-10-17", "FD", map)));
		
		return map;
	}

}
