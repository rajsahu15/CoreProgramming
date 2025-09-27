public class for1 {
 public static void main(String[] args) {
  
    int count=0;
    int sum=0;
    int product=1;



    for(int i= 1;i<=100;i++)
    {
   
   
        count++;

        System.out.print(i+"\t");
        sum=sum+i;
        product=product*i;

  
    
    }
  
System.out.println("\nCount= "+count);
  
System.out.print("\nproduct= "+product);  
System.out.print("\nSum= "+sum);

 }   
}
