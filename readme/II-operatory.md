# Operatory w Javie

## Wprowadzenie

**ELI5:** Operatory to narzędzia, które pozwalają robić różne rzeczy z naszymi pudełkami (zmiennymi). Mogą dodawać liczby, porównywać wartości, sprawdzać prawdę/fałsz lub zmieniać wartość pudełka.

**Java:** Operatory w Javie dzielą się na kilka typów:

1. **Arytmetyczne** – do liczb. Pozwalają dodawać, odejmować, mnożyć, dzielić i liczyć resztę z dzielenia.
2. **Relacyjne** – porównują wartości, zwracają `true` lub `false`. Przykłady: większe, mniejsze, równe, różne.
3. **Logiczne** – łączą wartości logiczne (boolean) w wyrażenia, np. AND, OR, NOT.
4. **Przypisania** – przypisują wartość do zmiennej, w tym również operatory skrócone jak `+=`, `-=`, `*=`.

**ELI5 + Java:**
- Arytmetyczne – pudełka z liczbami mogą się dodawać, odejmować, mnożyć, dzielić lub dać resztę.
- Relacyjne – sprawdzamy, czy zawartość pudełek spełnia jakieś warunki (np. większe/mniejsze).
- Logicze – działają tylko na prawda/fałsz i łączą je w nowe wartości logiczne.
- Przypisania – wkładamy nową wartość do pudełka albo zmieniamy starą o coś.

```java
# Operatory w Javie

## Przykłady w klasie PlayGround

```java
public class PlayGround {
    public static void main(String[] args) {

        // Arytmetyczne
        int a = 10;
        int b = 3;
        System.out.println("Suma: " + (a + b));
        System.out.println("Różnica: " + (a - b));
        System.out.println("Iloczyn: " + (a * b));
        System.out.println("Iloraz: " + (a / b));
        System.out.println("Reszta: " + (a % b));

        // Relacyjne
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        // Logicze
        boolean x = true;
        boolean y = false;
        System.out.println("x AND y: " + (x && y));
        System.out.println("x OR y: " + (x || y));
        System.out.println("NOT x: " + (!x));

        // Przypisania
        int c = 5;
        c += 3;  // c = 8
        c *= 2;  // c = 16
        System.out.println("Przypisania c: " + c);

        // Wyrażenie logiczne
        System.out.println("(a > b) AND (b < a): " + ((a > b) && (b < a)));

        // Operator skrócony na double
        double d = 20.0;
        d /= 4;  // d = 5.0
        System.out.println("Double /= 4: " + d);

        // Mieszane operatory
        int e = 2;
        e = e * 3 + 4;  // e = 10
        System.out.println("Mieszane operatory e: " + e);

        // Char
        char ch1 = 'A';
        char ch2 = 'B';
        System.out.println("ch1 == ch2: " + (ch1 == ch2));
        System.out.println("ch1 != ch2: " + (ch1 != ch2));

        // Boolean NOT
        boolean z = false;
        System.out.println("NOT z: " + (!z));

        // Złożone wyrażenie
        int f = 5;
        int g = 3;
        boolean wynik = ((f + g) > 7) && (f < g);
        System.out.println("Złożone wyrażenie wynik: " + wynik);
    }
}

```


## Podsumowanie

Operatory pozwalają w Javie manipulować zmiennymi, wykonywać obliczenia, porównania i logikę programu. W następnych ćwiczeniach użyjemy wszystkich typów operatorów w praktyce.
