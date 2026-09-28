import java.util.Scanner;

public class pro5 {
    public static void main(String[] args) {
       
        Scanner thisIsAScanner = new Scanner(System.in);

        int age = thisIsAScanner.nextInt();

        System.out.println(age + " is your age dumbo");

        thisIsAScanner.close();
    }
}