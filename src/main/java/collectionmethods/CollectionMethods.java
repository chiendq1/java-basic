package collectionmethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMethods {
    public static void main(String[] args) {
        // Create a Collection of Strings using ArrayList
        Collection<String> collection1 = new ArrayList<>();

        // add(E e): Adds the specified element to the collection
        collection1.add("Apple");
        collection1.add("Banana");
        collection1.add("Orange");

        System.out.println("Collection1 after adding elements: " + collection1);

        // addAll(Collection<? extends E> c): Adds all elements from the specified collection to the current collection
        Collection<String> collection2 = new ArrayList<>();
        collection2.add("Mango");
        collection2.add("Grapes");

        collection1.addAll(collection2);
        System.out.println("Collection1 after adding all elements from Collection2: " + collection1);

        // clear(): Removes all elements from the collection
        collection2.clear();
        System.out.println("Collection2 after clearing: " + collection2);

        // contains(Object o): Returns true if the collection contains the specified element
        boolean containsBanana = collection1.contains("Banana");
        System.out.println("Does Collection1 contain 'Banana'? " + containsBanana);

        // containsAll(Collection<?> c): Returns true if the collection contains all elements of the specified collection
        Collection<String> collection3 = Arrays.asList("Apple", "Mango");
        boolean containsAll = collection1.containsAll(collection3);
        System.out.println("Does Collection1 contain all elements of Collection3? " + containsAll);

        // isEmpty(): Returns true if the collection contains no elements
        boolean isCollection2Empty = collection2.isEmpty();
        System.out.println("Is Collection2 empty? " + isCollection2Empty);

        // iterator(): Returns an iterator over the elements in the collection
        System.out.println("Iterating over Collection1:");
        Iterator<String> iterator = collection1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // remove(Object o): Removes a single instance of the specified element from the collection, if present
        collection1.remove("Apple");
        System.out.println("Collection1 after removing 'Apple': " + collection1);

        // removeAll(Collection<?> c): Removes all elements in the current collection that are also contained in the specified collection
        Collection<String> collection4 = Arrays.asList("Banana", "Grapes");
        collection1.removeAll(collection4);
        System.out.println("Collection1 after removing all elements of Collection4: " + collection1);

        // retainAll(Collection<?> c): Retains only the elements in the current collection that are also contained in the specified collection
        Collection<String> collection5 = Arrays.asList("Mango");
        collection1.retainAll(collection5);
        System.out.println("Collection1 after retaining only elements in Collection5: " + collection1);

        // size(): Returns the number of elements in the collection
        int size = collection1.size();
        System.out.println("Size of Collection1: " + size);

        // toArray(): Returns an array containing all elements in the collection
        Object[] array = collection1.toArray();
        System.out.println("Array created from Collection1: " + Arrays.toString(array));

        // toArray(T[] a): Returns an array containing all elements in the collection, the runtime type of the returned array is that of the specified array
        String[] stringArray = new String[collection1.size()];
        collection1.toArray(stringArray);
        System.out.println("String array created from Collection1: " + Arrays.toString(stringArray));
    }
}
