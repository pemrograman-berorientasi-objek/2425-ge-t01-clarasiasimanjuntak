package fintech.model;

public class Transaction {
    private static int counter = 1; 
    
    private int id;
    private String accountName;
    private double amount;
    private String postedAt;
    private String note;

    public Transaction(String accountName, double amount, String postedAt, String note) {
        this.id = counter++; 
        this.accountName = accountName;
        this.amount = amount;
        this.postedAt = postedAt;
        this.note = (note.length() > 40) ? note.substring(0, 40) : note; // Batasi note max 40 karakter
    }

    public String getAccountName() {
        return accountName;
    }
    public double getAmount() {
        return amount;
    }
    public String getPostedAt() {
        return postedAt;
    }
    public String getNote() {
        return note;
    }
    @Override
    public String toString() {
        return id + "|" + accountName + "|" + String.format("%.1f", amount) + "|" + postedAt + "|" + note;
    }
}
