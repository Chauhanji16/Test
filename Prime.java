import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println("number is not a prime");
        } else {
            int count = 0;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    count++;
                    break;
                }
            }
            if (count==0) {
                System.out.println("Number is prime");
            } else {
                System.out.println("Number is't prime");

            }
        }
        sc.close();
    }
}
