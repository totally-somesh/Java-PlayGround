
public class Clerk extends Person implements Tax {

private double CiAmount;
	
	@Override
	public void payTax(double income) {
			
		CiAmount = ((3 * income)/100);
	}
	
	public Clerk(int uID, String name, String address, double income)
	{
		super(uID,name,address,income);
		payTax(income);
		this.CiAmount = CiAmount;
		
	}
	
	public String toString()
	{
		return " | UID : " +this.getUID()+ " | Name : " +this.getName()+ " | Address : " +this.getAddress()+ " | Income :  " +this.getIncome()+ " | Interest Amount : " +CiAmount;
	}
	
}
