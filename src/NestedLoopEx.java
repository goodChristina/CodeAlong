import java.awt.*;
import java.util.Scanner;

import static java.lang.System.*;

public class NestedLoopEx {
    static void main() {
        /*

        for (int i = 1; i <11; i++){

            if (i % 2 == 0){
                //break;
                continue;
            }
            System.out.print(i + " ");
        }

    }




        // run the code 3 times
        for ( int j = 1; j <= 3; j++){
            for (int i = 1; i <= 9; i++){
                out.print(" " + i);
        } out.println();


        }
         */

        Scanner scanner = new Scanner(System.in);

        int  rows;
        int columns;
        char symbol;

        System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        columns = scanner.nextInt();

        System.out.print("Enter the symbol you want in the columns: ");
        symbol = scanner.next().charAt(0);

        for (int i = 0; i < rows; i ++){
            for ( int j = 0; j <columns; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }



        System.out.println();

        scanner.close();
    }
}
