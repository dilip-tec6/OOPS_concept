package OOPS_Concept;
class car {
    String brand;
    int price;
    public void showCar(){
        System.out.println("Brand" + this.brand);
        System.out.println("Price" + this.price);
    }
    car(String brand,int price){
        this.brand = brand;
        this.price = price;
    }
}
public class ClassObjectPractice {
    public static void main(String[]arg) {
        car Car1 = new car("BMW",1000000);
        car Car2 = new car("RR", 2000000);
        Car1.showCar();
        Car2.showCar();
    }
}
