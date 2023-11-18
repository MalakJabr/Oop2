
package pkg1;


public class SimpleCalculatorV2 {
    public static void main(String[] args) {
        int n1 = Util.readNumber("Enter n1");
        int n2 = Util.readNumber("Enter n2");
        boolean exit = false;
        while (!exit) {
            int ch = showMenu();
            switch (ch){
                 case 1:
                Util.print( n1 + n2);
                break;
                 case 2:
                Util.print( n1 - n2);
                break;
                 case 3:
                Util.print( n1 * n2);
                break;
                 case 4:
                Util.print( n1 / n2);
                break;
                default:
                Util.print("Invalid Input");
            }
        }
    }
    private static int showMenu(){
        Util.print("1- Add");
            Util.print("2- Sub");
            Util.print("3- Mul");
            Util.print("4- Div");
            Util.print("5- Quit");
            Util.print("----------------");
            int ch = Util.readNumber("Please enter your choice");
            return ch;
    }
}
