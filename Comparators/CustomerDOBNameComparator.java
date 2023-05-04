package Comparators;

import java.util.Comparator;

import Definition.Customer;

public class CustomerDOBNameComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		int value = o1.getDob().compareTo(o2.getDob());
		if (value == 0) {
			return o1.getName().compareTo(o2.getName());
		}

		return value;
	}

}
