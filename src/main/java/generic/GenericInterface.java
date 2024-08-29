package generic;

import java.util.ArrayList;
import java.util.List;

// Defining a generic interface called Container
interface Container<T> {
    void add(T item);           // Method to add an item
    T get(int index);           // Method to get an item at a specific index
    int size();                 // Method to get the size of the container
}

// Implementing the generic interface with an ArrayList
class ListContainer<T> implements Container<T> {
    private List<T> items = new ArrayList<>();

    @Override
    public void add(T item) {
        items.add(item);
    }

    @Override
    public T get(int index) {
        return items.get(index);
    }

    @Override
    public int size() {
        return items.size();
    }
}

public class GenericInterface {
    public static void main(String[] args) {
        // Creating a ListContainer instance for Integer
        Container<Integer> integerContainer = new ListContainer<>();
        integerContainer.add(10);
        integerContainer.add(20);
        integerContainer.add(30);

        // Displaying the elements in the Integer container
        System.out.println("Integer Container:");
        for (int i = 0; i < integerContainer.size(); i++) {
            System.out.println(integerContainer.get(i));
        }

        // Creating a ListContainer instance for String
        Container<String> stringContainer = new ListContainer<>();
        stringContainer.add("Hello");
        stringContainer.add("World");
        stringContainer.add("Generics");

        // Displaying the elements in the String container
        System.out.println("\nString Container:");
        for (int i = 0; i < stringContainer.size(); i++) {
            System.out.println(stringContainer.get(i));
        }
    }
}

