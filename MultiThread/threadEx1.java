class Threadt1 extends Thread{
    
    @Override
    public void run()
    {
      for(int i=0;i<10;i++)
      {
        System.out.println("Thread1: "+i);
      }
    }
}

public class threadEx1 {
   public static void main(String[] args) {
    Threadt1 t1=new Threadt1();
    t1.start();
     for(int i=0;i<10;i++)
      {
        System.out.println("No - Thread: "+i);
      }
   }
}
