import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    static void main() {

        //Guess the number kind of game
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min,max + 1); //range

        //System.out.println(randomNumber);
        System.out.println("Number Guessing Game!");
        System.out.printf("Guess a number between %d-%d:\n ", min , max);

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
