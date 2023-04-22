import java.util.Scanner;

public class Odd_Even {

	public static void main(String[] args) {
		
		System.out.println("Please Enter The Value Of N.");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sumEven = 0;
		int sumOdd = 0;

		for(int i=1; i<=n; i++)
		{
		if(i%2 == 0)
		{
		sumEven += i;
		}
		else
		{
		sumOdd += i;
		}
		}
		System.out.println("Sum Of Even Numbers :" +sumEven);
		System.out.println("Sum Of Odd Numbers :" +sumOdd);

		}
		

	}


