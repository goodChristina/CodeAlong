import java.util.Scanner;

public class Pizza {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '£';
        double total;

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();
        //System.out.println(item.toUpperCase());

        System.out.print("What is the price for each: ");
        price = scanner.nextDouble();
        //System.out.println(currency + "" + price);

        System.out.print("How many would you like?: ");
        quantity = scanner.nextInt();
        //System.out.println(quantity);

        total = price * quantity;
        //System.out.print(currency);
        //System.out.printf("%.2f", total);

        System.out.println("\nYou have bought "+ quantity + " "+item +"/s");
        System.out.println("Your total: " + currency + total);

        scanner.close();
    }
}
