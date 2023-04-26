public class Testing {

	public static void main(String[] args) {
	
		System.out.println(" Enter : UID | Name | Address | Income ");
		
		System.out.println(" -----Businessman----- ");
		Businessman B1 = new Businessman(101, "Virat", "Bangalore", 10000);
		System.out.println(B1);
		 
		System.out.println(" -----Shopkeeper----- ");
		Shopkeeper S1 = new Shopkeeper(201,"Rohit","Mumbai",20000);
		System.out.println(S1);
		 		
		System.out.println(" -----Teacher----- ");
		Teacher T1 = new Teacher(301,"Dhoni","Chennai",30000);
		System.out.println(T1);
		
		System.out.println(" -----Clerk----- ");
		Clerk C1 = new Clerk(401,"Hardik","Gujarat",40000);
		System.out.println(C1);
		
	}

}
