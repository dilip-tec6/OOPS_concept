package OOPS_Concept;
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        int name;
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
class Ox extends Animal {
    void sound (){
        System.out.println("beats ");
    }
}
public class AnimalPolymorphism {
    static void makeAnimalSound(Animal animal){
        System.out.println("Animal Type: " + animal.getClass().getSimpleName());
        animal.sound();//runtime polymorphism
    }
    public static void main(String[] args) {

        // Polymorphism: parent reference, child object
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Cow();
        Animal a4 = new Buffalo();
        Animal a5 = new Goat();
        Animal a6 = new Ox();



        a1.sound(); // Dog barks
        a2.sound(); // Cat meows
        a3.sound(); // Cow moos
        a4.sound(); // Buffalo Bellows
        a5.sound(); // Goat Bleats
        a6.sound(); // Ox sound

        System.out.println("\n--- Using Polymorphic Method ---");
        makeAnimalSound(a1);
        makeAnimalSound(a2);
        makeAnimalSound(a3);
        makeAnimalSound(a4); 
        makeAnimalSound(a5);
        makeAnimalSound(a6);
    }
}
