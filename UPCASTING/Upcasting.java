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

}

public class Upcasting {
    public static void main(String[] args) {
    Car c=new Bmw();  // c---->upcasted reference variable  (With upcasted reference variable we can access only the parents property)
    //upcasting   (the process of creating a object of child and placing it inside reference variable of parent)  
    //
    c.ShowCar();   //the method called will be based on the object created ----that means the upcasted ref_variable having Bmw class object
                                                                  //                (method called will be of Bmw Class Show method) 
   // c.BmwDrive();   //this method is not present in out upcasted reference variable's class   its a CTE 
}
}
