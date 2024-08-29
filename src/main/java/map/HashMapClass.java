package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {
    public static void main(String[] args) {
        // Creating a HashMap to store phone numbers
        Map<String, String> phoneBook = new HashMap<>();

        // Adding entries to the phone book
        phoneBook.put("John Doe", "555-1234");
        phoneBook.put("Jane Smith", "555-5678");
        phoneBook.put("Emily Johnson", "555-8765");

        // Displaying the phone book entries
        System.out.println("Phone Book:");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Retrieving a phone number
        String johnsNumber = phoneBook.get("John Doe");
        System.out.println("\nJohn Doe's Number: " + johnsNumber);

        // Checking if a contact exists
        if (phoneBook.containsKey("Jane Smith")) {
            System.out.println("Jane Smith is in the phone book.");
        }

        // Updating a phone number
        phoneBook.put("Emily Johnson", "555-0000");
        System.out.println("\nUpdated Phone Book:");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Removing a contact from the phone book
        phoneBook.remove("John Doe");
        System.out.println("\nPhone Book after removing John Doe:");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Checking the size of the phone book
        System.out.println("\nNumber of contacts in phone book: " + phoneBook.size());
    }
}
