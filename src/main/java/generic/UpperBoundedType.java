package generic;

// A generic class with an upper-bounded type parameter
class NumberBox<T extends Number> {
    private T value;

    // Constructor to initialize the value
    public NumberBox(T value) {
        this.value = value;
    }

    // Method to get the value
    public T getValue() {
        return value;
    }

    // Method to display the double value of the number
    public void showDoubleValue() {
        System.out.println("Double Value: " + value.doubleValue());
    }
}

public class UpperBoundedType {

    // Generic method with an upper-bound that calculates the sum of an array of numbers
    public static <T extends Number> double calculateSum(T[] numbers) {
        double sum = 0.0;
        for (T number : numbers) {
            sum += number.doubleValue();
        }

        return sum;
    }

    public static void main(String[] args) {
        // Creating NumberBox instances with different types of numbers
        NumberBox<Integer> intBox = new NumberBox<>(10);
        NumberBox<Double> doubleBox = new NumberBox<>(15.5);
        NumberBox<Float> floatBox = new NumberBox<>(7.3f);

        // Displaying double values
        intBox.showDoubleValue();   // Output: Double Value: 10.0
        doubleBox.showDoubleValue(); // Output: Double Value: 15.5
        floatBox.showDoubleValue();  // Output: Double Value: 7.3

        // Calculating the sum of an array of different types of numbers
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.5, 2.5, 3.5, 4.5};
        Float[] floatArray = {1.1f, 2.2f, 3.3f};

        System.out.println("Sum of intArray: " + calculateSum(intArray));   // Output: Sum of intArray: 15.0
        System.out.println("Sum of doubleArray: " + calculateSum(doubleArray)); // Output: Sum of doubleArray: 12.0
        System.out.println("Sum of floatArray: " + calculateSum(floatArray));  // Output: Sum of floatArray: 6.6
    }
}

