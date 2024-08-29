package methodvisibility1;

import methodvisibility2.Second;

public class SecondSubClass extends Second {
    public SecondSubClass() {
        super();
    }

    // use protected method in subclass, different package
    protected void getProtectedMethod() {
        protectedMethod();
    }
}
