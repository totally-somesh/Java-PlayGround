import java.io.FileWriter;
import java.io.IOException;

public class WritingIntoAFile {

	public static void main(String[] args) {

		try {
			FileWriter FW = new FileWriter("D:\\India\\Cricket.txt");
			FW.write("Cricket Is A Sport.");
			FW.close();
			System.out.println("Writing Operation Is Successful.");
		} catch (IOException e) {
			System.out.println("Writing Operation Is Unsuccessful.");
			e.printStackTrace();
		}//catch
	}//main
}//class
