import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        
        LinkedList<String> linkedList = new LinkedList<>();
        
        linkedList.add("Ikmal");
        linkedList.add("Anas");
        linkedList.add("Aidid");

        System.out.println("LinkedList: " + linkedList);
        
        linkedList.addFirst("Start");
        linkedList.addLast("End");
        
        System.out.println("First element: " + linkedList.getFirst());
        System.out.println("Last element: " + linkedList.getLast());
        
        linkedList.removeFirst(); 
        linkedList.removeLast();  
        System.out.println("After removals: " + linkedList);

        if (linkedList.contains("Anas")) {
            System.out.println("LinkedList contains Anas");
        }

        System.out.println("Iterating through LinkedList:");
        for (String name : linkedList) {
            System.out.println(name);
        }
    }
}
