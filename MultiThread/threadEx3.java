//thread using runnable Interface
class Threadt1 implements Runnable
 {
    @Override
    public void run(){
        for(int i=0;i<10;i++)
        {
            System.out.println("Thread 1 :"+i);
        }
    }
 }

public class threadEx3 {
    public static void main(String[] args) {
        Threadt1 t1=new Threadt1();
        Thread t=new Thread(t1);
        t.start();
         for(int i=0;i<10;i++)
        {
            System.out.println("Non threaded :"+i);
        }
        
    }
}
