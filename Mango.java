package P1;

public class Mango extends Fruit{

	private static int mangoqty = 0;
	
	public Mango(String name, String colour, double weight)
	{
		super(name,colour,weight);
		mangoqty++;
	}
	
	@Override
	public String taste()
	{
		return "Sweet";
	}
	
	public static int getmangoqty()
	{
		return mangoqty;
		
	}
	
	public void pulp()
	{
		System.out.println("Mango Pulp Is Delicious.");
	}
	}
	


