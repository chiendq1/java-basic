package basicoop;

abstract class Vehicle {
    String name;
    String type;

    public Vehicle(String name, String type) {
        this.name = name;
        this.type = type;
    }

    abstract String getDetails();
}
