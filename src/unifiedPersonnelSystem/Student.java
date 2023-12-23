package unifiedPersonnelSystem;

//Student Class
public class Student extends Person 
{
	protected int studentID;
	// Protected instance variable studentID
	
	// Constructor for Student class that takes name and studentID as parameters
	public Student(String name, int studentID) 
	{
		super(name);
		// Calling the constructor of the parent class (Person) using super keyword
	    this.studentID = studentID;
	    // Assigning the passed studentID parameter to the studentID instance variable
	}
	// Default constructor for Student class
	public Student() 
	{
		super();
     int studentID = 0;
	}
	// Accessor and mutator for studentID
 public int getStudentID() 
 {
     return studentID;
 }

 public void setStudentID(int studentID) 
 {
     this.studentID = studentID;
 }
 // Method to reset the name and studentID
 public void reset() 
 {
     super.reset();
     studentID = 0;
     
 }

 // Method to check if two Student objects have the same name, studentID, and department
 public boolean equals(Student otherStudent) 
 {
     return super.equals(otherStudent) && this.studentID == otherStudent.studentID ;
 }

 // Method to check if two Student objects have the same name and studentID
 public boolean hasSameID(Student otherStudent) 
 {
     return equals(otherStudent);
 }
	// Method to write output for Student class
	public void writeOutput() 
	{
		super.writeOutput();
		// Calling the writeOutput() method of the parent class (Person) using super keyword
	    System.out.println("Student Number: " + studentID);
	    // Printing the studentID instance variable
	 	
	}
}
	


