/* 

 * Class: CMSC203  

 * Instructor: Professor Monshi

 * Description: (This assignment has 3 classes. My patient class holds the blueprint for
making patients and saving all their information. Also methods to create names. Then
my Procedure class is the blueprint to create and save all the information about the 
patients procedure. Then finally the Patient driver class allows me to create my objects
the constructors that have been created. Then I have methods that allow me to display all
the information that I've collected. Also displays the calculated total cost of the procedure.) 

 * Due: 09/21/23

 * Platform/compiler: Eclipse IDE

 * I pledge that I have completed the programming  

 * assignment independently. I have not copied the code  

 * from a student or any source. I have not given my code  

 * to any student. 

   Print your Name here: Iban Vasquez  

*/ 
public class PatientDriverApp {

	public static void main(String[] args) 
	{
			Patient pat1 = new Patient("Liana", "Zoe", "Zang", "11282 Rockwood Rd", "Potomac", "MD", "Robert Middleton", 20783, "240-289-2090", "301-328-3679");
			Procedure pro1 = new Procedure("X-Ray" , "08/20/2023", "Dr. Vasquez", 308.50);
			Procedure pro2 = new Procedure("Brain Scan", "09/13/2023", "Dr. Locket", 205.75);
			Procedure pro3 = new Procedure("Brain Surgery", "09/20/2023", "Dr. Karolokus", 3967.80);
			displayPatient(pat1);
			displayProcedure(pro1);
			displayProcedure(pro2);
			displayProcedure(pro3);
			System.out.println("\nTotal Charges: $" + calculateTotalCost(pro1, pro2, pro3));
			System.out.println("\nStudent Name: Iban Vasquez" + 
							   "\nMC#: M21113806" + 
							   "\nDue Date: 09/21/2023");
	}

		public static void displayPatient(Patient p)
		{
			System.out.println("Patient info:\n" +
					   "  Name: " + p.getfName() + " " + p.getmName() + " " + p.getlName() + "\n" +
					   "  Address: " + p.getStreet() + " " + p.getCity() + " " + p.getState() + " " + p.getZipcode()+ "\n" + 
					   "  Emergency Contact: " + p.geteName() + " " + p.geteNumber());
		}
		public static void displayProcedure(Procedure p)
		{
			System.out.println("\n\tProcedure: " + p.getName());
			System.out.println("\tProcedure Date = " + p.getDate());
			System.out.println("\tPractitioner = " + p.getPractitioner());
			System.out.println("\tCharge = " + p.getCharge());
			
		}

		public static double calculateTotalCost(Procedure p1, Procedure p2, Procedure p3)
		{
			double total = p1.getCharge() + p2.getCharge() + p3.getCharge();
			return total;
		}
	

}
