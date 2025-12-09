package io.udlbu._6_data_i_czas;

/**
 * Praca z datą i czasem w Javie (java.time).
 *
 *  - LocalDate, LocalTime, LocalDateTime
 *  - Period i Duration do obliczania różnic
 *  - dodawanie dni, miesięcy, godzin
 *  - pobieranie dnia tygodnia i innych informacji
 *
 */

import java.time.*;

public class Main {
    public static void main(String[] args) {

        // --- LocalDate: tylko data ---
        LocalDate today = LocalDate.now();
        LocalDate future = today.plusDays(10).plusMonths(1);

        System.out.println("Dziś: " + today);
        System.out.println("Data za 10 dni i 1 miesiąc: " + future);

        // --- LocalTime: tylko czas ---
        LocalTime now = LocalTime.now();
        LocalTime later = now.plusHours(3).plusMinutes(30);

        System.out.println("Teraz: " + now);
        System.out.println("Za 3h30min: " + later);

        // --- LocalDateTime: data i czas ---
        LocalDateTime dateTime = LocalDateTime.now();
        LocalDateTime plusWeek = dateTime.plusWeeks(1).plusHours(5);

        System.out.println("Teraz (data + czas): " + dateTime);
        System.out.println("Za tydzień i 5 godzin: " + plusWeek);

        // --- Period: różnica dat ---
        Period diff = Period.between(today, future);
        System.out.println("Różnica dat: " + diff.getMonths() + " miesięcy i " + diff.getDays() + " dni");

        // --- Duration: różnica czasu ---
        Duration duration = Duration.between(now, later);
        System.out.println("Różnica czasu: " + duration.toHours() + " godzin i " +
                duration.toMinutesPart() + " minut");

        // --- Dodatkowe informacje ---
        System.out.println("Dzień tygodnia dzisiaj: " + today.getDayOfWeek());
        System.out.println("Rok: " + today.getYear());
        System.out.println("Miesiąc: " + today.getMonth());
    }
}
