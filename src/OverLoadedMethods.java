// Methods that share the same name, but different parameters
//  signature = name + params

public class OverLoadedMethods {
    static void main() {
        //Part 1
        System.out.println(add(1, 2));
        //Part 2
        //String pizza = bakePizza("flat bread");
        //String pizza = bakePizza("flat bread", "mozzarella");
        String pizza = bakePizza("flat bread", "mozzarella", "mushrooms");
        System.out.println(pizza);
    }

    //Part 1
    static double add(double a, double b){
        return a + b;
    }
    static double add(double a, double b, double c){
        return a + b + c;
    }

    //Part 2
    static String bakePizza(String bread){
        return bread + " pizza";
    }
    static String bakePizza(String bread, String cheese){
        return cheese + " " + bread + " pizza";
    }
    static String bakePizza(String bread, String cheese, String topping){
        return cheese + " " + bread + " pizza with " + topping ;
    }
}