import java.util.Scanner;

public class AverageOfThree {
    public static void printAverage(double a, double b, double c) {
        double average = (a + b + c) / 3.0;
        System.out.println("The average is: " + average);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        
        printAverage(num1, num2, num3);
    }
}