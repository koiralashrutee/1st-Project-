package thulotechnology.com;

public class Person {
    protected String id;
    protected String name;

    void walking(){
        System.out.println("Walking ");
    }

}

class Student extends Person{
    int grade;
    double fee;

    void walking(){
        System.out.println("Student is walking ");
    }


}

class Teacher extends Person{
    double salary;


}
