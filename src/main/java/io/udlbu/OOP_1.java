package io.udlbu;



/*
📦 CZTERY pojęcia w jednym miejscu:
1️⃣ KLASA – szablon opisujący jak obiekt wygląda i co potrafi
2️⃣ OBIEKT – konkretna instancja klasy
3️⃣ KONSTRUKTOR – metoda wywoływana przy tworzeniu obiektu, ustawia początkowy stan
4️⃣ HERMETYZACJA – ukrywanie pól i udostępnianie kontrolowanego API (gettery/metody)
*/
public class OOP_1 {
    public static void main(String[] args) {

        // ----- 2. Użycie OBIEKTu -----

        // Tworzymy obiekt na podstawie klasy Car, używając konstruktora
        Car myCar = new Car("Toyota", 120_000);

        System.out.println("Brand: " + myCar.getBrand());
        System.out.println("Mileage before drive: " + myCar.getMileage());

        myCar.drive(50);

        System.out.println("Mileage after drive: " + myCar.getMileage());
    }
}


// ----- 1. KLASA -----
// Klasa "Car" to szablon – opisuje, jak taki obiekt ma wyglądać i co potrafi.
class Car {

    // ----- HERMETYZACJA -----
    // Pola są prywatne – dostęp tylko przez metody.
    // ❌ BEZPOŚREDNI dostęp z zewnątrz jest zabroniony:
    //
    // Car myCar = new Car("Toyota", 120_000);
    // myCar.brand;     // ❌ niedostępne
    //
    // ✔️ PRAWIDŁOWY dostęp:
    // myCar.getBrand();   // ✔️ OK


    private String brand;
    private int mileage;

    // ----- 3. KONSTRUKTOR -----
    // Konstruktor ustala początkowy, poprawny stan obiektu.
    Car(String brand, int mileage) {
        this.brand = brand;
        this.mileage = mileage;
    }

    // Zamiast publicznych pól – udostępniamy kontrolowane metody (gettery/zachowania).
    String getBrand() {
        return brand;
    }

    int getMileage() {
        return mileage;
    }

    // Metoda modyfikująca stan zgodnie z zasadami klasy.
    void drive(int km) {
        if (km < 0) throw new IllegalArgumentException("Distance must be positive");
        mileage += km;
    }
}
