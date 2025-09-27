public class BintoDec {
    public static void main(String[] args) {
        System.out.println(decimalOf(11, 1, 0));
    }
    public static int decimalOf(int binary,int pow,int dec)
    {
        if(binary==0)return dec;
        dec=dec+pow*binary%10;
        return decimalOf(binary/10, pow*2, dec);
    }
}
