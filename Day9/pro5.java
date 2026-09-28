import java.util.Random;
import java.util.Scanner;

public class pro5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int randomNumber = rand.nextInt(100);
        System.out.println("\n<==========Guessing Game==========>");
        System.out.print("Guess the Number (0-100):");
        int guess = scanner.nextInt();
        int guessesTaken = 1;
        while (guess != randomNumber) {
            guessesTaken++;
            System.out.println("The number guessed number is  wrong! Try Again.\n");
            System.out.print("Hint: ");
            if (guess > randomNumber) {
                System.out.println("The number is Less than " + guess + ".");

            } else if (guess < randomNumber) {
                System.out.println("The number is Greater than " + guess + ".");
            }
            System.out.print("Guess the Number (0-100):");
            guess = scanner.nextInt();
        }
        System.out.println("\n\n<==============================>");
        System.out.println("Congratulations! you guessed the number. It was " + guess);
        System.out.println("you took " + guessesTaken + " guesses");
        scanner.close();
    }
}
