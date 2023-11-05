import java.util.Objects;

public class ManagementCompany {

	private static final int MAX_PROPERTY = 5;
	
	private static final int MGMT_DEPTH = 10;
	
	private static final int MGMT_WIDTH = 10;
	
	private String name, taxID;
	private double mgmFeePer;
	private Plot plot;
	private Property[] prop = new Property[MAX_PROPERTY];
	private int numProperties = 0;
	
	ManagementCompany()
	{
		name = "";
		taxID = "";
		mgmFeePer = 0;
		plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
	}
	
	ManagementCompany(String name, String taxID, double mgmFee)
	{
		this.name = name;
		this.taxID = taxID;
		this.mgmFeePer = mgmFee;
		 plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
	}
	
	ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth)
	{
		this.name = name;
		this.taxID = taxID;
		this.mgmFeePer = mgmFee;
		plot = new Plot(x, y, width, depth);
	}
	
	
	ManagementCompany(ManagementCompany other)
	{
		this.name = other.getName();
		this.taxID = other.getTaxID();
		this.mgmFeePer = other.getMgmFeePer();
		plot = new Plot(other.getPlot());
	}

	public int addProperty(String name, String city, double rent, String owner)
	{
		return addProperty(new Property(name, city, rent, owner));
	}
	public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth)
	{
		return addProperty(new Property(name, city, rent, owner, x, y, width, depth));
	}
	
	public int addProperty(Property property)
	{
		
		if(this.isPropertiesFull())
		{
			return -1;
		}
		if(property == null)
		{
			return -2;
		}
		if((plot.encompasses(property.getPlot())) == false)
		{
			return -3;
		}
		
		for(int i = 0; i < numProperties; i++)
		{
			if(property.getPlot().overlaps(prop[i].getPlot()))
			{
				return -4;
			}
		}
		prop[numProperties] = new Property(property);
		numProperties++;
		return numProperties -1;
	}
	
	public void removeLastProperty()
	{
		if(numProperties > 0)
		{
			prop[numProperties] = null;
			numProperties--;
		}
		
	}
	
	public boolean isPropertiesFull()
	{
		boolean flag = false;
		
		if(numProperties >= 4)
		{
			flag = true;
		}
		else 
		{
			flag = false;
		}
		return flag;
	}
	
	public int getPropertiesCount()
	{
		return numProperties;
	}
	
	public double getTotalRent()
	{
		double rent = 0;
		for(int i = 0; i < numProperties; i++)
		{
			rent += prop[i].getRentAmount();
		}
		return rent;
	}
	
	public Property getHighestRentProperty()
	{
		double num = -1;
		int element = 0;
		for(int i = 0; i < numProperties; i++)
		{
			if(prop[i].getRentAmount() > num)
			{
				num = prop[i].getRentAmount();
				element = i;
			}
		}
		return prop[element];
		
	}
	
	public boolean isManagementFeeValid()
	{
		boolean flag = false;
		
		if(this.mgmFeePer >= 0 && this.mgmFeePer <= 100)
		{
			flag = true;
		}
		
		return flag;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTaxID() {
		return taxID;
	}

	public void setTaxID(String taxID) {
		this.taxID = taxID;
	}

	public double getMgmFeePer() {
		return mgmFeePer;
	}

	public void setMgmFeePer(double mgmFeePer) {
		this.mgmFeePer = mgmFeePer;
	}

	public Plot getPlot() {
		return plot;
	}

	public void setPlot(Plot plot) {
		this.plot = plot;
	}
	
	
	public Property[] getProperties()
	{
		return prop;
	}
	
	@Override
	public String toString()
	{
		String line;
		String loop = "";
		String line2 = "";
		line = "List of the properties for "+  this.name +  ", taxID: " + this.taxID + "\n"
				+ "______________________________________________________\n";
		
		for(int i = 0; i < numProperties; i++)
		{
			loop += prop[i].toString() + "\n";
					
		}
		
		line2 += "______________________________________________________\n"
				+"\n"
				+ " total management Fee: "  + (getTotalRent() * this.mgmFeePer) / 100;
		
		return line + loop + line2;
	}
	
	
}
