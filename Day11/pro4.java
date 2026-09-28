import java.util.Scanner;

public class pro4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        try {
            String abc = "1231";
            int convertedInt = Integer.parseInt(abc);
            System.out.println("Converted String to int: " + convertedInt);
        } catch (NumberFormatException e){
            System.out.println("Error! " + e.getClass() + " " + e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("<==== Execution Complete ====>\n");
        }

        sc.close();
    }
}
