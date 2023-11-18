
package pkg1;


public class Test {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.setId(10);
        std1.setName("Malak");
        std1.setGpa(4.0);
        
        Student std2 = new Student (20,"kamelea",2.5);
        
        Student std3 = new Student();
        std3.withId(15).withName("Taleen").withGpa(3.9);
        std3.withEmail("m@m.com");
    }
}
