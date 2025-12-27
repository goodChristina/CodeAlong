import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    static void main() {

        //Guess the number kind of game
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int randomNumber = random.nextInt(1,11); //range

        //System.out.println(randomNumber);
        System.out.println("Number Guessing Game!");
        System.out.println("Guess a number between 1-10: ");

        do{
            System.out.print("Guess a number: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber){
                System.out.println("Too low!");
            } else if (guess > randomNumber){
                System.out.println("Too high!");
            }
            else {
                System.out.printf("Correct! The number was %d!", randomNumber);
                System.out.printf("\nIt took you %d attempts.", attempts);
            }

        } while(guess != randomNumber);

        scanner.close();
    }
}
