import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class AgeCheck1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your age");
    int age = sc.nextInt();
    try {
        if(age < 18) {
            throw new InvalidAgeException("Age must be greater than or equal to 18");
        }
        System.out.println("Age is accepted ! You are eligible to vote ");
    } catch(InvalidAgeException e) {
        System.out.println("Exception: " + e.getMessage());
    }
    System.out.println("Program continues after handling exceptions");
    sc.close();
    }
}

