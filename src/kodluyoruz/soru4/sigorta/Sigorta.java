package kodluyoruz.soru4.sigorta;

import java.util.Date;

public abstract class Sigorta {
    protected String sigortaAdı;
    protected double ücreti;
    protected Date baslangicTarihi;
    protected Date bitisTarihi;

    public Sigorta() {
    }

    public Sigorta(String sigortaAdı, double ücreti, Date baslangicTarihi, Date bitisTarihi) {
        this.sigortaAdı = sigortaAdı;
        this.ücreti = ücreti;
        this.baslangicTarihi = baslangicTarihi;
        this.bitisTarihi = bitisTarihi;
    }

    protected abstract double calculate();
}
