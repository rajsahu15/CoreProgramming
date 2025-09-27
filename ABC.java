public abstract class ABC {
public abstract void show();
   public void show2(){
    System.out.println("Ram");
         }   
     ABC()
     {
    System.out.println("Sita");
    }
    }



class C extends ABC{
 
    public static void main(String[] args) {
        C c1=new C();

        System.out.println("Prabhu");
        c1.show2();
        
    }
    public void show()
    {

    }
}
