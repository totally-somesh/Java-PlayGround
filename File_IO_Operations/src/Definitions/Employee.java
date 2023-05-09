package Definitions;

import java.io.Serializable;
import java.time.LocalDate;

public class Employee implements Serializable {
	
	private String id;
	private String name;
	private double salary;
	private LocalDate doj;
	private department dept;
	
	public Employee(String id, String name, double salary, LocalDate doj, department dept) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.doj = doj;
		this.dept = dept;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	public department getDept() {
		return dept;
	}

	public void setDept(department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "EmpID : " + id + " |Name : " + name + " | Salary : " + salary + " | DOJ : " + doj + " | Dept : " + dept;
	}
	
	
	
	
	
	

}
