# Zmienne i typy danych w Javie

## Wprowadzenie

**ELI5:** Zmienna to jak pudełko, w którym przechowujesz dane. Możesz w nim trzymać liczby, tekst, prawda/fałsz – wszystko, co chcesz użyć w programie.

**Java:** Java jest językiem statycznie typowanym (statically typed). Oznacza to, że przy deklarowaniu zmiennej musisz podać:

1. Typ zmiennej – określa, co można w "pudełku" przechowywać i jak duże jest to "pudełko".  
   Przykłady typów: `int, double, boolean, char, String`

2. Nazwę zmiennej – identyfikator Twojego pudełka.  
   Przykłady nazw: `liczba, imie, czyPada`

3. Wartość – co aktualnie wkładasz do pudełka.  
   Przykłady wartości: `10, "Jan", true`

---
```java
public class PlayGround {
    public static void main(String[] args) {

        // Typy proste
        int liczba = 42;
        boolean prawdaFałsz = false;
        double pi = 3.14;
        char litera = 'Z';

        System.out.println("Integer: " + liczba);
        System.out.println("Boolean: " + prawdaFałsz);
        System.out.println("Double: " + pi);
        System.out.println("Char: " + litera);

        // Typy referencyjne
        String imie = "Jan";
        System.out.println("String: " + imie.toUpperCase());
    }
}
```
---

## Typy proste (prymitywne)

**ELI5:** Małe pudełka, które przechowują pojedynczą wartość – liczbę, literę lub prawdę/fałsz.

**Java:** Typy proste obejmują:
- Liczby całkowite: byte, short, int, long
- Liczby zmiennoprzecinkowe: float, double
- Prawda/fałsz: boolean
- Pojedynczy znak: char

---

## Typy referencyjne (obiekty)

**ELI5:** Pudełka, które oprócz wartości mają dodatkowe funkcje i metody.

**Java:** Najprostszy typ referencyjny to String – przechowuje tekst.  
Różnica: Typ prosty przechowuje tylko wartość, typ referencyjny pozwala korzystać z metod (np. zmiana liter na wielkie, sprawdzenie długości tekstu).

---

## Podsumowanie

- Zmienna to pojemnik na dane, który ma typ, nazwę i wartość.
- Typy proste przechowują pojedyncze wartości i są szybkie w działaniu.
- Typy referencyjne przechowują obiekty, pozwalają korzystać z metod i są bardziej elastyczne.
- Ćwiczenia pozwalają praktycznie utrwalić deklarację zmiennych i rozróżnienie typów.  
