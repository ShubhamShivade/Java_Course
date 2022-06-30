class Base{
	public int x;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		System.out.println("I am in base and setting x now");
		this.x=x;
	}
	public void printMe() {
		System.out.println("I am a constructor");
	}
	
}

class Derived extends Base{
	public int y;
	
	public int getY() {
		return y;
		
	}
	public void setY(int y) {
		this.y= y;
	}
	
}
public class Ch_29_Inheritance {

	public static void main(String[] args) {
		//Creating an Object of base class
		
		Base b = new Base(); // Create an object from base class
		b.setX(4); // we set the values of x but we can not set the value of Y
		System.out.println(b.getX());
		
//		Creating an object of derived class
		Derived d = new Derived(); // Created an Object form Derived class which is extends form the base Class
		d.setY(43);  // we can set the value of y
		d.setX(22);	 // we can set the value of x because of the we extend the class from the class base
		System.out.println(d.getY());
		System.out.println(d.getX());

	}

}
