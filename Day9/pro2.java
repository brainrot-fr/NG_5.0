import java.util.Scanner;

public class pro2 {
    public static void main(String[] args) {
        Scanner getInt = new Scanner(System.in);

        System.out.print("\nEnter first number: ");
        int fnum = getInt.nextInt();

        System.out.print("\nEnter second number: ");
        int snum = getInt.nextInt();

        System.out.print("\nEnter third number: ");
        int tnum = getInt.nextInt();

        if (fnum > snum && fnum > tnum) {
            System.out.println( fnum + " is the greatest.");
        } else if (snum > tnum && snum > fnum) {
            System.out.println(snum + " is the greatest.");
        } else if (tnum > snum && tnum > fnum) {
            System.out.println(tnum + " is the greatest.");
        } else {
            System.out.println("All numbers are equal.");
        }
        getInt.close();
    }
}
