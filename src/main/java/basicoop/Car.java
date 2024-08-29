package basicoop;

public class Car extends Vehicle implements Movable{
    short year;

    public Car(String name, String type, short year) {
        super(name, type);
        this.year = year;
    }

    @Override
    public String getDetails() {
        return this.name + " " + this.type + " " + this.year ;
    }

    public String move() {
        return "This is " + this.name + " type " + this.type + " mmodel " + this.year;
    }
}
