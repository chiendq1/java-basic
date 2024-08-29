package traversinglist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomTypes {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // Add new Student objects to the list
        students.add(new Student("Alice", 20, "A"));
        students.add(new Student("Bob", 21, "B"));
        students.add(new Student("Charlie", 22, "C"));

        // Traverse the list using different methods
        System.out.println("Traversing using a for-loop:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

        System.out.println("\nTraversing using an enhanced for-loop:");
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("\nTraversing using an Iterator:");
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student);
        }

        System.out.println("\nTraversing using forEach and lambda expression:");
        students.forEach(student -> System.out.println(student));

        // Example of modifying an element
        students.get(1).setGrade("A+");  // Modify Bob's grade
        System.out.println("\nAfter modifying Bob's grade:");
        students.forEach(System.out::println);
    }
}
