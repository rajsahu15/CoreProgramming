class Threadt1 extends Thread {
   @Override
    public void run()
   {
      for (int i = 0; i < 10; i++) {
       try{ 
          threadJoin.t2.join();
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

public class threadJoin {
     static Threadt2 t2;
     static Threadt1 t1;
     
    public static void main(String[] args)throws InterruptedException {
            t1=new Threadt1();
            t2=new Threadt2();
            t1.start();  
            t2.start();
            t1.join();
             for (int i = 0; i < 10; i++) {
           System.out.println("Main : "+i);
       }

    }
    
}
