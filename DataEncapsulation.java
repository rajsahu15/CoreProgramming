class SBI {
   private String UserName; // non static var
   private  int balance; // non static var

   //setter
    void initialize(String s, int b) {
        UserName = s;
        balance = b;
    }
    //getter
    void getDetails() {
       System.out.println("USERNAME::"+UserName);
       System.out.println("Balance::"+balance);
       
    }

}
public class DataEncapsulation {
    public static void main(String[] args) {

        SBI s = new SBI();
        s.initialize("Rashmi", 10000);
        
        
    }

}

// provide data security
// it the binding and wrapping up of data members (variables)and member
// function(methods)
// into a single unit cell is data encapsulation;
