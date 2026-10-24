# Inventory & Stock Control System (Java Swing + MySQL)

## 1. Requirements
- JDK 17 (recommended) installed
- IntelliJ IDEA
- MySQL Server 8.x running

## 2. Database setup
1. Open MySQL Workbench (or mysql command line).
2. Run the script `database/inventory_db.sql` (creates `inventory_db` with sample data).
3. Edit `src/main/resources/db.properties` -> set `db.user` and `db.password`.
   For Backup/Restore set `mysql.bin.path` (example: `C:/Program Files/MySQL/MySQL Server 8.0/bin`).

## 3. Run in IntelliJ
1. File -> Open -> select the `pom.xml` -> "Open as Project". Wait until Maven downloads libraries.
2. Project SDK = JDK 17.
3. Run `com.inventory.Main`.

## 4. Login
| Role  | Username | Password  |
|-------|----------|-----------|
| Admin | admin    | admin123  |
| Staff | staff    | staff123  |

## 5. Run unit tests
IntelliJ: right click `src/test/java` -> Run 'All Tests'  (or `mvn test`)

## 6. Build executable package
`mvn clean package`  ->  creates `target/InventorySystem.jar` and `target/lib/`.
Copy `InventorySystem.jar`, the `lib` folder, `run.bat` and `database/inventory_db.sql` into one folder and zip it.
Run with `run.bat` or `java -jar InventorySystem.jar`.
