package Definition;

import java.time.LocalDate;

public class Customer {

	private int custID;
	private String name;
	private String email;
	private String password;
	private LocalDate dob;
	private ServicePlan plan;
	private double regAmount;

	private static int count;

	static {
		count = 1000;
	}

	public Customer(String name, String email, String password, double regAmount, LocalDate dob, ServicePlan plan) {
		super();
		count++;

		this.custID = count;
		this.name = name;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.plan = plan;
		this.regAmount = regAmount;
	}

	@Override
	public String toString() {
		return "| CustID : " + custID + " | Name : " + name + " | Email : " + email + " | Password : " + password
				+ " | DOB : " + dob + " | Plan : " + plan ;
	}
	
	@Override
	public boolean equals(Object o) {
		
		if(o instanceof Customer)
		{return this.email.equals(((Customer)o).email);
		}
//&& this.password.equals(((Customer)o).password)
		return false;
	}

	public int getCustID() {
		return custID;
	}

	public void setCustID(int custID) {
		this.custID = custID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public ServicePlan getPlan() {
		return plan;
	}

	public void setPlan(ServicePlan plan) {
		this.plan = plan;
	}

	public double getRegAmount() {
		return regAmount;
	}

	public void setRegAmount(double regAmount) {
		this.regAmount = regAmount;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Customer.count = count;
	}

	public Customer(String email) {
		super();
		this.email = email;
	}

	
	
	
	
	
	

}
