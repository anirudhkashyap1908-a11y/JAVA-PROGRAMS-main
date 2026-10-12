import java.util.Scanner;

public class PrintStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        
        // Outer loop runs N times (for each row)
        for (int i = 0; i < n; i++) {
            // Inner loop prints N asterisks
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            // Move to the next line after printing N asterisks
            System.out.println();
        }
    }
}