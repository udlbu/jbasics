# Ćwiczenia – Pętle

## Zadania
1. Wypisz liczby od 1 do 10 (for).
2. Wypisz liczby parzyste od 2 do 20.
3. Użyj while, aby odliczać od 5 do 1.
4. Użyj do-while, aby wypisać liczby 1–3.
5. Przejdź pętlą foreach po tablicy imion i wypisz każde.
6. Zsumuj liczby od 1 do 100 (for).
7. Zlicz, ile liczb w tablicy jest większych od 10.
8. Wypisz elementy tablicy, ale przerwij pętlę po znalezieniu liczby 7.
9. Użyj continue, aby pominąć liczby podzielne przez 3 w zakresie 1–15.
10. Wydrukuj prosty kwadrat z gwiazdek 5×5 (zagnieżdżona pętla).

---

# Rozwiązania

```java
        // 1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
```
```java
        // 2
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
```
```java
        // 3
        int a = 5;
        while (a >= 1) {
            System.out.println(a);
            a--;
        }
```
```java
        // 4
        int b = 1;
        do {
            System.out.println(b);
            b++;
        } while (b <= 3);
```
```java
        // 5
        String[] imiona = {"Ala", "Ola", "Kuba"};
        for (String imie : imiona) {
            System.out.println(imie);
        }
```
```java
        // 6
        int suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma += i;
        }
        System.out.println("Suma = " + suma);
```
```java
        // 7
        int[] arr = {4, 12, 7, 15, 3};
        int count = 0;
        for (int n : arr) {
            if (n > 10) count++;
        }
        System.out.println("Liczb >10: " + count);
```
```java
        // 8
        int[] nums = {1, 4, 7, 9};
        for (int n : nums) {
            if (n == 7) {
                System.out.println("Znaleziono 7, kończę");
                break;
            }
            System.out.println(n);
        }
```
```java
        // 9
        for (int i = 1; i <= 15; i++) {
            if (i % 3 == 0) continue;
            System.out.println(i);
        }
```
```java
        // 10 – kwadrat 5×5
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
```
