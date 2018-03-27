import java.util.Scanner;

public class HomeWork2 {
    public static void main(String args[]) {
        int a, b;
        System.out.println("Enter the first integer number:");
        Scanner scn = new Scanner(System.in);
        a = scn.nextInt();
        System.out.println("Enter the second integer number:");
        b = scn.nextInt();
        int c = a + b;
        int d = a - b;
        int e = a * b;
        float f = (float) a / b;
        System.out.println("Choose your action by number:");
        System.out.println("1 - sum");
        System.out.println("2 - deduction");
        System.out.println("3 - multiplication");
        System.out.println("4 - division");
        int x = scn.nextInt();
        if (x == 1) System.out.println(c);
        if (x == 2) System.out.println(d);
        if (x == 3) System.out.println(e);
        if (x == 4) System.out.println(f);
        System.out.println("THE END");

    }
}
