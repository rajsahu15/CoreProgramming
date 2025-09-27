public class DectoBin {
    public static void main(String[] args) {
        System.out.println(binaryOf(5, ""));
    }
    public static String binaryOf(int n,String bin)
    {
        if(n==0)return bin;
       
        bin=n%2+bin;

        return binaryOf(n/2, bin);
    }
}
