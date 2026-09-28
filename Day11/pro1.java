import java.util.Scanner;

public class pro1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter first Number: ");
            float fnum = scanner.nextInt();

            System.out.print("Enter Second Number: ");
            float snum = scanner.nextInt();
            float division;

            division = fnum / snum;
            System.out.println(fnum + "/" + snum + " = " + division);
        } catch (ArithmeticException e) {
            System.out.println("Error! Division by 0. ");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }

        scanner.close();
    }
}