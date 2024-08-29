package generic;

public class GenericMethod {

    // Generic method to print an array of any type
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Generic method to find the maximum element in an array of Comparable items
    public static <T extends Comparable<T>> T findMax(T[] array) {
        if (array == null || array.length == 0) {
            return null; // or throw an exception
        }

        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // Integer array
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.print("Integer Array: ");
        printArray(intArray);

        // String array
        String[] strArray = {"apple", "orange", "banana", "pear"};
        System.out.print("String Array: ");
        printArray(strArray);

        // Double array
        Double[] doubleArray = {3.5, 1.2, 4.8, 2.3};
        System.out.print("Double Array: ");
        printArray(doubleArray);

        // Finding the maximum in different types of arrays
        System.out.println("Max in Integer Array: " + findMax(intArray));
        System.out.println("Max in String Array: " + findMax(strArray));
        System.out.println("Max in Double Array: " + findMax(doubleArray));
    }
}

