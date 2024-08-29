package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {

    // Inner class for handling LinkedList operations
    class LinkedListHandling {
        public LinkedListHandling() {}

        public void handle() {
            List<String> linkedList = new LinkedList<>();

            // Adding elements
            linkedList.add("Apple");
            linkedList.add("Banana");
            linkedList.add("Cherry");

            // Accessing elements
            String fruit = linkedList.get(1); // Gets the element at index 1
            System.out.println("Element at index 1: " + fruit);

            // Modifying elements
            linkedList.set(2, "Orange"); // Replaces the element at index 2 with "Orange"

            // Removing elements
            linkedList.remove("Banana"); // Removes the element "Banana"
            linkedList.remove(0); // Removes the element at index 0 ("Apple")

            // Iterating over the list
            System.out.println("LinkedList contents:");
            for (String item : linkedList) {
                System.out.println(item);
            }
        }
    }

    // Inner class for handling Vector operations
    class VectorHandling {
        public VectorHandling() {}

        public void handle() {
            List<String> vector = new Vector<>();

            // Adding elements
            vector.add("Apple");
            vector.add("Banana");
            vector.add("Cherry");

            // Accessing elements
            String fruit = vector.get(1); // Gets the element at index 1
            System.out.println("Element at index 1: " + fruit);

            // Modifying elements
            vector.set(2, "Orange"); // Replaces the element at index 2 with "Orange"

            // Removing elements
            vector.remove("Banana"); // Removes the element "Banana"
            vector.remove(0); // Removes the element at index 0 ("Apple")

            // Iterating over the list
            System.out.println("Vector contents:");
            for (String item : vector) {
                System.out.println(item);
            }
        }
    }

    // Inner class for handling ArrayList operations
    class ArrayListHandling {
        public ArrayListHandling() {}

        public void handle() {
            List<String> arrayList = new ArrayList<>();

            // Adding elements
            arrayList.add("Apple");
            arrayList.add("Banana");
            arrayList.add("Cherry");

            // Accessing elements
            String fruit = arrayList.get(1); // Gets the element at index 1
            System.out.println("Element at index 1: " + fruit);

            // Modifying elements
            arrayList.set(2, "Orange"); // Replaces the element at index 2 with "Orange"

            // Removing elements
            arrayList.remove("Banana"); // Removes the element "Banana"
            arrayList.remove(0); // Removes the element at index 0 ("Apple")

            // Iterating over the list
            System.out.println("ArrayList contents:");
            for (String item : arrayList) {
                System.out.println(item);
            }
        }
    }

    public static void main(String[] args) {
        Main mainInstance = new Main();

        // Handling ArrayList
        ArrayListHandling arrayListHandling = mainInstance.new ArrayListHandling();
        arrayListHandling.handle();

        // Handling LinkedList
        LinkedListHandling linkedListHandling = mainInstance.new LinkedListHandling();
        linkedListHandling.handle();

        // Handling Vector
        VectorHandling vectorHandling = mainInstance.new VectorHandling();
        vectorHandling.handle();
    }
}
