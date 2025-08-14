public class recurr {
    public static void main(String[] args) {
    
    int a=10;  
    for(int i=1;i<=2;i++){ 
    System.out.println("my money = "+   m1(a++));
    }
    System.out.println(a);     

    }
    public static int m1(int a)   
    {
      
        a=100; 
        System.out.println("stock MONEY= "+a);  

        return a; 
        
    }
}


