public class ndarray {
 public static void main(String[] args) {
    int arr[]={10,30,203,04,5};

    int max=arr[0];
    int max2=arr[0];
    int min=arr[0];
    for(int i=0;i<arr.length;i++){
        if(arr[i]>max){max2=max; max=arr[i];}
        else if(arr[i]>max2) max2=arr[i];
        if(arr[i]<min) min=arr[i];
    }
    System.out.println(max2);
 }   
}
