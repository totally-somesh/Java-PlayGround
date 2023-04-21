import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromAFile {

	public static void main(String[] args) {

		try {
			File Cricket = new File("D:\\India\\Cricket.txt");
			Scanner Reader = new Scanner(Cricket);
			while (Reader.hasNextLine()) {
				String data = Reader.nextLine();
				System.out.println(data);
			}
			Reader.close();
		} // try
		catch (FileNotFoundException e) {
			System.out.println("Error In Reading, Please Check The Code Again.");
			e.printStackTrace();
		}
	}
}
