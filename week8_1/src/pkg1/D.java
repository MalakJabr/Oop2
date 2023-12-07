package pkg1;

public class D extends C {

    public void m1(String s) {
        A a = new A();
        a.m1(s.toCharArray());
    }
}
