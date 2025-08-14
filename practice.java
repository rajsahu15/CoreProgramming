class b{
    b()
    {
System.out.println("SUPER CALLED FROM A CLASS IT A B CLASS");
    }
}
class a extends b{
    a() {
        System.out.println("SUPER CALLED FROM pRACTICE CLASS it IS A A CLASS");
    }
}
public class practice extends a {
    practice(){
        System.out.println("DEFAULLLLTTTTTTTTTTTTTTT");
    }
    public static void main(String[] args) {
    practice p = new practice();
       
       
    
    }
}
//constructor me pahli statement super keyword rahta hai by default
//hum v likh skte hain
//but overriding ke time