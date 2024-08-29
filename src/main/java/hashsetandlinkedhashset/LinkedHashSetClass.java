package hashsetandlinkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSetClass {
    public static void main(String[] args) {
        // Create a LinkedHashSet
        LinkedHashSet<String> fruits = new LinkedHashSet<>();

        // Adding elements to the LinkedHashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Apple"); // Duplicate element

        // Trying to add a duplicate element
        boolean isAdded = fruits.add("Apple"); // Will return false
        System.out.println("Was 'Apple' added again? " + isAdded);

        // LinkedHashSet allows one null element
        fruits.add(null);
        fruits.add(null); // Trying to add null again

        // Printing the LinkedHashSet (maintains insertion order)
        System.out.println("LinkedHashSet contents:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Checking if an element is present
        boolean containsBanana = fruits.contains("Banana");
        System.out.println("Does the LinkedHashSet contain 'Banana'? " + containsBanana);

        // Removing an element
        fruits.remove("Cherry");

        // LinkedHashSet after removal
        System.out.println("LinkedHashSet contents after removal:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Size of the LinkedHashSet
        int size = fruits.size();
        System.out.println("Size of the LinkedHashSet: " + size);
    }
}
