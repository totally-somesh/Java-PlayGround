package Definitions;

public class Orange extends Fruit {
	private boolean fresh;

	public Orange(String name, String colour, double weight, boolean fresh)
	{
		super(name, colour, weight);
		this.fresh = fresh;
		System.out.println(" -: Orange Constructor :- ");
	}

	public String taste() {
		return ("Oranges Are Sour In Taste.");
	}

	public void showDetails() {
		super.showDetails();
		System.out.println(" | Oranges Are Fresh : " + fresh);
		System.out.println(" Juice Can Be Made From Oranges. ");	
	}

	public void juice()
	{
		super.showDetails();
		System.out.println(" | Juice Can Be Made From Oranges.") ;
	}



}
