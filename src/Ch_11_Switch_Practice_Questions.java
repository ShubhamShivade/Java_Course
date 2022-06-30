import java.util.Random;
import java.util.Scanner;

//Question 1 : What will be the output of this program: 
//
//int a = 10;
//if (a=11)
//        System.out.println(“I am 11”);
//else
//        System.out.println(“I am not 11”);
//Question 2: Write a program to find out whether a student is pass or fail; if it requires a total of 40% and at least 33% in each subject to pass. Assume 3 subjects and take marks as input from the user.
//
//Question 3 :Calculate income tax paid by an employee to the government as per the slabs mentioned below:
//
//Income Slab	Tax
//2.5L – 5.0L  	5%
//5.0L – 10.0L 	20%
//Above 10.0L	30%
//Note that there is not tax below 2.5L. Take the input amount as input from the user.
//
//Question 4: Write a Java program to find out the day of the week given the number [1 for Monday, 2 for Tuesday … and so on!]
//
//Question 5:Write a Java program to find whether a year entered by the user is a leap year or not.
//
//Question 6:Write a program to find out the type of website from the URL:
//
//.com – commercial website
//.org – organization website
//.in – Indian website
public class Ch_11_Switch_Practice_Questions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Question 1:
//			int a = 11;
//		if(a=11) {
//			
//		}
		
			
//		Question 2:
//		boolean x= true;
//		while(x) {
//		byte m1,m2,m3;
//		System.out.println("Enter Your marks in Physics");
//		m1=sc.nextByte();
//		System.out.println("Enter your marks in Chemistry");
//		m2 = sc.nextByte();
//		System.out.println("Enter Your marks in Mathematics");
//		m3= sc.nextByte();
//		float avg=(m1+m2+m3)/3.0f;
//		System.out.println("Your Overall percentage is:  "+avg);
//		if(avg>=40 && m1>=33 && m2>=33 && m3>=33) {
//			System.out.println("Congratulations, you have been promoted");
//			x=false;
//			
//		}
//		else {
//			System.out.println("Sorry, You have not bee promoted ! Please try again later");
//			
//		}
//		}
		
		
		// Question 3
//		boolean t=true;
//		while(t) {
//			System.out.println("Enter you income in Lakhs per annum");
//			float tax=0;
//			float income =sc.nextFloat();
//			if(income<=2.5) {
//				tax = tax+0;
//				
//			}
//			else if(income>2.5f && income<5f) {
//				tax = tax+0.05f * (income - 2.5f);
//			}
//			else if(income>5f && income<=10.0f) {
//				tax = tax+0.05f*(income - 2.5f);
//				tax = tax+0.2f*(income - 5f);
//			}
//			else if(income>10.0f) {
//				tax = tax+ 0.05f*(income - 2.5f);
//				tax = tax+ 0.2f*(10.0f-5f);
//				tax = tax+0.3f*(income - 10.0f);
//				
//			}
//			System.out.println("The total tax paid by the employee is : "+tax);
//			System.out.println("The total income save the employees is : "+(income-tax));
//			System.out.println("\nIf you want to exit the tax Calculator then Enter the 'E'or 'e' ");
//			char T= sc.next().charAt(0);
//			
//			if(T=='e'|| T=='E') {
//				t=false;
//			}
//			
//		}
//		System.out.println("Now you are Out from the tax Calculator");
		
		
		//Problem 5
//		System.out.println("Enter the Day ");
//		int day = sc.nextInt();
//		switch(day) {
//		
//		case 1 ->System.out.println("Monday");
//		case 2 ->System.out.println("Tuesday");
//		case 3 ->System.out.println("Wednesday");
//		case 4 ->System.out.println("Thursday");
//		case 5 ->System.out.println("Friday");
//		case 6 ->System.out.println("Saturday");
//		case 7 ->System.out.println("Sunday");
//		}
		
		
		//Problem 6
//		boolean loop=true;
//		while(loop) {
//			System.out.print("Enter a website URL ");
//			String str = sc.nextLine();
//			if(str.endsWith(".com")) {
//				System.out.println("The website is commercial ");
//			}
//			else if(str.endsWith(".org")) {
//				System.out.println("The website is organization ");
//			}
//			else if(str.endsWith(".in")) {
//				System.out.println("The website is Indian");
//			}
//			else {
//				System.out.println("The site is others community");
//				loop=false;
//			}
//		}

			
		Random r = new Random();
		int a = r.nextInt();
		System.out.println(a);
	}
}
