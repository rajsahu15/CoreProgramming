
import java.util.Arrays;

public class BubbleSort
{
    public static void main(String[] args) {
    int arr[]={10,2,3,4,20};
    sort(arr);
    System.out.println(Arrays.toString(arr));    
    }
    public static void sort(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

}