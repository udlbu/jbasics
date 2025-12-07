# Instrukcje warunkowe w Javie

## Wprowadzenie

**ELI5:** Instrukcje warunkowe to jak skrzyżowania w programie: w zależności od tego, co jest w pudełku (zmiennej), idziemy w jedną lub drugą stronę. Dzięki nim program może podejmować decyzje.

**Java:** Instrukcje warunkowe pozwalają sprawdzić warunki i wykonywać różne bloki kodu w zależności od wyniku (true/false). Najczęściej używamy:
1. `if` – wykonuje blok kodu, jeśli warunek jest prawdziwy.
2. `if-else` – wykonuje jeden blok kodu, jeśli warunek jest prawdziwy, a inny, jeśli fałszywy.
3. `if-else if` – sprawdzamy wiele warunków po kolei.
4. `switch` – sprawdzamy wartość zmiennej i wykonujemy odpowiadający blok kodu.

---

## Przykład w klasie Playground

```java
public class PlayGround {
    public static void main(String[] args) {

        int liczba = 7;

        // 1. if
        if (liczba > 5) {
            System.out.println("Liczba jest większa niż 5");
        }

        // 2. if-else
        if (liczba % 2 == 0) {
            System.out.println("Liczba jest parzysta");
        } else {
            System.out.println("Liczba jest nieparzysta");
        }

        // 3. if-else if
        if (liczba < 0) {
            System.out.println("Liczba jest ujemna");
        } else if (liczba == 0) {
            System.out.println("Liczba jest zerem");
        } else {
            System.out.println("Liczba jest dodatnia");
        }

        // 4. switch
        int dzienTygodnia = 3;
        switch (dzienTygodnia) {
            case 1:
                System.out.println("Poniedziałek");
                break;
            case 2:
                System.out.println("Wtorek");
                break;
            case 3:
                System.out.println("Środa");
                break;
            default:
                System.out.println("Inny dzień");
        }
    }
}
```