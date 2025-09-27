public class Decimal {
    public static void main(String[] args) {
        int binary=11;
        int decimal=0;
        int a;
        int power=1;
        while(binary!=0)
        {
         a=binary%10;
         binary=binary/10;
         decimal=decimal+power*a;
         power=power*2;

        }
        System.out.println("Decimal= "+decimal);

    }
}
