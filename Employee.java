public class Employee {
    private String name;
    private double baseSalary;
    private double healthAllowance = 500;
    private double transportAllowance = 200;
    private double bonus = 0;

    public Employee(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculateTotalSalary(){

        double total = 0;

        total = baseSalary + healthAllowance + transportAllowance + bonus;
        return total;
    }

    public double bonus(){

        if(baseSalary>10000){
            bonus = 0.1 * baseSalary;
        }else if(baseSalary>= 5000 && baseSalary<=10000){
            bonus = 0.05 * baseSalary;
        }else{
            bonus = 0;
        }

        return bonus;
    }

    public void display(){
        
        System.out.println("Name: " + name);
        System.out.println("Base Salary: RM " + baseSalary);
        System.out.println("Health Allowance: RM " + healthAllowance);
        System.out.println("Transport Allowance: RM " + transportAllowance);
        System.out.println("Bonus: RM" + bonus());
        System.out.println("Total Salary: RM" + calculateTotalSalary());
        System.out.println();
    }

}
