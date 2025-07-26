public class forEach {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        String str[]={"Raj","JI","Rohan","Sahil","Prakash"};
        int sum=0;
        for(String str2:str)
         {
         System.out.print(str2+" ");
         }
         for(int a:arr)
         {
            sum=a+sum;
         }
         System.out.println("\nSum="+sum);
    }
}
