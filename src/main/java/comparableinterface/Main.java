package comparableinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a list of Person objects
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));
        people.add(new Person("David", 28));

        // Display the list before sorting
        System.out.println("Before sorting:");
        for (Person person : people) {
            System.out.println(person);
        }

        // Sort the list using Collections.sort() (relies on compareTo)
        Collections.sort(people);

        // Display the list after sorting by age
        System.out.println("\nAfter sorting by age:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
