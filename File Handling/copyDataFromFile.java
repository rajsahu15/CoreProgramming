
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyDataFromFile {
    public static void main(String[] args)throws IOException {
        File source = new File("E:\\doc\\FirstFile.txt");
        FileOutputStream destinationFile=new FileOutputStream("E:\\doc\\SecondFile.txt");
        FileInputStream sourceFile=new FileInputStream(source);

        if(source.canRead()){
            int i=sourceFile.read();
            while(i!=-1){
                destinationFile.write(i);
                i=sourceFile.read();
            }
        }
        else System.out.println("File Cannot Read");
        destinationFile.close();
        sourceFile.close();
    }

}
