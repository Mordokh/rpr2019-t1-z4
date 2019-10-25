package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodajArtikl() {
        Korpa tk=new Korpa();
        for (int i=0; i<50; i++){
            Artikl ta=new Artikl("Test", 100, "1");
            assertTrue(tk.dodajArtikl(ta));
        }
        assertFalse(tk.dodajArtikl(new Artikl("Prekoracenje",101,"2")));
    }

    @Test
    void getArtikli() {
        Korpa tk=new Korpa();
        Artikl[] taa=new Artikl[50];
        for (int i=0; i<50; i++){
            String vrti=(i+1)+"";
            Artikl ta=new Artikl("Test",100,vrti);
            tk.dodajArtikl(ta);
            taa[i]=ta;
        }
        assertArrayEquals(taa,tk.getArtikli());
    }

    @Test
    void izbaciArtiklSaKodom() {
        Korpa tk=new Korpa();

        for (int i=0; i<10; i++){
            String vrti=i+"";
            Artikl ta=new Artikl("Test",100,vrti);
            tk.dodajArtikl(ta);
        }

        assertAll("Izbacivanje artikala",
                () -> assertEquals(tk.getArtikli()[9], tk.izbaciArtiklSaKodom("9")),
                () -> assertEquals(9,tk.getBrojArtikala()),
                () -> assertNull(tk.izbaciArtiklSaKodom("pogresno"))
        );
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa tk=new Korpa();
        for (int i=0; i<50; i++){
            tk.dodajArtikl(new Artikl("Test",100,"1"));
        }
        assertEquals(5000,tk.dajUkupnuCijenuArtikala());
    }
}