package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void dodajArtikl() {
        Supermarket st=new Supermarket();
        Artikl ta=new Artikl("Test", 100, "1");
        Artikl[] taa=new Artikl[1000];
        for (int i=0; i<1000; i++){
            st.dodajArtikl(ta);
            taa[i]=ta;
        }
        assertAll ("Dodavanje artikala",
                () -> assertEquals(1000,st.getBrojArtikala()),
                () -> assertFalse (st.dodajArtikl(ta))
        );
    }

    @Test
    void getArtikli() {
        Supermarket st=new Supermarket();
        Artikl ta=new Artikl("Test", 100, "1");
        Artikl[] taa=new Artikl[1000];
        for (int i=0; i<1000; i++){
            st.dodajArtikl(ta);
            taa[i]=ta;
        }
        assertArrayEquals(taa,st.getArtikli());
    }

    @Test
    void izbaciArtiklSaKodom() {
        Supermarket st=new Supermarket();

        for (int i=0; i<10; i++){
            String vrti=i+"";
            Artikl ta=new Artikl("Test",100,vrti);
            st.dodajArtikl(ta);
        }

        assertAll("Izbacivanje artikala",
                () -> assertEquals(st.getArtikli()[9], st.izbaciArtiklSaKodom("9")),
                () -> assertEquals(9,st.getBrojArtikala()),
                () -> assertNull(st.izbaciArtiklSaKodom("pogresno"))
        );
    }
}