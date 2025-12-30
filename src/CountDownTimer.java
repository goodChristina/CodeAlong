import java.util.Scanner;

public class CountDownTimer {
    static void main() throws InterruptedException {
        int start = 10;
        for (int i = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println("Happy New Year");
    }
}
