public class VarArgs {
    static void main() {
        // varargs = allow a method to accept a varying number of arguments
        // it makes methods more flexible (skip the overloaded methods)
        // java packs these into an array (y... x)

        //add(1,2,4);
        //System.out.println(add(1,2,4,5,6));
        System.out.println(average(3, 6, 8, 2));
    }

    /*
    static int add(int... numbers){
        //System.out.println(numbers);
        // gives address [I@27716f4

        int sum = 0;
        // enhanced for loop, like i for i in numbers in python
        for (int number : numbers){
            sum += number;
        }
        return sum;

        }

     */
    static double average(double... numbers) {
        double sum = 0;

        if (numbers.length == 0){
            return 0;
        }

        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }
}
