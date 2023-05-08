package char_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class BufferedTextFileReadFP {

	public static void main(String[] args) {
		System.out.println("Enter file name");
		try (Scanner sc = new Scanner(System.in);

			BufferedReader br = new BufferedReader(new FileReader(sc.nextLine()))) {

//			String s = null;
//			while ((s = br.readLine()) != null)
//				System.out.println(s);
//			System.out.println("File reading complete!!!!!");
			
			System.out.println("Please Enter A String To Search : ");
			String key = sc.next();
			
			//br.lines().forEach(line -> System.out.println(line));
			
			//br.lines().filter(S -> S.contains(key.toLowerCase())).forEach(S -> System.out.println(S));
			
			br.lines().filter(S -> S.contains(key)).map(S -> S.substring(0,1).toUpperCase()
					.concat(S.substring(1))).forEach(S -> System.out.println(S));
			
			//System.out.println("Count : " + count);
			
		} // JVM : br.close() , sc.close
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over....");

	}

}
