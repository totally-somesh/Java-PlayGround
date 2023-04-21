import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class FileCreation {

	public static void main(String[] args) {
	
		try {
			File myObj = new File("D:\\India\\Cricket.txt");
			if(myObj.createNewFile())
			{
				System.out.println("File Created : " +myObj.getName());
			}
			else 
			{
				System.out.println("File Already Exists.");
			}
		}//try
		catch(IOException e) 
		{
			System.out.println("Error In File Creation.");
			e.printStackTrace();
		}//catch
	}//main
}//class
