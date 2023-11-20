package pkg1;

public class AFactory {

    public A create(int type) {
        if (type == 1) {
            return new B();
        } else if (type == 2) {
            return new C();
        }
        return null;
    }
}
