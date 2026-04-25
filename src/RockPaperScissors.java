import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    static void main() {
        //Game
        //Get user choice
        // Get random choice from computer
        // Check conditions
        // Who won?
        // Play again?

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //Choices
        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;

        //Play Again, need while loop
        String playAgain = "yes";

        do {        //Get choice from user
            System.out.print("Enter your move (rock, paper or scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissors")) {
                System.out.println("Invalid choice!");
                continue;
            }

            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice: " + computerChoice);

            //Win conditions
            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                    playerChoice.equals("scissors") && computerChoice.equals("paper")) {
                System.out.println("You win!");
            } else {
                System.out.println("Sorry. You lose!");
            }

            //play again?
            System.out.print("Do you want to play again? yes/no: ");
            playAgain = scanner.nextLine().toLowerCase();

        } while(playAgain.equals("yes"));
        System.out.println();
            System.out.println("GAME OVER");


        scanner.close();
    }
}
