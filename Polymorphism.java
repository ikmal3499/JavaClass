class Animal{
    public void sound(){
        System.out.println("hop hop");
    }
}

class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("Barking");
    }
}

class cat extends Animal{
    @Override
    public void sound(){
        System.out.println("Meowing");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        myAnimal.sound();

        myAnimal = new cat();
        myAnimal.sound();
    }
}
