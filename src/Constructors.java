public class Constructors {
    static void main() {
        //Constructor is a special method to initialize objects
        //          you can pass arguments to a constructor
        //          and set up initial values
        //this is used with Students.java

        Students students1 = new Students("Spongebob", 30, 3.2);
        Students students2 = new Students("Patrick", 34, 1.5);
        Students students3 = new Students("Sandy", 34, 4.0);

        System.out.println(students1.name);
        System.out.println(students1.age);
        System.out.println(students1.gpa);
        System.out.println(students1.isEnrolled);

        students1.study();
    }
}
