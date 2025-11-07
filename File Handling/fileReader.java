import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class fileReader {
 public static void main(String[] args)throws IOException {
  
    FileReader f1=new  FileReader("E:\\doc\\firstFile.txt");
    
    try(BufferedReader br=new BufferedReader(f1)){
               String s=br.readLine();
               while(s!=null){
                System.out.println(s);
                s=br.readLine();
               }
    }
   //FileReader

 }   
}
