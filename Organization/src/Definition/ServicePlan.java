package Definition;

public enum ServicePlan {

	SILVER(1000), GOLD(2000), DIAMOND(5000), PLATINUM(10000);

	@SuppressWarnings("unused")
	private double plancost;

	private ServicePlan(double plancost) {
		this.plancost = plancost;
	}

	public double getPlancost() {
		return plancost;
	}

	public void setPlancost(double plancost) {
		this.plancost = plancost;
	}

	@Override
	public String toString() {
		return name() + " : " + plancost;  //name() returns the constant values of the enum.

	}

}
