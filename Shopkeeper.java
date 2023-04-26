
public class Shopkeeper extends Person implements Tax {
	
	private double SiAmount;
	
	@Override
	public void payTax(double income) {
			
		SiAmount = ((7 * income)/100);
	}
	
	public Shopkeeper(int uID, String name, String address, double income)
	{
		super(uID,name,address,income);
		payTax(income);
		this.SiAmount = SiAmount;
		
	}
	
	public String toString()
	{
		return " | UID : " +this.getUID()+ " | Name : " +this.getName()+ " | Address : " +this.getAddress()+ " | Income :  " +this.getIncome()+ " | Interest Amount : " +SiAmount;
	}
	

}
