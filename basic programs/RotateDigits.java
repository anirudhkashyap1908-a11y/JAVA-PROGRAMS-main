import java.util.Scanner;

public class RotateDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        String nStr = sc.next();
        System.out.print("Enter K: ");
        int k = sc.nextInt();
        
        int len = nStr.length();
        
        // Normalize K in case it is larger than the number of digits
        k = k % len;
        
        // If K is negative (right rotation), equivalent to left rotating by (len + k)
        if (k < 0) {
            k += len;
        }
        
        // Perform the rotation
        String rotatedStr = nStr.substring(k) + nStr.substring(0, k);
        
        System.out.println("Output: " + rotatedStr);
    }
}