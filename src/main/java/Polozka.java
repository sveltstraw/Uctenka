public class Polozka {
    private String nazev;
    private double cena;
    private int pocet;

    public Polozka(String nazev, double cena, int pocet) {
        this.nazev = nazev;
        this.cena = cena;
        this.pocet = pocet;
    }

    public String getNazev() { return nazev; }
    public double getCena() { return cena; }
    public int getPocet() { return pocet; }

    public double getCelkovaCena() {
        return cena * pocet;
    }
}