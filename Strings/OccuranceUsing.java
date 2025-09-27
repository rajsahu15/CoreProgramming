public class OccuranceUsing {
   public static void main(String[] args) {
    String s1="Javaa";
    int a;
    String s2="";
    int min=s1.length();
    char cmax='\u0000';
    char cmin='\u0000';
    int max=0;
    while(s1.length()>0){
        char ch=s1.charAt(0);
        s2=s1.replace(ch+"", "");
        a=s1.length()-s2.length();
        if(a>max){max=a; cmax=ch;}
        if(a<min){min=a;cmin=ch;}
        s1=s2;
    }
    System.out.println("Max occurance char is "+cmax+" and occurance is "+max);
    System.out.println("Min occurance char is "+cmin+" and occurance is "+min);
   } 
}
