package io.udlbu;

/*
🏦 Ta klasa pokazuje różnicę między:
1️⃣ Elementami statycznymi – należą do klasy, wspólne dla wszystkich obiektów
2️⃣ Elementami instancji – należą do konkretnego obiektu, każdy ma własny stan
*/

class BankAccount {

    // 🏷️ Statyczne pole – liczba wszystkich kont w systemie
    static int totalAccounts = 0;

    // 🔹 Pole instancji – saldo konkretnego konta
    private double balance;

    // Konstruktor – tworzy konto i zwiększa licznik wszystkich kont
    BankAccount(double initialBalance) {
        this.balance = initialBalance;
        totalAccounts++;  // statyczny licznik rośnie globalnie
    }

    void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Amount must be positive");
        balance += amount;
    }

    double getBalance() {
        return balance;
    }

    // Metoda statyczna – pokazuje liczbę wszystkich kont
    static void showTotalAccounts() {
        System.out.println("Total accounts created: " + totalAccounts);
    }
}

public class OOP_4 {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(1000);
        BankAccount acc2 = new BankAccount(500);
        BankAccount acc3 = new BankAccount(2000);

        // Salda instancji – każda inna
        System.out.println("Acc1 balance: " + acc1.getBalance());
        System.out.println("Acc2 balance: " + acc2.getBalance());
        System.out.println("Acc3 balance: " + acc3.getBalance());

        // Pole statyczne – wspólne dla wszystkich obiektów
        BankAccount.showTotalAccounts();
    }
}
