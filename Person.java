
public class Person {

	private int UID;
	private String name;
	private String address;
	private double income;
	
	
	public Person(int uID, String name, String address, double income) {
		super();
		this.UID = uID;
		this.name = name;
		this.address = address;
		this.income = income;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public int getUID() {
		return UID;
	}
	
	
	
}
