package io.udlbu;

/*
🎛️ Ta klasa pokazuje KONCEPCJĘ INTERFEJSU w Javie:
1️⃣ INTERFEJS – kontrakt, który definiuje, co obiekt potrafi
2️⃣ Implementacje – różne klasy realizujące ten kontrakt
3️⃣ Polimorfizm – wywołanie tej samej metody na różnych obiektach przez typ interfejsowy
*/

interface Printable {
    void print(); // kontrakt – każda klasa, która implementuje Printable, musi mieć tę metodę
}

// Pierwsza implementacja interfejsu
class Document implements Printable {
    private String text;

    Document(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        System.out.println("Printing document: " + text);
    }
}

// Druga implementacja interfejsu
class Photo implements Printable {
    private String filename;

    Photo(String filename) {
        this.filename = filename;
    }

    @Override
    public void print() {
        System.out.println("Printing photo: " + filename);
    }
}

// Trzecia implementacja interfejsu
class Invoice implements Printable {
    private int id;

    Invoice(int id) {
        this.id = id;
    }

    @Override
    public void print() {
        System.out.println("Printing invoice #" + id);
    }
}

// Czwarta implementacja interfejsu
class Label implements Printable {
    private String labelText;

    Label(String labelText) {
        this.labelText = labelText;
    }

    @Override
    public void print() {
        System.out.println("Printing label: " + labelText);
    }
}

public class OOP_5 {
    public static void main(String[] args) {
        // Tworzymy obiekty – każdy implementuje Printable
        Printable document = new Document("Project Proposal");
        Printable photo = new Photo("Vacation.jpg");
        Printable invoice = new Invoice(12345);
        Printable label = new Label("Fragile");

        // Polimorfizm – ta sama metoda, różne zachowania
        document.print();
        photo.print();
        invoice.print();
        label.print();

        // Pętla po tablicy Printable
        Printable[] items = { document, photo, invoice, label };
        for (Printable item : items) {
            item.print();
        }
    }
}
