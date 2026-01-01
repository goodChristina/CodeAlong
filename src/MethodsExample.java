public class MethodsExample {
    static void main() {
        String name = "Charles Leclerc";
        int age = 29;

        //double result = square(3);
        //System.out.println(result);
        //System.out.println(cube(3));

        //String fullname = getFullName("Charles", "Leclerc");
        //System.out.println(fullname );

        if (ageCheck(age)){
            System.out.println("You are old enough to be enlisted into the army for WWIII!");
        } else {
            System.out.println("You are too young. Sorry!");
        }
        //happyBirthday(name, age); //need arguments, parameters don't have to match method, ex birthdayboi vs name
    }

    static void happyBirthday(String birthdayboi, int age){
        System.out.printf("Happy birthday to %s!\n", birthdayboi);
        System.out.printf("Happy bithday dear %s!\n", birthdayboi);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy birthday to you!\n");
    }
    //Must be static to call the 'square part
    static double square (double number){
            return number * number;
        }
         static double cube(double number){
        return number * number* number;
        }

        static String getFullName(String first, String last){
            return first + " " +  last;
        }

        static boolean ageCheck (int age){
            if(age >= 18){
                return true;
            } else {
                return false;
            }
        }
    }


