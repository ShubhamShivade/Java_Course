


class Employee{
	int id; 
	int salary;
	String name;
	public void printDetails() {
		System.out.println("My id is "+id);
		System.out.println("and my name is "+ name);
	}
	public int getSalary() {
		return salary;
	}
}
public class Ch_24_Class_with_java_methods {

	
	public static void main(String[] args) {
		System.out.println("This is our custom class");
		Employee shubh = new Employee();// Instantiating a new Employee Object
		Employee john = new Employee();// Instantiating a new Employee Object
		
		// setting Attributes for shubh
		shubh.id=25;
		shubh.salary=35;
		shubh.name="Shubham";
		
		// setting Attributes for john
		john.id=17;
		john.salary=23;
		john.name="Harry Potter";
		
		// Printing the Attribuites
		shubh.printDetails();
		john.printDetails();
		int salary = john.getSalary();
		System.out.println(salary);
//		System.out.println(shubh.id);
//		System.out.println(shubh.name);

	}

}
