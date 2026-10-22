import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PolozkaTest {

    @Test
    void vypocetCelkoveCeny() {
        Polozka polozka = new Polozka("Jablko", 15.50, 3);
        assertEquals(46.50, polozka.getCelkovaCena(), 0.01);
    }

    @Test
    void nuloveMnozstviDavaNulu() {
        Polozka polozka = new Polozka("Hruška", 12.00, 0);
        assertEquals(0.0, polozka.getCelkovaCena(), 0.01);
    }

    @Test
    void zapornaCenaVyhodiVyjimku() {
        assertThrows(IllegalArgumentException.class, () -> new Polozka("Jablko", -1.0, 1));
    }

    @Test
    void zaporneMnozstviVyhodiVyjimku() {
        assertThrows(IllegalArgumentException.class, () -> new Polozka("Jablko", 10.0, -1));
    }
}
