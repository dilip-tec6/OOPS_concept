package OOPS_Concept;
abstract class Student {                      // Abstraction
    private int id;                           // Encapsulation
    private String name;
    protected int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    abstract String getResult();              // Abstract method

    public void display() {                   // Concrete method
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

class ScienceStudent extends Student {         // Inheritance
    ScienceStudent(int id, String name, int marks) {
        super(id, name, marks);
    }

    @Override
    String getResult() {                      // Polymorphism
        return (marks >= 40) ? "PASS" : "FAIL";
    }
}

class ManagementStudent extends Student {      // Inheritance
    ManagementStudent(int id, String name, int marks) {
        super(id, name, marks);
    }

    @Override
    String getResult() {                      // Polymorphism
        return (marks >= 50) ? "PASS" : "FAIL";
    }
}

public class StudentResultSystem{
    public static void main(String[] args) {

        Student s1 = new ScienceStudent(1, "Amit", 45);
        Student s2 = new ManagementStudent(2, "Rita", 48);

        s1.display();
        System.out.println("Result: " + s1.getResult());

        System.out.println();

        s2.display();
        System.out.println("Result: " + s2.getResult());
    }
}
