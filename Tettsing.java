public class Tettsing
{
    public static String name;
    public static String name2;
    
    public static void main(String[] args) {
      name="raj";
      name2="rohan";
      
      
      Runnable r1=new Runnable() {
        public void run()
        {
            for (int i = 0; i < 10; i++) {
                System.out.println(name+" ");
            }
        }
    };
    Runnable r2=new Runnable() {
        public void run()
        {
            for (int i = 0; i < 10; i++) {
                System.out.println(name2+" ");
            }
        }
    };
        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        
        t1.start();
        t2.start();
        
    }
} 