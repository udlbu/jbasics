package io.udlbu._7_zapisanie_pliku;

/**
 * Obsługa wyjątków i zapis tekstu do pliku w Javie (NIO2).
 *
 * Pokazuje:
 *  - try-catch i obsługę wyjątków
 *  - try-with-resources (bezpieczne zamykanie zasobów)
 *  - zapis i odczyt pliku za pomocą java.nio.file.Files
 *
 * Kod można uruchomić bez zmian.
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {

        // Ścieżka do pliku
        Path filePath = Path.of("example.txt");
        String textToWrite = "Hello, Java!\nZapis do pliku za pomocą NIO2.";

        // --- Zapis pliku z obsługą wyjątków ---
        try {
            // Zapis tekstu do pliku (utworzy plik, jeśli nie istnieje)
            Files.writeString(filePath, textToWrite);
            System.out.println("Plik zapisany pomyślnie: " + filePath.toAbsolutePath());
        } catch (IOException e) {
            // Obsługa błędu zapisu
            System.out.println("Błąd podczas zapisu pliku: " + e.getMessage());
        }

        // --- Odczyt pliku z obsługą wyjątków ---
        try {
            String content = Files.readString(filePath);
            System.out.println("\nZawartość pliku:");
            System.out.println(content);
        } catch (IOException e) {
            System.out.println("Błąd podczas odczytu pliku: " + e.getMessage());
        }
//
//        // --- Przykład try-with-resources (jeśli używamy strumieni) ---
//        try (var writer = Files.newBufferedWriter(filePath)) {
//            writer.write("Dodany tekst przy użyciu try-with-resources");
//            System.out.println("\nDodatkowy zapis wykonany.");
//        } catch (IOException e) {
//            System.out.println("Błąd przy dodatkowym zapisie: " + e.getMessage());
//        }
    }
}

