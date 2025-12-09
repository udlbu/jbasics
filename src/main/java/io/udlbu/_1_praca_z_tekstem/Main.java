package io.udlbu._1_praca_z_tekstem;

/**
 * Praca z tekstem w Javie.
 *
 * Ten przykład demonstruje:
 *  - podstawowe operacje na String: toUpperCase, replace, substring, split
 *  - łączenie tekstu za pomocą String.join
 *  - budowanie tekstu przy użyciu StringBuilder (wydajne modyfikacje)
 *
 * Kod można skopiować i uruchomić bez zmian.
 */

public class Main {

    public static void main(String[] args) {

        // --- String: operacje podstawowe ---
        String text = "Ala ma kota";

        String upper = text.toUpperCase();
        String replaced = text.replace("kota", "psa");
        String substring = text.substring(4, 6); // "ma"

        System.out.println("Uppercase: " + upper);
        System.out.println("Zamiana słowa: " + replaced);
        System.out.println("Substring (4-6): " + substring);


        // --- Split i join ---
        String[] parts = text.split(" ");
        String joined = String.join("-", parts);

        System.out.println("Split → Join: " + joined);


        // --- StringBuilder: wydajne budowanie tekstu ---
        StringBuilder sb = new StringBuilder();
        sb.append("Hello")
                .append(" ")
                .append("World")
                .append("!");

        System.out.println("StringBuilder: " + sb.toString());


        // --- Odwrócenie tekstu ---
        String reversed = new StringBuilder(text).reverse().toString();
        System.out.println("Odwrócone: " + reversed);
    }
}
