import java.util.Scanner;

public class HomeWork2 {
    public static void main(String args[]) {
        double a, b;

        System.out.println("Enter the first integer number:");
        Scanner mScanner = new Scanner(System.in);
        a = mScanner.nextInt();

        int x;
        System.out.println("Choose your action by number:");
        System.out.println("1 - sum");
        System.out.println("2 - deduction");
        System.out.println("3 - multiplication");
        System.out.println("4 - division");

        for (x = mScanner.nextInt(); x == 0 || x > 4;) {
            System.out.println("Choose again!");
            x = mScanner.nextInt();
        }

        System.out.println("Enter the second integer number:");
        for (b = mScanner.nextInt(); b == 0;) {
            System.out.println("DIVISION BY ZERO !!! Try again:");
            b = mScanner.nextInt();
        }

        switch (x) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println(a / b);
                break;
        }
        
        System.out.println("THE END");
    }
}

