
public class Teacher extends Person implements Tax {
	
	private double TiAmount;
	
	@Override
	public void payTax(double income) {
			
		TiAmount = ((5 * income)/100);	
	}
	
	public Teacher(int uID, String name, String address, double income)
	{
		super(uID,name,address,income);
		payTax(income);
		this.TiAmount = TiAmount;	
	}
	
	public String toString()
	{
		return " | UID : " +this.getUID()+ " | Name : " +this.getName()+ " | Address :  " +this.getAddress()+ " | Income : " +this.getIncome()+ " | Interest Amount : " +TiAmount; 
	}

}
