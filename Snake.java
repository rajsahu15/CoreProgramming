public class Snake {
    public static void main(String[] args) {
        int k=0;
        for(int i=1;i<=6;i++)
        {
            if(i%2!=0){
            for(int j=1;j<=6;j++)
            {
             k++;
             System.out.print(k+" ");
            }
        }
        else{
            for(int j=6;j>=1;j--)
            {
             System.out.print(k+" ");
             k--;
            }
        }   k=k+6;
            System.out.println();
        }
    }
}
