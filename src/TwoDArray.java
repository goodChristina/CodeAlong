public class TwoDArray {
    static void main() {
        //2D array = Where each element is an array.
        //          Matrix of data

        //example, 1 D
        String[] fruits = {"apple", "banana", "orange"};
        String[] veggies = {"potato", "onion", "carrot"};
        String[] meats = {"chicken", "fish", "cuy"};

        //combine all to matrix

        String[][] groceries = {fruits, veggies, meats};

        //change element
        // [][] row, column
        groceries[0][0] = "pineapple";
        groceries[1][0] = "celery";
        groceries[1][2] = "beet";
        groceries[2][0] = "goat";

        for (String[] foods : groceries){
            //System.out.println(foods);
            // will get [Ljava.lang.String;@27716f4
            //[Ljava.lang.String;@8efb846
            //[Ljava.lang.String;@2a84aee7
            //because arrays are reference data types, USE NESTED LOOP!

            for (String food : foods){
                System.out.print(food + " ");
            }
            System.out.println();
            //apple banana orange
            //potato onion carrot
            //chicken fish cuy
        }
    }
}
