public class StringProg {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String arr[]= str.split("[,! ]");
        for(String c:arr)
        {   
            System.out.println(c);
        }

    

    }
}
