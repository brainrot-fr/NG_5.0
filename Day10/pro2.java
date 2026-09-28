public class pro2 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display();
        Child child = new Child();
        child.display();
        Parent parentChild = new Child();
        parentChild.display();
    }
}

class Parent {
    public void display(){
        System.out.println("This is the Parent Class");
    }
}

class Child extends Parent{
    public void display(){
        System.out.println("This is a Child Class");
    }
    
}
