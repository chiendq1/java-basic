package instanceandstatic;

public class Static {
    public static int staticCount = 0; // Static variable
    public int instanceCount = 0;      // Instance variable

    public Static() {
        staticCount++;
        instanceCount++;
    }

    public static void staticMethod() {
        System.out.println("This is a static method.");
        // Cannot access instanceCount here, because it's not static.
    }

    public void instanceMethod() {
        System.out.println("This is an instance method.");
        // Can access both static and instance variables here.
        System.out.println("Static count: " + staticCount);
        System.out.println("Instance count: " + instanceCount);
    }

    public static void main(String[] args) {
        Static obj1 = new Static();
        Static obj2 = new Static();
        Static obj3 = new Static();

        System.out.println("Static Count after creating 3 objects: " + Static.staticCount);
        System.out.println("Instance Count for obj1: " + obj1.instanceCount);
        System.out.println("Instance Count for obj2: " + obj2.instanceCount);
        System.out.println("Instance Count for obj3: " + obj3.instanceCount);

        obj1.instanceMethod();
        Static.staticMethod();
    }
}
