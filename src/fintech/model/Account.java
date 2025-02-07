package fintech.model;

/**
 * @author NIM Nama
 * @author NIM Nama
 */
public class Account {
    private String owner;
    private String accountname;
    private double balance;

    // Konstruktor yang benar
    public Account(String owner, String accountname, double balance) {
        this.owner = owner;
        this.accountname = accountname;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return accountname + "|" + owner + "|" + balance;
    }
}