package Testing;

import static Utilities.DBUtils.openConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBCTesting1 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in);

				Connection cn = openConnection();

				PreparedStatement pst = cn.prepareCall("select * from users where role = ? and reg_amt > ? ");

		// select * from users
		// where role = ? and reg_amt > ?

		)

		{

			System.out.println(" | We're Connected Succesfully To : " + cn);
			// Here, toString is getting called on cn.

			System.out.println("  ");
			System.out.println(" | Please Enter Role & Registration Amount : ");
			
			// Now, We're taking inputs from users as per ? counts.

			pst.setString(1, sc.next());
			pst.setDouble(2, sc.nextDouble());

			try (ResultSet rst = pst.executeQuery()) {
				while (rst.next()) {
					System.out.println(" |ID : " + rst.getInt(1) + " |Name : " + rst.getString(2) + " " + rst.getString(3)
							+ " |Registration Date : " + rst.getDate(7));
				} // while Block

			} // Inner Try - With Resources Block

		} // Outer Try - With Resources Block
		catch (Exception e) {
			e.printStackTrace();
		}// Catch
	}// Main

}// Class
