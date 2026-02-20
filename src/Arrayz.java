import java.util.Arrays;

public class Arrayz {
    static void main() {
        //This only holds one thing. Add [] and {} to make array
        // If you print array, it gives ref address
        //String fruit = "apple";
        String[] fruits = {"apple", "orange", "banana", "coconut"};

        //change any element
        fruits[0] = "pineapple";

        //int numOfFruits = fruits.length;

        //for(int i = 0; i < fruits.length; i++){
            //System.out.println(fruits[i]);
            // pineapple
            //orange
            //banana
            //coconut

            //System.out.print(fruits[i] + " ");
            //pineapple orange banana coconut

        Arrays.sort(fruits);
        //banana
        //coconut
        //orange
        //pineapple

        //Arrays.fill(fruits,"apples");


        //enhanced for loop
        for(String fruit : fruits){
            System.out.println(fruit);
        }
        //System.out.println(fruits[0]);
        //System.out.println(numOfFruits);
    }
}
