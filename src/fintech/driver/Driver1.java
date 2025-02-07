package fintech.driver;
import fintech.model.Account;
import java.util.Scanner;

/**
 * 12S23019 - Clarasia Simanjuntak
 * 12S23043 - Grace Tiodora
 */
public class Driver1 {
    public static void main(String[] _args) {
        Scanner sc = new Scanner(System.in);

        // Membaca input
        String command = sc.nextLine();
        String owner = sc.nextLine();
        String accountname = sc.nextLine();

        // Jika tidak ada balance diberikan, set default ke 0.0
        double balance = 0.0;

        if ("create-account".equals(command)) {
            // Membuat objek Account
            Account account = new Account(owner, accountname, balance);
            
            // Menampilkan hasil sesuai format yang diinginkan
            System.out.println(account.toString());
        } else {
            System.out.println("Unknown command");
        }

        sc.close();
    }
}
