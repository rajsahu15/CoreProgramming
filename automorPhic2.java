
public class automorPhic2 {

    public static void main(String[] args) {
        int start = 1;
        int end = 10000;
        int square;
        boolean bool;
        for (int i = start; i <= end; i++) {
           
            bool = true;
            int n = i;   //25  //6
            square = n* n; //,square 625  //36
            while (n != 0) {
                if (n % 10 != square % 10) //n%10=5  ,square%10=5
                {
                    bool = false;
                    break;
                }
                n = n / 10;   //remove last from n
                square = square / 10;   //square last digit remove

            }
            if (bool) {
                System.out.println(i+"= "+i*i);
                
            }

        }

    }
}

//5
//5*5 =25
//2_5
//5=5
//25
//625

//625 ends with 25 is automorphic
