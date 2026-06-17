public class Students {

    String name;
    int age;
    double  gpa;
    boolean isEnrolled;

    //We can now construct an object
    Students(String name, int age, double gpa){
        //this, is object we are currently constructing
        //they don't need to be the same as the attribute names above
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }

    //all students have the attribute study
    void study(){
        System.out.println(this.name + " is studying");
    }
}
