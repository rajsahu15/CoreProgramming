class Threadt1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread1: " + i);
            try{
            Thread.sleep(500);
            }
            catch(InterruptedException e){}
        }
    }
}
class Threadt2 extends Thread {
    @Override
    public void run() {
        for (int i = 101; i < 112; i++) {
            System.out.println("Thread2: " + i);
            try{
            Thread.sleep(500);
            }
            catch(InterruptedException e){}
        }
    }
}
public class threadExDaemon {
    public static void main(String[] args) {
        Threadt1 t1=new Threadt1();
        Threadt2 t2=new Threadt2();
        t1.setDaemon(true);
        t2.start();
        t1.start();

           
    }

}
//daemon thread will not complete its execution if all user threads are finished
//daemon thread will execute only when there is at least one non daemon thread running