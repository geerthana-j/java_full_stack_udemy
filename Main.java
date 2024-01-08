import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList to store names
        ArrayList<String> namesList = new ArrayList<>();

        // Add names to the list
        namesList.add("Alice");
        namesList.add("Bob");
        namesList.add("Charlie");
        namesList.add("David");

        // Display the elements using a for-each loop
        System.out.println("Names in the list:");
        for (String name : namesList) {
            System.out.println(name);
        }

        // Remove an element from the list
        namesList.remove("Bob");

        // Display the modified list
        System.out.println("\nNames after removing 'Bob':");
        for (String name : namesList) {
            System.out.println(name);
        }

        // Use an Iterator to go through the list
        System.out.println("\nNames using Iterator:");
        Iterator<String> iterator = namesList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
