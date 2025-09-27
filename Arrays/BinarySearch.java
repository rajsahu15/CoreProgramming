public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70};
        int key=40;
        System.out.println(binarySearch(arr,key,0,arr.length-1));

    }
    public static int binarySearch(int arr[],int key,int start,int end)
    {    
        if( start>end)return -1;
        int mid=(start+end)/2;

        if(key==arr[mid])return mid;

        else if(key<mid) return binarySearch(arr, key, start, mid-1);
        else return binarySearch(arr, key, start, mid+1);
    } 
}
