public class DifferentScopes {
    
    int instanceVariable = 10;
    double instanceVariableDouble = 10.8;
    String instanceVariableString = "This is a String"; 

    static int instanceVariableStatic = 20; // the variable cannot change

    public void showLocalVariable() {
        String localStringVariable = "Finish";
        int localVariable = 30;

        System.out.println("my local variable is: " + localVariable + " " + localStringVariable);
    }

    public void showNames() {
        String name = "Ikmal";
        String name2 = "Mohyidin";

        System.out.println("My name is: " + name + " " + name2);
    }

    public static void main(String [] args) {
        DifferentScopes example = new DifferentScopes();
        example.showNames();
        example.showLocalVariable();
        System.out.println("my local variable is: " + example.instanceVariable + " " + example.instanceVariableString);

    }
}
