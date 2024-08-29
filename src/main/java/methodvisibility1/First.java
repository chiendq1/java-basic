package methodvisibility1;

public class First {

    public First() {}

    public void publicMethod() {
        System.out.println("publicMethod");
    }

    protected void protectedMethod() {
        System.out.println("protectedMethod");
    }

    private void privateMethod() {
        System.out.println("privateMethod");
    }

    void defaultMethod() {
        System.out.println("defaultMethod");
    }
}
