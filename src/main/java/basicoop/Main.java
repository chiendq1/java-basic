package basicoop;

public class Main {
    public static void main(String[] args) {

        // Stack: car is a reference variable are stored in stack
        // car variable point to Car object stored in heap
        Car car = new Car("Toyota camry", "sedan", (short) 2023);

        // car reference is used to access the object on heap
        System.out.println(car.move());
    }
}
