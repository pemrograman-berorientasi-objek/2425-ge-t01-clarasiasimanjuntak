package fintech.model;
import java.util.ArrayList;
import java.util.List;

/**
 * 12S23019_clarasia l. simanjuntak
 * 12s23043_grace Tiodora
 */
public class Account {
  private String owner;
    private String accountName;
    private double balance;
    private List<Transaction> transactions;

    public Account(String owner, String accountName) {
        this.owner = owner;
        this.accountName = accountName;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
 
}
    public double getBalance(){
    return balance;
    }
    @Override
    public String toString(){
        return this.accountName + " (" + this.owner + ") : " + this.balance;
}