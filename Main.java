class SingletonCheck
{
    public static SingletonCheck instance=null;
    private SingletonCheck()
    {
    }
    public static SingletonCheck getInstanceof()
    {
     if(instance==null)
     {
        instance=new SingletonCheck();
     }   
     return instance;
    }

}

public class Main {
    public static void main(String[] args) {
    SingletonCheck sk=SingletonCheck.getInstanceof();
    SingletonCheck sy=SingletonCheck.getInstanceof();
    if(sk==sy)
    {
        System.out.println("Both references point to the same instance.");
    }
    else
    {
        System.out.println("References point to different instances.");
    }

    }
}
