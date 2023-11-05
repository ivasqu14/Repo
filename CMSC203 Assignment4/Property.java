
public class Property {
	
	private String propertyName, city, owner;
	private double rentAmount;
	private Plot plot;
	
	Property()
	{
		propertyName = "";
		city = "";
		owner = "";
		rentAmount = 0;
		plot = new Plot();
	}
	
	Property(String name, String city, double rent, String owner)
	{
		this.propertyName = name;
		this.city = city;
		this.rentAmount = rent;
		this.owner = owner;
		plot = new Plot();
	}
	Property(String name, String city, double rent, String owner, int x, int y, int width, int depth)
	{
		this.propertyName = name;
		this.city = city;
		this.rentAmount = rent;
		this.owner = owner;
		plot = new Plot(x, y, width, depth);		
	}
	Property(Property otherProperty)
	{
		this.propertyName = otherProperty.getPropertyName();
		this.city = otherProperty.getCity();
		this.rentAmount = otherProperty.getRentAmount();
		this.owner = otherProperty.getOwner();
		plot = new Plot(otherProperty.getPlot());
	}
	
	

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getRentAmount() {
		return rentAmount;
	}

	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}

	public Plot getPlot() {
		return plot;
	}

	public void setPlot(Plot plot) {
		this.plot = plot;
	}

	@Override
	public String toString()
	{
		return this.propertyName + "," + this.city + "," + this.owner + "," + this.rentAmount;
	}
	
}
