import java.util.Scanner;

public class VotingEligibility {
    public static boolean isEligible(int age) {
        // Based on the document text: "A person of age > 18 is eligible to vote."
        return age > 18; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        
        if (isEligible(age)) {
            System.out.println("Eligible to vote.");
        } else {
            System.out.println("Not eligible to vote.");
        }
    }
}