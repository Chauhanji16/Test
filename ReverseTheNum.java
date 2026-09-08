import java.util.*;

public class ReverseTheNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give the number");
        int num = sc.nextInt();
        System.out.println("thr riverse of give number is :");
        while (num != 0) {
            int  digit = num % 10;
            System.out.print(digit);
            num = num / 10;
        }
        System.out.println();

    }
}