package ValidationRules;

import java.time.LocalDate;
import java.util.Map;

import Definitions.Tape;
import Exceptions.CustomException;

public class TapeValidation {

	public static Tape validateAllTapeInputs(int tape_id, String tape_name, double tape_price, String publishDate,
			int rating, Map<Integer, Tape> tmap) throws CustomException {

		LocalDate validTDate = parseAndValidateTDate(publishDate);

		tapeCheck(tape_name, tmap);

		return new Tape(tape_id, tape_name, tape_price, validTDate, rating);
	}

	public static LocalDate parseAndValidateTDate(String tdate) throws CustomException {

		LocalDate Tdate = LocalDate.parse(tdate);

		LocalDate cdate = LocalDate.parse("2000-01-01");

		if (Tdate.isBefore(cdate))
			throw new CustomException("Old Tape Is Not Allowed.");

		return Tdate;
	}

	public static void tapeCheck(String tname, Map<Integer, Tape> tmap) throws CustomException {

		if (tmap.containsValue(tname))
			throw new CustomException("Tape With This Name Already Exist.");
	}

}
