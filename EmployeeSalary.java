import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        
        Employee[] employee = new Employee[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Employee Salary Management System");
        System.out.println("-----------------------------------------------------");
        System.out.println();
        
        for(int i=0; i<employee.length; i++){
            
            System.out.print("Name : ");
            String name = scanner.next();
            System.out.print("Base Salary : RM ");
            double base = scanner.nextDouble();
            System.out.println();

            employee[i] = new Employee(name, base);
        }

        System.out.println("-----------------------------------");
        System.out.println("--------------OUTPUT---------------");

        for(int j=0; j<employee.length; j++){
            employee[j].display();
        }

        scanner.close();
    }
}
