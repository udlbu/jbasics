# Ćwiczenia – Zmienne i typy danych

## Zadania do wykonania

1. Zadeklaruj zmienną typu `int` o dowolnej wartości i wydrukuj ją do konsoli.
2. Zadeklaruj zmienną typu `double` o dowolnej wartości i wydrukuj ją.
3. Zadeklaruj zmienną typu `boolean` i wydrukuj ją.
4. Zadeklaruj zmienną typu `char` i wydrukuj ją.
5. Zadeklaruj zmienną typu `String` i wydrukuj ją.
6. Zmodyfikuj wartość zmiennej `int` i wydrukuj nową wartość.
7. Zmodyfikuj wartość zmiennej `String` używając jednej z metod typu referencyjnego (np. `toUpperCase`) i wydrukuj wynik.
8. Zadeklaruj zmienną typu `long` i wydrukuj ją.
9. Zadeklaruj zmienną typu `float` i wydrukuj ją.
10. Zadeklaruj dwie zmienne typu `int`, wykonaj prostą operację arytmetyczną (dodawanie) i wydrukuj wynik.

---

# Rozwiązania – Zmienne i typy danych

```java
public class Playground {
    public static void main(String[] args) {

        // 1. int
        int liczba = 10;
        System.out.println("Integer: " + liczba);

        // 2. double
        double pi = 3.14;
        System.out.println("Double: " + pi);

        // 3. boolean
        boolean prawdaFałsz = true;
        System.out.println("Boolean: " + prawdaFałsz);

        // 4. char
        char litera = 'Z';
        System.out.println("Char: " + litera);

        // 5. String
        String imie = "Jan";
        System.out.println("String: " + imie);

        // 6. modyfikacja int
        liczba = 25;
        System.out.println("Nowa Integer: " + liczba);

        // 7. metoda na String
        System.out.println("Uppercase String: " + imie.toUpperCase());

        // 8. long
        long duzaLiczba = 100000L;
        System.out.println("Long: " + duzaLiczba);

        // 9. float
        float liczbaFloat = 5.5f;
        System.out.println("Float: " + liczbaFloat);

        // 10. operacja arytmetyczna
        int a = 7;
        int b = 3;
        int suma = a + b;
        System.out.println("Suma a + b: " + suma);

    }
}
