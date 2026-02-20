import java.util.Scanner;

public class UserInputArray {
    static void main() {
        //need to know size of array beforehand


        Scanner scanner = new Scanner(System.in);

        //User enters the number of food
        String[] foods;
        int size;

        System.out.print("Enter the number of food you want: ");
        size = scanner.nextInt();
        //clear buffer because of the string scanner below
        scanner.nextLine();

        foods = new String[size];


        //Empty array that has space for 4
        //String[] foods = new String[4];
        //foods[0] = "pizza";
        //foods[1] = "taco";
        //foods[2] = "hamburger";

        //making the array
        for(int i = 0; i < foods.length; i++){
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        for (String food : foods){
            System.out.println(food);
        }



        scanner.close();
    }
}
