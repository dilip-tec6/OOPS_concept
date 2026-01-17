package OOPS_Concept;
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}
public class AnimalPolymorphism {
    public static void main(String[] args) {

        // Polymorphism: parent reference, child object
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        a1.sound(); // Dog barks
        a2.sound(); // Cat meows
    }
}
