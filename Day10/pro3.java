public class pro3 {
    public static void main(String[] args) {
        Truck bus = new Truck();
        Car swift = new Car();
    }
}

class Vehicle {
    Vehicle(){
        System.out.println("This is a Vehicle.");
    }
}

class Car extends Vehicle {
    Car(){
        System.out.println("This is a Car, extended from Vehicle");
    }
}

class Truck extends Vehicle {
    Truck(){
        System.out.println("This is a Truck, extended from Vehicle");
    }
}