class Threadt1 extends Thread{
    String name;

    public Threadt1(String name) {
                    this.name=name;
    }
    
    public synchronized void m1(String s)
    {
           for (int i = 0; i < 10; i++) {
               System.out.println("Thread Running By :"+s);
           }
    }
    @Override
    public void run(){
       m1(name);
    }
}

public class synchronizedThread {
    public static void main(String[] args) {
        Threadt1 t1=new Threadt1("Ram");
        Threadt1 t2=new Threadt1("Sita");
        t1.start();
        t2.start();
        
    }
}
