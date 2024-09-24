import java.util.Scanner;

public class studentManagement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Student[] student = new Student[5];
        
        for(int i=0; i<2; i++){

            System.out.print("Name : ");
            String setName = scanner.next();
            System.out.print("Mathematic : ");
            int setMath = scanner.nextInt();
            System.out.print("Science : ");
            int setScience = scanner.nextInt();
            System.out.print("English : ");
            int setEnglish = scanner.nextInt();
            System.out.println("");

            student[i] = new Student(setName, setMath, setScience, setEnglish);
        }

        for(int j=0; j<2; j++){
            student[j].display();
            student[j].calculateAverage();
            student[j].assignGrade();
        }

        scanner.close();
    }
}
