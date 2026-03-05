import java.util.Scanner;

public class SearchElementsArray {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        int[] numbers= {1,66,3,32,78,99,12};
        String[] fruits = {"apple", "kiwi", "pears", "banana"};
        boolean isFound = false;

        //when target is not assigned
        String target;


        //when target is assigned
        //int target = 990;
        //String target = "pineapple";

        //user input
        System.out.print("Enter a fruit to search the array for: ");
        target = scanner.nextLine();


        //for(int i = 0; i< numbers.length; i++){
        for (int i = 0; i < fruits.length; i++){

            //if(target == numbers[i]){
            if (fruits[i].equals(target)){
                System.out.println("Element in array found at index: " + i);
                isFound = true;
                break;
            }
        }

        if (!isFound){
            System.out.println("Element not found in the array!");
        }

        scanner.close();
    }
}
