import java.util.*;

public class ass2 {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

      
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Linked List: " + list);

        
        list.addFirst(5);

        System.out.println("After inserting: " + list);

        
        list.addLast(50);

        System.out.println("After adding last: " + list);

      
        list.removeFirst();

        System.out.println("After deleting first: " + list);

        
        list.removeLast();

        System.out.println("After deleting last: " + list);

        
        System.out.println("First element: " + list.getFirst());

       
        System.out.println("Last element: " + list.getLast());

        
        System.out.println("Size: " + list.size());
    }
}