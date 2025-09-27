public class MinAndMax {
    public static void main(String[] args) {
        int arr[]={10,30,3,5,50,100};
        int min=arr[0];
        int max=arr[0];

        for(int a:arr)
        {
            if(a>max)max=a;
            if(a<min)min=a;
            
        }
        System.out.println("MAX: "+max);
        System.out.println("MIN: "+min);
        
    }
}
