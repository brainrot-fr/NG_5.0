import java.util.Scanner;

public class pro1 {
    public static void main(String[] args){
        Scanner getInt = new Scanner(System.in);

        System.out.print("\nEnter a time in 24 hour format ex.(0000-2359):");
        int time = getInt.nextInt();

        if(time >= 0400 && time <= 1159){
            System.out.println("Good Morning.");
        }
        else if(time >= 1200 && time <= 0330){
            System.out.println("Good Afternoon.");
        }
        else if(time >= 0331 && time <= 2000){
            System.out.println("Good Evening.");
        }
        else if (time >= 2001 && time <= 0400){
            System.out.println("its late at night sleep, dumbass");
        }
        else{
            System.out.println("idiot, enter correct format!");
            main(args);
        }
        getInt.close();
    }
}
