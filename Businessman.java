
public class Businessman extends Person implements Tax {
	
	private double BiAmount;
	
	@Override
	public void payTax(double income) {
			
		BiAmount = ((10 * income)/100);
	}
	
	public Businessman(int uID, String name, String address, double income)
	{
		super(uID, name, address,income);
		payTax(income);
		this.BiAmount = BiAmount;
		
	}
	
	public String toString()
	{
		return " | UID : " +this.getUID()+ " | Name : " +this.getName()+ " | Address :  " +this.getAddress()+ " | Income : " +this.getIncome()+ " | Interest Amount : " +BiAmount;
			
	}
	
	

}
