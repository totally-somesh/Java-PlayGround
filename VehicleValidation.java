package Definition;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;

@SuppressWarnings("unused")
public class VehicleValidation {

	public static final int MAX_SPEED;
	public static final int MIN_SPEED;

	static {
		MAX_SPEED = 80;
		MIN_SPEED = 40;
	}

	public static void SpeedLimit(int speed) throws SpeedOutOfRangeException {

		if (speed > MAX_SPEED)
			throw new SpeedOutOfRangeException("You're Speed Has Exceeded The Limit.");
		if (speed < MIN_SPEED)
			throw new SpeedOutOfRangeException("You're Going Too Slow, Causing Traffic Jam.");
		System.out.println("Speed Within Limit. Have A Safe Journey.");

	}

	public static Date LicenseExpiry(String expdt) throws ParseException, LicenseExpiry {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		Date expirydate = sdf.parse(expdt);

		Date today = new Date();

		if (expirydate.after(today))
			return expirydate;
		
		throw new LicenseExpiry("You're License Has Expired. Please Renew.");

	}

}
