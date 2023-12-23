package unifiedPersonnelSystem;

//Graduate Class
public class Graduate extends Student 
{
	protected int level;
	// Protected instance variable level
	
	// Constructor for Graduate class that takes name, studentID, and level as parameters
	public Graduate(String name, int studentID, int level) 
	{
		super(name, studentID);
		// Calling the constructor of the parent class (Student) using super keyword
	    this.level = level;
	    // Assigning the passed level parameter to the level instance variable
	 	
	}
	// Default constructor for Graduate class
	public Graduate() 
	{
		super();
     this.level = 0;
	}
	// Method to write output for Graduate class
	public void writeOutput() 
	{
		super.writeOutput();
		// Calling the writeOutput() method of the parent class (Student) using super keyword
	    System.out.println("Student Level: " + level);
	    // Printing the level instance variable
	}
}


