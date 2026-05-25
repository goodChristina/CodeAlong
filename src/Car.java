public class Car {

    //attributes
    String make = "Chevy";
    String model = "Corvette";
    int year = 2026;
    double price = 58000.99;
    boolean isRunning = false;


    //define method
    void start(){
        isRunning = true;
        System.out.println("Carlos Sainz started the engine!");
    }

    void stop (){
        isRunning = false;
        System.out.println("Charles Leclear stopped the engine.");
    }

    void drive(){
        System.out.println("You drive a " + model);
    }

    void brake(){
        System.out.println("You brake the " +model +" before a turn.");
    }
    }

