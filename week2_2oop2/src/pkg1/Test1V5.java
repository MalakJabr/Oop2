package pkg1;

import javax.swing.JOptionPane;
import static pkg1.Util.*;

public class Test1V5 {

    public static void main(String[] args) {
        String str1 = JOptionPane.showInputDialog("Enter n1");
        String str2 = JOptionPane.showInputDialog("Enter n2");

        int n1 = Integer.parseInt(str1);
        int n2 = Integer.parseInt(str2);
        int sum = n1 + n2;
        print(sum);
    }
}
