# Importy i pakiety w Javie

## 🧒 ELI5
- **Klasa** to pudełko, w którym trzymasz metody i dane.
- **Metoda** to instrukcja, którą możesz wykonać.
- Tworzenie klas pozwala na dzielenie kodu na mniejsze części, które można wielokrotnie używać.
- **Pakiet** to jak folder na klasy – pozwala organizować kod w projekcie.
- **Import** pozwala użyć klasy z innego pakietu, zamiast pisać wszystko w jednym miejscu.
- **Zależności Maven** to gotowe biblioteki, które można dodać do projektu – zamiast pisać wszystko samemu, używasz sprawdzonego kodu innych ludzi.

## 🧑‍💻 Java – wyjaśnienie
1. **Klasy i metody**
    - Każda metoda musi znajdować się w klasie.
    - Metody statyczne (`static`) można wywołać bez tworzenia obiektu klasy.
    - Przykład: klasa `Utils` z metodą `powitanie(String imie)`.

2. **Pakiety**
    - Każdy projekt Java może mieć pakiety, które odpowiadają folderom w systemie plików.
    - W IntelliJ pakiet w projekcie wygląda jak folder w strukturze projektu.
    - Pakiety pozwalają organizować kod, unikając konfliktów nazw i ułatwiając ponowne użycie.
    - Pełna nazwa klasy w Javie to: `nazwa.pakietu.NazwaKlasy`.

3. **Import**
    - Aby użyć klasy z innego pakietu, dodajesz `import nazwa_pakietu.NazwaKlasy;`
    - Import ułatwia modularność – możesz mieć wiele małych „cegiełek”, które łączysz w projekcie.

```java
// Przykład 1 – własna klasa z metodą statyczną powitanie
package io.udlbu.utils;

public class Utils {
    public static String powitanie(String imie) {
        return "Cześć, " + imie + "!";
    }
}

// Użycie w Main
package io.udlbu;

import io.udlbu.utils.Utils;

public class Main {
    public static void main(String[] args) {
        String wiadomosc = Utils.powitanie("Ola");
        System.out.println(wiadomosc);
    }
}
```


4. **Zależności Maven**
    - Maven zarządza bibliotekami w projekcie – pobiera je i dodaje do klaspath.
    - W IntelliJ widać je w `External Libraries`.
    - Maven używa narzędzi Java (np. `javac`) do kompilacji, ale dodatkowo zarządza zależnościami.
    - Pliki bibliotek przechowywane są w lokalnym repozytorium `.m2` w Twoim systemie.

```xml
<!-- Przykład 2 – użycie zależności Maven
Dodajemy do pom.xml (przykład: Apache Commons Lang)
-->
<dependencies>
    <dependency>
        <groupId>org.apache.commons</groupId>
        <artifactId>commons-lang3</artifactId>
        <version>3.12.0</version>
    </dependency>
</dependencies>

```
// W kodzie Java:
```java
package io.udlbu;
import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        String tekst = "  java kurs  ";
        // trim do usunięcia spacji z obu stron
        String przycietyString = StringUtils.trim(tekst);
        System.out.println(wynik);
    }
}

```

## 🔹 Podsumowanie
- Klasy = miejsce na metody i dane.
- Pakiety = organizacja klas w foldery.
- Import = możliwość użycia klas z innych pakietów.
- Maven = zarządzanie zależnościami i kompilacja z użyciem narzędzi Java.
- Modularność i ponowne użycie kodu to klucz do utrzymania dużych projektów.
