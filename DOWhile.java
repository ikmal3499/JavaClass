import java.util.Scanner;

public class DOWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correctPassword = "java123";

        String enteredPassword;

        do{
            System.out.println("Enter the Password: ");
            enteredPassword = scanner.nextLine();
            if(!enteredPassword.equals(correctPassword)){
                System.out.println("Please Try Again");
            }
        }while(!enteredPassword.equals(correctPassword));

        System.out.println("True Password");
    }
}
