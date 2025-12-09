package io.udlbu.oop_3;

/*
🧬 Ta klasa pokazuje DWA pojęcia w jednym miejscu:
1️⃣ DZIEDZICZENIE – tworzenie nowych klas na podstawie istniejącej klasy bazowej
2️⃣ RZUTOWANIE TYPÓW – zamiana referencji na bardziej szczegółowy typ, aby uzyskać dostęp do metod specyficznych dla danej klasy
*/

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    void honk() {
        System.out.println("Car is honking!");
    }
}

class Boat extends Vehicle {
    void anchor() {
        System.out.println("Boat is dropping anchor!");
    }
}

class Plane extends Vehicle {
    void takeOff() {
        System.out.println("Plane is taking off!");
    }
}

class Bike extends Vehicle {
    void ringBell() {
        System.out.println("Bike bell rings!");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // Tworzymy 4 obiekty typu Vehicle
        Vehicle car = new Car();
        Vehicle boat = new Boat();
        Vehicle plane = new Plane();
        Vehicle bike = new Bike();


        // Przykład polimorfizmu w pętli + rzutowanie

        Vehicle[] vehicles = { car, boat, plane, bike };

        for (Vehicle v : vehicles) {
            v.start();

            // Rzutowanie do konkretnych typów, aby wywołać metody specyficzne
            if (v instanceof Car c){
                c.honk();
            } else if (v instanceof Boat b) {
                b.anchor();
            } else if (v instanceof Plane p) {
                p.takeOff();
            } else if (v instanceof Bike b) {
                b.ringBell();
            }
        }
    }
}

