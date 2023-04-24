package Definitions;

public class Fruit {
	
	private String name;
	private String colour;
	private double weight;
	
	public Fruit(String name, String colour, double weight)
	{		
		this.name = name;
		this.colour = colour;
		this.weight = weight;
		System.out.println(" -: Fruit Constructor :- ");
	}
	
	public String toString()
	{
		return ("Name : " +name+ " | Colour : " +colour+ " | Weight : " +weight);
	}

	public String taste()
	{
		return ("No Specific Taste For Fruit, Until The Type Of Fruit Is Defined."); 
	}
	
	public void showDetails()
	{
		System.out.println("Name : " +name+ " | Colour : " +colour+ " | Weight : " +weight);
	}
}
