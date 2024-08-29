package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapClass {
    public static void main(String[] args) {
        // Creating a LinkedHashMap to store book titles and their publication year
        Map<String, Integer> bookLibrary = new LinkedHashMap<>();

        // Adding entries to the LinkedHashMap
        bookLibrary.put("To Kill a Mockingbird", 1960);
        bookLibrary.put("1984", 1949);
        bookLibrary.put("The Great Gatsby", 1925);
        bookLibrary.put("Moby Dick", 1851);

        // Displaying the LinkedHashMap (which will maintain insertion order)
        System.out.println("LinkedHashMap (Insertion Order):");
        for (Map.Entry<String, Integer> entry : bookLibrary.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Retrieving a value
        int year = bookLibrary.get("1984");
        System.out.println("\nPublication Year of '1984': " + year);

        // Removing an entry
        bookLibrary.remove("Moby Dick");
        System.out.println("\nLinkedHashMap after removing 'Moby Dick':");
        for (Map.Entry<String, Integer> entry : bookLibrary.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
