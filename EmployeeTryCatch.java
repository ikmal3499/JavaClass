public class EmployeeTryCatch {
    public static void main(String[] args) {
        
        Employee[] employee = new Employee[5];
        String[] emp = {"Anas", "Aidid", "Amirun", "Sopel", "EDDY"};
        double[] sal = {3000, 2500, 6000, 4000, 1500};
        
        System.out.println();
        System.out.println("Employee Salary Management System");
        System.out.println("-----------------------------------------------------");
        for(int i=0; i<employee.length; i++){

            employee[i] = new Employee(emp[i], sal[i]);
        }

        System.out.println("-----------------------------------");
        System.out.println("--------------OUTPUT---------------");
        try{
            for(int j=0; j<employee.length+1; j++){
                employee[j].display();
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Caught bad " + e.getMessage());
        }finally{
            System.out.println("It will continue anyway");
        }
    }
}