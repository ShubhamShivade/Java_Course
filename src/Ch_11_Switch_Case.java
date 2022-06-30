
public class Ch_11_Switch_Case {
	public static void main(String[] args) {
		String var = "Shubham";
		
		switch(var) {
		case "Yug" ->{
			System.out.println("You are going to become an Adult!");
		}
		case "Shubham"->System.out.println("You are going to join a Job!");
		case "Vishaka"->System.out.println("You are going to get promotion!");
		default -> System.out.println("Enjoy Your Life!");
		}
        System.out.println("Thanks for using my Java Code!");


        /*
        int age;
        System.out.println("Enter Your Age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age>56){
            System.out.println("You are experienced!");
        }
        else if(age>46){
            System.out.println("You are semi-experienced!");
        }
        else if(age>36){
            System.out.println("You are semi-semi-experienced!");
        }
        else{
            System.out.println("You are not experienced");
        }
        if(age>2){
            System.out.println("You are not a baby!");
        }
        */
	}

}
