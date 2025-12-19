import java.util.Scanner;

public class CompoundInterest {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        // A = P [1 + r/n]^nt
        double principal;
        double rate;
        int timesCompounded;
        int year;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();
        //System.out.println(principal);
        System.out.print("Enter the interst rate in %: ");
        rate = scanner.nextDouble()/100;
        //System.out.print("rate"+rate);
        System.out.print("Enter the number of times per year it is compounded: ");
        timesCompounded = scanner.nextInt();
        //System.out.print(timesCompounded);
        System.out.print("Enter the number of year: ");
        year = scanner.nextInt();
        //System.out.print(year);
        amount = principal * Math.pow(1 + rate/ timesCompounded, timesCompounded * year);
        System.out.printf("Amount after %d years is £%.2f", year, amount);


        scanner.close();
    }
}
