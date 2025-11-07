
import java.io.File;
import java.io.IOException;

public class File1Ex {
 public static void main(String[] args)throws IOException {

   File f = new File("E:\\doc\\lala.txt");

    System.out.println(f.createNewFile());
    System.out.println(f.mkdir());
    //System.out.println(f.mkdirs()); it is for creating multiple directories
    System.out.println(f.exists());

    System.out.println(f.canExecute());
    System.out.println(f.canRead());
    System.out.println(f.canWrite());  
    System.out.println(f.getAbsolutePath());
    System.out.println(f.getName());
    System.out.println(f.getParent());  

    
   File f1 = new File("E:\\doc\\bala.txt");
   //for renaming file dont create new file
   //  f1.createNewFile();

   System.out.println(f.renameTo(f1));
   
   File f3 = new File("E:\\doc\\gala.txt"); 
   System.out.println(f1.delete());
   System.out.println(f.delete());
   System.out.println(f3.delete());
    
}   
}
