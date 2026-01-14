package OOPS_Concept;
class Pen{
    String color;
    String type;
    public void write(){
        System.out.println("Hey I'm SudoZen");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}
public class Class {
    public static void main(String [] arg) {
        Pen P1 = new Pen();
        P1.color="Red";
        P1.type="gel";
        P1.write();
        P1.printColor();

        Pen P2 = new Pen();
        P2.color="Green";
        P2.type="Ball";
        
        P1.printColor();
        P2.printColor();
    }
}
