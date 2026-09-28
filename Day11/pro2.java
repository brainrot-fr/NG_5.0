import java.util.Scanner;

public class pro2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int[] arr = { 1, 2, 3, 4, 5 };
            System.out.println("6th Element of array is : " + arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error! " + e.getMessage() + " in Array 'arr'");
        } catch (Exception e) {
            System.out.println(e);
        }

        sc.close();
    }
}
