package unifiedPersonnelSystem;
//Person Class
public class Person 
{
	private int writeOutput;
	// Private instance variable writeOutput
	protected String name;
	// Protected instance variable name
	
	
	// Constructor for Person class that takes a name parameter
	public Person(String name) 
	{
		this.name = name;
		// Assigning the passed name parameter to the name instance variable
	}
	// Default constructor for Person class
	public Person()
	{
		this.name = "";
	}
	// Accessor and mutator for name
 public String getName() 
 {
     return name;
 }

 public void setName(String name) 
 {
     this.name = name;
 }
	    
	// Method to write output for Person class
	public void writeOutput() 
	{
		System.out.println("Name: " + name);
		// Printing the name instance variable
	}
	// Method to reset the name
 public void reset() 
 {
     name = "";
 }
 // Method to check if two Person objects have the same name
 public boolean equals(Person otherPerson) 
 {
     return this.name.equals(otherPerson.name);
 }
 // Method to check if two Person objects have the same name
 public boolean hasSameName(Person otherPerson) 
 {
     return equals(otherPerson);
 }

	// Method to get the value of writeOutput instance variable
	public int getwritePutput() 
	{
		return writeOutput;
		// Returning the value of writeOutput instance variable
	}
}
	


