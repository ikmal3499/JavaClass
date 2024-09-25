import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class EmployeeArrayList {
    public static void main(String[] args) {
        
        LocalDate startDate = LocalDate.of(2024, 8, 01);
        LocalDate endDate = LocalDate.of(2024, 8, 31);
        Period Tdate = Period.between(startDate, endDate);

        Employee[] employee = new Employee[5];

        ArrayList<String> emp = new ArrayList<>();

        emp.add("Anas");
        emp.add("Aidid");
        emp.add("Amirun");
        emp.add("Sopel");
        emp.add("EDDY");

        ArrayList<Double> sal = new ArrayList<>();

        sal.add(3000.0);
        sal.add(2500.0);
        sal.add(12000.0);
        sal.add(4000.0);
        sal.add(15000.0);
        
        System.out.println();
        for(int i=0; i<employee.length; i++){

            employee[i] = new Employee(emp.get(i), sal.get(i));
        }

        System.out.println("-----------------------------------");
        System.out.println("--------------OUTPUT---------------");
        System.out.println("-----LIST OF PAYSLIP GENERATED-----");
        System.out.println("----" + startDate + " until " + endDate + "----");
        System.out.println("----------Total date " + Tdate + "----------");
        System.out.println();

        try{
            for(int j=0; j<employee.length; j++){

                employee[j].display();
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Caught bad " + e.getMessage());
        }finally{
            System.out.println("The Program will continue");
        }
    }
}
