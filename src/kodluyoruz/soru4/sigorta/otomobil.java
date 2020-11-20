package kodluyoruz.soru4.sigorta;

import java.util.Date;

public class otomobil extends Sigorta {
    public otomobil() {
    }

    public otomobil(String sigortaAdı, double ücreti, Date baslangicTarihi, Date bitisTarihi) {
        super(sigortaAdı, ücreti, baslangicTarihi, bitisTarihi);
    }

    @Override
    protected double calculate() {

        double time =super.bitisTarihi.getTime()-super.baslangicTarihi.getTime();
        double ücret= time*ücreti;

        return ücret;
    }
}
