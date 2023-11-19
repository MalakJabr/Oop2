package pkg1;

public class FactoryTest {

    public A create(int type) {
        switch (type) {
            case 1:
                return new B();
            case 2:
                return new C();
            default:
                return null;
        }
    }

}
