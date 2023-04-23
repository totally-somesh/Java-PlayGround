
public class Bowler extends Player {

	
	private int hours;
	private double rate;
	private double bonus;
	private double totalsalary;
	

	public Bowler(int empid, String ename, double basicsalary, int hours, double rate)
	{
		super(empid, ename, basicsalary);
		this.hours = hours;
		this.rate = rate;
		
		this.bonus = this.hours * this.rate;
		this.totalsalary = this.basicsalary + this.bonus;
		
	}
	
	public void display()
	{
		System.out.println(" | Id : " +empid+ " | Name : " +ename+ " | Basic Salary : " +basicsalary+ " | Bonus : " +bonus+ " | Total Salary : " +totalsalary );
	}
	
	public String toString()
	{
		return ( " | Id : " +empid+ " | Name : " +ename+ " | Basic Salary : " +basicsalary+ " | Bonus : " +bonus+ " | Total Salary : " +totalsalary );
	}
	

}
