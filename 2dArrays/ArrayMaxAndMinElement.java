public class ArrayMaxAndMinElement {
    public static void main(String[] args) {
          int a[][]={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int max=a[0][0];
        int min=a[0][0];

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                if(a[i][j]>max){max=a[i][j];}
                if(a[i][j]<min){min=a[i][j];}
                
            }
        }
        System.out.println("Arrays MaxElement: "+max);
        System.out.println("Arrays MinElement: "+min);
        
    }
}
