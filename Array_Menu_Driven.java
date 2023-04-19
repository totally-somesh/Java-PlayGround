import java.util.Scanner;

public class Array_Menu_Driven {

		public static void main(String[] args)
		{
			
		Scanner sc = new Scanner(System.in);
		
		int choice, size, key;
		System.out.println("How Many Elements You Wants To Store ? ");
		size = sc.nextInt();
		
		int [] arr = new int[size];
		System.out.print("Enter Array Elements : ");
		
		for(int i=0; i<arr.length; i++)
		arr[i] = sc.nextInt();
		
		do { 
			System.out.println("\n Enter Your Choice.");
			System.out.println("1: Read Array 2: Print Array 3: Search Element In Array 4: Reverse Array 5: Even Number From Array 6: Sum Of Array Elements 7:Exit ");
			choice = sc.nextInt();
			
		switch(choice)
		{
			case 1:
				System.out.print("Entered Array Is : ");
				for(int i=0; i<arr.length; i++)
					System.out.println(arr[i]);
			break;
			
			case 2:
				System.out.print("Entered Array Is : ");
				for(int i=0; i<arr.length; i++)
					System.out.print(arr[i]+ " ");
				System.out.println();
			break;
			
			case 3:
				System.out.print("Entered Element To Be Searched : ");
				key = sc.nextInt();
				int found=0;
				for(int i=0; i<arr.length; i++)
				{
					if(arr[i] == key)
					{
					found++;
					break;
					}
				}
				
				if(found == 1)
				{
					System.out.print("Entered Element " +key+ 
					" Found In Array.\n");
					System.out.println();
				}
				else
				{
					System.out.print("Entered Element " +key+ 
					" Not Found In Array.");
					System.out.println();
				}
			break;
			
			case 4:
				System.out.println("Array In Reverse Manner : ");
				for(int i=arr.length-1; i>=0; i--)
				{
					System.out.print(arr[i]+ " ");
				}
				System.out.println();
			break;
			
			case 5:
				System.out.println("Even Numbers From Array : ");
				for(int i=0; i<arr.length; i++)
				{
				if(arr[i]%2 == 0)
				{
					System.out.print(arr[i]+ " ");
				}
				else
				{
					continue;
				}
				}
				System.out.println();
			break;
			
			case 6:
				int sum=0;
				System.out.println("Sum Of Array Elements : ");
				for(int i=0; i<arr.length; i++)
				{
					sum = sum + arr[i];
				}
				System.out.println(sum);
			break;
			
			case 7:
				System.out.println("Exit ! Thank You !");
			break;
			default :
				System.out.println("Invalid Choice !");
			break;
		}//switch
		} while(choice !=7 ); 
		
	}//main
		

}
