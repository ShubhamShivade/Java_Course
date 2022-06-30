import java.util.Random;
import java.util.Scanner;

public class Ch_26_Rock_Paper_Scissor {

	public static void main(String[] args) {

//		0 for Rock
//		1 for Paper
//		2 for Scissor
//		3 for Exit
		
		Scanner sc= new Scanner(System.in);
		boolean loop=true;
		while(loop) {
			System.out.println("Enter \n\t 0 - Rock\n\t 1 - Paper\n\t 2 - Scissor\n\t 3 - Exit");
			int userInput = sc.nextInt();
			
			Random random = new Random();
			int computerInput = random.nextInt(3);
			
			if(userInput == computerInput) {
				System.out.println("Draw");
			}
			else if(userInput ==0 && computerInput == 2 || userInput == 1 && computerInput==0 || userInput == 2 && computerInput ==1) {
			System.out.println("You Win!");
			}
			else {
				System.out.println("Computer Win!");
			}
			System.out.println("Computer choice: "+ computerInput);
			
			if(userInput==0) {
				System.out.println("Your choice: Rock");
			}
			else if(userInput == 1) {
				System.out.println("Your choice: Paper");
			}
			else if(userInput == 2) {
				System.out.println("Your choice: Scissors");
			}
			if(computerInput==0) {
				System.out.println("Computer choice: Rock");
			}
			else if(computerInput == 1) {
				System.out.println("Computer choice: Paper");
			}
			else if(computerInput == 2) {
				System.out.println("Computer choice: Scissors");
			}
		
		if(userInput==3) {
			loop=false;
			System.out.println("Exit the game...");
			}
		}
	}
}


