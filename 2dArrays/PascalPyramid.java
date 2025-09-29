public class PascalPyramid {
    public static void main(String[] args) {
        int n=5;
        int space=n-1;   
        int a[][]=new int [n][];
           for(int i=0;i<a.length;i++){
           a[i]=new int[i+1];
           for(int j=0;j<a[i].length;j++){
              if(j==0||i==j)
              a[i][j]=1;
              else
              a[i][j]=a[i-1][j-1]+a[i-1][j];
           }
      }
        for(int i=0;i<a.length;i++){
            for(int k=1;k<=space;k++)
            System.out.print(" ");
            space--;
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

   }  
}
