
class Car {

    String company;
    String color;
    int price;
    Engine e;//composition

    public Car(String company, String color, int price, Engine e) {
        this.company = company;
        this.color = color;
        this.price = price;
        this.e = e;
    }
    public void carStart(){
     System.out.println("NAME OF THE CAR IS : "+company);
     System.out.println("COLOR OF THE CAR IS : "+color);
     System.out.println("PRICE OF THE CAR IS : "+price);
     System.out.println("CAR ENGINE IS "+e.hp+" horsepowers");
     System.out.println("CAR SPEED IS "+e.speed+" km/hrs");
    }

}

class Engine {

    int hp;
    int speed;

    public Engine(int hp, int speed) {
        this.hp = hp;
        this.speed = speed;
    }

}

public class Composition {

    public static void main(String[] args) {
    Car c=new Car("BMW", "BLACK", 100000, new Engine(1100, 400));
    System.out.println();
    c.e.speed=500;
    c.carStart();
    System.out.println();

    }
}
