//1.Create a class Employee with the following properties and methods:
//Salary (property) (int)
//getSalary (method returning int)
//name (property) (String)
//getName (method returning String)
//setName (method changing name)
//2.Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.
//3.Create a class Square with a method to initialize its side, calculating area, perimeter etc.
//4.Create a class Rectangle & problem 3.
//5.Create a class TommyVecetti for Rockstar Games capable of hitting (print hitting…), running, firing, etc.
//6.Repeat problem 4 for a circle.

class Employee1{
	int salary;
	String name;
	
	public int getSalary() {
		return salary;
	}
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name=name;
	}
	
}
class CellPhone{
	public void ring() {
		System.out.println("Ringging....");
	}
	public void vibrate() {
		System.out.println("Vibrating.....");
	}
	public void callFriend() {
		System.out.println("Calling  Harry Potter.....");
	}
}

class Square{
	int side;
	public int area() {
		return side*side;
	}
	public int perimeter() {
		return 4*side;
	}
}

class Tommy	{
	public void hit() {
		System.out.println("Hitting the enemy");
	}
	public void run() {
		System.out.println("Running from the enemy");
	}
	public void fire() {
		System.out.println("Firing on the enemy");
	}
}

public class Ch_24_OOPs_Question {

	public static void main(String[] args) {
		//Problem 1
//		Employee1 shubh = new Employee1();
//		shubh.setName("Shubham");
//		shubh.salary=333;
//		System.out.println(shubh.getSalary());
//		System.out.println(shubh.getName());
		
		//Problem 2
//		CellPhone mi = new CellPhone();
//		mi.callFriend();
//		mi.vibrate();
//		mi.ring();
		
		//Problem 3
//		Square sq = new Square();
//		sq.side=3;
//		System.out.println(sq.area());
//		System.out.println(sq.perimeter());
		
		//Problem 5
		Tommy player1= new Tommy();
		player1.fire();
		player1.run();
		player1.hit();

	}

}
