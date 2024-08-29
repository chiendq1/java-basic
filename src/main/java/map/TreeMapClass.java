package map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapClass {
    public static void main(String[] args) {
        // Creating a TreeMap to store student names and their grades
        Map<String, Integer> studentGrades = new TreeMap<>();

        // Adding entries to the TreeMap
        studentGrades.put("David", 65);
        studentGrades.put("Bob", 75);
        studentGrades.put("Alice", 85);
        studentGrades.put("Charlie", 90);

        // Displaying the TreeMap (which will be sorted by keys)
        System.out.println("TreeMap (Sorted by Student Names):");
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Retrieving a value
        int grade = studentGrades.get("Charlie");
        System.out.println("\nCharlie's Grade: " + grade);

        // Removing an entry
        studentGrades.remove("David");
        System.out.println("\nTreeMap after removing David:");
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
