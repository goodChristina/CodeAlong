import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    static void main() {
        // Java Slot Machine

        //Declare variables
        //Welcome message
        //Play if there is a balance
        //Enter bet amount
        //      verify if bet is > balance
        //      verify if bet is > 0
        //      Subtract bet from balance
        //spin row
        //print emoji row
        //get payout
        //ask to play again
        //exit message

        //Declare variables
        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;

        //Welcome message
        System.out.println("✦✧✦✧✦✧✦✧✦✧✦✧✦✧✦✧✦✧✦✧✦✧✦✧✦✧✦✧✦✧✦✧✦");
        System.out.println("✦    WELCOME TO JAVA SLOTS      ✦");
        System.out.println("✦                               ✦");
        System.out.println("✦   Symbols:  🍋 🍉 ⭐ 🍒 🔔   ✦");
        System.out.println("✦✧✦✧✦✧✦✧✦✧✦✧✦✧✦✧✦✧✦✧✦✧✦✧✦✧✦✧✦✧✦✧✦");

        //Play if there is a balance/Enter bet
        while(balance > 0){
            System.out.println("Current balance: £" + balance);
            System.out.print("Place bet amount: £");
            bet = scanner.nextInt();
            scanner.nextLine(); //clears buffer so it doesn't exit

            if (bet > balance){
                System.out.println("INSUFFICIENT FUNDS!");
                continue;
            }
            else if(bet <= 0){
                System.out.println("Bet must be greater than zero!");
                continue;
            }
            else {
                balance -= bet;
                //System.out.println("Balance: £"+balance);
            }

            //Spin row
            System.out.println("Spinning ✧ ✧ ✧");
            row = spinRow();
            printRow(row);
            payout = getPayout(row, bet);

            //if you win
            if (payout > 0){
                System.out.println("\nYou won £"+ payout);
                balance += payout;
            } else {
                System.out.println("\nSorry, you lost this round!");
            }
            //play again
            System.out.print("\nWould you like to play again? (Y/N): ");
            playAgain = scanner.nextLine().toUpperCase();
            if (!playAgain.equals("Y")){
                break;
            }
        }
        System.out.println("✦✧✦✧✦✧✦✧✦✧✦✧✦✧✦✧✦✧✦✧✦✧✦✧✦");
        System.out.println("\n\tGAME OVER\n\nYour final balance is: £"+balance);
        System.out.println();
        System.out.println("✦✧✦✧✦✧✦✧✦✧✦✧✦✧✦✧✦✧✦✧✦✧✦✧✦");

        scanner.close();
    }

    //making the spinner
    static  String[] spinRow(){

        String[] symbols = {"🍋", "🍉", "⭐", "🍒", "🔔"};
        String[] row = new String[3];
        Random random = new Random();
        //System.out.println(symbols[4]);
        //System.out.println(symbols[random.nextInt(symbols.length)]);

        for(int i = 0; i < 3;i ++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        //System.out.println(row[0]+ row[1] +row[2]);

        // need array just to return something
        //return new String[0];
        return row;
    };
    static void printRow(String[] row){
        System.out.println("✦✧✦✧✦✧✦✧✦✧✦✧✦✧✦✧✦✧✦");
        System.out.println(" " + String.join("  |  ", row));
        System.out.println("✦✧✦✧✦✧✦✧✦✧✦✧✦✧✦✧✦✧✦");

    }

    //Get payout
    static int getPayout(String[] row, int bet){

        //check matches, can't use ==
        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch(row[0]){
                case "🍋" -> bet * 3;
                case "🍉" -> bet * 4;
                case "⭐" -> bet * 5;
                case "🍒" -> bet * 10;
                case "🔔" -> bet * 20;
                default -> 0;
            };
        }

        else if(row[0].equals(row[1])) {
            return switch (row[0]) {
                case "🍋" -> bet * 2;
                case "🍉" -> bet * 3;
                case "⭐" -> bet * 4;
                case "🍒" -> bet * 5;
                case "🔔" -> bet * 10;
                default -> 0;
            };
        }
        else if(row[1].equals(row[2])) {
            return switch (row[1]) {
                case "🍋" -> bet * 2;
                case "🍉" -> bet * 3;
                case "⭐" -> bet * 4;
                case "🍒" -> bet * 5;
                case "🔔" -> bet * 10;
                default -> 0;
            };
        }
        return 0;
    }
}
