public class pro1 {
    // attributes
        String name;
        int age;
    
    // methods
    public void displayName(){
        System.out.print(name);
        System.out.println(" is " + age + " years old.");
    }
    public static void main(String[] args) {
        // pro1 person = new pro1();

        // person.name = "John Doe";
        // person.age = 19;

        // person.displayName();

        Student student1 = new Student();

        student1.name = "Akshay Reddy";
        student1.email = "sunkariakshayreddy@gmail.com";
        student1.mobile = "9192101293";
        student1.hallTicketNumber = "23R91A04N1";

        student1.display();

        Mobile oppo = new Mobile();

        oppo.brandName = "OPPO";
        oppo.model = "A57 4G";
        oppo.price = 120;

        oppo.display();

    }
}

class Student {
    String name;
    String email;
    String mobile;
    String hallTicketNumber;

    public void display(){
        System.out.println("Name of the Student                             : " + name);
        System.out.println("Email of the Student                            : " + email);
        System.out.println("Mobile number of the Student                    : " + mobile);
        System.out.println("Hall Ticket number (Roll no.) of the Student    : " + hallTicketNumber);

    }
}

class Mobile {
    String brandName;
    String model;
    int price;


    public void display(){
        System.out.println("Brand Name : " + brandName);
        System.out.println("Model Name : " + model);
        System.out.println("Price      : $" + price);
    }
}