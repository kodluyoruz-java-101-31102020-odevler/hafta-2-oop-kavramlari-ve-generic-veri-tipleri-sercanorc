package kodluyoruz.soru4;

import kodluyoruz.soru4.manager.AccountManager;
import kodluyoruz.soru4.exceptions.InvalidAuthenticationException;
import kodluyoruz.soru4.giris.AuthenticationStatus;
import kodluyoruz.soru4.kontrolcü.SifreKontrolcüsü;
import kodluyoruz.soru4.sigorta.Sigorta;

import java.util.Date;
import java.util.List;

public abstract class Account implements Comparable<Account> {
    protected User user;
    protected List<Sigorta> sigortaList;
    protected AuthenticationStatus authenticationStatus = AuthenticationStatus.FAIL;

    public Account() {
    }

    public Account(User user, List<Sigorta> sigortaList, AuthenticationStatus authenticationStatus) {
        this.user = user;
        this.sigortaList = sigortaList;
        this.authenticationStatus = authenticationStatus;
    }

    public final void showUserInfo() {
        if (this.user != null) {
            System.out.println(this.user.getIsim()+" "+ this.user.getSoyisim()+" sisteme son giris tarihi"+ this.user.getSonGiris(new Date()));
        } else {
            System.out.println("user null");
        }
    }

    public abstract void createInsurancePolicy();

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Sigorta> getSigortaList() {
        return sigortaList;
    }

    public void setSigortaList(List<Sigorta> sigortaList) {
        this.sigortaList = sigortaList;
    }

    public AuthenticationStatus getAuthenticationStatus() {
        return authenticationStatus;
    }

    public void setAuthenticationStatus(AuthenticationStatus authenticationStatus) {
        this.authenticationStatus = authenticationStatus;
    }

    public void loginUser(String email, String password) throws InvalidAuthenticationException {
        if (SifreKontrolcüsü.returnLoginDetail(email, password) == "Basarili") {
            if (user != null) {
                if (user.getEmail() != null && user.getPassword() != null) {
                    if (email.equals(user.getEmail()) && password.equals(user.getPassword())) {
                        authenticationStatus = AuthenticationStatus.SUCCESS;
                        user.getSonGiris(new Date());
                        System.out.println("Oturum açma başarılı");
                        AccountManager.accountStatus = 1;
                    } else {
                        System.out.println("Kullanıcı epostası ya da şifre alanı yanlış.");
                    }
                } else {
                    System.out.println("Kullanıcı epostası ya da şifre alanı boş bırakılamaz.");
                }
            }
        } else {
            System.out.println("basarsiz giris");
            authenticationStatus = AuthenticationStatus.FAIL;
        }
        authenticationStatus = AuthenticationStatus.FAIL;
    }
}
