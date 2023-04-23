
public class Captain extends Player {

	
	private double mbonus;
	private double totalsalary;

	public Captain(int empid, String ename, double basicsalary, double mbonus) {
		super(empid, ename, basicsalary);
		this.mbonus = mbonus;
		
		this.totalsalary = this.basicsalary + this.mbonus;
		}
	
	public void display()
	{
		System.out.println(" | Id : " +empid+ " | Name : " +ename+ " | Basic Salary : " +basicsalary+ " | Bonus : " +mbonus+ " | Total Salary : " +totalsalary );
	}
	
	public String toString()
	{
		return ( " | Id : " +empid+ " | Name : " +ename+ " | Basic Salary : " +basicsalary+ " | Bonus : " +mbonus+ " | Total Salary : " +totalsalary );
	}

}
