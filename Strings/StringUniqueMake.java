public class StringUniqueMake {
    
    public static void main(String[] args) {
      String str="java is easy";
      String new1="";
      for(int i=0;i<str.length();i++)
      { boolean bool =true;
        for(int j=0;j<i;j++)
        {
         if(str.charAt(i)==str.charAt(j))
              {bool =false;break;}
        }
        if(bool)
        new1+=str.charAt(i);
      
      }
      System.out.println("Original  :-"+str);
      System.out.println("New       :-"+new1);
    }
}
