package pkg1;

public class Test {

    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();
        A a2 = b1;
        B b3 = (B) a2;
        A a3 = new B();
        AFactory T1 = new AFactory();
        A a4 = T1.create(1);
        a4.m3();
        A a5 = T1.create(2);
        a5.m3();

    }
}
