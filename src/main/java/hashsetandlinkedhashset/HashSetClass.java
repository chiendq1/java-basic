package hashsetandlinkedhashset;

import java.util.HashSet;

public class HashSetClass {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> fruits = new HashSet<>();

        // Adding elements to the HashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Apple"); // Duplicate element

        // Trying to add a duplicate element
        boolean isAdded = fruits.add("Apple"); // Will return false
        System.out.println("Was 'Apple' added again? " + isAdded);

        // HashSet allows one null element
        fruits.add(null);
        fruits.add(null); // Trying to add null again

        // Printing the HashSet (unordered and no duplicates)
        System.out.println("HashSet contents:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Checking if an element is present
        boolean containsBanana = fruits.contains("Banana");
        System.out.println("Does the HashSet contain 'Banana'? " + containsBanana);

        // Removing an element
        fruits.remove("Cherry");

        // HashSet after removal
        System.out.println("HashSet contents after removal:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Size of the HashSet
        int size = fruits.size();
        System.out.println("Size of the HashSet: " + size);
    }
}
