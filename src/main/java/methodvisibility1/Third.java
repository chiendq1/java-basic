package methodvisibility1;

public class Third {

    // get default method in the same package
    public void getDefaultMethod() {
        First first = new First();
        first.defaultMethod();
    }
}
