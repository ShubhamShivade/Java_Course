
class Employee2 {
//	private int id;
//	private String name;
	int id;
	String name;
}
public class Ch_25_Acess_modifiers {
	
	public static void main(String[] args) {
		Employee2 emp1= new Employee2();
		emp1.id=3;
		emp1.name="Shubham";
		System.out.println(emp1.id);
		System.out.println(emp1.name);

	}

}
