package Testing;

import static Utilities.DBUtils.openConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBCTesting2 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in);

				Connection cn = openConnection();

				PreparedStatement pst = cn.prepareCall("delete from users where id = ?");

		// delete from users
		// where id = ?
		)// Try - With Resources()
		{

			
			System.out.println(" |We've Connected Succesfully To : " +cn);
			
			System.out.println(" ");
			System.out.println(" |Please Enter ID To Delete The User : ");
			System.out.println(" ");
			pst.setInt(1, sc.nextInt());

			try {
				int count = pst.executeUpdate();

				if (count == 1)
					System.out.println(count + " |User Deleted Succesfully.");
				else
					System.out.println(" |User Not Found.");
			} catch (Exception e)
			{
				e.printStackTrace();
			}
		} // Try Block
		catch (Exception e) {
			e.printStackTrace();
		}

	}// Main

}// Class
