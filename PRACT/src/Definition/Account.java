package Definition;

import java.time.LocalDate;

import Exceptions.AccountException;
import Validations.ValidationRules;

public class Account {

	private int acctNo;
	private String name;
	private double balance;
	private boolean active;
	private LocalDate createdOn;
	private LocalDate txnDate;
	private AccType type; // ENUM

	public Account(int acctNo, String name, double balance, LocalDate createdOn, AccType type) {
		super();
		this.acctNo = acctNo;
		this.name = name;
		this.balance = balance;
		this.active = true;
		this.createdOn = LocalDate.now();
		this.txnDate = this.createdOn;
		this.type = type;
	}

	@Override
	public String toString() {
		return " | AcctNo : " + acctNo + " | Name : " + name + " | Balance : " + balance + " | Active : " + active
				+ " | CreatedOn : " + createdOn + " | Txn Date : " + txnDate + " | Type : " + type;
	}

	public int getAcctNo() {
		return acctNo;
	}

	public void setAcctNo(int acctNo) {
		this.acctNo = acctNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public LocalDate getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDate createdOn) {
		this.createdOn = createdOn;
	}

	public LocalDate getTxnDate() {
		return txnDate;
	}

	public void setTxnDate(LocalDate txnDate) {
		this.txnDate = txnDate;
	}

	public AccType getType() {
		return type;
	}

	public void setType(AccType type) {
		this.type = type;
	}

	public double getBalance() {
		return balance;
	}

	public void withdraw(double amount) throws AccountException {

		if (this.active == true) {
			if (((this.getBalance() - this.getType().getMinBalance()) < amount))
				throw new AccountException("Insufficient Balance ! ");
			else {
				this.balance = this.balance - amount;
				this.txnDate = LocalDate.now();
			}
		}

	}

	public void deposit(double amount) {
		if (this.active == true) {
			this.balance = this.balance + amount;
		}
		this.txnDate = LocalDate.now();

	}

	public void transfer(Account destination, double amount) throws AccountException {

		if (this.active == true && destination.active == true) {

			ValidationRules.validateMinBalance(this.getBalance());
			this.withdraw(amount);
			destination.deposit(amount);
		}
		this.txnDate = LocalDate.now();
		destination.txnDate = LocalDate.now();

	}

	public double simpleInterestAmount(double rate, double years) {

		double siamount = (this.balance * rate * years) / 100;
		System.out.println("Account No : " + this.acctNo + " | Name : " + this.name + " | SI Amount : " + siamount);
		return siamount;
	}

}
