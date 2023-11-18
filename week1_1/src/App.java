import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int number1 = in.nextInt();
        System.out.println("Enter the second number");
        int number2 = in.nextInt();
        System.out.println("1- Add");
        System.out.println("2- Sub");
        System.out.println("3- Mul");
        System.out.println("4- Div");
        System.out.println("Please enter the number you choice from 1 to 4");

        int choice = in.nextInt();
        System.out.println(mathematicalOperations(number1, number2, choice));
    }

    public static int mathematicalOperations(int num1, int num2, int cho) {
        switch (cho) {
            case 1:
                return num1 + num2;

            case 2:
                return num1 - num2;

            case 3:
                return num1 * num2;

            case 4:
                return num1 / num2;
            default:
                return 0;
        }
    }
}
