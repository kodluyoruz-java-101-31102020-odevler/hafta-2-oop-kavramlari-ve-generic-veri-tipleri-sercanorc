package kodluyoruz.soru4;

import java.util.Date;
import java.util.List;
import kodluyoruz.soru4.adres.IAdres;

public class User {
    private String isim;
    private String soyisim;
    private String email;
    private String password;
    private String job;
    private Integer age;
    private List<IAdres> adresList;
    private Date sonGiris;

    public User() {
    }

    public User(String isim, String soyisim, String email, String password, String job, Integer age, List<IAdres> adresList, Date sonGiris) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.email = email;
        this.password = password;
        this.job = job;
        this.age = age;
        this.adresList = adresList;
        this.sonGiris = sonGiris;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<IAdres> getAdresList() {
        return adresList;
    }

    public void setAdresList(List<IAdres> adresList) {
        this.adresList = adresList;
    }

    public Date getSonGiris(Date date) {
        return sonGiris;
    }

    public void setSonGiris(Date sonGiris) {
        this.sonGiris = sonGiris;
    }

    @Override
    public String toString() {
        return "User{" +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", job='" + job + '\'' +
                ", age=" + age +
                ", adresList=" + adresList +
                ", sonGiris=" + sonGiris +
                '}';
    }
}
