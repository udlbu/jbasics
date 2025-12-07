# Pętle w Javie

## 🧒 ELI5
Pętla to jak wykonywanie tej samej czynności wiele razy, dopóki spełniony jest jakiś warunek.  
Zamiast pisać ten sam kod 10 razy, mówisz Javie: „powtórz to 10 razy”.

## 🧑‍💻 Java – wyjaśnienie
W Javie mamy kilka podstawowych pętli:

1. **for** – gdy wiemy, ile razy powtarzamy.
2. **while** – gdy powtarzamy dopóki warunek jest prawdziwy.
3. **do-while** – wykonuje się przynajmniej raz.
4. **foreach (enhanced for)** – wygodne przejście po tablicy/zbiorze.

## 🔧 Przykłady w kodzie (do Playground)

```java
public class Playground {
    public static void main(String[] args) {

        // FOR – licz od 1 do 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("For i: " + i);
        }

        // WHILE – licz dopóki licznik < 4
        int x = 0;
        while (x < 4) {
            System.out.println("While x: " + x);
            x++;
        }

        // DO-WHILE – wykona się co najmniej raz
        int y = 10;
        do {
            System.out.println("Do-while y: " + y);
            y++;
        } while (y < 12);

        // FOREACH – przejście po tablicy
        int[] liczby = {3, 6, 9};
        for (int n : liczby) {
            System.out.println("Foreach element: " + n);
        }
    }
}
```
