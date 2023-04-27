package P1;

public class Orange extends Fruit {

		private static int orangeqty = 0;
		
		public Orange(String name, String colour, double weight)
		{
			super(name,colour,weight);
			orangeqty++;
		}
		
		@Override
		public String taste()
		{
			return "Sour";
		}

		public void juice()
		{
			System.out.println("Orange Juice Is So Energizing.");
		}
		
		public static int getorangeqty()
		{
			return orangeqty;
		}
}