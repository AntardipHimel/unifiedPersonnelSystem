package unifiedPersonnelSystem;

//Undergraduate Class
public class Undergraduate extends Student 
{
	protected int level;
	// Protected instance variable level
	
	// Constructor for Undergraduate class that takes name, studentID, and level as parameters
 public Undergraduate(String name, int studentID, int level) 
 {
 	 super(name, studentID);
 	 // Calling the constructor of the parent class (Student) using super keyword
      this.level = level;
      // Assigning the passed level parameter to the level instance variable
 }
 // Default constructor for Undergraduate class
 public Undergraduate() 
 {
 	 super();
     this.level = 0;
 }
 // Accessor and mutator for year
 public int getYear() 
 {
     return level;
 }

 public void setYear(String year) 
 {
     this.level = level;
 }


 // Method to write output for Undergraduate class
 public void writeOutput() 
 {
     super.writeOutput();
     // Calling the writeOutput() method of the parent class (Student) using super keyword
     System.out.println("Student Level: " + level);
     // Printing the level instance variable
 
 }

 // Method to reset the name, studentID, and year
 public void reset() 
 {
     super.reset();
     level = 0;
 }
 // Method to check if two Undergraduate objects have the same name, studentID, department, and level
 public boolean equals(Undergraduate otherUndergrad) 
 {
     return super.equals(otherUndergrad) && this.level == otherUndergrad.level;
 }

 // Method to check if two Undergraduate objects have the same name and level
 public boolean hasSameNameAndLevel(Undergraduate otherUndergrad) 
 {
     return super.getName().equals(otherUndergrad.getName()) && this.level == otherUndergrad.level;
 }


}

