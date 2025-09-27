import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={10,30,20,3,10};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {   
            int j=i-1;
            int key=arr[i];
            while(j>=0&&arr[j]>key)
            {
              arr[j+1]=arr[j];
              j--;
            }
            arr[j+1]=key;
        }
    }
}
