package unifiedPersonnelSystem;
//Employee Class
public class Employee extends Person 
{
	protected int employeeID;
	// Protected instance variable employeeID
	protected String department;
	// Protected instance variable department
	
	
	// Constructor for Employee class that takes name, department, and employeeID as parameters
	public Employee(String name, String department,int employeeID) 
	{
		super(name);
		// Calling the constructor of the parent class (Person) using super keyword
	    this.employeeID = employeeID;
	    // Assigning the passed employeeID parameter to the employeeID instance variable
	    this.department = department;
	    // Assigning the passed department parameter to the department instance variable
	}
	// Default constructor for Employee class
	public Employee() 
	{
		  super();
		  this.department = "";
		  this.employeeID = 0;
		  
	}
	// Accessors and mutators for employeeID and department
	public int getEmployeeID() 
	{
	    return employeeID;
	}

	public void setEmployeeID(int employeeID) 
	{
	    this.employeeID = employeeID;
	}

	public String getDepartment() 
	{
	    return department;
	}

	public void setDepartment(String department) 
	{
	    this.department = department;
	}

	// Method to write output for Employee class
	public void writeOutput() 
	{
		super.writeOutput();
		// Calling the writeOutput() method of the parent class (Person) using super keyword
	    System.out.println("Dept: " + department);
	    // Printing the department instance variable
	    System.out.println("Employee ID: " + employeeID);
	    // Printing the employeeID instance variable
	 	
	}
	// Method to reset the name, employeeID, and department
	public void reset() 
	{
	    super.reset();
	    department = "";
	    employeeID = 0;
	   
	}

	// Method to check if two Employee objects have the same name, employeeID, and department
	public boolean equals(Employee otherEmployee) 
	{
	    return super.equals(otherEmployee) &&
	    this.employeeID == otherEmployee.employeeID &&
	    this.department.equals(otherEmployee.department);
	}

	// Method to check if two Employee objects have the same name, employeeID, and department
	public boolean hasSameNameIDAndDept(Employee otherEmployee) 
	{
	    return equals(otherEmployee);
	}
}



