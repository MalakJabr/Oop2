package pkg1;

public class Test {

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRod(3);
        System.out.println(c1.getRound() + "\n" + c1.getArea());
        Circle c2 = new Circle();
        c2.setRod(10);
        System.out.println(c2.getRound() + "\n" + c2.getArea());
    }
    
}
