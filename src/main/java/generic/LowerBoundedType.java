package generic;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundedType {

    // A generic method with a lower-bounded wildcard
    public static void addNumbers(List<? super Integer> list) {
        // Adding integers to the list
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
    }

    public static void main(String[] args) {
        // Creating a list of Number (superclass of Integer)
        List<Number> numberList = new ArrayList<>();

        // Adding integers to the list using the lower-bounded generic method
        addNumbers(numberList);

        // Displaying the elements in the list
        System.out.println("Elements in numberList: " + numberList);

        // Creating a list of Object (superclass of Number)
        List<Object> objectList = new ArrayList<>();

        // Adding integers to the list using the lower-bounded generic method
        addNumbers(objectList);

        // Displaying the elements in the list
        System.out.println("Elements in objectList: " + objectList);
    }
}
