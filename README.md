# Členi týmu : Adam Malina, Šimon Hruška, Hoang Dat Nguyen, David Kochan

# Tiskárna Účtenek v1.0

# sestavení programu 
 Ke zkompilování projektu je zapotřebí Maven.
1. V IntelliJ IDEA otevři pravý postranní panel **Maven**.
2. Rozbal **Lifecycle** a dvakrát klikněte na **package**.
   *(Případně lze použít příkaz `mvn clean package`, pokud je Maven nainstalovaný v systému).*

Po  sestavení se vytvoří složka `target/` se spustitelným JAR souborem.

# spuštění programu  
Ke spuštění programu není potřeba vývojové prostředí.
1. Otevři systémový terminál.
2. Přejdi do složky s projektem (`cd ~/IdeaProjects/druhy/uctenka`).
3. Spusť program příkazem:
   `java -jar target/TiskarnaUctenek-1.0jar`