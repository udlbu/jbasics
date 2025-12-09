package io.udlbu;

/*
🎛️ Ta klasa pokazuje DWA pojęcia w jednym miejscu:
1️⃣ INTERFEJS – definiuje kontrakt, czyli co obiekt potrafi
2️⃣ POLIMORFIZM – pozwala wywołać tę samą metodę na różnych implementacjach
*/

public class OOP_2{
    public static void main(String[] args) {
        // Tworzymy obiekty – każda zmienna ma sensowną nazwę
        Movable robot = new Robot();
        Movable boat = new Boat();
        Movable drone = new Drone();

        // Wywołanie tej samej metody, różne zachowanie w zależności od obiektu
        robot.move();  // Robot moves forward.
        boat.move();   // Boat sails on water.
        drone.move();  // Drone flies in the sky.

        // Polimorfizm w pętli
        Movable[] movables = { robot, boat, drone };
        for (Movable m : movables) {
            m.move();
        }
    }
}

interface Movable {
    void move();
}

// Pierwsza implementacja interfejsu
class Robot implements Movable {
    @Override
    public void move() {
        System.out.println("Robot moves forward.");
    }
}


// Druga implementacja interfejsu
class Boat implements Movable {
    @Override
    public void move() {
        System.out.println("Boat sails on water.");
    }
}

// Trzecia implementacja interfejsu
class Drone implements Movable {
    @Override
    public void move() {
        System.out.println("Drone flies in the sky.");
    }
}