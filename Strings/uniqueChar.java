    public class uniqueChar {
    
    public static void main(String[] args) {
      String str="java_";
      String new1="";
      for(int i=0;i<str.length();i++)
      { boolean bool =true;
        for(int j=0;j<str.length();j++)
        {
         if(str.charAt(i)==str.charAt(j)&&i!=j)
              {bool =false;break;}
        }
        if(bool)
        new1+=str.charAt(i);
      
      }
      System.out.println("Original  :-"+str);
      System.out.println("New       :-"+new1);


    }
}


