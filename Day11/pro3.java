import java.util.Scanner;

public class pro3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String name = null;
            System.out.println("Length of Name " + name.length());    
        } catch (NullPointerException e){
            System.out.println("Error! " + e.getClass() );
        } catch (Exception e){
            System.out.println("Error! unexpected error occured.");
            System.out.println(e.getLocalizedMessage());
        }
        sc.close();
    }
}
