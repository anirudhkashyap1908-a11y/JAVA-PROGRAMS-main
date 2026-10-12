import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first positive integer (a): ");
        int a = sc.nextInt();
        System.out.print("Enter second positive integer (b): ");
        int b = sc.nextInt();
        
        long lhs = (long) Math.pow(a + b, 2);
        long rhs = (long) (Math.pow(a, 2) + Math.pow(b, 2) + (2 * a * b));
        
        if (lhs == rhs) {
            System.out.println("VERIFIED");
        } else {
            System.out.println("NOT VERIFIED");
        }
    }
}