package pkg1;

public class B extends C {
    
    public C c;
    
    public void setC(C c) {
        this.c = c;
    }

    public void process() {
      c.m1("hello");
    }
}
