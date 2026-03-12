public class Telephone2DArray {
    static void main() {
        // char always uses single quotes
        //array of arrays
        char[][] telephone = {{'1', '2', '3'},
                {'4','5','6'},
                {'7','8','9'},
                {'*','0', '#'}};
        for(char[] row : telephone){
            for (char number : row){
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
