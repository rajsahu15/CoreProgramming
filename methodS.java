public class methodS {
    
    public static void main(String[] args) {        
    Rashmi(/* Actual Agrument */);   //method call

    System.out.println("RAJ");

    }                                                                                                       //Formal Argument//parameters  
    //Access_Modifier(non Mandatory)    NON_Access_MODIFIER(non mandatory)                       Return_Type(compulsory)                                (compulsory)   METHOD_NAME(   ){} 
    //public                             //static                                                           1.Primitive         2.Non-Primitive              User_DEFINED Infinite 
    //protected                         //final                                                         byte,short,long,int      String,Infinite
    //default                          //abstract    (without body)                                                     double,float            
    //private                         //Non Static--bydefault                                             char,boolean

    public static void Rashmi(/*---  Formal Agrument --  -*/ )   //method defination
    {
        System.out.println("Method Called");
        System.out.println("Rashmi");
        
          //return the execution to method calling point
    }

}



//Method Defination In Java WAYS
/* 
            1                                                 2                                               3                                            4
without Return Without Parameter                    without return with parameter                    with return without parameter                with return with parameter
                                                                                                         
public static void Rashmi()                             public static void Rashmi(int a)                   static int Rashmi()                      static int Rashmi(int a){   return 0;  }
{                                                                                                              {     return 10; }
                                                         {     }

}

void Rashmi()
{

}








*/