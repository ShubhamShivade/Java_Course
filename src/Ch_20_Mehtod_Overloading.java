
public class Ch_20_Mehtod_Overloading {
	
	static void foo() {
		System.out.println("Good Morning bro!");
	}
	

	static void foo(int a) {
		System.out.println("Good Morning "+a+"bro!");
	}
	
	static void foo(int a , int b) {
		System.out.println("Good Morning "+a+"bro!");
		System.out.println("Good Morning "+b+"bro!");
	}
	
	static void foo(int a, int b, int c) {
		System.out.println("Good Morning "+a+"bro!");
		System.out.println("Good Morning "+b+"bro!");
		System.out.println("Good Morning "+c+"bro!");	
	}
	
	
	static void change2(int [] arr) {
		arr[0] = 98;
	}

	 static void change1(int a) {
		a = 98;
	}
	static void td(int t) {
		t=993;
	}
	static void tellJoke() {
		System.out.println("I invented a new word!\n"+ "Plagiarism!");
	}
	
	public static void main(String[] args) {
		
		tellJoke();
		
		// Case 1: Changing the Integer
		int p = 4;
		change1(p);
		System.out.println("The value of the p after running change is " + p);
		int x = 45;
		x=50;
        td(4);
        System.out.println("The value of x after running change is: " + x);

		
//		Case 1: Changing the Array
         int [] marks = {52, 73, 77, 89, 98, 94};
         change2(marks);
         System.out.println("The value of x after running change is: " + marks[0]);


	}

}
