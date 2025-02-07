package fintech.model;

public class Account {
    private String owner;
    private String accountname;
    private double balance;


    public Account(String owner, String accountname, double balance) {
        this.owner = owner;
        this.accountname = accountname;
        this.balance = balance;
    }
    public String getAccountName() {
        return accountname;
    }
    public double getBalance() {
        return balance;
    }

    public void updateBalance(double amount) {
        this.balance += amount;
    }

    @Override
    public String toString() {
        return accountname + "|" + owner + "|" + String.format("%.1f", balance);
    }
}
