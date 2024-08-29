package methodvisibility2;

public class Second {
    public Second() {}

    public void publicMethod() {
        System.out.println("publicMethod2");
    }

    protected void protectedMethod() {
        System.out.println("protectedMethod2");
    }

    private void privateMethod() {
        System.out.println("privateMethod2");
    }

    //using private method in same class
    public void getPrivateMethod() {
        privateMethod();
    }

    void defaultMethod() {
        System.out.println("defaultMethod2");
    }
}
