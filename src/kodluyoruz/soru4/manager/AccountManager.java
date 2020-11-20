package kodluyoruz.soru4.manager;

import kodluyoruz.soru4.Account;
import kodluyoruz.soru4.exceptions.InvalidAuthenticationException;

import java.util.TreeSet;

public class AccountManager {
    public static int accountStatus = 0;
    private TreeSet<Account> accountTreeSet;

    public AccountManager(TreeSet<Account> accountTreeSet) {
        this.accountTreeSet = accountTreeSet;
    }

    public static int getAccountStatus() {
        return accountStatus;
    }

    public static void setAccountStatus(int accountStatus) {
        AccountManager.accountStatus = accountStatus;
    }

    public TreeSet<Account> getAccountTreeSet() {
        return accountTreeSet;
    }

    public void setAccountTreeSet(TreeSet<Account> accountTreeSet) {
        this.accountTreeSet = accountTreeSet;
    }

    public Account loginControl(String email, String password) {
        for (Account account : accountTreeSet) {
            if (account != null) {
                try {
                    account.loginUser(email, password);
                } catch (InvalidAuthenticationException ex) {
                    System.out.println(ex.getMessage());
                }

            }
        }
        return null;
    }
}
