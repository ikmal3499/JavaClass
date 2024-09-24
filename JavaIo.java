import java.io.File;
import java.io.FileReader;

public class JavaIo {
    public static void main(String [] args){
        try{
            File file = new File("newText.txt");
            FileReader fr = new FileReader(file);
        }catch (Exception e){//when try is not working
            System.out.println("Caught checked: " + e.getMessage());
        }
        
    }
}
