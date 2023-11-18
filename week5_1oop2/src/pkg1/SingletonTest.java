package pkg1;

public class SingletonTest {

    private static SingletonTest instance = new SingletonTest();

    private SingletonTest() {
        System.out.println("new Object has been created");
    }

    public static SingletonTest getInstance() {
        //if (instance == null)
        //instance = new SingletonTest();
        return instance;
    }

    public void hello() {
        System.out.println("hello from singleton");
    }
}
