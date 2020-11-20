package kodluyoruz.soru4.adres;

public class IsAdresi implements IAdres {
    private String ulke;
    private String sehir;
    private String ilce;
    private String acikAdres;

    public IsAdresi(String ulke, String sehir, String ilce, String acikAdres) {
        this.ulke = ulke;
        this.sehir = sehir;
        this.ilce = ilce;
        this.acikAdres = acikAdres;
    }

    public String getUlke() {
        return ulke;
    }

    public void setUlke(String ulke) {
        this.ulke = ulke;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public String getAcikAdres() {
        return acikAdres;
    }

    public void setAcikAdres(String acikAdres) {
        this.acikAdres = acikAdres;
    }

    @Override
    public String toString() {
        return "EvAdresi{" +
                "ulke='" + ulke + '\'' +
                ", sehir='" + sehir + '\'' +
                ", ilce='" + ilce + '\'' +
                ", acikAdres='" + acikAdres + '\'' +
                '}';
    }

    @Override
    public void adresDetayı() {
        toString();
    }
}
