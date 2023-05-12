package Testing;

import static Utilities.DBUtils.openConnection;
import java.sql.Connection;
import java.util.Scanner;

public class JDBCTesting3 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);

				Connection cn = openConnection();
				
				PreparedStatement pst = cn.prepareCall(insert into users values (4, "Riya", "Pathak", "riya@gmail.com", 4235, 1700, "2017-03-04", "CUSTOMER") );
				
				//insert into users values
				//(4, "Riya ", "Pathak", "riya@gmail.com", 4235, 1700, "2017-03-04", "CUSTOMER")

		)// Try-With Resource Block
		{

		} // Try Block
		catch (Exception e) {

			e.printStackTrace();

		}

	}

}
