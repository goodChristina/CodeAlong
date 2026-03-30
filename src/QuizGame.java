/*
        Java Quiz Game
        Steps

        Q's array[]
        Options - 2D array [][]
        Declare variables
        Welcome message
        Q's loop
              options
              get user guess
              check our guess
        Display final score
        (5:59)
 */

import java.util.Scanner;

public class QuizGame {
    static void main() {
        //Q's array[]
        String [] questions = {"Do poisonous butterflies exist?",
                                "Where do vanilla orchids originate from?",
                                "Who were the indigenous people of Japan?",
                                "When was Bitcoin launched?",
                                "What stars are in Orion's belt?"};
        //Options - 2D array [][]- need an array for each Q
        String [][] options = {{"1. No such thing!", "2. Yes, of course!"},
                                {"1. Africa", "2. The Americas", "3. South East Asia", "4. Western Europe"},
                                {"1. Ōkami", "2. Tora", "3. Ainu", "4. Kujira"},
                                {"1. 2003", "2. 2005", "3. 2009", "4. 2011"},
                                {"1. Alnitak, Alnilam, and Mintaka","2. Rhodos, Benthesikyme, and Kymopoleia","3. Calliope,  Clio, and Erato","4. Aquata, Arista, and Andrina"}};
        //Declare variables
        int[] answers = {2, 2, 3, 3, 1};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);
        //Welcome message
        System.out.println("**********************************************");
        System.out.println("*   WELCOME TO CHRISTINA'S GUESSING GAME     *");
        System.out.println("**********************************************");
        System.out.println();
        //Q's loop
        for(int i = 0; i < questions.length; i++){
            //test
            System.out.println(questions[i]);
            for(String option : options[i]){
                System.out.println(option);
            }

            //Guess from user
            System.out.println();
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            //check guess
            if (guess ==  answers[i]){
                System.out.println();
                System.out.println("CORRECT!");
                System.out.println();
                score++;
            }
            else{
                System.out.println();
                System.out.println("WRONG!");
                System.out.println();

            }
        }

        System.out.println("Your score is "+score +" out of " + questions.length + "!");

        scanner.close();
    }
}
