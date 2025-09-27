class BMW 
{

}
class Benz 
{

}
class Audi 
{

}

class Driver
{
    public void drive(Object c)
    {
       String str=  c.getClass().toString();
       switch (str) {
           case "class BMW":System.out.println("BMW STARTED BY DRIVER");break;
           case "class Benz":System.out.println("Benz STARTED BY DRIVER");break;
           case "class Audi":System.out.println("Audi STARTED BY DRIVER");break;
           default:break;
           
       }

    }
}



public class upCast {
    public static void main(String[] args) {
      //driving BMW
      BMW bm=new BMW();
      Driver d=new Driver();

      d.drive(bm);

      Benz benz=new Benz();
      
      d.drive(benz);

      Audi audi=new Audi();
      
      d.drive(audi);
      
      
    }
}
