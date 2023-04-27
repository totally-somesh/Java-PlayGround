package P1;

public class Apple extends Fruit {

		private static int appleqty = 0;
		
		public Apple(String name, String colour, double weight)
		{
			super(name,colour,weight);
			appleqty++;
		}
		
		@Override
		public String taste()
		{
			return "Sweet & Sour";
		}

		public void jam()
		{
			System.out.println("Apple Jam Is Yummy.");
		}
		
		public static int getappleqty() {
			return appleqty;
		}
		
}
