package bikeproject;

public class Bike implements BikeParts {

	private String handleBars, frame, tyres, seatType;
	private int NumGears;
	private final String make;

	public Bike() {
		this.make = "Oracle Bikes";
	}// end constructor

	public Bike(String handleBars, String frame, String tyres, String seatType, int numGears) {
		this.handleBars = handleBars;
		this.frame = frame;
		this.tyres = tyres;
		this.seatType = seatType;
		NumGears = numGears;
		this.make = "Oracle Bikes";
	}// end constructor

	protected void printDescription() {
		System.out.println("\n" + this.make + "\n"
				+ "This bike has " + this.handleBars + " handlebars on a "
				+ this.frame + " frame with " + this.NumGears + " gears."
				+ "\nIt has a " + this.seatType + " seat with " + this.tyres + " tyres.");
	}// end method printDescription

	public String getHandleBars() {
		return this.handleBars;
	}// end method getHandleBars

	public void setHandleBars(String newValue) {
		this.handleBars = newValue;
	}// end method setHandleBars

	public String getFrame() {
		return this.frame;
	}

	public String getTyres() {
		return this.tyres;
	}// end method getsetTyres

	public void setTyres(String newValue) {
		this.tyres = newValue;
	}// end method setTyres

	public String getSeatType() {
		return this.seatType;
	}// end method getSeatType

	public void setSeatType(String newValue) {
		this.seatType = newValue;
	}// end method

	public int getNumGears() {
		return this.NumGears;
	}

}// end class Bike