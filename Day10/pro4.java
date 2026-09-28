abstract class Sunstar {
    abstract void display();
}

class Sun extends Sunstar {

    String name;
    int age;
    double salary;

    void display() {
        System.out.println("Name : " + this.name);
        System.out.println("age : " + this.age);
        System.out.println("Salary : " + this.salary);

    }
}

public class pro4 {
    public static void main(String[] args) {
        Sun abstractClass = new Sun();
        abstractClass.name  = "This is Sun Class";
        abstractClass.display();
    }
}
