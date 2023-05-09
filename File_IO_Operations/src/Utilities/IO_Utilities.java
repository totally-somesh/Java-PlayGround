package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

import Definitions.Employee;
import Exception.Emp_Exception;

public interface IO_Utilities {

	static void store(String sfilename, Map<String, Employee> emap) throws FileNotFoundException, IOException {

		// Java App --> ObjectOutputStream --> FileOutputStream --> Binary
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(sfilename))) {
			out.writeObject(emap);
		}
	}

	@SuppressWarnings("unchecked")
	static Map<String, Employee> restore(String filename)
			throws Emp_Exception, ClassNotFoundException, IOException, FileNotFoundException {

		// Java App <-- ObjectInputStream <-- FileInputStream <-- Binary
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
			Map<String, Employee> mmm = (Map<String, Employee>) in.readObject();

			if (mmm.isEmpty())
				throw new Emp_Exception("Your File Is Empty.");
			return mmm;
		} // try
	}// restoring
}// i/f
