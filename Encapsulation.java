public class Encapsulation {
    
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public static void main(String[] args) {
        
        Encapsulation person = new Encapsulation();

        person.setName("Atok");
        person.setAge(25);

        System.out.println(person.getName() + " is " + person.getAge() + " years old");
    }
}
