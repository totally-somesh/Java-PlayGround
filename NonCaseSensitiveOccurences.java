import java.util.Scanner;

public class NonCaseSensitiveOccurences {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter A Sentence : ");
		String str = sc.nextLine().toLowerCase();

		System.out.println("Enter A Character To Search : ");
		char L = sc.next().charAt(0);

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == L) {
				count++;
			}
		}
		System.out.println("Entered Character : " + L + " Is Present For " + count + " Times.");
	}
}
