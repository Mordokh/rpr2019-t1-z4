package ba.unsa.etf.rpr;

public class Artikl {
    private String naziv, kod;
    private int cijena;


    public Artikl (String naziv, int cijena, String kod) {
        this.naziv=naziv;
        this.cijena=cijena;
        this.kod=kod;
    }

    public final String getNaziv(){return naziv;}
    public final String getKod() {return kod;}
    public final int getCijena() {return cijena;}

}
