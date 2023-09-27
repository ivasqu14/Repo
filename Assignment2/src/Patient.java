
public class Patient {
	
	private String fName, mName, lName, street, city, state, eName, eNumber, number;
	private int zipcode;

	Patient()
	{
		fName = "";
		mName = "";
		lName = "";
		street = "";
		city = "";
		state = "";
		eName = "";
		zipcode = 0;
		number = "";
		eNumber = "";
	}
	
	Patient(String first, String middle, String last)
	{
		fName = first;
		mName = middle;
		lName = last;
		street = "";
		city = "";
		state = "";
		eName = "";
		zipcode = 0;
		number = "";
		eNumber = "";
	}
	
	Patient(String first, String middle, String last, String street, String city, String state, String eName, int zipcode, String number, String eNumber)
	{
		fName = first;
		mName = middle;
		lName = last;
		this.street = street;
		this.city = city;
		this.state = state;
		this.eName = eName;
		this.zipcode = zipcode;
		this.number = number;
		this.eNumber = eNumber;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String geteNumber() {
		return eNumber;
	}

	public void seteNumber(String eNumber) {
		this.eNumber = eNumber;
	}
	
	public String buildFullName(String first, String middle, String last)
	{
		return first + " " + middle + " " + last;
	}
	
	public String buildEmergencyContact(String name, int num)
	{
		return name + " " + num;
	}

	@Override
	public String toString() {
		return "Patient info\n" +
			   "Name: " + fName + " " + mName + " " + lName + "\n" +
			   "Address: " + street + " " + city + " " + state + " " + zipcode + "\n" + 
			   "Emergency Contact: " + eName + " " + eNumber;
	}
	
	
}
