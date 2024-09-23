interface Animal{
    void sound();
}

interface Playbale{
    void play();
}

class Dog implements Animal, Playbale{
    @Override
    public void sound(){
        System.out.println(("barking"));
    }
    @Override
    public void play(){
        System.out.println("dog is playing");
    }
}

class Cat implements Animal, Playbale{
    @Override
    public void sound(){
        System.out.println(("Meowing"));
    }
    @Override
    public void play(){
        System.out.println("Cat is playing");
    }
}

public class Interface {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.play();
    }
}
