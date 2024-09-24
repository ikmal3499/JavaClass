public class Employee {
    private String name;
    private double baseSalary;
    private double healthAllowance = 0;
    private double transportAllowance = 0;
    private double bonus = 0;

    public Employee(String name, double baseSalary, double healthAllowance, double transportAllowance){
        this.name = name;
        this.baseSalary = baseSalary;
        this.healthAllowance = healthAllowance;
        this.transportAllowance = transportAllowance;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public double calculateTotalSalary(){
        double total = 0;

        if(baseSalary>50000){
            bonus = 0.1 * baseSalary;
        }else if(baseSalary>= 30000 && baseSalary<=50000){
            bonus = 0.05 * baseSalary;
        }else{
            bonus = 0;
        }

        total = baseSalary + healthAllowance + transportAllowance + bonus;

        return total;
    }

    public void display(){
        
        System.out.println("Name: " + name);
        System.out.println("Base Salary: RM" + baseSalary);
        System.out.println("Health Allowance: RM" + healthAllowance);
        System.out.println("Transport Allowance: RM" + transportAllowance);
        System.out.println("Total Salary: RM" + calculateTotalSalary());
        System.out.println();
    }

}
