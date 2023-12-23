package unifiedPersonnelSystem;

//Staff Class
public class Staff extends Employee 
{
	protected int payGrade;
	// Protected instance variable payGrade
	
	// Constructor for Staff class that takes name, department, employeeID, and payGrade as parameters
	public Staff(String name, String department,int employeeID, int payGrade) 
	{
		super(name, department,employeeID);
		// Calling the constructor of the parent class (Employee) using super keyword
		this.payGrade = payGrade;
		// Assigning the passed payGrade parameter to the payGrade instance variable
	}
	// Default constructor for Staff class
	public Staff() 
	{
		 super();
		 this.payGrade = 0;
	}
	// Accessor and mutator for payGrade
	public int getPayGrade() 
	{
	    return payGrade;
	}

	public void setPayGrade(int payGrade) 
	{
	    this.payGrade = payGrade;
	}
	// Method to write output for Staff class
	public void writeOutput() 
	{
		super.writeOutput();
		// Calling the writeOutput() method of the parent class (Employee) using super keyword
	    if(payGrade > 0 && payGrade <= 20) 
	    { 
	    	System.out.println("Pay Grade: " + payGrade);
	    	// Printing the payGrade instance variable if it is within valid range
	    }
	    else
	    {
	    	System.out.println("Pay Grade: 0");
	    	// Printing 0 if the payGrade instance variable is not within valid range
	    }
	}
	// Method to reset the name, employeeID, department, and payGrade
	public void reset() 
	{
	    super.reset();
	    payGrade = 0;
	}

	// Method to check if two Staff objects have the same name, employeeID, department, and payGrade
	public boolean equals(Staff otherStaff) 
	{
	    return super.equals(otherStaff) && this.payGrade == otherStaff.payGrade;
	}

	// Method to check if two Staff objects have the same name, employeeID, department, and payGrade
	public boolean hasSameNameIDDeptAndPayGrade(Staff otherStaff) 
	{
	    return equals(otherStaff);
	}
}


