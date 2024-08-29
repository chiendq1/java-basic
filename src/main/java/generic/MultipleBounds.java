package generic;

// A class that represents a creature
class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
}

// An interface that specifies the ability to fly
interface Flyable {
    void fly();
}

// An interface that specifies the ability to swim
interface Swimmable {
    void swim();
}

// A generic class with multiple bounds
class SuperCreature<T extends Animal & Flyable & Swimmable> {
    private T creature;

    // Constructor
    public SuperCreature(T creature) {
        this.creature = creature;
    }

    // Method to make the creature perform its abilities
    public void performAbilities() {
        creature.eat();    // Inherited from Animal
        creature.fly();    // Provided by Flyable
        creature.swim();   // Provided by Swimmable
    }
}

// A class that extends Animal and implements both Flyable and Swimmable
class Duck extends Animal implements Flyable, Swimmable {
    public void fly() {
        System.out.println("Duck is flying");
    }

    public void swim() {
        System.out.println("Duck is swimming");
    }
}

public class MultipleBounds {
    public static void main(String[] args) {
        // Creating a Duck instance
        Duck duck = new Duck();

        // Creating a SuperCreature instance with a Duck
        SuperCreature<Duck> superDuck = new SuperCreature<>(duck);

        // Performing the abilities of the duck
        superDuck.performAbilities();
    }
}

