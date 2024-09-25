import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        for(String fruit: fruits){
            System.err.println("Fruits : " + fruit);
        }
        
        fruits.remove(1);
        System.out.println(fruits);
    }
}
