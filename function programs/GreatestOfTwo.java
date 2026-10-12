import java.util.Scanner;

public class GreatestOfTwo {
    public static int getGreatest(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int greatest = getGreatest(a, b);
        System.out.println("The greatest number is: " + greatest);
    }
}