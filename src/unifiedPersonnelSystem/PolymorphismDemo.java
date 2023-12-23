/**
 * This programming project showcases the concept of polymorphism, 
 * emphasizing its practical application in an object-oriented context. 
 * The code demonstrates how objects of related classes—Person, Student, 
 * Undergraduate, Employee, Faculty, and Staff—can be seamlessly and 
 * interchangeably treated based on a common superclass. Through class hierarchy 
 * and inheritance, a unified structure is created, enabling objects of different 
 * classes to be treated uniformly as a common type, such as Person or Employee.

In practical terms, the project uses a for loop to iterate over an array of 
diverse objects, including those representing individuals with various roles 
within an educational or organizational setting. Despite their distinct class 
memberships, these objects are treated uniformly, invoking common methods like 
writeOutput. The project vividly illustrates how polymorphism allows objects of 
different classes to respond to the same method call based on shared 
characteristics, fostering code reusability and enhancing flexibility in 
object-oriented programming. This implementation serves as a valuable example 
of how polymorphism can simplify code structure and support the dynamic handling 
of diverse entities within a unified framework.
 */

package unifiedPersonnelSystem;
public class PolymorphismDemo
{ 
	public static void main(String[] args) 
	{	
		// Creating an array of Person objects
		Person[] people = new Person[21];
		// Initializing the array with objects of different classes
		people[0] = new Person("Smith, Ron");
		people[1] = new Undergraduate();
		people[2] = new Undergraduate("Kick, Anita", 9931, 2);
		people[3] = new Employee();
		people[4] = new Staff("Harvey, Patrick", "EECS", 4555, 20);
		people[5] = new Student();
		people[6] = new Staff();
		people[7] = new Person();
		people[8] = new Undergraduate("Bugg, June", 9901, 4);
		people[9] = new Student("DeBanque, Robin", 8812);
		people[10] = new Faculty("Thomas, Lawrence", "EECS", 6221, "Associate Professor");
		people[11] = new Faculty();
		people[12] = new Student("Rumbry, Jon", 9693);
		people[13] = new Employee("Deer, Bob", "CHEM", 4201);
		people[14] = new Faculty("Hobbs, Joe", "EECS", 4531, "Associate Chair");
		people[15] = new Employee("Shmo, Joe", "MAIN", 7824);
		people[16] = new Staff("Yawf, Len", "MECH", 8942, 28);
		people[17] = new Staff("Bruh, John", "ARTE", 2369, -2);
		people[18] = new Employee("Brando, Dio", "JOJO", 8945);
		people[19] = new Faculty("Hennen, Christie", "EECS", 9821, "Advisor");
		people[20] = new Undergraduate("Tired, Iam", 4532, 6);
		
		
		// Looping through the array and calling writeOutput() on each object
	    for (Person p : people) 
	    {
	    	p.writeOutput(); 
	        System.out.println();
	        // even though p is of type Person, the
	        // writeOutput method associated with
	        // Undergraduate or Student is invoked
	        // depending upon which class was used to
	        // create the object.
	    }
	}
}



