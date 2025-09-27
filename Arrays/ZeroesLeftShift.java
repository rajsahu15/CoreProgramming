
import java.util.Arrays;

public class ZeroesLeftShift
{
    public static void main(String[] args) {
     
        int arr[]={10,0,20,0,30,0};
        int arr2[]=new int[arr.length];
        int count=arr.length-1;
        for(int i=arr.length-1;i>=0;i--)
        {
           if(arr[i]!=0)
           {
            arr2[count--]=arr[i];
           }
        }
        System.out.println(Arrays.toString(arr2));
    }
}