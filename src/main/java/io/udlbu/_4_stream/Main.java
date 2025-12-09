package io.udlbu._4_stream;

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {

        List<Vehicle> vehicles = List.of(
                new Vehicle("Car", "A1"),
                new Vehicle("Bike", "B2"),
                new Vehicle("Truck", "C3"),
                new Vehicle("Car", "D4")
        );

        // ===== FILTER =====
        // wybierz tylko pojazdy typu Car
        List<Vehicle> onlyCars = vehicles.stream()
                .filter(v -> v.getType().equals("Car"))
                .toList();

        System.out.println("Tylko auta:");
        onlyCars.forEach(System.out::println);


        // ===== MAP =====
        // wyciągamy np. same numery tablic
        List<String> plates = vehicles.stream()
                .map(v -> v.getPlate())
                .toList();

        System.out.println("\nNumery rejestracyjne:");
        plates.forEach(System.out::println);


        // ===== FILTER + MAP =====
        // wyszukaj wszystkie Car i zwróć same tablice rejestracyjne
        List<String> carPlates = vehicles.stream()
                .filter(v -> v.getType().equals("Car"))
                .map(v -> v.getPlate())
                .toList();

        System.out.println("\nTablice aut:");
        carPlates.forEach(System.out::println);
    }
}
