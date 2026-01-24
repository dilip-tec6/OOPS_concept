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

class Cow extends Animal {
    void sound() {
        System.out.println("moos");
    }
}

class Buffalo extends Animal{
    void sound (){
        System.out.println("bellows");
    }
}

class Goat extends Animal{
     void sound (){
         System.out.println("bleats");
     }
}
public class AnimalPolymorphism {
    public static void main(String[] args) {

        // Polymorphism: parent reference, child object
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Cow();
        Animal a4 = new Buffalo();
        Animal a5 = new Goat();


        a1.sound(); // Dog barks
        a2.sound(); // Cat meows
        a3.sound(); // Cow moos
        a4.sound(); // Buffalo Bellows
        a5.sound(); // Goat Bleats
    }
}
