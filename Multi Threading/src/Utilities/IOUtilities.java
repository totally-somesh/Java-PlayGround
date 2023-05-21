package Utilities;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import Definitions.Product;

public interface IOUtilities {

	static void store(String fileName, List<Product> sortedList) throws IOException {

		// Here, We're dealing with character type of streams, Hence, using
		// Java --> PrintWriter --> FileWriter --> FileName (TextFile)

		try (PrintWriter out = new PrintWriter(new FileWriter(fileName))) {

			sortedList.forEach(out::println);

			// Here, We're using Method Reference, But by using out i.e. our own
			// PrintWriter.

		} // try - with resources

	}

}
