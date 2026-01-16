package OOPS_Concept;
//Single Inheritance
class Shape{
    String color;

}
class Triangle extends Shape{

}
// Usage
// Child c = new Child();
// c.parentMethod(); // inherited from Parent
// c.childMethod();  // own method

// 2. Multilevel Inheritance
// A class inherits from a child class which already inherits from parent
class GrandParent {
    void grandParentMethod() {
        System.out.println("GrandParent method");
    }
}

class Parent2 extends GrandParent {
    void parentMethod() {
        System.out.println("Parent2 method");
    }
}
class Child2 extends Parent2 {
    void childMethod() {
        System.out.println("Child2 method");
    }
}
// Usage
// Child2 c2 = new Child2();
// c2.grandParentMethod(); // inherited from GrandParent
// c2.parentMethod();      // inherited from Parent2
// c2.childMethod();       // own method

// 3. Hierarchical Inheritance
// Multiple classes inherit from a single parent class
class Parent3 {
    void parentMethod() {
        System.out.println("Parent3 method");
    }
}

class Child3 extends Parent3 {
    void childMethod1() {
        System.out.println("Child3 method1");
    }
}

class Child4 extends Parent3 {
    void childMethod2() {
        System.out.println("Child4 method2");
    }
}

// Usage
// Child3 ch3 = new Child3();
// ch3.parentMethod(); // from Parent3
// ch3.childMethod1(); // own method
//
// Child4 ch4 = new Child4();
// ch4.parentMethod(); // from Parent3
// ch4.childMethod2(); // own method

public class Inheritance {
    public static void main(String[]arg) {
        Triangle t1 = new Triangle();
        t1.color= "red";

        //There are 4 Types of Inheritance in java


    }
}
