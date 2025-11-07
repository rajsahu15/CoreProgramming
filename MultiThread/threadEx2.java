class Threadt1 extends Thread {
   @Override
    public void run()
   {
      for (int i = 0; i < 10; i++) {
       try{ 
           Thread.sleep(500);   
         }
         catch(InterruptedException e){
             e.printStackTrace();
         }
        System.out.println("Thread 1: "+i);

       }
   }
}

class Threadt2 extends Thread {

   @Override
    public void run()
   {
      for (int i = 0; i < 10; i++) {
           System.out.println("Thread 2: "+i);
       }
   }
}

public class threadEx2 {
    public static void main(String[] args)throws InterruptedException {
          Threadt1 t1=new Threadt1();
          Threadt2 t2=new Threadt2();
          Thread m=Thread.currentThread();
          m.setName("Ram");
          System.out.println(m.getName());
          System.out.println(t1.getName());
          System.out.println(t2.getName());
          t1.setPriority(1);
          t2.setPriority(10);

          System.out.println( t1.getState());
          t1.start();  
          t2.start();
        
          
    }
}
