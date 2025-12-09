package io.udlbu._3_kolekjce;

/**
 * Przykład użycia kolekcji w Javie:
 *  - List<Vehicle>
 *  - Set<Vehicle>
 *  - Map<String, Vehicle>
 *
 * Każda kolekcja przechowuje obiekty Vehicle.
 */

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // --- Klasa Vehicle ---
        Vehicle v1 = new Vehicle("Car", "ABC123");
        Vehicle v2 = new Vehicle("Bike", "XYZ999");
        Vehicle v3 = new Vehicle("Truck", "TRK555");

        // ===== LISTA ===== (kolejność, duplikaty dozwolone)
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(v1);
        vehicleList.add(v2);
        vehicleList.add(v3);

        System.out.println("LISTA:");
        for (Vehicle v : vehicleList) {
            System.out.println(v);
        }


        // ===== SET ===== (brak duplikatów, brak indeksów)
        // Uwaga: equals() i hashCode() decydują o unikalności
        Set<Vehicle> vehicleSet = new HashSet<>();
        vehicleSet.add(v1);
        vehicleSet.add(v2);
        vehicleSet.add(v1); // duplikat, zostanie zignorowany

        System.out.println("\nSET:");
        for (Vehicle v : vehicleSet) {
            System.out.println(v);
        }


        // ===== MAPA ===== (klucz → wartość)
        Map<String, Vehicle> vehicleMap = new HashMap<>();
        vehicleMap.put(v1.getPlate(), v1);
        vehicleMap.put(v2.getPlate(), v2);
        vehicleMap.put(v3.getPlate(), v3);

        System.out.println("\nMAPA (plate -> vehicle):");
        for (Map.Entry<String, Vehicle> entry : vehicleMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}