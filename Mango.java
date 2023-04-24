package Definitions;

public class Mango extends Fruit {
	
	private boolean fresh;
	
	public Mango(String name, String colour, double weight, boolean fresh)
	{
		super(name, colour, weight);
		this.fresh = fresh;
		System.out.println(" -: Mango Constructor :- ");
	}
	
	
	public String taste()
	{
		return ("Mangoes Are Sweet In Taste.");
	}

	public void showDetails()
	{
		super.showDetails();
		System.out.println(" | Mangoes Are Fresh : " +fresh);
		System.out.println(" Pulp Can Be Extracted From Mangoes. ");
	}

	public void pulp()
	{
		super.showDetails();
		System.out.println(" | Pulp Can Be Extracted From Mangoes.") ;
	}

}
