import java.io.FileOutputStream;
import java.io.IOException;

public class byteStreamEx {
    public static void main(String[] args)throws IOException {
        FileOutputStream fo=new FileOutputStream("E:\\doc\\firstfile.txt",false);
        String s="hello sir welcome to java";
        byte b[]=s.getBytes();
        fo.write(b);
        fo.close();
    }
}
//how many time i compile and run it the data will be appended because of true in FileOutputStream
//if i put false or nothing then the data will be overwritten
//FileOutputStream is used for writing data in the file in the form of bytes    
//if the file is not present it will create a new file
//if the file is present it will write the data in the existing file