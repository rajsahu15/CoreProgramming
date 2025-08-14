class userDef extends Exception {
    userDef(String Message){
        super(Message);
    }

}
public class Excep{
    public static void main(String[] args) {
       try {
           throw new userDef("User Defined Exception");
       } catch (userDef e) {
           System.out.println(e.getMessage());
           System.out.println("Exception caught successfully.");
       } 
    }
}
