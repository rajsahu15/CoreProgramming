public class Binary {
    public static void main(String[] args) {
        int binary[]=new int[100];
        int n=8,i=0;
        while(n!=0)
        {
            binary[i]=n%2;
            n=n/2;
            i++;
        }
        for(int j=i-1;j>=0;j--)
        {
            System.out.print(" "+binary[j]);
        }
    }
}


