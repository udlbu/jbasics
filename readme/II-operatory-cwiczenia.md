# Ćwiczenia – Operatory

## Zadania do wykonania

1. Zadeklaruj dwie zmienne `int` i oblicz ich sumę, różnicę, iloczyn, iloraz i resztę z dzielenia.
2. Porównaj dwie zmienne i sprawdź, która jest większa, mniejsza, równa.
3. Zadeklaruj dwie zmienne `boolean` i użyj operatorów logicznych AND, OR, NOT.
4. Zadeklaruj zmienną `int` i użyj operatora przypisania `+=` oraz `*=`.
5. Sprawdź w wyrażeniu logicznym kombinację operatorów relacyjnych i logicznych (np. większe AND mniejsze).
6. Zadeklaruj zmienną `double` i zmodyfikuj jej wartość przy pomocy operatora skróconego `/=`.
7. Oblicz wynik wyrażenia mieszającego operatory arytmetyczne i przypisania.
8. Porównaj dwie zmienne `char` i sprawdź ich relacje (równe, różne).
9. Zadeklaruj zmienną `boolean` i zastosuj operator NOT.
10. Połącz kilka operacji w jednym wyrażeniu i wypisz wynik do konsoli.

---

# Rozwiązania – Operatory

```java
public class PlayGround {
    public static void main(String[] args) {

        // 1. Arytmetyczne
        int a = 10;
        int b = 3;
        System.out.println("Suma: " + (a + b));
        System.out.println("Różnica: " + (a - b));
        System.out.println("Iloczyn: " + (a * b));
        System.out.println("Iloraz: " + (a / b));
        System.out.println("Reszta: " + (a % b));

        // 2. Relacyjne
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        // 3. Logicze
        boolean x = true;
        boolean y = false;
        System.out.println("x AND y: " + (x && y));
        System.out.println("x OR y: " + (x || y));
        System.out.println("NOT x: " + (!x));

        // 4. Przypisania
        int c = 5;
        c += 3;  // c = 8
        c *= 2;  // c = 16
        System.out.println("Przypisania c: " + c);

        // 5. Wyrażenie logiczne
        System.out.println("(a > b) AND (b < a): " + ((a > b) && (b < a)));

        // 6. Operator skrócony na double
        double d = 20.0;
        d /= 4;  // d = 5.0
        System.out.println("Double /= 4: " + d);

        // 7. Mieszane operatory
        int e = 2;
        e = e * 3 + 4;  // e = 10
        System.out.println("Mieszane operatory e: " + e);

        // 8. Char
        char ch1 = 'A';
        char ch2 = 'B';
        System.out.println("ch1 == ch2: " + (ch1 == ch2));
        System.out.println("ch1 != ch2: " + (ch1 != ch2));

        // 9. Boolean NOT
        boolean z = false;
        System.out.println("NOT z: " + (!z));

        // 10. Złożone wyrażenie
        int f = 5;
        int g = 3;
        boolean wynik = ((f + g) > 7) && (f < g);
        System.out.println("Złożone wyrażenie wynik: " + wynik);
    }
}
```