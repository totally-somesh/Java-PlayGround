package ValidationRules;

import java.time.LocalDate;
import java.util.Map;

import Definitions.Book;
import Exceptions.CustomException;

public class BookValidation {

	public static Book validateAllBookInputs(int book_id, String book_name, String publishDate, double book_price,
			int ratings, Map<Integer, Book> map) throws CustomException {

		LocalDate validDate = parseAndValidateBDate(publishDate);

		titleCheck(book_name, map);

		return new Book(book_id, book_name, validDate, book_price, ratings);
	}

	public static LocalDate parseAndValidateBDate(String bdate) throws CustomException {

		LocalDate date = LocalDate.parse(bdate);
		LocalDate cdate = LocalDate.parse("2000-01-01");

		if (date.isBefore(cdate))
			throw new CustomException("Old Books Are Not Allowed.");
		else
			return date;
	}// dateParsing

	@SuppressWarnings("unlikely-arg-type")
	public static void titleCheck(String title, Map<Integer, Book> map) throws CustomException {

		if (map.containsValue(title))
			throw new CustomException("Book Already Exist With This Name.");

	}

}
