package Utilities;

import java.util.HashMap;
import java.util.Map;

import static ValidationRules.BookValidation.validateAllBookInputs;

import Definitions.Book;
import Definitions.Tape;
import Exceptions.CustomException;

public class Population {

	public static Map<Integer, Book> populateBookMap() throws CustomException {

		Map<Integer, Book> popBook = new HashMap<>();

		popBook.put(101, validateAllBookInputs(101, "Harry Potter", "2010-12-12", 299, 5, popBook));
		popBook.put(102, validateAllBookInputs(102, "Her Life", "2012-10-02", 999, 1, popBook));
		popBook.put(103, validateAllBookInputs(103, "Life", "2010-10-02", 199, 4, popBook));
		popBook.put(104, validateAllBookInputs(104, "My Life", "2001-10-02", 799, 2, popBook));
		popBook.put(105, validateAllBookInputs(105, "Life", "2010-10-02", 399, 3, popBook));

		return popBook;

	}

}
