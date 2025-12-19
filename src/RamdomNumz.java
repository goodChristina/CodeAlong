import java.util.Random;
public class RamdomNumz {
    static void main() {
        Random random = new Random();

        double number1;
        //between 1-100
        number1 = random.nextDouble(1,101);

        boolean isHeads;
        isHeads = random.nextBoolean();
        if(isHeads){
            System.out.println("HEADS");
        } else {
            System.out.println("TAILS");
        }

        System.out.println(number1);
        System.out.println(isHeads);

    }
}
