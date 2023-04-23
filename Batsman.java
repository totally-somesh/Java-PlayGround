
public class Batsman extends Player {

	
	private double abonus;
	private double totalsalary;
	

	public Batsman(int empid, String ename, double basicsalary, double abonus) {
		super(empid, ename, basicsalary);
		this.abonus = abonus;
		
		this.totalsalary = this.basicsalary + this.abonus;
	}
	
	public void display()
	{
		System.out.println(" | Id : " +empid+ " | Name : " +ename+ " | Basic Salary : " +basicsalary+ " | Bonus : " +abonus+ " | Total Salary : " +totalsalary );
	}
	
	public String toString()
	{
		return ( " | Id : " +empid+ " | Name : " +ename+ " | Basic Salary : " +basicsalary+ " | Bonus : " +abonus+ " | Total Salary : " +totalsalary );
	}

}
