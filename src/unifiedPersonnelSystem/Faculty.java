package unifiedPersonnelSystem;

//Faculty Class
public class Faculty extends Employee 
{
	protected String title;
	// Protected instance variable title
	
	// Constructor for Faculty class that takes name, department, employeeID, and title as parameters
	public Faculty(String name, String department,int employeeID, String title) 
	{
		super(name, department,employeeID);
		// Calling the constructor of the parent class (Employee) using super keyword
	    this.title = title;
	    // Assigning the passed title parameter to the title instance variable
	 	
	}
	// Default constructor for Faculty class
	public Faculty() 
	{
		 super();
		 this.title = "";
	}
	// Accessor and mutator for title
	public String getTitle() 
	{
	    return title;
	}

	public void setTitle(String title) 
	{
	    this.title = title;
	}
	// Method to write output for Faculty class
  public void writeOutput() 
  {
  	super.writeOutput();
  	// Calling the writeOutput() method of the parent class (Employee) using super keyword
	    System.out.println("Title: " + title);
	    // Printing the title instance variable
	}
  // Method to reset the name, employeeID, department, and title
  public void reset() 
  {
      super.reset();
      title = "";
  }

  // Method to check if two Faculty objects have the same name, employeeID, department, and title
  public boolean equals(Faculty otherFaculty) 
  {
      return super.equals(otherFaculty) && this.title.equals(otherFaculty.title);
  }

  // Method to check if two Faculty objects have the same name, employeeID, department, and title
  public boolean hasSameNameIDDeptAndTitle(Faculty otherFaculty)
  {
      return equals(otherFaculty);
  }
  
}


