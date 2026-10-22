# Receipt Printer (Tiskárna účtenek) v1.0

A simple command-line program that creates a receipt from items entered by the user.

**Team:** Adam Malina, Šimon Hruška, Hoang Dat Nguyen, David Kochan

## What you need

- **Java 17 or newer** installed on your computer.
- If you want to build the program from source, you will also need **Maven**. You do not need Maven just to run the already-built JAR file.

To check whether Java is installed, open a terminal (Command Prompt or PowerShell on Windows) and run:

```bash
java -version
```

If Java is not installed, install a Java 17 (or newer) JDK from [Eclipse Temurin](https://adoptium.net/) or another trusted Java distributor. Close and reopen the terminal after installation, then run `java -version` again.

## Option 1: Run the ready-made executable JAR

If the project includes `target/TiskarnaUctenek-1.0.jar`, you can run it without opening IntelliJ or building the project again.

1. Download or copy the project folder to your computer and extract it if it is archived.
2. Open a terminal in the main project folder—the folder containing `README.md`, `obchod.properties`, and the `target` folder.
3. Run this command:

   ```bash
   java -jar target/TiskarnaUctenek-1.0.jar
   ```

   On Windows, you can open the project folder in File Explorer, click the address bar, type `cmd`, and press Enter to open Command Prompt in that folder. Then enter the command above.

> **Important:** The command must include the `.jar` extension. Run it from the main project folder so the program can find `obchod.properties`.

## Option 2: Build and run the program yourself

Use this option if the JAR file is missing or you want to compile the source code again. You need Java 17 or newer and Maven.

### Build in IntelliJ IDEA

1. Open the project in IntelliJ IDEA.
2. Open **View → Tool Windows → Maven**. (Depending on your IntelliJ version, the Maven tool window may be available on the right side.)
3. In the Maven tool window, expand **Lifecycle**.
4. Double-click **package** and wait for the build to finish.
5. The executable file will be created at `target/TiskarnaUctenek-1.0.jar`.

Then run it from the main project folder using:

```bash
java -jar target/TiskarnaUctenek-1.0.jar
```

### Build from a terminal

Open a terminal in the main project folder and run:

```bash
mvn package
java -jar target/TiskarnaUctenek-1.0.jar
```

## How to use the program

1. When prompted, enter the name of an item and press **Enter**.
2. Enter the price for one item and press **Enter**. Use a dot for decimal values, for example `15.50`.
3. Enter the quantity and press **Enter**. The quantity must be a whole number greater than zero.
4. Repeat these steps for each item you want to add.
5. When you have finished adding items, type `konec` and press **Enter**. The program will print the receipt and calculate the total.

The program displays the receipt in the terminal; it does not send it to a physical printer.

## Store details

The file `obchod.properties` contains the store name, address, company ID (IČO), and the message displayed at the bottom of the receipt. Keep this file in the main project folder when running the program. If the file is missing, the program will use default values.

## Troubleshooting

- **`java` is not recognized / command not found:** Java may not be installed or may not be added to your system's `PATH`. Install Java 17 or newer, then reopen the terminal.
- **`Unable to access jarfile ...`:** Check that `target/TiskarnaUctenek-1.0.jar` exists and that you are running the command from the main project folder.
- **The store name or address is missing or shows default values:** Make sure `obchod.properties` is in the main project folder and that you started the program from that folder.
- **`mvn` is not recognized / command not found:** Maven is not installed or is not available in your system's `PATH`. You can either install Maven or use the ready-made JAR if it is included.

## Team

- Adam Malina
- Šimon Hruška
- Hoang Dat Nguyen
- David Kochan
