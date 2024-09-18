public class Person {
    
    private String name;
    private int age;
    private String myGpa;
    private Double GPA;
    private Double GPA2;
    private Double GPA3;
    private int years;

    public Person(String name, int age, String myGpa, Double GPA, Double GPA2, Double GPA3, int years){
        this.name = name;
        this.age = age;
        this.myGpa = myGpa;
        this.GPA = GPA;
        this.GPA2 = GPA2;
        this.GPA3 = GPA3;
        this.years = years;
    }

    public void displayDetails(){
        int maxInt = Integer.MAX_VALUE;
        long maxPlusOne = 2147483649L; // ade L tuu baru boleh gune long sbb value die dah lebih max value for int
        System.out.println(maxInt);
        System.out.println(maxPlusOne);
        System.out.println("Name is: " + name);
        System.out.println("The age is: " + age);
        System.out.println(myGpa + " " + GPA + " in " + years + " years of training");

        Double sum = GPA + GPA2 + GPA3;
        System.out.println("Total summation of GPA is: " + sum);
        System.out.println("Average GPA is: " + sum/3);
    }

    public static void main(String [] args) {
        Person person = new Person("Malmoh", 25, "My GPA is", 3.5, 3.2, 3.8, 3);
        //Double totalGPA = person.GPA + person.GPA2 + person.GPA3;
        person.displayDetails();
        //System.out.println("Total GPA: " + totalGPA);
        //System.out.println("Average GPA: " + totalGPA/3);
 
    }
}
