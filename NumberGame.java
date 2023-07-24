import java.util.Scanner;
import java.util.Random;

public class NumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int minNumber = 1;
        int maxNumber = 100;
        int targetNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;
        int playerGuess;
        int attempts = 0;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between " + minNumber + " to " + maxNumber + ".");
        
        do {
            System.out.print("Enter your guess: ");
            playerGuess = scanner.nextInt();
            attempts++;
            
            if (playerGuess < targetNumber) {
                System.out.println("Too low! Guess again.");
            } else if (playerGuess > targetNumber) {
                System.out.println("Too high! Guess again.");
            } else {
                System.out.println("Congratulations! You guessed the number " + targetNumber + " correctly in " + attempts + " attempts!");
            }
        } while (playerGuess != targetNumber);
        
        scanner.close();
    }
}


		
		    
		        
	


