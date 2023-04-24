package Definitions;

public class Apple extends Fruit {
	
	private boolean fresh;
	
	public Apple(String name, String colour, double weight, boolean fresh)
	{
		super(name, colour, weight);
		this.fresh = fresh;
		System.out.println(" -: Apple Constructor :- ");
	}
	
	public String taste()
	{
		return ("Apples Are Sweet N Sour In Taste.");
	}

	public void showDetails()
	{
		super.showDetails();
		System.out.println(" | Apples Are Fresh : " +fresh);
		System.out.println(" Jam Can Be Made From Apples. ");
	}

	public void jam()
	{
		super.showDetails();
		System.out.println(" | Jam Can Be Made From Apples.") ;
	}
}
