import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        // Inicializace Scanneru pro čtení z příkazové řádky [System.in]
        Scanner scanner = new Scanner(System.in);
        List<Polozka> nakup = new ArrayList<>();

        System.out.println("--- Pokladní systém spuštěn ---");

        // Nekonečný cyklus, který přerušíme příkazem 'break'
        while (true) {
            System.out.print("Zadej název položky (nebo napiš 'konec' pro tisk): ");
            String nazev = scanner.nextLine();

            // Pokud uživatel napíše konec [nezáleží na velikosti písmen], ukončíme zadávání
            if (nazev.equalsIgnoreCase("konec")) {
                break;
            }

            double cena = 0;
            int pocet = 0;

            // Ošetření chyby pro cenu (musí to být číslo)
            while (true) {
                System.out.print("Zadej cenu za kus: ");
                try {
                    cena = Double.parseDouble(scanner.nextLine());
                    if (cena < 0) {
                        System.out.println("Cena nemůže být záporná.");
                        continue;
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Chyba: Zadej platné číslo (např. 15.50 nebo 20).");
                }
            }

            // Ošetření chyby pro počet [musí to být celé číslo]
            while (true) {
                System.out.print("Zadej počet kusů: ");
                try {
                    pocet = Integer.parseInt(scanner.nextLine());
                    if (pocet <= 0) {
                        System.out.println("Počet musí být větší než 0.");
                        continue;
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Chyba: Zadej celé číslo (např. 2).");
                }
            }

            // Přidáme položku do seznamu
            nakup.add(new Polozka(nazev, cena, pocet));
            System.out.println("-> Přidáno: " + pocet + "x " + nazev + " za " + cena + " CZK/kus\n");
        }

        System.out.println("\n--- Tisk účtenky ---");

        // 1. Načtení statických dat ze souboru
        Properties obchodData = new Properties();
        try (FileInputStream fis = new FileInputStream("obchod.properties")) {
            obchodData.load(fis);
        } catch (IOException e) {
            System.out.println("Upozornění: Soubor obchod.properties nebyl nalezen. Používám výchozí hodnoty.");
        }

        // Získání hodnot ze souboru (druhý parametr je výchozí hodnota, pokud soubor chybí)
        String nazevObchodu = obchodData.getProperty("obchod.nazev", "Můj Obchod");
        String adresa = obchodData.getProperty("obchod.adresa", "Neznámá adresa");
        String ico = obchodData.getProperty("obchod.ico", "00000000");
        String uvitani = obchodData.getProperty("obchod.uvitani", "Děkujeme!");

        // 2. Tisk hlavičky
        System.out.println("=====================================");
        System.out.printf("%25s%n", nazevObchodu);
        System.out.printf("%25s%n", adresa);
        System.out.printf("%25s%n", "IČO: " + ico);
        System.out.println("-------------------------------------");

        // 3. Tisk položek a výpočet celkové ceny
        double celkovaCena = 0.0;
        for (Polozka p : nakup) {
            System.out.printf("%-15s %3dx %8.2f CZK%n", p.getNazev(), p.getPocet(), p.getCelkovaCena());
            celkovaCena += p.getCelkovaCena();
        }

        // 4. Tisk patičky
        System.out.println("-------------------------------------");
        System.out.printf("CELKEM: %20.2f CZK%n", celkovaCena);
        System.out.println("=====================================");
        System.out.printf("%25s%n", uvitani);

        scanner.close(); // Slušnost je po sobě Scanner zavřít - umístěno na úplném konci
    }
}