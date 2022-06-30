import java.util.Scanner;

public class Ch_05_Addition {

	public static void main(String[] args) {
		
		int a,b;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first Number ");
		a=input.nextInt();
		System.out.println("Your first number is "+a);
		System.out.println("Enter the Second Number");
		b=input.nextInt();
		System.out.println("Your Second Number is "+b);
		System.out.println("Addition of First and Second is "+(a+b));

	}

}
