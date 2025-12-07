# TODO: Pierwsze kroki 

Ten plik przeprowadzi Cię krok po kroku przez pierwsze czynności po wycheckoutowaniu projektu. Każdy krok zawiera wyjaśnienie „Co to znaczy?” i „Dlaczego to robimy?”.

---

## TODO 0: Checkout projektu z Gita
**Co to znaczy:** Checkout oznacza pobranie projektu z repozytorium Git na Twój komputer. Każdy branch w repozytorium to osobny moduł kursu, dzięki czemu możemy pracować nad różnymi częściami projektu niezależnie.  
**Dlaczego to robimy:** Branch pozwala mieć odseparowany kod dla danego modułu kursu, ułatwia pracę z informacjami i kodem, a jednocześnie od początku zapewnia środowisko pracy zbliżone do prawdziwego projektu, mimo minimalnej ilości kodu.

**Kroki:**
### Opcja 1: Ekran startowy IntelliJ
- Otwórz IntelliJ – zobaczysz ekran powitalny.
- Wybierz "Get from Version Control".
- Wklej link do repozytorium kursu w polu URL.
- Wybierz lokalizację do zapisania projektu.
- Kliknij "Clone".
- Projekt otworzy się automatycznie w IntelliJ.

### Opcja 2: Menu File → New
- Otwórz IntelliJ i wybierz "File" → "New" → "Project from Version Control".
- Wybierz "Git".
- Wklej link do repozytorium kursu w polu URL.
- Wybierz lokalizację do zapisania projektu.
- Kliknij "Clone".

### Praca z branchami
- Otwórz menu **Git** w lewym dolnym rogu IntelliJ.
- Kliknij rozwijane menu branchy (local)
- W każdym module Wybierz branch odpowiadający bieżącemu modułowi kursu.

---

## TODO 1: Zapoznaj się ze strukturą projektu i plikami
**Co to znaczy:** Zanim zaczniemy budować projekt, warto zobaczyć, jak wygląda struktura plików w IntelliJ.  
**Dlaczego to robimy:** Zrozumienie struktury ułatwia późniejszą pracę, a także pokazuje, że widok w IntelliJ nie zawsze odpowiada dokładnie plikom w systemie plików.

**Kroki:**
- W IntelliJ otwórz folder projektu.
- Znajdź plik `pom.xml` – główny plik konfiguracyjny Maven, który mówi jakie biblioteki i ustawienia kompilatora używamy.
- Zauważ wersję Javy w `pom.xml` (podstawowe ustawienie dla projektu).
- Znajdź folder `src/main/java` i plik `Main.java` z metodą main.
- Zastanów się, dlaczego nie widzimy `External Libraries` w widoku plików, ale widzimy w IntelliJ.
---

## TODO 2: Zainstaluj JDK i ustaw SDK w projekcie
**Co to znaczy:** JDK (Java Development Kit) to zestaw narzędzi, który pozwala pisać i uruchamiać programy w Javie. SDK w IntelliJ mówi, której wersji JDK użyć w projekcie.  
**Dodatkowe wyjaśnienie:** JDK to fizyczny zestaw programów na Twoim komputerze, SDK to ustawienie w IntelliJ, które mówi IDE „użyj tej wersji JDK do kompilacji i uruchamiania projektu”.  
**Dlaczego to robimy:** Bez JDK nie możemy kompilować ani uruchamiać kodu. IntelliJ potrzebuje SDK, żeby wiedzieć, jak uruchomić Twój projekt.

**Kroki:**
- Pobierz i zainstaluj najnowszą wersję JDK.
- W IntelliJ otwórz wyszukiwarkę (DoubleShift) i wpisz "Project Structure".
- W menu po lewej wybierz "Project".
- W polu "SDK" kliknij "Add SDK" → "Download JDK".
- Wybierz najnowszą wersję i zatwierdź przyciskiem OK.

---

## TODO 3: Zbuduj projekt za pomocą Maven
**Co to znaczy:** Maven kompiluje Twój kod, pobiera potrzebne biblioteki i przygotowuje projekt do uruchomienia.  
**Dlaczego to robimy:** Chcemy sprawdzić, czy projekt działa poprawnie i czy wszystkie zależności są w porządku.

**Kroki:**
- Zapoznaj się ze strukturą projektu
- Otwórz panel Maven w IntelliJ (View → Tool Windows → Maven lub DoubleShift → wpisz "Maven").
- Rozwiń sekcję "Lifecycle".
- Kliknij dwukrotnie "clean".
- Kliknij dwukrotnie "install", aby wykonać pełne zbudowanie projektu.
- Po zbudowaniu obejrzyj poonownie strukturę projektu - czy coś się zmieniło?

---

## TODO 4: Uruchom aplikację
**Co to znaczy:** Metoda main jest miejscem startu programu. Uruchomienie aplikacji oznacza, że komputer wykona Twój kod.  
**Dlaczego to robimy:** Chcemy zobaczyć działanie programu i upewnić się, że wszystko jest poprawnie skonfigurowane.

**Kroki:**
- Otwórz klasę główną z metodą main.
- Kliknij zieloną ikonę "Run" obok deklaracji klasy lub metody main.
- Wybierz "Run '<nazwa_klasy>'".

---

## TODO 5: Podsumowanie pierwszych kroków
**Co to znaczy:** Projekt jest gotowy do uruchamiania i testowania.  
**Dlaczego to robimy:** Chcemy zobaczyć pełen flow działania projektu i zrozumieć, jak poszczególne narzędzia współpracują ze sobą.

**Kroki / Flow działania:**
- Plik .java (Twój kod źródłowy) jest kompilowany przez **javac** do pliku .class (bytecode).
- **JVM** (Java Virtual Machine) uruchamia bytecode i wykonuje go w systemie operacyjnym.
- **Maven** korzysta z javac i innych narzędzi Javy, aby zbudować projekt, pobrać zależności i przygotować go do uruchomienia.
- **IntelliJ** integruje Maven, ułatwia uruchamianie kodu i śledzenie zmian.

**Struktura kodu w projekcie:**
- **Instrukcja** – pojedyncza linia kodu, np. wypisanie tekstu.
- **Metoda** – grupa instrukcji realizująca konkretną funkcjonalność, np. `main()`.
- **Klasa** – zestaw metod i pól, np. `Main`.
- **Plik** – zawiera jedną lub kilka klas, np. `Main.java`.
- **Pakiet** – logiczne grupowanie plików i klas, np. `io.udlbu`.
- **Projekt** – cała aplikacja z folderami, plikami konfiguracyjnymi (`pom.xml`) i strukturą źródłową.
