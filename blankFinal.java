public class blankFinal {
final int a;    
/*
blankFinal()
{
    a=10;
}
blankFinal(int a)
{
   this.a=10;
}
    */
{  //non static multiline initializer 
    a=20;
}


public static void main(String[] args) {
System.out.println(new blankFinal().a);
    
}
}

