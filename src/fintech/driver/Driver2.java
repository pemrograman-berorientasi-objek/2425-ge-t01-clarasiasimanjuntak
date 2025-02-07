package fintech.driver;

import fintech.model.Account;
import fintech.model.Transaction;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver2 {
    public static void main(String[] _args) {
        Scanner sc = new Scanner(System.in);
        List<Account> accounts = new ArrayList<>();
        List<Transaction> transactions = new ArrayList<>();

        while (sc.hasNextLine()) {
            String command = sc.nextLine();
            
            if ("create-account".equals(command)) {
                String owner = sc.nextLine();
                String accountName = sc.nextLine();

                Account newAccount = new Account(owner, accountName, 0.0);
                accounts.add(newAccount);

                System.out.println(newAccount);
            } 
            else if ("create-transaction".equals(command)) {
                String accountName = sc.nextLine();
                double amount = Double.parseDouble(sc.nextLine());
                String postedAt = sc.nextLine();
                String note = sc.nextLine();

                Account targetAccount = null;
                for (Account acc : accounts) {
                    if (acc.getAccountName().equals(accountName)) {
                        targetAccount = acc;
                        break;
                    }
                }

                if (targetAccount == null) {
                    System.out.println("Account not found");
                    continue;
                }

                // Buat transaksi dan update saldo akun
                Transaction newTransaction = new Transaction(accountName, amount, postedAt, note);
                transactions.add(newTransaction);
                targetAccount.updateBalance(amount);

                // Cetak transaksi + saldo akun terbaru
                System.out.println(newTransaction + "|" + String.format("%.1f", targetAccount.getBalance()));
            } 
            else {
                System.out.println("Unknown command");
            }
        }
        sc.close();
    }
}
