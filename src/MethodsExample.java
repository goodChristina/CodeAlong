public class MethodsExample {
    static void main() {
        String name = "Charles Leclerc";
        int age = 28;

        happyBirthday(name, age);
    }

    static void happyBirthday(String name, int age){
        System.out.println("Happy birthday to you!");
        System.out.printf("Happy bithday dear %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy birthday to you!\n");

    }
}
