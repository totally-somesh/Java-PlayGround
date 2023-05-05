package Definition;

public enum AccType {

	/*
	 * // SAVING { // @Override // public double minBal() { // minBalance=1000; // }
	 * // // }; // CURRENT{ // // @Override // public double minBal() { //
	 * minBalance = 1000; // } // // };FD{ // // @Override // public double minBal()
	 * { // minBalance = 1000; // } // // };DMAT{@Override // public double minBal()
	 * { // minBalance = 1000; // } // // }; // // private AccType(double
	 * minBalance) { // this.minBalance = minBalance; // }
	 */
	
	SAVING(1000), CURRENT(5000), FD(2000), DMAT(10000);
	
	private double minBalance;

	private AccType(double minBalance) {
		this.minBalance = minBalance;
	}
	
	public String toString()
	{
		return name() + " : " +minBalance;
	}

	public double getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}
}
