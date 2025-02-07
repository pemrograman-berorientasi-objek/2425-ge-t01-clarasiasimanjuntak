package fintech.model;

public class Transaction {
    private static int counter = 1;  // ID transaksi otomatis
    
    private int id;
    private String accountName;
    private double amount;
    private String postedAt;
    private String note;

    // Konstruktor
    public Transaction(String accountName, double amount, String postedAt, String note) {
        this.id = counter++;  // Set ID transaksi dan naikkan counter
        this.accountName = accountName;
        this.amount = amount;
        this.postedAt = postedAt;
        this.note = (note.length() > 40) ? note.substring(0, 40) : note; // Batasi note max 40 karakter
    }

    // Getter untuk Account Name
    public String getAccountName() {
        return accountName;
    }

    // Getter untuk saldo transaksi
    public double getAmount() {
        return amount;
    }

    // Getter untuk waktu transaksi
    public String getPostedAt() {
        return postedAt;
    }

    // Getter untuk catatan transaksi
    public String getNote() {
        return note;
    }

    // Format output sesuai spesifikasi
    @Override
    public String toString() {
        return id + "|" + accountName + "|" + String.format("%.1f", amount) + "|" + postedAt + "|" + note;
    }
}
