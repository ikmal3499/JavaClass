import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class IoExeption {
    public static void main(String[] args) {

        try {
            File file = new File("nonexist.txt");
            FileReader fr = new FileReader(file);
            Scanner read = new Scanner(file);
            while(read.hasNextLine()){
                int n = read.nextInt();
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Checked exeption " + e.getMessage());
        }
        // int result = 10/0;
    }
}
