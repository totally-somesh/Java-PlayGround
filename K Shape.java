import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows");
		int n = sc.nextInt();
		for (int i = 1; i < n; i++) {
			System.out.print("*");
			for (int k = i + 1; k <= n - 1; k++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}

		for (int i = 1; i < n; i++) {
			System.out.print("*");
			for (int k = 1; k <= i; k++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
	}
}