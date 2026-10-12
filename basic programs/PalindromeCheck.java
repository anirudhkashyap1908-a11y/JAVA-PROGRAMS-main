import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int originalNum = num;
        int reversedNum = 0;
        
        int temp = num;
        while (temp > 0) {
            int remainder = temp % 10;
            reversedNum = reversedNum * 10 + remainder;
            temp /= 10;
        }
        
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }
    }
}