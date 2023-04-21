import java.io.File;

public class FileInformation {

	public static void main(String[] args) {
		
		File Cricket = new File("D:\\India\\Cricket.txt");
		if(Cricket.exists())
		{
			System.out.println(" | File Name : " +Cricket.getName());
			System.out.println(" | File Path : " +Cricket.getAbsolutePath());
			
			if(Cricket.canWrite())
				System.out.println(" | Data Can Written Into The File With Name :  " +Cricket.getName());
			
			if(Cricket.canRead())
				System.out.println((" | Data Can Read From The File With Name :  " +Cricket.getName()));
			
				System.out.println(" | Size Of The File (In KB ) : " +Cricket.length());
		}//if
		else
		{
			System.out.println(" | Given File Does Not Exists, Please Check Once.");
		}//else
	}//main
}//class
