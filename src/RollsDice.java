import java.util.Random;
import java.util.Scanner;

public class RollsDice {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //get number of dice from user
        int numOfDice;
        int total = 0;
        System.out.print("Enter number the number of dice to roll: ");
        numOfDice = scanner.nextInt();

        //greater than zero
        if (numOfDice > 0 ){
            //System.out.println("You roll the dice!");

            for (int i= 0; i <numOfDice;i++){
                // local var of roll for random num
                int roll = random.nextInt(1,7);

                //Call the method of printDie
                printDie(roll);
                System.out.println("You rolled: " + roll);
                total += roll;

            }
            System.out.println("Your total is: "+total);
        } else {
            System.out.println("Number of dice must be 1 or more!");
        }

        //Ascii of dice


        scanner.close();
    }
    //need method outside of the main method for the ascii art
    //it has one parameter, int roll
    static void printDie(int roll){
        String dice1 = """
                 -------
                |       |
                |   ♥   |
                |       |
                 -------
                """;

        String dice2 = """
                 -------
                | ♥     |
                |       |
                |     ♥ |
                 -------
                """;

        String dice3 = """
                 -------
                | ♥     |
                |   ♥   |
                |     ♥ |
                 -------
                """;

        String dice4 = """
                 -------
                | ♥   ♥ |
                |       |
                | ♥   ♥ |
                 -------
                """;

        String dice5 = """
                 -------
                | ♥   ♥ |
                |   ♥   |
                | ♥   ♥ |
                 -------
                """;

        String dice6 = """
                 -------
                | ♥   ♥ |
                | ♥   ♥ |
                | ♥   ♥ |
                 -------
                """;

        switch (roll){
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.print("Bad roll!");

        }

        //System.out.println(dice6);
    }
}
