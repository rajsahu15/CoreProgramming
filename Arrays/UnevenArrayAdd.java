
import java.util.Arrays;

public class UnevenArrayAdd {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={1,2,3};

        int max=Math.max(arr1.length, arr2.length);
        int min=Math.min(arr1.length, arr2.length);

        for(int i=0;i<min;i++)
        {
             if(arr1.length>arr2.length)
             {
                  arr1[i]+=arr2[i];
             }
             else{
                  arr2[i]+=arr1[i];
             }
        }
        arr1=arr1.length>arr2.length?arr1:arr2;
        System.out.println(Arrays.toString(arr1));
    }
}
