
class ThreadTest extends Thread {

    private String Name;

    ThreadTest(String Name) {
        this.Name = Name;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
        System.out.print(Name+" ");
        }

    }

}

public class multiThread1 {

    public static void main(String agr[]) {
        ThreadTest tt=new ThreadTest("Raj");
        tt.start();
        
        ThreadTest tv=new ThreadTest("Thala");
        tv.start();
    }
}
