import java.util.*;

public class Perfectnum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int sum = 0;
        System.out.println("enter the number");
        int n = sc.nextInt();
          
        System.out.println("given num fully  divisible by :");
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                sum = sum + i;
            }
        }
        if (sum == n) {
            System.out.println("this  is perfect number  : " +n+" = " + sum);
        } else {
            System.out.println("this is not a perfect number  : " +n+" !=  " + sum);
        }
    }
}
