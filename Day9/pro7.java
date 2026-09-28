public class pro7 {
    public static float add(int a, int b){
        return a+b;
    }
    public static float subtract(int a, int b){
        return a-b;
    }
    public static float multiply(int a, int b){
        return a*b;
    }
    public static float divide(int a, int b){
        return a/b;
    }

    public static void main(String[] args) {
        System.out.println("Addition is " + add(3,4));
        System.out.println("Subtraction is " + subtract(3,4));
        System.out.println("Multiplication is " + multiply(3,4));
        System.out.println("Division is " + divide(3,4));
    }
}
