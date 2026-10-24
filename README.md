# Inventory & Stock Control System

A Java Swing desktop application with a MySQL database that helps a small business
manage products, suppliers, customers and stock movements.

## Features
- Login with hashed passwords (SHA-256) and two roles: **Admin** and **Staff**
- Dashboard with summary cards and a low-stock list
- Add / update / delete / search for Categories, Suppliers, Customers, Products and Users
- **Stock In**, **Stock Out** and **Stock Adjustment** (saved with JDBC transactions; stock can never go negative)
- **Barcode** generation (Code 128), save as PNG and **print labels**
- **Barcode scanning** with a USB / Bluetooth scanner or the laptop camera
- Three Jasper reports (Current Stock, Low Stock, Stock Transactions) with **PDF and Excel export**
- Database **Backup and Restore**
- Input validation, friendly error messages and Log4j2 logging
- JUnit tests for validation, password hashing and barcodes

## Tech stack
Java 17 · Swing · JDBC · MySQL 8 · JasperReports · ZXing (barcode) · webcam-capture · Log4j2 · JUnit 5 · Maven

## 1. Requirements
- JDK 17 or newer (a full JDK, not only a JRE)
- IntelliJ IDEA
- MySQL Server 8.x (running)

## 2. Database setup
1. Open MySQL Workbench (or the mysql command line).
2. Run `database/inventory_db.sql`. It creates `inventory_db` with 8 tables and sample data.
3. Open `src/main/resources/db.properties` and set `db.user` and `db.password`.
   For Backup / Restore also set `mysql.bin.path`
   (example: `C:/Program Files/MySQL/MySQL Server 8.0/bin`).

## 3. Run in IntelliJ
1. File -> Open -> select `pom.xml` -> **Open as Project**. Wait until Maven downloads the libraries.
2. Set Project SDK to JDK 17.
3. Run `com.inventory.Main`.

## 4. Login
| Role  | Username | Password |
|-------|----------|----------|
| Admin | admin    | admin123 |
| Staff | staff    | staff123 |

Staff users cannot open the **Users** and **Backup / Restore** screens.

## 5. Using barcodes
- **Products** screen: *Generate Barcode*, *Save Barcode PNG* and *Print Barcode*.
  Tick *Print barcode label after adding* to print a label when a new product is saved.
  Tip: choose "Microsoft Print to PDF" if you do not have a printer.
- **Scanning**: on *Stock In*, *Stock Out* and the *Products* search box, use a USB scanner
  (click the box, scan, it presses Enter) or click **Scan with Camera** and show the barcode to the laptop camera.
- The camera needs Windows camera access (Settings -> Privacy & security -> Camera).
  Close other apps that use the camera (Zoom, OBS...) first.

## 6. Run the unit tests
IntelliJ: right-click `src/test/java` -> *Run 'All Tests'*, or run `mvn test`.

## 7. Build the Windows EXE
1. In IntelliJ: Maven panel -> Lifecycle -> **clean**, then **package**.
   This creates `target/InventorySystem.jar` and `target/lib/`.
2. Double-click **`make_exe.bat`** (needs a full JDK 17+ with `jpackage`).
   The application is created in `dist\InventorySystem\InventorySystem.exe`
   together with its own Java runtime, `db.properties` and `inventory_db.sql`.
3. Edit `dist\InventorySystem\db.properties` (database password, `mysql.bin.path`) - no rebuild needed.
4. Run `InventorySystem.exe`. To share it, zip the whole `dist\InventorySystem` folder.

The target PC needs MySQL with `inventory_db.sql` imported.
To run the jar without making an EXE, use `run.bat` or `java -jar target\InventorySystem.jar`.

## 8. Logs
Application logs are written to `C:\Users\<your name>\InventorySystem\logs\inventory.log`.

## 9. Project structure
```
database/                 SQL script (tables + sample data)
src/main/java/com/inventory
    db/                   DBConnection, DBHelper (JDBC)
    util/                 validation, password hashing, barcode, reports, backup
    ui/                   Swing screens, Theme (colours), camera scan
src/main/resources/       db.properties, log4j2.xml, Jasper reports (.jrxml)
src/test/java/            JUnit tests
make_exe.bat              builds the Windows EXE with jpackage
```
