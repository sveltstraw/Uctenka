# tym: Adam Malina, Šimon Hruška, Hoang Dat Nguyen, David Kochan

# Tiskárna Účtenek v1.0.0

# Jak program sestavit
Ke zkompilování projektu je potřeba Maven.
1. V IntelliJ IDEA otevřete pravý postranní panel **Maven**.
2. Rozbalte **Lifecycle** a dvakrát klikněte na **package**.
   *(Případně lze použít příkaz `mvn clean package`, pokud je Maven nainstalován v systému).*

Po úspěšném sestavení se vytvoří složka `target/` se spustitelným JAR souborem.

# Jak program spustit
Program nevyžaduje ke spuštění vývojové prostředí.
1. Otevřete systémový terminál.
2. Přejděte do složky s projektem (`cd ~/IdeaProjects/druhy/uctenka`).
3. Spusťte program příkazem:
   `java -jar target/TiskarnaUctenek-1.0.0.jar`