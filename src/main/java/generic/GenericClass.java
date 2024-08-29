package generic;

// Defining a generic class called Box
class Box<T> {
    // T is a type parameter that will be replaced with a specific type when the class is used
    private T content;

    // Constructor to initialize the content
    public Box(T content) {
        this.content = content;
    }

    // Getter method to retrieve the content
    public T getContent() {
        return content;
    }

    // Setter method to set or update the content
    public void setContent(T content) {
        this.content = content;
    }

    // Method to display the content
    public void displayContent() {
        System.out.println("Content: " + content);
    }
}

public class GenericClass {
    public static void main(String[] args) {
        // Creating a Box instance for Integer
        Box<Integer> integerBox = new Box<>(123);
        integerBox.displayContent();  // Output: Content: 123

        // Creating a Box instance for String
        Box<String> stringBox = new Box<>("Hello, Generics!");
        stringBox.displayContent();  // Output: Content: Hello, Generics!

        // Creating a Box instance for a custom type (e.g., Double)
        Box<Double> doubleBox = new Box<>(45.67);
        doubleBox.displayContent();  // Output: Content: 45.67

        // Updating the content of the stringBox
        stringBox.setContent("Updated Content");
        stringBox.displayContent();  // Output: Content: Updated Content

        // Retrieving and displaying the content
        Integer integerContent = integerBox.getContent();
        System.out.println("Integer Content: " + integerContent);  // Output: Integer Content: 123
    }
}

