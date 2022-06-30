
public class Ch_16_Arrays {

	public static void main(String[] args) {
		/* Class room of 500 students - You have to store marks of these 500 students you have 2 options:
		 1.create 500 variables
		 2. Use Arrays (recommended)
		 */
//		There are three main ways to create an array in java
//		1. Declaration annd memory allocation
//		int [] marks = new int[5];
		
//		2. Declaration and then memory allocation
//		int[] marks;
//		marks = new int[5];
////		Initialization
//		marks[0] = 100;
//		marks[1] = 60;
//		marks[2] = 70;
//		marks[3] = 90;
//		marks[4] = 89;
//		for(int i=0;i<marks.length;i++) {
//			
//		System.out.print(marks[i]+",");
//		}
		
//		3. Declaration, memory allocation and initialization together 
		int [] marks = {98, 45, 94, 80,44};
		System.out.println(marks.length);
		
//		marks[4] = 96;
		System.out.println(marks[4]);
	}

}
