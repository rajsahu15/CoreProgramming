import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//file Writer
public class charStreamEx {
    public static void main(String[] args) throws IOException{
        File f=new File("E:\\doc\\FirstFile.txt");
        //here we can pass true or false for append or overwrite but in FileWriter we have to use another constructor for that
        FileWriter f1=new FileWriter(f);
        if(f.canWrite()){
            f1.write("Jai Shree Ram\n");
            f1.write("Jai Ho\n");
            f1.write("Har har mahadev");
        }
        else{
            System.out.println("You don't have write permission");
        }
        f1.close();
        //without closing the stream data will not be written to the file
    }
}
//FileWriter is used for writing data in the file in the form of characters
//if the file is not present it will create a new file
