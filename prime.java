class prime{
    public static int isPrime(int n){
     boolean prime=true;   
     for(int i=2;i<=n/2;i++)
     {  prime=true;
       if(n%i==0){
        prime=false;
        break;
       }
     }
     if(prime){
     return n;
     }
     else{
        return 0;
     }
    }
    public static void main(String[] args) {
        //print series of prime till 100
        int number;
        int highest=1;
        int lowest=1;
        int secondHighest=1;
     
        for(int i=0;i<100;i++)
        {   number=isPrime(i);
            if(number!=0)
            {
            if(number>highest){
                secondHighest=highest;
                highest=number;
            }
            else if(number>=secondHighest){secondHighest=number;}
            
            if(number<lowest){lowest=number;}
            }
        
        }
            System.out.println("\nHighest ="+highest);
            System.out.println("Lowest= "+lowest);
            System.err.println("Second= "+secondHighest);
        }
}


