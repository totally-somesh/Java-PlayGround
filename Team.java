
public class Team {

	public static void main(String[] args) {

		Captain M1 = new Captain(101, "Virat", 10000, 1000);
		Captain M2 = new Captain(102, "Rohit", 10000, 2000);

		Batsman A1 = new Batsman(201, "Ishan", 5000, 1000);
		Batsman A2 = new Batsman(202, "Hardik", 5000, 2000);

		Bowler W1 = new Bowler(301, "Arshdeep", 3000, 5, 200);
		Bowler W2 = new Bowler(302, "Mohd", 3000, 5, 200);

		System.out.println("\n----Captain----");
		M1.display();
		M2.display();

		System.out.println("\n----Batsman----");
		A1.display();
		A2.display();

		System.out.println("\n----Bowler----");
		W1.display();
		W2.display();

	}

}
