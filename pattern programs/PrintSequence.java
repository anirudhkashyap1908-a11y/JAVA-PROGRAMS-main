import java.util.Scanner;

public class PrintSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        
        // Outer loop runs N times (rows)
        for (int i = 1; i <= n; i++) {
            // Inner loop prints 1 to N
            for (int j = 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Move to the next line
        }
    }
}