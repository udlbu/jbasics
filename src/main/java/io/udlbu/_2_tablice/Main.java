package io.udlbu._2_tablice;

/**
 * Praca z tablicami – podstawy i tablica obiektów.
 *
 * Pokazuje:
 *  - deklarację i inicjalizację tablicy
 *  - iterację zwykłą pętlą for (indeksy)
 *  - iterację pętlą for-each
 *  - modyfikację elementu tablicy
 *  - tablicę obiektów klasy Person
 *  - zmianę wartości pól w pętli for-each i wypisywanie ich do konsoli
 */

public class Main {

    public static void main(String[] args) {

        // --- Deklaracja i inicjalizacja tablicy ---
        int[] numbers = {10, 20, 30, 40, 50};

        // --- Iteracja zwykłym for (dostęp przez indeks) ---
        System.out.println("Iteracja zwykłym for:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index: " + i + ", liczba: " + numbers[i]);
        }

        // --- Iteracja for-each ---
        System.out.println("\nIteracja for-each:");
        for (int n : numbers) {
            System.out.println("Liczba: " + n);
        }

        // --- Modyfikacja elementu tablicy ---
        numbers[2] = 999; // zmiana elementu na indeksie 2
        System.out.println("\nPo modyfikacji elementu [2] = 999:");
        for (int n : numbers) {
            System.out.println(n);
        }

        // --- Tablica obiektów Person ---
        Person[] people = {
                new Person("Ala"),
                new Person("Ola"),
                new Person("Zenek")
        };

        // --- For-each zmieniający imiona i wypisujący do konsoli ---
        System.out.println("\nZmiana imion w tablicy obiektów:");
        int counter = 1;

        for (Person p : people) {
            p.name = "User" + counter; // zmiana imienia
            System.out.println(p.name);
            counter++;
        }
    }
}

// Prosta klasa z jednym polem (brak hermetyzacji)
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}
