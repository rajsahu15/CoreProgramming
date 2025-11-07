
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class readData {
    public static void main(String[] args)throws IOException {
        File f=new File("E:\\doc\\FirstFile.txt");
        FileInputStream f1=new FileInputStream(f);

        if(f.canRead()){
             int i=f1.read();
                while(i!=-1){
                    System.out.print((char)i);
                    i=f1.read();
                }
        }
        else{
            System.out.println("You don't have read permission");
        }
        f1.close();
        
    }
}
