package fintech.driver;

import fintech.model.Account;
import model.transaction;
import java.util.Scanner;

/**
 * 12S23019_clarasia l. simanjuntak
 * 12s23043_grace Tiodora
 */

public class Driver2 {
    private static final String CREATE_ACCOUNT = "create-account";

    public static void main(String[] _args) {
     scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        if(command.equals(CREATE_ACCOUNT)){
            String owner = scanner.nextLine();
            String accountName = scanner.nextLine();
            Account account = new Account(owner, accountName);
            accounts.add(accountName, account);
            System.out.println(account);
        }
    

        

    }

}