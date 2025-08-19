
class PrintStream {

    public PrintStream() {
    }
    public void print(String s) {
        if (s == null) {
            s = "null";
        }
         try {

            java.lang.System.out.write(s.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    public void println(String s) {
        try {

            java.lang.System.out.write(s.getBytes());
            java.lang.System.out.write("\n".getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

final class System {

    public static final PrintStream out = new PrintStream();

    private System() {
    }
}

public class SystemOUT {

    public static void main(String[] args) {
     
        System.out.println("RAJ SAHU");
        //System.out.println(10);
        

    }
}
