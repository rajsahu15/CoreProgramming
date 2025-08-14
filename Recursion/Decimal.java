public class Decimal{
    public static void main(String[] args) {
        int Binary=100;
        System.out.println("Decimal value of binary "+Binary +" is: " + binaryToDecimal(Binary,1));
    }
    public static int binaryToDecimal(int bin,int pow)
    {
        if(bin==0)
        return bin;
    
        int a=bin%10;
        bin=bin/10;
        return a*pow+binaryToDecimal(bin, pow*2);
    }
}