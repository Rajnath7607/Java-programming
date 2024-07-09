 import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your guess number: ");
        int guess = scanner.nextInt();
        
        System.out.println("You guessed: " + guess);
        
        scanner.close();
    }
}
  