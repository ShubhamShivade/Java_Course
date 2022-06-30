
public class Ch_19_Methods_in_java {
	
	static int logic(int x, int y) {
		int z;
		if(x>y) {
			z=x+y;
		}
		else {
			z=(x+y)*5;
		}
//		x=566;
		return z;
	}
	
	public static void main(String[] args) {
		int a = 5;
		int b= 7;
		int c;
		// Method invocation using Object creation
		// Ch_19_Methods_in_java obj = new Ch_19_Methods_in_java();
		//c =obj.logic(a,b);
		c=logic(a,b);
		System.out.println(a+" "+b);
		System.out.println(c);
		int a1= 2;
		int b1= 1;
		System.out.println(a1+" "+b1);
		int c1;
		c1= logic(a1,b1);
		System.out.println(c1);

	}

}
