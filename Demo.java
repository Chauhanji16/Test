import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int a = sc.nextInt();

        System.out.println("Enter the second number:");
        int b = sc.nextInt();

        average(a, b);
        swap(a, b);
        max(a, b);
        evenOdd(a);
        numberCheck(a);
    }

    public static void average(int a, int b) {
        System.out.println("Average = " + (a + b) / 2.0);
    }

    public static void swap(int a, int b) {
        int c = a;
        a = b;
        b = c;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    public static void max(int a, int b) {
        if (a > b) {
            System.out.println("a is greatest number");
        } else {
            System.out.println("b is greatest number");
        }
    }

    public static void evenOdd(int a) {
        if (a % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }

    public static void numberCheck(int a) {
        if (a > 0) {
            System.out.println("Number is positive");
        } else if (a < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }
    }
}