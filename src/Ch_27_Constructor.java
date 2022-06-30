class Employees {
// First constructor
    Employees(String s, int i){
    	System.out.println("The id of the first employee is : " + i);
        System.out.println("The name of the first employee is : " + s);
    }
//    Constructor overloaded
    Employees(String s, int i, int salary){
    	System.out.println("The id of the second employee is : " + i);
        System.out.println("The name of the second employee is : " + s);
        System.out.println("The salary of second employee is : " + salary);
    }
}
    class MyMainEmployee{
	private int id;
	private String name;
	 
	public MyMainEmployee() {
		id=0;
		name="Your-Name-Here";
		
	}
	public MyMainEmployee(String myName, int myId) {
		id = myId;
		name = myName;
	}
	public MyMainEmployee(String myName) {
		id = 1;
		name = myName;
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		this.name= n;
	}
	public void setId(int id) {
		this.id= id;
	}
	public int getId() {
		return id;
	}
	
	
}
public class Ch_27_Constructor {

	public static void main(String[] args) {
		//MyMainEmployee shubh = new MyMainEmployee("ProgrammingLogic",23);
		MyMainEmployee shubh = new MyMainEmployee();
		shubh.setName("ShubhamShivade");
//		shubh.setId(55);
		System.out.println(shubh.getId());
		System.out.println(shubh.getName());
		
		Employees shubham = new Employees("Shubham",1);
        Employees harry = new Employees("Harry",2,70000);


	}

}
