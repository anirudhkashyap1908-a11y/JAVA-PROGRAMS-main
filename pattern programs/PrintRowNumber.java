import java.util.Scanner;

public class PrintRowNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        
        // Outer loop runs N times (for numbers 1 to N)
        for (int i = 1; i <= n; i++) {
            // Inner loop prints the current number 'i', N times
            for (int j = 1; j <= n; j++) {
                System.out.print(i + " ");
            }
            System.out.println(); // Move to the next line
        }
    }
}