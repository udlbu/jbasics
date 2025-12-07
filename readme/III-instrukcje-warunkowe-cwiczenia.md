# Ćwiczenia – Instrukcje warunkowe

## Zadania do wykonania

1. Sprawdź, czy liczba jest dodatnia, ujemna czy równa zeru.
2. Sprawdź, czy liczba jest parzysta czy nieparzysta.
3. Zadeklaruj dwie liczby i sprawdź, która jest większa.
4. Sprawdź, czy litera w zmiennej `char` jest samogłoską czy spółgłoską.
5. Zadeklaruj zmienną `int` z dniem tygodnia (1–7) i wypisz nazwę dnia używając `switch`.
6. Sprawdź, czy liczba mieści się w przedziale 10–20 włącznie.
7. Zadeklaruj zmienną `boolean` i użyj instrukcji `if-else` do wypisania komunikatu, jeśli jest `true` lub `false`.
8. Zadeklaruj zmienną `int` z oceną (0–5) i wypisz ocenę słownie (`switch` lub `if-else if`).
9. Sprawdź, czy liczba jest podzielna przez 3 i 5 jednocześnie.
10. Połącz kilka warunków logicznych w jednym `if` i wypisz wynik.

---

# Rozwiązania – Instrukcje warunkowe

```java

        // 1. Dodatnia, ujemna, zero
        int liczba1 = -4;
        if (liczba1 < 0) {
            System.out.println("Liczba jest ujemna");
        } else if (liczba1 == 0) {
            System.out.println("Liczba jest zerem");
        } else {
            System.out.println("Liczba jest dodatnia");
        }
```
```java
        // 2. Parzysta / nieparzysta
        int liczba2 = 7;
        if (liczba2 % 2 == 0) {
            System.out.println("Liczba jest parzysta");
        } else {
            System.out.println("Liczba jest nieparzysta");
        }
```
```java
        // 3. Która liczba jest większa
        int x = 5;
        int y = 9;
        if (x > y) {
            System.out.println("x jest większe");
        } else if (x < y) {
            System.out.println("y jest większe");
        } else {
            System.out.println("x i y są równe");
        }
```
```java
        // 4. Samogłoska / spółgłoska
        char litera = 'e';
        if (litera == 'a' || litera == 'e' || litera == 'i' || litera == 'o' || litera == 'u') {
            System.out.println("Litera jest samogłoską");
        } else {
            System.out.println("Litera jest spółgłoską");
        }
```
```java
        // 5. Dzień tygodnia
        int dzien = 3;
        switch (dzien) {
            case 1: System.out.println("Poniedziałek"); break;
            case 2: System.out.println("Wtorek"); break;
            case 3: System.out.println("Środa"); break;
            case 4: System.out.println("Czwartek"); break;
            case 5: System.out.println("Piątek"); break;
            case 6: System.out.println("Sobota"); break;
            case 7: System.out.println("Niedziela"); break;
            default: System.out.println("Nieprawidłowy dzień"); break;
        }
```

```java
        // 6. Przedział 10–20
        int liczba3 = 15;
        if (liczba3 >= 10 && liczba3 <= 20) {
            System.out.println("Liczba mieści się w przedziale 10–20");
        } else {
            System.out.println("Liczba poza przedziałem");
        }
```

```java
        // 7. Boolean
        boolean prawda = true;
        if (prawda) {
            System.out.println("Wartość jest true");
        } else {
            System.out.println("Wartość jest false");
        }
```

```java
        // 8. Ocena słownie
        int ocena = 4;
        switch (ocena) {
            case 0: System.out.println("Niedostateczny"); break;
            case 1: System.out.println("Jedynka"); break;
            case 2: System.out.println("Dwa"); break;
            case 3: System.out.println("Trzy"); break;
            case 4: System.out.println("Cztery"); break;
            case 5: System.out.println("Pięć"); break;
            default: System.out.println("Nieprawidłowa ocena"); break;
        }
```

```java
        // 9. Podzielna przez 3 i 5
        int liczba4 = 15;
        if (liczba4 % 3 == 0 && liczba4 % 5 == 0) {
            System.out.println("Liczba podzielna przez 3 i 5");
        } else {
            System.out.println("Liczba niepodzielna przez 3 i 5");
        }
```

```java
        // 10. Złożone warunki
        int liczba5 = 8;
        boolean wynik = (liczba5 > 5 && liczba5 < 10) || (liczba5 % 2 == 0);
        System.out.println("Wynik złożonego warunku: " + wynik);

```

