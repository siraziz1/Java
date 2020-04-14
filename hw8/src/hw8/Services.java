package hw8;

import java.text.DecimalFormat;
public class Services extends Account {

	final DecimalFormat df = new DecimalFormat("0.00");
	 int numberOfHours;
	 double ratePerHour;

	 
	
	public Services(int id, int numberOfHours, double ratePerHour) {
		super(id);
		this.numberOfHours = numberOfHours;
		this.ratePerHour = ratePerHour;
	}

	public Services(int id) {
		super (id);
		numberOfHours = 0;
		ratePerHour = 0;
	}

	public Services() {
		// TODO Auto-generated constructor stub
	}

	public double getRatePerHour() {
		return ratePerHour;
	}

	public int getNumberOfHours() {
		return numberOfHours;
	}

	public void setNumberOfHours(int numberOfHours) {
		this.numberOfHours = numberOfHours;
	}

	public void setRatePerHour(double ratePerHour) {
		this.ratePerHour = ratePerHour;
	}

	public double calculateSales() {
		return getNumberOfHours() * getRatePerHour();
	}

	
	@Override
	public String toString() {
		return super.toString() + ", Rate/hour: $" + df.format(getRatePerHour()) + ", Hours worked: " + getNumberOfHours()
				+ ", Total Income: $" + df.format(calculateSales());
	}
}