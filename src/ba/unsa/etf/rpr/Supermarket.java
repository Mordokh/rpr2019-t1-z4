package ba.unsa.etf.rpr;
import java.util.ArrayList;

public class Supermarket {
    private int max_value=1000;
    private int nartikal=0;
    private Artikl[] sviartikli =new Artikl[max_value];

    public boolean dodajArtikl (Artikl n) {
        if (nartikal==max_value) {
            System.out.println("Supermarket je pun!");
            return false;
        }

        else {
            sviartikli[nartikal]=n;
            nartikal++;
            return true;
        }
    }

    public Artikl[] getArtikli () {
        return sviartikli;
    }

    public int getBrojArtikala () {return nartikal;}

    public Artikl izbaciArtiklSaKodom(String n) {

        for (int i=0; i<nartikal; i++) {
            if (sviartikli[i].getKod().equals(n)) {

                Artikl izbacen=sviartikli[i];

                if (i==max_value-1) {
                    sviartikli[i]=null;
                    nartikal--;
                    return izbacen;
                }

                else {
                    for (int j=i+1; j<nartikal; j++) {
                        sviartikli[j-1]=sviartikli[j];
                    }

                    sviartikli[nartikal-1]=null;
                    nartikal--;
                    return izbacen;
                }
            }
        }
        return null;
    }


}
