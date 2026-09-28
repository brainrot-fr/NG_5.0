import java.util.Scanner;

public class pro3 {
    public static void main(String[] args) {
        Scanner getInt = new Scanner(System.in);


        System.out.println("********MENU*********");
        System.out.println("1. Pizza");
        System.out.println("2. biryani");

        System.out.print("\nEnter age: ");
        int age = getInt.nextInt();

        
        getInt.close();
    }
}
