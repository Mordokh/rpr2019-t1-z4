package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {


    @Test
    void Artikl(){
        Artikl ta=new Artikl("Test", 200, "5");
        assertEquals("Test"+200+"5",ta.getNaziv()+ta.getCijena()+ta.getKod());
    }

    @Test
    void getNaziv() {
        Artikl ta=new Artikl("Test", 200, "5");
        assertEquals("Test", ta.getNaziv());
    }

    @Test
    void getKod() {
        Artikl ta=new Artikl("Test", 200, "5");
        assertEquals("5",ta.getKod());
    }

    @Test
    void getCijena() {
        Artikl ta=new Artikl("Test", 200, "5");
        assertEquals(200,ta.getCijena());
    }
}