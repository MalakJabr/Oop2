package pkg1;

import static pkg1.Util.*;

public class Test1V6 {

    public static void main(String[] args) {
        int n1 = readNumber();
        int n2 = readNumber("Enter n1");
        int sum = n1 + n2;
        print(sum);
    }
}
