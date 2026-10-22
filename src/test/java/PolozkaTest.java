import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PolozkaTest {
    @Test
    public void testVypocetCelkoveCeny() {
        Polozka polozka = new Polozka("Jablko", 15.50, 3);
        // Očekáváme 15.50 * 3 = 46.50
        assertEquals(46.50, polozka.getCelkovaCena(), 0.01, "Výpočet celkové ceny je chybný");
    }
}