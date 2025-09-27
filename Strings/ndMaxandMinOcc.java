public class ndMaxandMinOcc {
    public static void main(String[] args) {
    String s1="jjjaavkk";
    int a;
    String s2="";
    int min=s1.length();
    int min2=s1.length();
    char c2max='\u0000';
    char c2min='\u0000';
    char cmax='\u0000';
    char cmin='\u0000';
    int max=0;
    int max2=0;
    while(s1.length()>0){
        char ch=s1.charAt(0);
        s2=s1.replace(ch+"", "");
        a=s1.length()-s2.length();

        
        if(a>max){max2=max;max=a;c2max=cmax; cmax=ch;
        }else if(a>max2&&a<max){max2=a;c2max=ch; 
        }
        if(a<min){min2=min;min=a;c2min=cmin;cmin=ch;
        }
        else if(a<min2&&a>min){min2=a;c2min=ch; 
        }
        s1=s2;
    }
    System.out.println("2ndMax occurance char is "+c2max+" and occurance is "+max2);
    System.out.println("2ndMin occurance char is "+c2min+" and occurance is "+min2);
    System.out.println("Max occurance char is "+cmax+" and occurance is "+max);
    System.out.println("Min occurance char is "+cmin+" and occurance is "+min);
    
   }
}

