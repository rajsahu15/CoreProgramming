class Car {

    public void ShowCar() {
        System.out.println("CLASS CAR SHOW METHOD----_SHOW CAR");
    }

}
class Bmw extends Car {
    @Override
    public void ShowCar() {
        System.out.println("BMW Class METHOD----SHOW CAR");
    }
    public void BmwDrive() {
        System.out.println("BMW Class METHOD----BMW DRIVE");
    }
}
public class tightCoupling {
    public static void main(String[] args) {
        Bmw b=new Bmw();  //b---->tight coupled reference variable (with tight coupled reference variable 
        //we can access both parent and child property)
        b.ShowCar();  //BMW Class METHOD----SHOW CAR
        b.BmwDrive(); //BMW Class METHOD----BMW DRIVE
    }
}
