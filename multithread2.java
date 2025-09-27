
class MultithreadEx implements Runnable {

    private String Name;

    MultithreadEx(String Name) {
        this.Name = Name;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(Name + " ");
        }

    }

}

public class multithread2 {

    public static void main(String[] args) {
        MultithreadEx tt = new MultithreadEx("Raj");
        Thread t1 = new Thread(tt);
        t1.start();
        MultithreadEx tv = new MultithreadEx("Sahu");
        Thread t2 = new Thread(tv);
        t2.start();

    }
}
