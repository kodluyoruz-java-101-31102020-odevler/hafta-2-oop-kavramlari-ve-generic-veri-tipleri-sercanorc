package kodluyoruz.soru4.sigorta;

import java.util.Date;

public class konut extends Sigorta {

    public konut() {
    }

    public konut(String sigortaAdı, double ücreti, Date baslangicTarihi, Date bitisTarihi) {
        super(sigortaAdı, ücreti, baslangicTarihi, bitisTarihi);
    }

    @Override
    protected double calculate() {
        double time =super.bitisTarihi.getTime()-super.baslangicTarihi.getTime();
        double ücret= time*ücreti;

        return ücret;
    }
}
