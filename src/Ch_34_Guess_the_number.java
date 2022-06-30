import java.util.Random;
import java.util.Scanner;

//Create a class Game, which allows a user to play "Guess the Number" game once.
//
//Game should have the following methods:
//Constructor to generate the random number
//takeUserInput() to take a user input of number
//isCorrectNumber() to detect whether the number entered by the user is true
//getter and setter for noOfGuesses
//Use properties such as noOfGuesses(int), etc to get this task done!

class Game{
	public int number;
	public int inputNumber;
	public int noOfGuesses = 0;
	
	public int getNoOfGuesses() {
		return noOfGuesses;
	}
	
	public void setNoOfGuesses(int noOfGuesses) {
		this.noOfGuesses= noOfGuesses;
	}
	
	Game(){
		Random rand = new Random();
		this.number = rand.nextInt(100);
	}
	
	void takeUserInput() {
		System.out.println("Guess the number");
		Scanner sc = new Scanner(System.in);
		inputNumber = sc.nextInt();
	}
	boolean isCorrectNumber() {
		noOfGuesses++;
		if(inputNumber == number) {
			System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, noOfGuesses);
		return true;
		}
		else if(inputNumber<number) {
			System.out.println("Too low... ");
		}
		else if(inputNumber>number) {
			System.out.println("Too high... ");
		}
		return false;
	}
}
public class Ch_34_Guess_the_number {

	public static void main(String[] args) {
 /*
            Create a class Game, which allows a user to play "Guess the Number"
            game once. Game should have the following methods:
            1. Constructor to generate the random number
            2. takeUserInput() to take a user input of number
            3. isCorrectNumber() to detect whether the number entered by the user is true
            4. getter and setter for noOfGuesses
            Use properties such as noOfGuesses(int), etc to get this task done!
         */
		boolean s=true;
		while(s) {
			Game g = new Game();
			boolean b = false;
			while(!b) {
				g.takeUserInput();
				b = g.isCorrectNumber();
			}
			System.out.println("Please \"e\" for Exit the game");
			Scanner sc= new Scanner(System.in);
			char c = sc.next().charAt(0);
			if(c=='e' || c=='E'){
				s=false;
				System.out.println("\nExit the game......");
			}
			else {
				s=true;
			}
		}
		
	}

}
