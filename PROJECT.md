# Inventory Managing System - Project Content

## Folder Structure

```
Folder PATH listing for volume Windows-SSD
Volume serial number is 5632-9ECC
C:.
|   .gitignore
|   pom.xml
|   PROJECT.md
|   README.md
|   run.bat
|   
+---.idea
|       .gitignore
|       compiler.xml
|       encodings.xml
|       jarRepositories.xml
|       misc.xml
|       workspace.xml
|       
+---database
|       inventory_db.sql
|       
+---dist
|   \---InventorySystem
|       |   InventorySystem.exe
|       |   InventorySystem.ico
|       |   
|       +---app
|       |   |   .jpackage.xml
|       |   |   db.properties
|       |   |   InventorySystem.cfg
|       |   |   InventorySystem.jar
|       |   |   
|       |   \---lib
|       |           bcprov-jdk15on-1.70.jar
|       |           bcutil-jdk15on-1.70.jar
|       |           commons-beanutils-1.9.4.jar
|       |           commons-codec-1.15.jar
|       |           commons-collections-3.2.2.jar
|       |           commons-collections4-4.2.jar
|       |           commons-compress-1.21.jar
|       |           commons-digester-2.1.jar
|       |           commons-io-2.11.0.jar
|       |           commons-logging-1.1.1.jar
|       |           commons-math3-3.6.1.jar
|       |           core-3.5.2.jar
|       |           curvesapi-1.07.jar
|       |           ecj-3.33.0.jar
|       |           itext-2.1.7.js10.jar
|       |           jackson-annotations-2.13.3.jar
|       |           jackson-core-2.13.3.jar
|       |           jackson-databind-2.13.3.jar
|       |           jackson-dataformat-xml-2.13.3.jar
|       |           jai-imageio-core-1.4.0.jar
|       |           jasperreports-6.20.0.jar
|       |           jasperreports-fonts-6.20.0.jar
|       |           javase-3.5.2.jar
|       |           jcommander-1.82.jar
|       |           jcommon-1.0.23.jar
|       |           jfreechart-1.0.19.jar
|       |           log4j-api-2.20.0.jar
|       |           log4j-core-2.20.0.jar
|       |           mysql-connector-j-8.0.33.jar
|       |           poi-5.2.3.jar
|       |           poi-ooxml-5.2.3.jar
|       |           poi-ooxml-lite-5.2.3.jar
|       |           protobuf-java-3.21.9.jar
|       |           SparseBitSet-1.2.jar
|       |           stax2-api-4.2.1.jar
|       |           woodstox-core-6.2.7.jar
|       |           xmlbeans-5.1.1.jar
|       |           
|       +---logs
|       |       inventory.log
|       |       
|       \---runtime
|           |   release
|           |   
|           +---bin
|           |   |   api-ms-win-core-console-l1-1-0.dll
|           |   |   api-ms-win-core-console-l1-2-0.dll
|           |   |   api-ms-win-core-datetime-l1-1-0.dll
|           |   |   api-ms-win-core-debug-l1-1-0.dll
|           |   |   api-ms-win-core-errorhandling-l1-1-0.dll
|           |   |   api-ms-win-core-fibers-l1-1-0.dll
|           |   |   api-ms-win-core-file-l1-1-0.dll
|           |   |   api-ms-win-core-file-l1-2-0.dll
|           |   |   api-ms-win-core-file-l2-1-0.dll
|           |   |   api-ms-win-core-handle-l1-1-0.dll
|           |   |   api-ms-win-core-heap-l1-1-0.dll
|           |   |   api-ms-win-core-interlocked-l1-1-0.dll
|           |   |   api-ms-win-core-libraryloader-l1-1-0.dll
|           |   |   api-ms-win-core-localization-l1-2-0.dll
|           |   |   api-ms-win-core-memory-l1-1-0.dll
|           |   |   api-ms-win-core-namedpipe-l1-1-0.dll
|           |   |   api-ms-win-core-processenvironment-l1-1-0.dll
|           |   |   api-ms-win-core-processthreads-l1-1-0.dll
|           |   |   api-ms-win-core-processthreads-l1-1-1.dll
|           |   |   api-ms-win-core-profile-l1-1-0.dll
|           |   |   api-ms-win-core-rtlsupport-l1-1-0.dll
|           |   |   api-ms-win-core-string-l1-1-0.dll
|           |   |   api-ms-win-core-synch-l1-1-0.dll
|           |   |   api-ms-win-core-synch-l1-2-0.dll
|           |   |   api-ms-win-core-sysinfo-l1-1-0.dll
|           |   |   api-ms-win-core-timezone-l1-1-0.dll
|           |   |   api-ms-win-core-util-l1-1-0.dll
|           |   |   api-ms-win-crt-conio-l1-1-0.dll
|           |   |   api-ms-win-crt-convert-l1-1-0.dll
|           |   |   api-ms-win-crt-environment-l1-1-0.dll
|           |   |   api-ms-win-crt-filesystem-l1-1-0.dll
|           |   |   api-ms-win-crt-heap-l1-1-0.dll
|           |   |   api-ms-win-crt-locale-l1-1-0.dll
|           |   |   api-ms-win-crt-math-l1-1-0.dll
|           |   |   api-ms-win-crt-multibyte-l1-1-0.dll
|           |   |   api-ms-win-crt-private-l1-1-0.dll
|           |   |   api-ms-win-crt-process-l1-1-0.dll
|           |   |   api-ms-win-crt-runtime-l1-1-0.dll
|           |   |   api-ms-win-crt-stdio-l1-1-0.dll
|           |   |   api-ms-win-crt-string-l1-1-0.dll
|           |   |   api-ms-win-crt-time-l1-1-0.dll
|           |   |   api-ms-win-crt-utility-l1-1-0.dll
|           |   |   awt.dll
|           |   |   fontmanager.dll
|           |   |   freetype.dll
|           |   |   j2gss.dll
|           |   |   java.dll
|           |   |   javajpeg.dll
|           |   |   jawt.dll
|           |   |   jimage.dll
|           |   |   jli.dll
|           |   |   jsound.dll
|           |   |   lcms.dll
|           |   |   management.dll
|           |   |   mlib_image.dll
|           |   |   msvcp140.dll
|           |   |   net.dll
|           |   |   nio.dll
|           |   |   prefs.dll
|           |   |   splashscreen.dll
|           |   |   sspi_bridge.dll
|           |   |   ucrtbase.dll
|           |   |   vcruntime140.dll
|           |   |   vcruntime140_1.dll
|           |   |   verify.dll
|           |   |   w2k_lsa_auth.dll
|           |   |   zip.dll
|           |   |   
|           |   \---server
|           |           jvm.dll
|           |           
|           +---conf
|           |   |   logging.properties
|           |   |   net.properties
|           |   |   sound.properties
|           |   |   
|           |   \---security
|           |       |   java.policy
|           |       |   java.security
|           |       |   
|           |       \---policy
|           |           |   README.txt
|           |           |   
|           |           +---limited
|           |           |       default_local.policy
|           |           |       default_US_export.policy
|           |           |       exempt_local.policy
|           |           |       
|           |           \---unlimited
|           |                   default_local.policy
|           |                   default_US_export.policy
|           |                   
|           +---legal
|           |   +---java.base
|           |   |       ADDITIONAL_LICENSE_INFO
|           |   |       aes.md
|           |   |       asm.md
|           |   |       ASSEMBLY_EXCEPTION
|           |   |       c-libutl.md
|           |   |       cldr.md
|           |   |       icu.md
|           |   |       LICENSE
|           |   |       public_suffix.md
|           |   |       siphash.md
|           |   |       unicode.md
|           |   |       wepoll.md
|           |   |       zlib.md
|           |   |       
|           |   +---java.datatransfer
|           |   |       ADDITIONAL_LICENSE_INFO
|           |   |       ASSEMBLY_EXCEPTION
|           |   |       LICENSE
|           |   |       
|           |   +---java.desktop
|           |   |       ADDITIONAL_LICENSE_INFO
|           |   |       ASSEMBLY_EXCEPTION
|           |   |       colorimaging.md
|           |   |       freetype.md
|           |   |       giflib.md
|           |   |       harfbuzz.md
|           |   |       jpeg.md
|           |   |       lcms.md
|           |   |       libpng.md
|           |   |       LICENSE
|           |   |       mesa3d.md
|           |   |       
|           |   +---java.logging
|           |   |       ADDITIONAL_LICENSE_INFO
|           |   |       ASSEMBLY_EXCEPTION
|           |   |       LICENSE
|           |   |       
|           |   +---java.management
|           |   |       ADDITIONAL_LICENSE_INFO
|           |   |       ASSEMBLY_EXCEPTION
|           |   |       LICENSE
|           |   |       
|           |   +---java.naming
|           |   |       ADDITIONAL_LICENSE_INFO
|           |   |       ASSEMBLY_EXCEPTION
|           |   |       LICENSE
|           |   |       
|           |   +---java.net.http
|           |   |       ADDITIONAL_LICENSE_INFO
|           |   |       ASSEMBLY_EXCEPTION
|           |   |       LICENSE
|           |   |       
|           |   +---java.prefs
|           |   |       ADDITIONAL_LICENSE_INFO
|           |   |       ASSEMBLY_EXCEPTION
|           |   |       LICENSE
|           |   |       
|           |   +---java.scripting
|           |   |       ADDITIONAL_LICENSE_INFO
|           |   |       ASSEMBLY_EXCEPTION
|           |   |       LICENSE
|           |   |       
|           |   +---java.security.jgss
|           |   |       ADDITIONAL_LICENSE_INFO
|           |   |       ASSEMBLY_EXCEPTION
|           |   |       LICENSE
|           |   |       
|           |   +---java.security.sasl
|           |   |       ADDITIONAL_LICENSE_INFO
|           |   |       ASSEMBLY_EXCEPTION
|           |   |       LICENSE
|           |   |       
|           |   +---java.sql
|           |   |       ADDITIONAL_LICENSE_INFO
|           |   |       ASSEMBLY_EXCEPTION
|           |   |       LICENSE
|           |   |       
|           |   +---java.transaction.xa
|           |   |       ADDITIONAL_LICENSE_INFO
|           |   |       ASSEMBLY_EXCEPTION
|           |   |       LICENSE
|           |   |       
|           |   +---java.xml
|           |   |       ADDITIONAL_LICENSE_INFO
|           |   |       ASSEMBLY_EXCEPTION
|           |   |       bcel.md
|           |   |       dom.md
|           |   |       jcup.md
|           |   |       LICENSE
|           |   |       xalan.md
|           |   |       xerces.md
|           |   |       
|           |   +---jdk.crypto.ec
|           |   |       ADDITIONAL_LICENSE_INFO
|           |   |       ASSEMBLY_EXCEPTION
|           |   |       LICENSE
|           |   |       
|           |   \---jdk.unsupported
|           |           ADDITIONAL_LICENSE_INFO
|           |           ASSEMBLY_EXCEPTION
|           |           LICENSE
|           |           
|           \---lib
|               |   classlist
|               |   fontconfig.bfc
|               |   fontconfig.properties.src
|               |   jawt.lib
|               |   jrt-fs.jar
|               |   jvm.cfg
|               |   jvm.lib
|               |   modules
|               |   psfont.properties.ja
|               |   psfontj2d.properties
|               |   tzdb.dat
|               |   tzmappings
|               |   
|               \---security
|                       blocked.certs
|                       cacerts
|                       default.policy
|                       public_suffix_list.dat
|                       
+---logs
|       inventory.log
|       
+---src
|   +---main
|   |   +---java
|   |   |   \---com
|   |   |       \---inventory
|   |   |           |   Main.java
|   |   |           |   
|   |   |           +---db
|   |   |           |       DBConnection.java
|   |   |           |       DBHelper.java
|   |   |           |       
|   |   |           +---ui
|   |   |           |       AdjustmentPanel.java
|   |   |           |       BackupPanel.java
|   |   |           |       CrudPanel.java
|   |   |           |       DashboardPanel.java
|   |   |           |       LoginFrame.java
|   |   |           |       MainFrame.java
|   |   |           |       ProductPanel.java
|   |   |           |       Refreshable.java
|   |   |           |       ReportPanel.java
|   |   |           |       StockInPanel.java
|   |   |           |       StockOutPanel.java
|   |   |           |       Theme.java
|   |   |           |       UserPanel.java
|   |   |           |       
|   |   |           \---util
|   |   |                   BackupUtil.java
|   |   |                   BarcodeUtil.java
|   |   |                   Item.java
|   |   |                   PasswordUtil.java
|   |   |                   ReportUtil.java
|   |   |                   Session.java
|   |   |                   Validator.java
|   |   |                   
|   |   \---resources
|   |       |   db.properties
|   |       |   log4j2.xml
|   |       |   
|   |       \---reports
|   |               low_stock_report.jrxml
|   |               stock_report.jrxml
|   |               transactions_report.jrxml
|   |               
|   \---test
|       \---java
|           \---com
|               \---inventory
|                   \---util
|                           BarcodeUtilTest.java
|                           PasswordUtilTest.java
|                           ValidatorTest.java
|                           
+---stage
|   |   InventorySystem.jar
|   |   
|   \---lib
|           bcprov-jdk15on-1.70.jar
|           bcutil-jdk15on-1.70.jar
|           commons-beanutils-1.9.4.jar
|           commons-codec-1.15.jar
|           commons-collections-3.2.2.jar
|           commons-collections4-4.2.jar
|           commons-compress-1.21.jar
|           commons-digester-2.1.jar
|           commons-io-2.11.0.jar
|           commons-logging-1.1.1.jar
|           commons-math3-3.6.1.jar
|           core-3.5.2.jar
|           curvesapi-1.07.jar
|           ecj-3.33.0.jar
|           itext-2.1.7.js10.jar
|           jackson-annotations-2.13.3.jar
|           jackson-core-2.13.3.jar
|           jackson-databind-2.13.3.jar
|           jackson-dataformat-xml-2.13.3.jar
|           jai-imageio-core-1.4.0.jar
|           jasperreports-6.20.0.jar
|           jasperreports-fonts-6.20.0.jar
|           javase-3.5.2.jar
|           jcommander-1.82.jar
|           jcommon-1.0.23.jar
|           jfreechart-1.0.19.jar
|           log4j-api-2.20.0.jar
|           log4j-core-2.20.0.jar
|           mysql-connector-j-8.0.33.jar
|           poi-5.2.3.jar
|           poi-ooxml-5.2.3.jar
|           poi-ooxml-lite-5.2.3.jar
|           protobuf-java-3.21.9.jar
|           SparseBitSet-1.2.jar
|           stax2-api-4.2.1.jar
|           woodstox-core-6.2.7.jar
|           xmlbeans-5.1.1.jar
|           
\---target
    |   InventorySystem.jar
    |   
    +---classes
    |   |   db.properties
    |   |   log4j2.xml
    |   |   
    |   +---com
    |   |   \---inventory
    |   |       |   Main.class
    |   |       |   
    |   |       +---db
    |   |       |       DBConnection.class
    |   |       |       DBHelper.class
    |   |       |       
    |   |       +---ui
    |   |       |       AdjustmentPanel$1.class
    |   |       |       AdjustmentPanel.class
    |   |       |       BackupPanel.class
    |   |       |       CrudPanel$1.class
    |   |       |       CrudPanel.class
    |   |       |       DashboardPanel$1.class
    |   |       |       DashboardPanel.class
    |   |       |       LoginFrame.class
    |   |       |       MainFrame.class
    |   |       |       ProductPanel$1.class
    |   |       |       ProductPanel.class
    |   |       |       Refreshable.class
    |   |       |       ReportPanel.class
    |   |       |       StockInPanel$1.class
    |   |       |       StockInPanel.class
    |   |       |       StockOutPanel$1.class
    |   |       |       StockOutPanel.class
    |   |       |       Theme$1.class
    |   |       |       Theme$RoundedButtonUI.class
    |   |       |       Theme$RowRenderer.class
    |   |       |       Theme.class
    |   |       |       UserPanel$1.class
    |   |       |       UserPanel.class
    |   |       |       
    |   |       \---util
    |   |               BackupUtil.class
    |   |               BarcodeUtil.class
    |   |               Item.class
    |   |               PasswordUtil.class
    |   |               ReportUtil.class
    |   |               Session.class
    |   |               Validator.class
    |   |               
    |   \---reports
    |           low_stock_report.jrxml
    |           stock_report.jrxml
    |           transactions_report.jrxml
    |           
    +---generated-sources
    |   \---annotations
    +---generated-test-sources
    |   \---test-annotations
    +---lib
    |       bcprov-jdk15on-1.70.jar
    |       bcutil-jdk15on-1.70.jar
    |       commons-beanutils-1.9.4.jar
    |       commons-codec-1.15.jar
    |       commons-collections-3.2.2.jar
    |       commons-collections4-4.2.jar
    |       commons-compress-1.21.jar
    |       commons-digester-2.1.jar
    |       commons-io-2.11.0.jar
    |       commons-logging-1.1.1.jar
    |       commons-math3-3.6.1.jar
    |       core-3.5.2.jar
    |       curvesapi-1.07.jar
    |       ecj-3.33.0.jar
    |       itext-2.1.7.js10.jar
    |       jackson-annotations-2.13.3.jar
    |       jackson-core-2.13.3.jar
    |       jackson-databind-2.13.3.jar
    |       jackson-dataformat-xml-2.13.3.jar
    |       jai-imageio-core-1.4.0.jar
    |       jasperreports-6.20.0.jar
    |       jasperreports-fonts-6.20.0.jar
    |       javase-3.5.2.jar
    |       jcommander-1.82.jar
    |       jcommon-1.0.23.jar
    |       jfreechart-1.0.19.jar
    |       log4j-api-2.20.0.jar
    |       log4j-core-2.20.0.jar
    |       mysql-connector-j-8.0.33.jar
    |       poi-5.2.3.jar
    |       poi-ooxml-5.2.3.jar
    |       poi-ooxml-lite-5.2.3.jar
    |       protobuf-java-3.21.9.jar
    |       SparseBitSet-1.2.jar
    |       stax2-api-4.2.1.jar
    |       woodstox-core-6.2.7.jar
    |       xmlbeans-5.1.1.jar
    |       
    +---maven-archiver
    |       pom.properties
    |       
    +---maven-status
    |   \---maven-compiler-plugin
    |       +---compile
    |       |   \---default-compile
    |       |           createdFiles.lst
    |       |           inputFiles.lst
    |       |           
    |       \---testCompile
    |           \---default-testCompile
    |                   createdFiles.lst
    |                   inputFiles.lst
    |                   
    +---surefire-reports
    |       com.inventory.util.BarcodeUtilTest.txt
    |       com.inventory.util.PasswordUtilTest.txt
    |       com.inventory.util.ValidatorTest.txt
    |       TEST-com.inventory.util.BarcodeUtilTest.xml
    |       TEST-com.inventory.util.PasswordUtilTest.xml
    |       TEST-com.inventory.util.ValidatorTest.xml
    |       
    \---test-classes
        \---com
            \---inventory
                \---util
                        BarcodeUtilTest.class
                        PasswordUtilTest.class
                        ValidatorTest.class
                        
```

## pom.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.inventory</groupId>
    <artifactId>InventorySystem</artifactId>
    <version>1.0</version>
    <packaging>jar</packaging>

    <properties>
        <maven.compiler.source>17</maven.compiler.source>
        <maven.compiler.target>17</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>

    <dependencies>
        <!-- MySQL JDBC driver -->
        <dependency>
            <groupId>com.mysql</groupId>
            <artifactId>mysql-connector-j</artifactId>
            <version>8.0.33</version>
        </dependency>
        <!-- Jasper Reports -->
        <dependency>
            <groupId>net.sf.jasperreports</groupId>
            <artifactId>jasperreports</artifactId>
            <version>6.20.0</version>
        </dependency>
        <dependency>
            <groupId>net.sf.jasperreports</groupId>
            <artifactId>jasperreports-fonts</artifactId>
            <version>6.20.0</version>
        </dependency>
        <!-- Java compiler used by Jasper to compile .jrxml -->
        <dependency>
            <groupId>org.eclipse.jdt</groupId>
            <artifactId>ecj</artifactId>
            <version>3.33.0</version>
        </dependency>
        <!-- Excel export -->
        <dependency>
            <groupId>org.apache.poi</groupId>
            <artifactId>poi-ooxml</artifactId>
            <version>5.2.3</version>
        </dependency>
        <!-- Barcode (ZXing) -->
        <dependency>
            <groupId>com.google.zxing</groupId>
            <artifactId>core</artifactId>
            <version>3.5.2</version>
        </dependency>
        <dependency>
            <groupId>com.google.zxing</groupId>
            <artifactId>javase</artifactId>
            <version>3.5.2</version>
        </dependency>
        <!-- Logging (Log4j2) -->
        <dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-api</artifactId>
            <version>2.20.0</version>
        </dependency>
        <dependency>
            <groupId>org.apache.logging.log4j</groupId>
            <artifactId>log4j-core</artifactId>
            <version>2.20.0</version>
        </dependency>
        <!-- JUnit 5 -->
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <version>5.10.0</version>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <build>
        <finalName>InventorySystem</finalName>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>3.1.2</version>
            </plugin>
            <!-- Executable jar: lib folder is referenced from the manifest -->
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-jar-plugin</artifactId>
                <version>3.3.0</version>
                <configuration>
                    <archive>
                        <manifest>
                            <mainClass>com.inventory.Main</mainClass>
                            <addClasspath>true</addClasspath>
                            <classpathPrefix>lib/</classpathPrefix>
                        </manifest>
                    </archive>
                </configuration>
            </plugin>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-dependency-plugin</artifactId>
                <version>3.6.0</version>
                <executions>
                    <execution>
                        <id>copy-libs</id>
                        <phase>package</phase>
                        <goals><goal>copy-dependencies</goal></goals>
                        <configuration>
                            <outputDirectory>${project.build.directory}/lib</outputDirectory>
                            <includeScope>runtime</includeScope>
                        </configuration>
                    </execution>
                </executions>
            </plugin>
        </plugins>
    </build>
</project>


```

## .idea\compiler.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project version="4">
  <component name="CompilerConfiguration">
    <annotationProcessing>
      <profile name="Maven default annotation processors profile" enabled="true">
        <sourceOutputDir name="target/generated-sources/annotations" />
        <sourceTestOutputDir name="target/generated-test-sources/test-annotations" />
        <outputRelativeToContentRoot value="true" />
        <module name="InventorySystem" />
      </profile>
    </annotationProcessing>
  </component>
</project>

```

## .idea\encodings.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project version="4">
  <component name="Encoding">
    <file url="file://$PROJECT_DIR$/src/main/java" charset="UTF-8" />
    <file url="file://$PROJECT_DIR$/src/main/resources" charset="UTF-8" />
  </component>
</project>

```

## .idea\jarRepositories.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project version="4">
  <component name="RemoteRepositoriesConfiguration">
    <remote-repository>
      <option name="id" value="central" />
      <option name="name" value="Central Repository" />
      <option name="url" value="https://repo.maven.apache.org/maven2" />
    </remote-repository>
    <remote-repository>
      <option name="id" value="central" />
      <option name="name" value="Maven Central repository" />
      <option name="url" value="https://repo1.maven.org/maven2" />
    </remote-repository>
    <remote-repository>
      <option name="id" value="jboss.community" />
      <option name="name" value="JBoss Community repository" />
      <option name="url" value="https://repository.jboss.org/nexus/content/repositories/public/" />
    </remote-repository>
  </component>
</project>

```

## .idea\misc.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project version="4">
  <component name="ExternalStorageConfigurationManager" enabled="true" />
  <component name="MavenProjectsManager">
    <option name="originalFiles">
      <list>
        <option value="$PROJECT_DIR$/pom.xml" />
      </list>
    </option>
  </component>
  <component name="ProjectRootManager" version="2" languageLevel="JDK_17" default="true" project-jdk-name="17" project-jdk-type="JavaSDK" />
</project>

```

## .idea\workspace.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project version="4">
  <component name="AutoImportSettings">
    <option name="autoReloadType" value="SELECTIVE" />
  </component>
  <component name="ChangeListManager">
    <list default="true" id="c5fc6f1c-44ca-4d43-b36a-3d95052f9329" name="Changes" comment="" />
    <option name="SHOW_DIALOG" value="false" />
    <option name="HIGHLIGHT_CONFLICTS" value="true" />
    <option name="HIGHLIGHT_NON_ACTIVE_CHANGELIST" value="false" />
    <option name="LAST_RESOLUTION" value="IGNORE" />
  </component>
  <component name="ProjectColorInfo">{
  &quot;associatedIndex&quot;: 7
}</component>
  <component name="ProjectId" id="3KM6rXLUkWveETpTxN56twHU6qS" />
  <component name="ProjectViewState">
    <option name="hideEmptyMiddlePackages" value="true" />
    <option name="showLibraryContents" value="true" />
  </component>
  <component name="PropertiesComponent">{
  &quot;keyToString&quot;: {
    &quot;Application.Main.executor&quot;: &quot;Run&quot;,
    &quot;Maven.InventorySystem [clean].executor&quot;: &quot;Run&quot;,
    &quot;Maven.InventorySystem [package].executor&quot;: &quot;Run&quot;,
    &quot;ModuleVcsDetector.initialDetectionPerformed&quot;: &quot;true&quot;,
    &quot;RunOnceActivity.ShowReadmeOnStart&quot;: &quot;true&quot;,
    &quot;RunOnceActivity.TerminalTabsStorage.copyFrom.TerminalArrangementManager.252&quot;: &quot;true&quot;,
    &quot;com.intellij.ml.llm.matterhorn.ej.ui.settings.DefaultModelSelectionForGA.v1&quot;: &quot;true&quot;,
    &quot;ignore.virus.scanning.warn.message&quot;: &quot;true&quot;,
    &quot;junie.onboarding.icon.badge.shown&quot;: &quot;true&quot;,
    &quot;kotlin-language-version-configured&quot;: &quot;true&quot;,
    &quot;last_opened_file_path&quot;: &quot;C:/Users/User/OneDrive/Documents/Java Institute/SAD/InventorySystem/src/main/java/com/inventory/ui&quot;,
    &quot;node.js.detected.package.eslint&quot;: &quot;true&quot;,
    &quot;node.js.detected.package.tslint&quot;: &quot;true&quot;,
    &quot;node.js.selected.package.eslint&quot;: &quot;(autodetect)&quot;,
    &quot;node.js.selected.package.tslint&quot;: &quot;(autodetect)&quot;,
    &quot;nodejs_package_manager_path&quot;: &quot;npm&quot;,
    &quot;project.structure.last.edited&quot;: &quot;Project&quot;,
    &quot;project.structure.proportion&quot;: &quot;0.0&quot;,
    &quot;project.structure.side.proportion&quot;: &quot;0.0&quot;,
    &quot;to.speed.mode.migration.done&quot;: &quot;true&quot;,
    &quot;vue.rearranger.settings.migration&quot;: &quot;true&quot;
  }
}</component>
  <component name="RecentsManager">
    <key name="CopyFile.RECENT_KEYS">
      <recent name="C:\Users\User\OneDrive\Documents\Java Institute\SAD\InventorySystem\src\main\java\com\inventory\ui" />
    </key>
  </component>
  <component name="RunManager">
    <configuration name="Main" type="Application" factoryName="Application" temporary="true" nameIsGenerated="true">
      <option name="MAIN_CLASS_NAME" value="com.inventory.Main" />
      <module name="InventorySystem" />
      <extension name="coverage">
        <pattern>
          <option name="PATTERN" value="com.inventory.*" />
          <option name="ENABLED" value="true" />
        </pattern>
      </extension>
      <method v="2">
        <option name="Make" enabled="true" />
      </method>
    </configuration>
    <recent_temporary>
      <list>
        <item itemvalue="Application.Main" />
      </list>
    </recent_temporary>
  </component>
  <component name="SharedIndexes">
    <attachedChunks>
      <set>
        <option value="bundled-jdk-9823dce3aa75-bf35d07a577b-intellij.indexing.shared.core-IU-252.27397.103" />
        <option value="bundled-js-predefined-d6986cc7102b-3aa1da707db6-JavaScript-IU-252.27397.103" />
      </set>
    </attachedChunks>
  </component>
  <component name="TaskManager">
    <task active="true" id="Default" summary="Default task">
      <changelist id="c5fc6f1c-44ca-4d43-b36a-3d95052f9329" name="Changes" comment="" />
      <created>1791355289188</created>
      <option name="number" value="Default" />
      <option name="presentableId" value="Default" />
      <updated>1791355289188</updated>
      <workItem from="1791355290429" duration="1842000" />
      <workItem from="1791382663368" duration="6668000" />
      <workItem from="1791724478618" duration="1634000" />
      <workItem from="1791902599822" duration="3665000" />
      <workItem from="1791910747492" duration="14000" />
      <workItem from="1791919168636" duration="855000" />
      <workItem from="1791966909394" duration="13000" />
    </task>
    <servers />
  </component>
  <component name="TypeScriptGeneratedFilesManager">
    <option name="version" value="3" />
  </component>
</project>

```

## database\inventory_db.sql

```sql
-- =====================================================
--  Inventory and Stock Control System - Database Script
--  MySQL 8.x
-- =====================================================
DROP DATABASE IF EXISTS inventory_db;
CREATE DATABASE inventory_db CHARACTER SET utf8mb4;
USE inventory_db;

-- 1. users
CREATE TABLE users (
    id            INT AUTO_INCREMENT PRIMARY KEY,
    username      VARCHAR(50)  NOT NULL UNIQUE,
    password_hash VARCHAR(64)  NOT NULL,
    full_name     VARCHAR(100) NOT NULL,
    role          ENUM('ADMIN','STAFF') NOT NULL DEFAULT 'STAFF',
    active        TINYINT(1)   NOT NULL DEFAULT 1
);

-- 2. categories
CREATE TABLE categories (
    id          INT AUTO_INCREMENT PRIMARY KEY,
    name        VARCHAR(100) NOT NULL UNIQUE,
    description VARCHAR(255)
);

-- 3. suppliers
CREATE TABLE suppliers (
    id             INT AUTO_INCREMENT PRIMARY KEY,
    name           VARCHAR(100) NOT NULL,
    contact_person VARCHAR(100),
    phone          VARCHAR(20),
    email          VARCHAR(100),
    address        VARCHAR(255)
);

-- 4. customers
CREATE TABLE customers (
    id      INT AUTO_INCREMENT PRIMARY KEY,
    name    VARCHAR(100) NOT NULL,
    phone   VARCHAR(20),
    email   VARCHAR(100),
    address VARCHAR(255)
);

-- 5. products
CREATE TABLE products (
    id            INT AUTO_INCREMENT PRIMARY KEY,
    code          VARCHAR(30)  NOT NULL UNIQUE,
    name          VARCHAR(100) NOT NULL,
    category_id   INT NOT NULL,
    supplier_id   INT NOT NULL,
    cost_price    DECIMAL(10,2) NOT NULL DEFAULT 0,
    unit_price    DECIMAL(10,2) NOT NULL DEFAULT 0,
    quantity      INT NOT NULL DEFAULT 0,
    reorder_level INT NOT NULL DEFAULT 0,
    FOREIGN KEY (category_id) REFERENCES categories(id),
    FOREIGN KEY (supplier_id) REFERENCES suppliers(id)
);

-- 6. stock_in (goods received from suppliers)
CREATE TABLE stock_in (
    id            INT AUTO_INCREMENT PRIMARY KEY,
    product_id    INT NOT NULL,
    supplier_id   INT NOT NULL,
    quantity      INT NOT NULL,
    unit_cost     DECIMAL(10,2) NOT NULL,
    received_date DATE NOT NULL,
    user_id       INT NOT NULL,
    remarks       VARCHAR(255),
    FOREIGN KEY (product_id)  REFERENCES products(id),
    FOREIGN KEY (supplier_id) REFERENCES suppliers(id),
    FOREIGN KEY (user_id)     REFERENCES users(id)
);

-- 7. stock_out (goods issued / sold to customers)
CREATE TABLE stock_out (
    id          INT AUTO_INCREMENT PRIMARY KEY,
    product_id  INT NOT NULL,
    customer_id INT NOT NULL,
    quantity    INT NOT NULL,
    unit_price  DECIMAL(10,2) NOT NULL,
    issue_date  DATE NOT NULL,
    user_id     INT NOT NULL,
    remarks     VARCHAR(255),
    FOREIGN KEY (product_id)  REFERENCES products(id),
    FOREIGN KEY (customer_id) REFERENCES customers(id),
    FOREIGN KEY (user_id)     REFERENCES users(id)
);

-- 8. stock_adjustments (damaged, lost, count corrections)
CREATE TABLE stock_adjustments (
    id              INT AUTO_INCREMENT PRIMARY KEY,
    product_id      INT NOT NULL,
    quantity_change INT NOT NULL,
    reason          VARCHAR(255) NOT NULL,
    adjust_date     DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    user_id         INT NOT NULL,
    FOREIGN KEY (product_id) REFERENCES products(id),
    FOREIGN KEY (user_id)    REFERENCES users(id)
);

-- ---------------- Sample data ----------------
-- admin / admin123   |   staff / staff123   (SHA-256 hashes)
INSERT INTO users (username, password_hash, full_name, role) VALUES
('admin','240be518fabd2724ddb6f04eeb1da5967448d7e831c08c8fa822809f74c720a9','System Administrator','ADMIN'),
('staff','10176e7b7b24d317acfcf8d2064cfd2f24e154f7b5a96603077d5ef813d6a6b6','Store Keeper','STAFF');

INSERT INTO categories (name, description) VALUES
('Electronics','Computer accessories and devices'),
('Stationery','Office stationery items'),
('Groceries','Food and beverage items'),
('Furniture','Office furniture'),
('Cleaning','Cleaning and hygiene items');

INSERT INTO suppliers (name, contact_person, phone, email, address) VALUES
('ABC Traders','Nimal Perera','0771234567','abc@traders.lk','Colombo 10'),
('Lanka Office Supplies','Kamal Silva','0712345678','info@lankaoffice.lk','Kandy'),
('Global Electronics','Sunil Fernando','0753456789','sales@globalelec.lk','Colombo 03'),
('Fresh Foods Pvt Ltd','Anura Bandara','0764567890','orders@freshfoods.lk','Gampaha');

INSERT INTO customers (name, phone, email, address) VALUES
('Walk-in Customer','0000000000','',''),
('Kandy City Mart','0812223344','mart@kandycity.lk','Kandy'),
('Perera & Sons','0771112233','perera@sons.lk','Peradeniya'),
('Silva Enterprises','0719998877','silva@ent.lk','Katugastota');

INSERT INTO products (code,name,category_id,supplier_id,cost_price,unit_price,reorder_level) VALUES
('ELE001','Wireless Mouse',1,3,1200,1650,10),
('ELE002','USB Keyboard',1,3,1800,2400,10),
('ELE003','LED Monitor 22 inch',1,3,28000,34500,5),
('STA001','A4 Paper Ream',2,2,950,1200,20),
('STA002','Ball Point Pen Box',2,2,350,480,15),
('STA003','Stapler',2,2,420,600,8),
('GRO001','Tea Packet 400g',3,4,520,650,25),
('GRO002','Sugar 1kg',3,4,210,260,30),
('FUR001','Office Chair',4,1,9500,12500,4),
('CLE001','Floor Cleaner 1L',5,1,380,520,12);

INSERT INTO stock_in (product_id,supplier_id,quantity,unit_cost,received_date,user_id,remarks) VALUES
(1,3,40,1200,'2026-09-01',1,'Opening stock'),
(2,3,25,1800,'2026-09-01',1,'Opening stock'),
(3,3,12,28000,'2026-09-01',1,'Opening stock'),
(4,2,100,950,'2026-09-02',1,'Opening stock'),
(5,2,60,350,'2026-09-02',1,'Opening stock'),
(6,2,20,420,'2026-09-02',1,'Opening stock'),
(7,4,80,520,'2026-09-03',1,'Opening stock'),
(8,4,120,210,'2026-09-03',1,'Opening stock'),
(9,1,10,9500,'2026-09-03',1,'Opening stock'),
(10,1,30,380,'2026-09-04',1,'Opening stock');

INSERT INTO stock_out (product_id,customer_id,quantity,unit_price,issue_date,user_id,remarks) VALUES
(1,2,35,1650,'2026-09-10',2,'Bulk order'),
(4,3,85,1200,'2026-09-11',2,'Office order'),
(3,2,4,34500,'2026-09-12',2,''),
(8,3,100,260,'2026-09-14',2,'Wholesale'),
(9,4,3,12500,'2026-09-15',2,''),
(7,1,20,650,'2026-09-16',2,''),
(2,2,10,2400,'2026-09-18',2,'');

-- keep product quantity consistent with the sample transactions
UPDATE products p SET quantity =
    COALESCE((SELECT SUM(quantity) FROM stock_in  WHERE product_id = p.id),0) -
    COALESCE((SELECT SUM(quantity) FROM stock_out WHERE product_id = p.id),0);


```

## dist\InventorySystem\app\.jpackage.xml

```xml
<?xml version="1.0" ?>
<jpackage-state version="17.0.17" platform="windows">
  <app-version>1.0</app-version>
  <main-launcher>InventorySystem</main-launcher>
  <signed>false</signed></jpackage-state>

```

## dist\InventorySystem\app\db.properties

```properties
# ---- Database settings (change to match your MySQL) ----
db.host=localhost
db.port=3306
db.name=inventory_db
db.user=root
db.password=Nadu@06&13

# ---- Folder that contains mysqldump / mysql (used by Backup & Restore) ----
# Leave empty if MySQL bin folder is in the system PATH.
# Example (Windows): C:/Program Files/MySQL/MySQL Server 8.0/bin
mysql.bin.path=C:\Program Files\MySQL\MySQL Server 8.4\bin


```

## dist\InventorySystem\runtime\conf\logging.properties

```properties
############################################################
#  	Default Logging Configuration File
#
# You can use a different file by specifying a filename
# with the java.util.logging.config.file system property.
# For example, java -Djava.util.logging.config.file=myfile
############################################################

############################################################
#  	Global properties
############################################################

# "handlers" specifies a comma-separated list of log Handler
# classes.  These handlers will be installed during VM startup.
# Note that these classes must be on the system classpath.
# By default we only configure a ConsoleHandler, which will only
# show messages at the INFO and above levels.
handlers= java.util.logging.ConsoleHandler

# To also add the FileHandler, use the following line instead.
#handlers= java.util.logging.FileHandler, java.util.logging.ConsoleHandler

# Default global logging level.
# This specifies which kinds of events are logged across
# all loggers.  For any given facility this global level
# can be overridden by a facility-specific level
# Note that the ConsoleHandler also has a separate level
# setting to limit messages printed to the console.
.level= INFO

############################################################
# Handler specific properties.
# Describes specific configuration info for Handlers.
############################################################

# default file output is in user's home directory.
java.util.logging.FileHandler.pattern = %h/java%u.log
java.util.logging.FileHandler.limit = 50000
java.util.logging.FileHandler.count = 1
# Default number of locks FileHandler can obtain synchronously.
# This specifies maximum number of attempts to obtain lock file by FileHandler
# implemented by incrementing the unique field %u as per FileHandler API documentation.
java.util.logging.FileHandler.maxLocks = 100
java.util.logging.FileHandler.formatter = java.util.logging.XMLFormatter

# Limit the messages that are printed on the console to INFO and above.
java.util.logging.ConsoleHandler.level = INFO
java.util.logging.ConsoleHandler.formatter = java.util.logging.SimpleFormatter

# Example to customize the SimpleFormatter output format
# to print one-line log message like this:
#     <level>: <log message> [<date/time>]
#
# java.util.logging.SimpleFormatter.format=%4$s: %5$s [%1$tc]%n

############################################################
# Facility-specific properties.
# Provides extra control for each logger.
############################################################

# For example, set the com.xyz.foo logger to only log SEVERE
# messages:
# com.xyz.foo.level = SEVERE


```

## dist\InventorySystem\runtime\conf\net.properties

```properties
############################################################
#       Default Networking Configuration File
#
# This file may contain default values for the networking system properties.
# These values are only used when the system properties are not specified
# on the command line or set programmatically.
# For now, only the various proxy settings can be configured here.
############################################################

# Whether or not the DefaultProxySelector will default to System Proxy
# settings when they do exist.
# Set it to 'true' to enable this feature and check for platform
# specific proxy settings
# Note that the system properties that do explicitly set proxies
# (like http.proxyHost) do take precedence over the system settings
# even if java.net.useSystemProxies is set to true.

java.net.useSystemProxies=false

#------------------------------------------------------------------------
# Proxy configuration for the various protocol handlers.
# DO NOT uncomment these lines if you have set java.net.useSystemProxies
# to true as the protocol specific properties will take precedence over
# system settings.
#------------------------------------------------------------------------

# HTTP Proxy settings. proxyHost is the name of the proxy server
# (e.g. proxy.mydomain.com), proxyPort is the port number to use (default
# value is 80) and nonProxyHosts is a '|' separated list of hostnames which
# should be accessed directly, ignoring the proxy server (default value is
# localhost & 127.0.0.1).
#
# http.proxyHost=
# http.proxyPort=80
http.nonProxyHosts=localhost|127.*|[::1]
#
# HTTPS Proxy Settings. proxyHost is the name of the proxy server
# (e.g. proxy.mydomain.com), proxyPort is the port number to use (default
# value is 443). The HTTPS protocol handlers uses the http nonProxyHosts list.
#
# https.proxyHost=
# https.proxyPort=443
#
# FTP Proxy settings. proxyHost is the name of the proxy server
# (e.g. proxy.mydomain.com), proxyPort is the port number to use (default
# value is 80) and nonProxyHosts is a '|' separated list of hostnames which
# should be accessed directly, ignoring the proxy server (default value is
# localhost & 127.0.0.1).
#
# ftp.proxyHost=
# ftp.proxyPort=80
ftp.nonProxyHosts=localhost|127.*|[::1]
#
# Socks proxy settings. socksProxyHost is the name of the proxy server
# (e.g. socks.domain.com), socksProxyPort is the port number to use
# (default value is 1080)
#
# socksProxyHost=
# socksProxyPort=1080
#
# HTTP Keep Alive settings. remainingData is the maximum amount of data
# in kilobytes that will be cleaned off the underlying socket so that it
# can be reused (default value is 512K), queuedConnections is the maximum
# number of Keep Alive connections to be on the queue for clean up (default
# value is 10).
# http.KeepAlive.remainingData=512
# http.KeepAlive.queuedConnections=10

# Authentication Scheme restrictions for HTTP and HTTPS.
#
# In some environments certain authentication schemes may be undesirable
# when proxying HTTP or HTTPS.  For example, "Basic" results in effectively the
# cleartext transmission of the user's password over the physical network.
# This section describes the mechanism for disabling authentication schemes
# based on the scheme name. Disabled schemes will be treated as if they are not
# supported by the implementation.
#
# The 'jdk.http.auth.tunneling.disabledSchemes' property lists the authentication
# schemes that will be disabled when tunneling HTTPS over a proxy, HTTP CONNECT.
# The 'jdk.http.auth.proxying.disabledSchemes' property lists the authentication
# schemes that will be disabled when proxying HTTP.
#
# In both cases the property is a comma-separated list of, case-insensitive,
# authentication scheme names, as defined by their relevant RFCs. An
# implementation may, but is not required to, support common schemes whose names
# include: 'Basic', 'Digest', 'NTLM', 'Kerberos', 'Negotiate'.  A scheme that
# is not known, or not supported, by the implementation is ignored.
#
# Note: This property is currently used by the JDK Reference implementation. It
# is not guaranteed to be examined and used by other implementations.
#
#jdk.http.auth.proxying.disabledSchemes=
jdk.http.auth.tunneling.disabledSchemes=Basic

#
# Allow restricted HTTP request headers
#
# By default, the following request headers are not allowed to be set by user code
# in HttpRequests: "connection", "content-length", "expect", "host" and "upgrade".
# The 'jdk.httpclient.allowRestrictedHeaders' property allows one or more of these
# headers to be specified as a comma separated list to override the default restriction.
# The names are case-insensitive and white-space is ignored (removed before processing
# the list). Note, this capability is mostly intended for testing and isn't expected
# to be used in real deployments. Protocol errors or other undefined behavior is likely
# to occur when using them. The property is not set by default.
# Note also, that there may be other headers that are restricted from being set
# depending on the context. This includes the "Authorization" header when the
# relevant HttpClient has an authenticator set. These restrictions cannot be
# overridden by this property.
#
# jdk.httpclient.allowRestrictedHeaders=host
#
#
# Transparent NTLM HTTP authentication mode on Windows. Transparent authentication
# can be used for the NTLM scheme, where the security credentials based on the
# currently logged in user's name and password can be obtained directly from the
# operating system, without prompting the user. This property has three possible
# values which regulate the behavior as shown below. Other unrecognized values
# are handled the same as 'disabled'. Note, that NTLM is not considered to be a
# strongly secure authentication scheme and care should be taken before enabling
# this mechanism.
#
# Transparent authentication never used.
#jdk.http.ntlm.transparentAuth=disabled
#
# Enabled for all hosts.
#jdk.http.ntlm.transparentAuth=allHosts
#
# Enabled for hosts that are trusted in Windows Internet settings
#jdk.http.ntlm.transparentAuth=trustedHosts
#
jdk.http.ntlm.transparentAuth=disabled

#
# Maximum HTTP field section size that a client is prepared to accept
#
# jdk.http.maxHeaderSize=393216
#
# This is the maximum header field section size that a client is prepared to accept.
# This is computed as the sum of the size of the uncompressed header name, plus
# the size of the uncompressed header value, plus an overhead of 32 bytes for
# each field section line. If a peer sends a field section that exceeds this
# size a {@link java.net.ProtocolException ProtocolException} will be raised.
# This applies to all versions of the HTTP protocol. A value of zero or a negative
# value means no limit. If left unspecified, the default value is 393216 bytes
# or 384kB.
#
# Note: This property is currently used by the JDK Reference implementation. It
# is not guaranteed to be examined and used by other implementations.
#
# Default directory where automatically bound Unix domain server
# sockets are stored. Sockets are automatically bound when bound
# with a null address.
#
# The search order for the directory on Windows is:
#
# 1. System property "jdk.net.unixdomain.tmpdir"
#
# 2. Networking property "jdk.net.unixdomain.tmpdir" specified
#    in this file (not set by default)
#
# 3. The TEMP environment variable (the effective default)
#
# 4. The java.io.tmpdir system property
#
#jdk.net.unixdomain.tmpdir=
#



```

## dist\InventorySystem\runtime\conf\sound.properties

```properties
############################################################
#               Sound Configuration File
############################################################
#
# This properties file is used to specify default service
# providers for javax.sound.midi.MidiSystem and
# javax.sound.sampled.AudioSystem.
#
# The following keys are recognized by MidiSystem methods:
#
# javax.sound.midi.Receiver
# javax.sound.midi.Sequencer
# javax.sound.midi.Synthesizer
# javax.sound.midi.Transmitter
#
# The following keys are recognized by AudioSystem methods:
#
# javax.sound.sampled.Clip
# javax.sound.sampled.Port
# javax.sound.sampled.SourceDataLine
# javax.sound.sampled.TargetDataLine
#
# The values specify the full class name of the service
# provider, or the device name.
#
# See the class descriptions for details.
#
# Example 1:
# Use MyDeviceProvider as default for SourceDataLines:
# javax.sound.sampled.SourceDataLine=com.xyz.MyDeviceProvider
#
# Example 2:
# Specify the default Synthesizer by its name "InternalSynth".
# javax.sound.midi.Synthesizer=#InternalSynth
#
# Example 3:
# Specify the default Receiver by provider and name:
# javax.sound.midi.Receiver=com.sun.media.sound.MidiProvider#SunMIDI1
#


```

## dist\InventorySystem\runtime\lib\psfontj2d.properties

```properties
#
#
# Copyright (c) 1999, Oracle and/or its affiliates. All rights reserved.
# DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
#
# This code is free software; you can redistribute it and/or modify it
# under the terms of the GNU General Public License version 2 only, as
# published by the Free Software Foundation.  Oracle designates this
# particular file as subject to the "Classpath" exception as provided
# by Oracle in the LICENSE file that accompanied this code.
#
# This code is distributed in the hope that it will be useful, but WITHOUT
# ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
# FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
# version 2 for more details (a copy is included in the LICENSE file that
# accompanied this code).
#
# You should have received a copy of the GNU General Public License version
# 2 along with this work; if not, write to the Free Software Foundation,
# Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
#
# Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
# or visit www.oracle.com if you need additional information or have any
# questions.

#
#	PostScript printer property file for Java 2D printing.
#
# WARNING: This is an internal implementation file, not a public file.
# Any customisation or reliance on the existence of this file and its
# contents or syntax is discouraged and unsupported.
# It may be incompatibly changed or removed without any notice.
#
#
font.num=35
#
# Legacy logical font family names and logical font aliases should all
# map to the primary logical font names.
#
serif=serif
times=serif
timesroman=serif
sansserif=sansserif
helvetica=sansserif
dialog=sansserif
dialoginput=monospaced
monospaced=monospaced
courier=monospaced
#
# Next, physical fonts which can be safely mapped to standard postscript fonts
# These keys generally map to a value which is the same as the key, so
# the key/value is just a way to say the font has a mapping.
# Sometimes however we map more than one screen font to the same PS font.
#
avantgarde=avantgarde_book
avantgarde_book=avantgarde_book
avantgarde_demi=avantgarde_demi
avantgarde_book_oblique=avantgarde_book_oblique
avantgarde_demi_oblique=avantgarde_demi_oblique
#
itcavantgarde=avantgarde_book
itcavantgarde=avantgarde_book
itcavantgarde_demi=avantgarde_demi
itcavantgarde_oblique=avantgarde_book_oblique
itcavantgarde_demi_oblique=avantgarde_demi_oblique
#
bookman=bookman_light
bookman_light=bookman_light
bookman_demi=bookman_demi
bookman_light_italic=bookman_light_italic
bookman_demi_italic=bookman_demi_italic
#
# Exclude "helvetica" on its own as that's a legacy name for a logical font
helvetica_bold=helvetica_bold
helvetica_oblique=helvetica_oblique
helvetica_bold_oblique=helvetica_bold_oblique
#
itcbookman_light=bookman_light
itcbookman_demi=bookman_demi
itcbookman_light_italic=bookman_light_italic
itcbookman_demi_italic=bookman_demi_italic
#
# Exclude "courier" on its own as that's a legacy name for a logical font
courier_bold=courier_bold
courier_oblique=courier_oblique
courier_bold_oblique=courier_bold_oblique
#
courier_new=courier
courier_new_bold=courier_bold
#
monotype_century_schoolbook=newcenturyschoolbook
monotype_century_schoolbook_bold=newcenturyschoolbook_bold
monotype_century_schoolbook_italic=newcenturyschoolbook_italic
monotype_century_schoolbook_bold_italic=newcenturyschoolbook_bold_italic
#
newcenturyschoolbook=newcenturyschoolbook
newcenturyschoolbook_bold=newcenturyschoolbook_bold
newcenturyschoolbook_italic=newcenturyschoolbook_italic
newcenturyschoolbook_bold_italic=newcenturyschoolbook_bold_italic
#
palatino=palatino
palatino_bold=palatino_bold
palatino_italic=palatino_italic
palatino_bold_italic=palatino_bold_italic
#
# Exclude "times" on its own as that's a legacy name for a logical font
times_bold=times_roman_bold
times_italic=times_roman_italic
times_bold_italic=times_roman_bold_italic
#
times_roman=times_roman
times_roman_bold=times_roman_bold
times_roman_italic=times_roman_italic
times_roman_bold_italic=times_roman_bold_italic
#
times_new_roman=times_roman
times_new_roman_bold=times_roman_bold
times_new_roman_italic=times_roman_italic
times_new_roman_bold_italic=times_roman_bold_italic
#
zapfchancery_italic=zapfchancery_italic
itczapfchancery_italic=zapfchancery_italic
#
# Next the mapping of the font name + charset + style to Postscript font name
# for the logical fonts.
#
serif.latin1.plain=Times-Roman
serif.latin1.bold=Times-Bold
serif.latin1.italic=Times-Italic
serif.latin1.bolditalic=Times-BoldItalic
serif.symbol.plain=Symbol
serif.dingbats.plain=ZapfDingbats
serif.symbol.bold=Symbol
serif.dingbats.bold=ZapfDingbats
serif.symbol.italic=Symbol
serif.dingbats.italic=ZapfDingbats
serif.symbol.bolditalic=Symbol
serif.dingbats.bolditalic=ZapfDingbats
#
sansserif.latin1.plain=Helvetica
sansserif.latin1.bold=Helvetica-Bold
sansserif.latin1.italic=Helvetica-Oblique
sansserif.latin1.bolditalic=Helvetica-BoldOblique
sansserif.symbol.plain=Symbol
sansserif.dingbats.plain=ZapfDingbats
sansserif.symbol.bold=Symbol
sansserif.dingbats.bold=ZapfDingbats
sansserif.symbol.italic=Symbol
sansserif.dingbats.italic=ZapfDingbats
sansserif.symbol.bolditalic=Symbol
sansserif.dingbats.bolditalic=ZapfDingbats
#
monospaced.latin1.plain=Courier
monospaced.latin1.bold=Courier-Bold
monospaced.latin1.italic=Courier-Oblique
monospaced.latin1.bolditalic=Courier-BoldOblique
monospaced.symbol.plain=Symbol
monospaced.dingbats.plain=ZapfDingbats
monospaced.symbol.bold=Symbol
monospaced.dingbats.bold=ZapfDingbats
monospaced.symbol.italic=Symbol
monospaced.dingbats.italic=ZapfDingbats
monospaced.symbol.bolditalic=Symbol
monospaced.dingbats.bolditalic=ZapfDingbats
#
# Next the mapping of the font name + charset + style to Postscript font name
# for the physical fonts. Since these always report style as plain, the
# style key is always plain. So we map using the face name to the correct
# style for the postscript font. This is possible since the face names can
# be replied upon to be different for each style.
# However an application may try to create a Font applying a style to an
# physical name. We want to map to the correct Postscript font there too
# if possible but we do not map cases where the application tries to
# augment a style (eg ask for a bold version of a bold font)
# Defer to the 2D package to attempt create an artificially styled version
#
avantgarde_book.latin1.plain=AvantGarde-Book
avantgarde_demi.latin1.plain=AvantGarde-Demi
avantgarde_book_oblique.latin1.plain=AvantGarde-BookOblique
avantgarde_demi_oblique.latin1.plain=AvantGarde-DemiOblique
#
avantgarde_book.latin1.bold=AvantGarde-Demi
avantgarde_book.latin1.italic=AvantGarde-BookOblique
avantgarde_book.latin1.bolditalic=AvantGarde-DemiOblique
avantgarde_demi.latin1.italic=AvantGarde-DemiOblique
avantgarde_book_oblique.latin1.bold=AvantGarde-DemiOblique
#
bookman_light.latin1.plain=Bookman-Light
bookman_demi.latin1.plain=Bookman-Demi
bookman_light_italic.latin1.plain=Bookman-LightItalic
bookman_demi_italic.latin1.plain=Bookman-DemiItalic
#
bookman_light.latin1.bold=Bookman-Demi
bookman_light.latin1.italic=Bookman-LightItalic
bookman_light.latin1.bolditalic=Bookman-DemiItalic
bookman_light_bold.latin1.italic=Bookman-DemiItalic
bookman_light_italic.latin1.bold=Bookman-DemiItalic
#
courier.latin1.plain=Courier
courier_bold.latin1.plain=Courier-Bold
courier_oblique.latin1.plain=Courier-Oblique
courier_bold_oblique.latin1.plain=Courier-BoldOblique
courier.latin1.bold=Courier-Bold
courier.latin1.italic=Courier-Oblique
courier.latin1.bolditalic=Courier-BoldOblique
courier_bold.latin1.italic=Courier-BoldOblique
courier_italic.latin1.bold=Courier-BoldOblique
#
helvetica_bold.latin1.plain=Helvetica-Bold
helvetica_oblique.latin1.plain=Helvetica-Oblique
helvetica_bold_oblique.latin1.plain=Helvetica-BoldOblique
helvetica.latin1.bold=Helvetica-Bold
helvetica.latin1.italic=Helvetica-Oblique
helvetica.latin1.bolditalic=Helvetica-BoldOblique
helvetica_bold.latin1.italic=Helvetica-BoldOblique
helvetica_italic.latin1.bold=Helvetica-BoldOblique
#
newcenturyschoolbook.latin1.plain=NewCenturySchlbk-Roman
newcenturyschoolbook_bold.latin1.plain=NewCenturySchlbk-Bold
newcenturyschoolbook_italic.latin1.plain=NewCenturySchlbk-Italic
newcenturyschoolbook_bold_italic.latin1.plain=NewCenturySchlbk-BoldItalic
newcenturyschoolbook.latin1.bold=NewCenturySchlbk-Bold
newcenturyschoolbook.latin1.italic=NewCenturySchlbk-Italic
newcenturyschoolbook.latin1.bolditalic=NewCenturySchlbk-BoldItalic
newcenturyschoolbook_bold.latin1.italic=NewCenturySchlbk-BoldItalic
newcenturyschoolbook_italic.latin1.bold=NewCenturySchlbk-BoldItalic
#
palatino.latin1.plain=Palatino-Roman
palatino_bold.latin1.plain=Palatino-Bold
palatino_italic.latin1.plain=Palatino-Italic
palatino_bold_italic.latin1.plain=Palatino-BoldItalic
palatino.latin1.bold=Palatino-Bold
palatino.latin1.italic=Palatino-Italic
palatino.latin1.bolditalic=Palatino-BoldItalic
palatino_bold.latin1.italic=Palatino-BoldItalic
palatino_italic.latin1.bold=Palatino-BoldItalic
#
times_roman.latin1.plain=Times-Roman
times_roman_bold.latin1.plain=Times-Bold
times_roman_italic.latin1.plain=Times-Italic
times_roman_bold_italic.latin1.plain=Times-BoldItalic
times_roman.latin1.bold=Times-Bold
times_roman.latin1.italic=Times-Italic
times_roman.latin1.bolditalic=Times-BoldItalic
times_roman_bold.latin1.italic=Times-BoldItalic
times_roman_italic.latin1.bold=Times-BoldItalic
#
zapfchancery_italic.latin1.plain=ZapfChancery-MediumItalic
#
# Finally the mappings of PS font names to indexes.
#
AvantGarde-Book=0
AvantGarde-BookOblique=1
AvantGarde-Demi=2
AvantGarde-DemiOblique=3
Bookman-Demi=4
Bookman-DemiItalic=5
Bookman-Light=6
Bookman-LightItalic=7
Courier=8
Courier-Bold=9
Courier-BoldOblique=10
Courier-Oblique=11
Helvetica=12
Helvetica-Bold=13
Helvetica-BoldOblique=14
Helvetica-Narrow=15
Helvetica-Narrow-Bold=16
Helvetica-Narrow-BoldOblique=17
Helvetica-Narrow-Oblique=18
Helvetica-Oblique=19
NewCenturySchlbk-Bold=20
NewCenturySchlbk-BoldItalic=21
NewCenturySchlbk-Italic=22
NewCenturySchlbk-Roman=23
Palatino-Bold=24
Palatino-BoldItalic=25
Palatino-Italic=26
Palatino-Roman=27
Symbol=28
Times-Bold=29
Times-BoldItalic=30
Times-Italic=31
Times-Roman=32
ZapfDingbats=33
ZapfChancery-MediumItalic=34
#
font.0=AvantGarde-Book ISOF
font.1=AvantGarde-BookOblique ISOF
font.2=AvantGarde-Demi ISOF
font.3=AvantGarde-DemiOblique ISOF
font.4=Bookman-Demi ISOF
font.5=Bookman-DemiItalic ISOF
font.6=Bookman-Light ISOF
font.7=Bookman-LightItalic ISOF
font.8=Courier ISOF
font.9=Courier-Bold ISOF
font.10=Courier-BoldOblique ISOF
font.11=Courier-Oblique ISOF
font.12=Helvetica ISOF
font.13=Helvetica-Bold ISOF
font.14=Helvetica-BoldOblique ISOF
font.15=Helvetica-Narrow ISOF
font.16=Helvetica-Narrow-Bold ISOF
font.17=Helvetica-Narrow-BoldOblique ISOF
font.18=Helvetica-Narrow-Oblique ISOF
font.19=Helvetica-Oblique ISOF
font.20=NewCenturySchlbk-Bold ISOF
font.21=NewCenturySchlbk-BoldItalic ISOF
font.22=NewCenturySchlbk-Italic ISOF
font.23=NewCenturySchlbk-Roman ISOF
font.24=Palatino-Bold ISOF
font.25=Palatino-BoldItalic ISOF
font.26=Palatino-Italic ISOF
font.27=Palatino-Roman ISOF
font.28=Symbol findfont
font.29=Times-Bold ISOF
font.30=Times-BoldItalic ISOF
font.31=Times-Italic ISOF
font.32=Times-Roman ISOF
font.33=ZapfDingbats findfont
font.34=ZapfChancery-MediumItalic ISOF
#


```

## src\main\java\com\inventory\Main.java

```java
package com.inventory;

import com.inventory.db.DBConnection;
import com.inventory.ui.LoginFrame;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import java.sql.Connection;

/** Application entry point. */
public class Main {

    private static final Logger log = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {
            // default look and feel is fine
        }
        SwingUtilities.invokeLater(() -> {
            try (Connection ignored = DBConnection.getConnection()) {
                log.info("Application started, database connection OK");
            } catch (Exception ex) {
                log.error("Database connection failed", ex);
                JOptionPane.showMessageDialog(null,
                        "Cannot connect to the database.\nCheck MySQL is running and db.properties is correct.\n\n" + ex.getMessage(),
                        "Database Error", JOptionPane.ERROR_MESSAGE);
                System.exit(1);
            }
            new LoginFrame().setVisible(true);
        });
    }
}


```

## src\main\java\com\inventory\db\DBConnection.java

```java
package com.inventory.db;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/** Creates JDBC connections using the settings in db.properties. */
public class DBConnection {

    private static final Logger log = LogManager.getLogger(DBConnection.class);
    private static final Properties props = new Properties();

    static {
        try {
            File dir = new File(DBConnection.class.getProtectionDomain()
                    .getCodeSource().getLocation().toURI()).getParentFile();
            File external = new File(dir, "db.properties");
            if (external.exists()) {
                try (InputStream in = new FileInputStream(external)) { props.load(in); }
            } else {
                try (InputStream in = DBConnection.class.getResourceAsStream("/db.properties")) { props.load(in); }
            }
        } catch (Exception e) {
            log.error("Could not load db.properties", e);
        }
    }

    public static String get(String key, String defaultValue) {
        return props.getProperty(key, defaultValue).trim();
    }

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://" + get("db.host", "localhost") + ":" + get("db.port", "3306")
                + "/" + get("db.name", "inventory_db")
                + "?useSSL=false&allowPublicKeyRetrieval=true";
        return DriverManager.getConnection(url, get("db.user", "root"), get("db.password", ""));
    }
}


```

## src\main\java\com\inventory\db\DBHelper.java

```java
package com.inventory.db;

import com.inventory.util.Item;

import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/** Small helper methods so every screen does not repeat the same JDBC code. */
public class DBHelper {

    private static void bind(PreparedStatement ps, Object... params) throws SQLException {
        for (int i = 0; i < params.length; i++) {
            ps.setObject(i + 1, params[i]);
        }
    }

    /** Runs a SELECT and fills the table model with the result. */
    public static void loadTable(DefaultTableModel model, String sql, Object... params) throws SQLException {
        model.setRowCount(0);
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            bind(ps, params);
            try (ResultSet rs = ps.executeQuery()) {
                int cols = rs.getMetaData().getColumnCount();
                while (rs.next()) {
                    Object[] row = new Object[cols];
                    for (int i = 0; i < cols; i++) {
                        row[i] = rs.getObject(i + 1);
                    }
                    model.addRow(row);
                }
            }
        }
    }

    /** Runs INSERT / UPDATE / DELETE. Returns affected rows. */
    public static int execute(String sql, Object... params) throws SQLException {
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            bind(ps, params);
            return ps.executeUpdate();
        }
    }

    /** Returns the first column of the first row (or null). */
    public static Object scalar(String sql, Object... params) throws SQLException {
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            bind(ps, params);
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next() ? rs.getObject(1) : null;
            }
        }
    }

    /** Loads (id, label) pairs for combo boxes. SQL must select id then label. */
    public static List<Item> items(String sql) throws SQLException {
        List<Item> list = new ArrayList<>();
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                list.add(new Item(rs.getInt(1), rs.getString(2)));
            }
        }
        return list;
    }

    /** Converts common MySQL errors to a user friendly message. */
    public static String friendlyMessage(SQLException e) {
        switch (e.getErrorCode()) {
            case 1062: return "This record already exists (duplicate value).";
            case 1451: return "This record is being used by other data and cannot be deleted.";
            case 1452: return "A related record was not found.";
            case 1045: return "Database login failed. Check db.properties.";
            default:   return "Database error: " + e.getMessage();
        }
    }
}


```

## src\main\java\com\inventory\ui\AdjustmentPanel.java

```java
package com.inventory.ui;

import com.inventory.db.DBConnection;
import com.inventory.db.DBHelper;
import com.inventory.util.Item;
import com.inventory.util.Session;
import com.inventory.util.Validator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/** Stock adjustments for damaged / lost items or stock count corrections (+ or -). */
public class AdjustmentPanel extends JPanel implements Refreshable {

    private static final Logger log = LogManager.getLogger(AdjustmentPanel.class);

    private final JComboBox<Item> cmbProduct = new JComboBox<>();
    private final JTextField txtChange = new JTextField();
    private final JTextField txtReason = new JTextField();
    private final DefaultTableModel model = new DefaultTableModel(
            new String[]{"ID", "Code", "Product", "Change", "Reason", "Date", "User"}, 0) {
        @Override
        public boolean isCellEditable(int r, int c) {
            return false;
        }
    };

    public AdjustmentPanel() {
        setLayout(new BorderLayout(10, 10));
        setBorder(new EmptyBorder(15, 15, 15, 15));

        JPanel form = new JPanel(new GridLayout(0, 4, 10, 10));
        form.add(new JLabel("Product *"));
        form.add(cmbProduct);
        form.add(new JLabel("Quantity Change * (e.g. -5 or 10)"));
        form.add(txtChange);
        form.add(new JLabel("Reason *"));
        form.add(txtReason);

        JButton btnSave = new JButton("Apply Adjustment");
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
        buttons.add(btnSave);

        JPanel north = new JPanel(new BorderLayout());
        north.setBorder(BorderFactory.createTitledBorder("Stock Adjustment"));
        north.add(form, BorderLayout.CENTER);
        north.add(buttons, BorderLayout.SOUTH);

        JTable tbl = new JTable(model);
        tbl.setRowHeight(24);

        add(north, BorderLayout.NORTH);
        add(new JScrollPane(tbl), BorderLayout.CENTER);

        btnSave.addActionListener(e -> save());
        refresh();
    }

    @Override
    public void refresh() {
        try {
            cmbProduct.removeAllItems();
            for (Item i : DBHelper.items("SELECT id, CONCAT(code, ' - ', name) FROM products ORDER BY code")) cmbProduct.addItem(i);
            DBHelper.loadTable(model, "SELECT a.id, p.code, p.name, a.quantity_change, a.reason, a.adjust_date, u.username "
                    + "FROM stock_adjustments a JOIN products p ON a.product_id = p.id JOIN users u ON a.user_id = u.id "
                    + "ORDER BY a.id DESC");
        } catch (SQLException ex) {
            log.error("Adjustment load failed", ex);
            JOptionPane.showMessageDialog(this, DBHelper.friendlyMessage(ex), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void save() {
        if (cmbProduct.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Select a product.", "Validation", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int change;
        try {
            change = Integer.parseInt(txtChange.getText().trim());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Quantity change must be a whole number.", "Validation", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (change == 0) {
            JOptionPane.showMessageDialog(this, "Quantity change cannot be 0.", "Validation", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (Validator.isEmpty(txtReason.getText())) {
            JOptionPane.showMessageDialog(this, "Reason is required.", "Validation", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int productId = ((Item) cmbProduct.getSelectedItem()).getId();

        try (Connection con = DBConnection.getConnection()) {
            con.setAutoCommit(false);
            try {
                int updated;
                try (PreparedStatement ps = con.prepareStatement(
                        "UPDATE products SET quantity = quantity + ? WHERE id = ? AND quantity + ? >= 0")) {
                    ps.setInt(1, change);
                    ps.setInt(2, productId);
                    ps.setInt(3, change);
                    updated = ps.executeUpdate();
                }
                if (updated == 0) {
                    con.rollback();
                    JOptionPane.showMessageDialog(this, "Adjustment would make the stock negative.",
                            "Not allowed", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                try (PreparedStatement ps = con.prepareStatement(
                        "INSERT INTO stock_adjustments (product_id, quantity_change, reason, user_id) VALUES (?, ?, ?, ?)")) {
                    ps.setInt(1, productId);
                    ps.setInt(2, change);
                    ps.setString(3, txtReason.getText().trim());
                    ps.setInt(4, Session.userId);
                    ps.executeUpdate();
                }
                con.commit();
            } catch (SQLException ex) {
                con.rollback();
                throw ex;
            }
            log.info("Stock adjustment: product {} change {}", productId, change);
            JOptionPane.showMessageDialog(this, "Adjustment saved.");
            txtChange.setText("");
            txtReason.setText("");
            refresh();
        } catch (SQLException ex) {
            log.error("Adjustment failed", ex);
            JOptionPane.showMessageDialog(this, DBHelper.friendlyMessage(ex), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}


```

## src\main\java\com\inventory\ui\BackupPanel.java

```java
package com.inventory.ui;

import com.inventory.util.BackupUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.io.File;
import java.time.LocalDate;

/** Database backup and restore (Admin only). */
public class BackupPanel extends JPanel {

    private static final Logger log = LogManager.getLogger(BackupPanel.class);

    private final JTextArea txtStatus = new JTextArea();

    public BackupPanel() {
        setLayout(new BorderLayout(10, 10));
        setBorder(new EmptyBorder(15, 15, 15, 15));

        JButton btnBackup = new JButton("Backup Database");
        JButton btnRestore = new JButton("Restore Database");
        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT, 15, 15));
        p.setBorder(BorderFactory.createTitledBorder("Database Maintenance"));
        p.add(btnBackup);
        p.add(btnRestore);

        txtStatus.setEditable(false);
        txtStatus.setText("Backup creates a .sql file using mysqldump.\n"
                + "Restore runs a .sql file using the mysql tool (existing data will be replaced).\n"
                + "If these tools are not found, set mysql.bin.path in db.properties.\n");

        add(p, BorderLayout.NORTH);
        add(new JScrollPane(txtStatus), BorderLayout.CENTER);

        btnBackup.addActionListener(e -> backup());
        btnRestore.addActionListener(e -> restore());
    }

    private void backup() {
        JFileChooser fc = new JFileChooser();
        fc.setSelectedFile(new File("inventory_backup_" + LocalDate.now() + ".sql"));
        if (fc.showSaveDialog(this) != JFileChooser.APPROVE_OPTION) return;
        try {
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            BackupUtil.backup(fc.getSelectedFile());
            txtStatus.append("Backup created: " + fc.getSelectedFile().getAbsolutePath() + "\n");
            JOptionPane.showMessageDialog(this, "Backup completed successfully.");
        } catch (Exception ex) {
            log.error("Backup failed", ex);
            txtStatus.append("Backup failed: " + ex.getMessage() + "\n");
            JOptionPane.showMessageDialog(this, "Backup failed:\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            setCursor(Cursor.getDefaultCursor());
        }
    }

    private void restore() {
        JFileChooser fc = new JFileChooser();
        if (fc.showOpenDialog(this) != JFileChooser.APPROVE_OPTION) return;
        int ok = JOptionPane.showConfirmDialog(this,
                "Restoring will overwrite current data. Continue?", "Confirm Restore", JOptionPane.YES_NO_OPTION);
        if (ok != JOptionPane.YES_OPTION) return;
        try {
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            BackupUtil.restore(fc.getSelectedFile());
            txtStatus.append("Database restored from: " + fc.getSelectedFile().getAbsolutePath() + "\n");
            JOptionPane.showMessageDialog(this, "Restore completed successfully.");
        } catch (Exception ex) {
            log.error("Restore failed", ex);
            txtStatus.append("Restore failed: " + ex.getMessage() + "\n");
            JOptionPane.showMessageDialog(this, "Restore failed:\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            setCursor(Cursor.getDefaultCursor());
        }
    }
}


```

## src\main\java\com\inventory\ui\CrudPanel.java

```java
package com.inventory.ui;

import com.inventory.db.DBHelper;
import com.inventory.util.Validator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.SQLException;

/**
 * Reusable CRUD screen (Add / Update / Delete / Search) for simple tables.
 * Used for Categories, Suppliers and Customers.
 */
public class CrudPanel extends JPanel implements Refreshable {

    private static final Logger log = LogManager.getLogger(CrudPanel.class);

    private final String title;
    private final String table;
    private final String[] columns;      // DB column names (without id)
    private final String[] labels;       // labels shown on screen
    private final int[] requiredIndexes; // which fields are mandatory

    private final JTextField[] fields;
    private final JTextField txtSearch = new JTextField(20);
    private final DefaultTableModel model;
    private final JTable tbl;
    private int selectedId = -1;

    public CrudPanel(String title, String table, String[] columns, String[] labels, int[] requiredIndexes) {
        this.title = title;
        this.table = table;
        this.columns = columns;
        this.labels = labels;
        this.requiredIndexes = requiredIndexes;

        setLayout(new BorderLayout(10, 10));
        setBorder(new EmptyBorder(15, 15, 15, 15));

        // ---- form ----
        JPanel form = new JPanel(new GridLayout(0, 4, 10, 10));
        fields = new JTextField[columns.length];
        for (int i = 0; i < columns.length; i++) {
            fields[i] = new JTextField();
            form.add(new JLabel(labels[i] + (isRequired(i) ? " *" : "")));
            form.add(fields[i]);
        }
        if (columns.length % 2 != 0) {          // keep grid aligned
            form.add(new JLabel());
            form.add(new JLabel());
        }

        JButton btnAdd = new JButton("Add");
        JButton btnUpdate = new JButton("Update");
        JButton btnDelete = new JButton("Delete");
        JButton btnClear = new JButton("Clear");
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
        buttons.add(btnAdd);
        buttons.add(btnUpdate);
        buttons.add(btnDelete);
        buttons.add(btnClear);

        JPanel north = new JPanel(new BorderLayout());
        north.setBorder(BorderFactory.createTitledBorder(title));
        north.add(form, BorderLayout.CENTER);
        north.add(buttons, BorderLayout.SOUTH);

        // ---- search + table ----
        String[] headers = new String[columns.length + 1];
        headers[0] = "ID";
        System.arraycopy(labels, 0, headers, 1, labels.length);
        model = new DefaultTableModel(headers, 0) {
            @Override
            public boolean isCellEditable(int row, int col) {
                return false;
            }
        };
        tbl = new JTable(model);
        tbl.setRowHeight(24);
        tbl.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JButton btnSearch = new JButton("Search");
        JButton btnAll = new JButton("Show All");
        JPanel searchBar = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
        searchBar.add(new JLabel("Search:"));
        searchBar.add(txtSearch);
        searchBar.add(btnSearch);
        searchBar.add(btnAll);

        JPanel center = new JPanel(new BorderLayout());
        center.add(searchBar, BorderLayout.NORTH);
        center.add(new JScrollPane(tbl), BorderLayout.CENTER);

        add(north, BorderLayout.NORTH);
        add(center, BorderLayout.CENTER);

        // ---- events ----
        btnAdd.addActionListener(e -> addRecord());
        btnUpdate.addActionListener(e -> updateRecord());
        btnDelete.addActionListener(e -> deleteRecord());
        btnClear.addActionListener(e -> clearForm());
        btnSearch.addActionListener(e -> load(txtSearch.getText().trim()));
        txtSearch.addActionListener(e -> load(txtSearch.getText().trim()));
        btnAll.addActionListener(e -> {
            txtSearch.setText("");
            load("");
        });
        tbl.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                fillFormFromTable();
            }
        });

        load("");
    }

    private boolean isRequired(int index) {
        for (int r : requiredIndexes) {
            if (r == index) return true;
        }
        return false;
    }

    @Override
    public void refresh() {
        load("");
    }

    private void load(String search) {
        try {
            String sql = "SELECT id, " + String.join(", ", columns) + " FROM " + table;
            if (search.isEmpty()) {
                DBHelper.loadTable(model, sql + " ORDER BY id DESC");
            } else {
                sql += " WHERE CONCAT_WS(' ', " + String.join(", ", columns) + ") LIKE ? ORDER BY id DESC";
                DBHelper.loadTable(model, sql, "%" + search + "%");
            }
        } catch (SQLException ex) {
            log.error("Load failed for {}", table, ex);
            JOptionPane.showMessageDialog(this, DBHelper.friendlyMessage(ex), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void fillFormFromTable() {
        int row = tbl.getSelectedRow();
        if (row < 0) return;
        selectedId = Integer.parseInt(model.getValueAt(row, 0).toString());
        for (int i = 0; i < fields.length; i++) {
            Object v = model.getValueAt(row, i + 1);
            fields[i].setText(v == null ? "" : v.toString());
        }
    }

    private void clearForm() {
        for (JTextField f : fields) f.setText("");
        selectedId = -1;
        tbl.clearSelection();
    }

    /** Returns an error message or null if all inputs are valid. */
    private String validateInputs() {
        for (int i = 0; i < fields.length; i++) {
            String value = fields[i].getText().trim();
            if (isRequired(i) && Validator.isEmpty(value)) {
                return labels[i] + " is required.";
            }
            if (columns[i].equals("email") && !value.isEmpty() && !Validator.isEmail(value)) {
                return "Invalid email address.";
            }
            if (columns[i].equals("phone") && !value.isEmpty() && !Validator.isPhone(value)) {
                return "Invalid phone number (7-15 digits).";
            }
        }
        return null;
    }

    private Object[] values() {
        Object[] v = new Object[fields.length];
        for (int i = 0; i < fields.length; i++) v[i] = fields[i].getText().trim();
        return v;
    }

    private void addRecord() {
        String error = validateInputs();
        if (error != null) {
            JOptionPane.showMessageDialog(this, error, "Validation", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            String marks = "?" + ", ?".repeat(columns.length - 1);
            DBHelper.execute("INSERT INTO " + table + " (" + String.join(", ", columns) + ") VALUES (" + marks + ")", values());
            log.info("{} record added", title);
            JOptionPane.showMessageDialog(this, "Record added successfully.");
            clearForm();
            load("");
        } catch (SQLException ex) {
            log.error("Insert failed", ex);
            JOptionPane.showMessageDialog(this, DBHelper.friendlyMessage(ex), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateRecord() {
        if (selectedId < 0) {
            JOptionPane.showMessageDialog(this, "Select a record from the table first.");
            return;
        }
        String error = validateInputs();
        if (error != null) {
            JOptionPane.showMessageDialog(this, error, "Validation", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            StringBuilder set = new StringBuilder();
            for (int i = 0; i < columns.length; i++) {
                set.append(i > 0 ? ", " : "").append(columns[i]).append(" = ?");
            }
            Object[] v = values();
            Object[] params = new Object[v.length + 1];
            System.arraycopy(v, 0, params, 0, v.length);
            params[v.length] = selectedId;
            DBHelper.execute("UPDATE " + table + " SET " + set + " WHERE id = ?", params);
            log.info("{} record {} updated", title, selectedId);
            JOptionPane.showMessageDialog(this, "Record updated successfully.");
            clearForm();
            load("");
        } catch (SQLException ex) {
            log.error("Update failed", ex);
            JOptionPane.showMessageDialog(this, DBHelper.friendlyMessage(ex), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void deleteRecord() {
        if (selectedId < 0) {
            JOptionPane.showMessageDialog(this, "Select a record from the table first.");
            return;
        }
        int ok = JOptionPane.showConfirmDialog(this, "Delete the selected record?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (ok != JOptionPane.YES_OPTION) return;
        try {
            DBHelper.execute("DELETE FROM " + table + " WHERE id = ?", selectedId);
            log.info("{} record {} deleted", title, selectedId);
            clearForm();
            load("");
        } catch (SQLException ex) {
            log.error("Delete failed", ex);
            JOptionPane.showMessageDialog(this, DBHelper.friendlyMessage(ex), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}


```

## src\main\java\com\inventory\ui\DashboardPanel.java

```java
package com.inventory.ui;

import com.inventory.db.DBHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.SQLException;

/** Home screen with summary numbers and the low stock list. */
public class DashboardPanel extends JPanel implements Refreshable {

    private static final Logger log = LogManager.getLogger(DashboardPanel.class);

    private final JLabel lblProducts = card();
    private final JLabel lblCategories = card();
    private final JLabel lblSuppliers = card();
    private final JLabel lblLow = card();
    private final JLabel lblValue = card();
    private final DefaultTableModel model = new DefaultTableModel(
            new String[]{"Code", "Product", "Quantity", "Reorder Level"}, 0) {
        @Override
        public boolean isCellEditable(int r, int c) {
            return false;
        }
    };

    public DashboardPanel() {
        setLayout(new BorderLayout(10, 15));
        setBorder(new EmptyBorder(15, 15, 15, 15));

        JPanel cards = new JPanel(new GridLayout(1, 5, 10, 10));
        cards.add(wrap("Products", lblProducts, Theme.PRIMARY));
        cards.add(wrap("Categories", lblCategories, Theme.SUCCESS));
        cards.add(wrap("Suppliers", lblSuppliers, Theme.WARNING));
        cards.add(wrap("Low Stock Items", lblLow, Theme.DANGER));
        cards.add(wrap("Stock Value (Cost)", lblValue, Theme.NAVY));

        JTable tbl = new JTable(model);
        tbl.setRowHeight(24);
        JPanel low = new JPanel(new BorderLayout());
        low.setBorder(BorderFactory.createTitledBorder("Items at or below reorder level"));
        low.add(new JScrollPane(tbl), BorderLayout.CENTER);

        add(cards, BorderLayout.NORTH);
        add(low, BorderLayout.CENTER);
        refresh();
    }

    private static JLabel card() {
        JLabel l = new JLabel("0", SwingConstants.CENTER);
        l.setFont(new Font("Segoe UI", Font.BOLD, 26));
        l.putClientProperty("keep", true);
        return l;
    }

    private JPanel wrap(String title, JLabel value, Color accent) {
        JPanel p = new JPanel(new BorderLayout());
        p.putClientProperty("accent", accent);
        value.setForeground(accent);
        p.setBorder(BorderFactory.createTitledBorder(title));
        p.setPreferredSize(new Dimension(150, 90));
        p.add(value, BorderLayout.CENTER);
        return p;
    }

    @Override
    public void refresh() {
        try {
            lblProducts.setText(String.valueOf(DBHelper.scalar("SELECT COUNT(*) FROM products")));
            lblCategories.setText(String.valueOf(DBHelper.scalar("SELECT COUNT(*) FROM categories")));
            lblSuppliers.setText(String.valueOf(DBHelper.scalar("SELECT COUNT(*) FROM suppliers")));
            lblLow.setText(String.valueOf(DBHelper.scalar("SELECT COUNT(*) FROM products WHERE quantity <= reorder_level")));
            Object value = DBHelper.scalar("SELECT COALESCE(SUM(quantity * cost_price), 0) FROM products");
            lblValue.setText(String.format("%,.2f", Double.parseDouble(String.valueOf(value))));
            DBHelper.loadTable(model, "SELECT code, name, quantity, reorder_level FROM products "
                    + "WHERE quantity <= reorder_level ORDER BY quantity");
        } catch (SQLException ex) {
            log.error("Dashboard load failed", ex);
            JOptionPane.showMessageDialog(this, DBHelper.friendlyMessage(ex), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}


```

## src\main\java\com\inventory\ui\LoginFrame.java

```java
package com.inventory.ui;

import com.inventory.db.DBConnection;
import com.inventory.util.PasswordUtil;
import com.inventory.util.Session;
import com.inventory.util.Validator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/** Login screen. */
public class LoginFrame extends JFrame {

    private static final Logger log = LogManager.getLogger(LoginFrame.class);

    private final JTextField txtUser = new JTextField(15);
    private final JPasswordField txtPass = new JPasswordField(15);

    public LoginFrame() {
        setTitle("Inventory System - Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel title = new JLabel("Inventory & Stock Control", SwingConstants.CENTER);
        title.setFont(new Font("Segoe UI", Font.BOLD, 22));
        title.setBorder(BorderFactory.createEmptyBorder(22, 10, 22, 10));
        title.setOpaque(true);
        title.setBackground(Theme.NAVY);
        title.setForeground(Color.WHITE);
        title.putClientProperty("keep", true);

        JPanel form = new JPanel(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        gc.insets = new Insets(8, 8, 8, 8);
        gc.anchor = GridBagConstraints.WEST;
        gc.gridx = 0; gc.gridy = 0;
        form.add(new JLabel("Username"), gc);
        gc.gridx = 1;
        form.add(txtUser, gc);
        gc.gridx = 0; gc.gridy = 1;
        form.add(new JLabel("Password"), gc);
        gc.gridx = 1;
        form.add(txtPass, gc);

        JButton btnLogin = new JButton("Login");
        JButton btnExit = new JButton("Exit");
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 10));
        buttons.add(btnLogin);
        buttons.add(btnExit);

        add(title, BorderLayout.NORTH);
        add(form, BorderLayout.CENTER);
        add(buttons, BorderLayout.SOUTH);

        btnLogin.addActionListener(e -> doLogin());
        txtPass.addActionListener(e -> doLogin());
        btnExit.addActionListener(e -> System.exit(0));
        getRootPane().setDefaultButton(btnLogin);

        getContentPane().setBackground(Theme.BG);
        form.setBorder(BorderFactory.createEmptyBorder(15, 20, 5, 20));
        Theme.apply((Container) getContentPane(), Theme.BG);

        pack();
        setSize(Math.max(getWidth(), 420), getHeight());
        setLocationRelativeTo(null);
    }

    private void doLogin() {
        String user = txtUser.getText().trim();
        String pass = new String(txtPass.getPassword());
        if (Validator.isEmpty(user) || pass.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter username and password.", "Validation", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String sql = "SELECT id, full_name, role FROM users WHERE username = ? AND password_hash = ? AND active = 1";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, user);
            ps.setString(2, PasswordUtil.hash(pass));
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Session.userId = rs.getInt("id");
                    Session.username = user;
                    Session.fullName = rs.getString("full_name");
                    Session.role = rs.getString("role");
                    log.info("User '{}' logged in", user);
                    new MainFrame().setVisible(true);
                    dispose();
                } else {
                    log.warn("Failed login attempt for '{}'", user);
                    JOptionPane.showMessageDialog(this, "Invalid username or password.", "Login Failed", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (SQLException ex) {
            log.error("Login database error", ex);
            JOptionPane.showMessageDialog(this, "Cannot connect to database:\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}


```

## src\main\java\com\inventory\ui\MainFrame.java

```java
package com.inventory.ui;

import com.inventory.util.Session;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/** Main window: left menu + screens shown with CardLayout. */
public class MainFrame extends JFrame {

    private static final Logger log = LogManager.getLogger(MainFrame.class);

    private final CardLayout cards = new CardLayout();
    private final JPanel content = new JPanel(cards);
    private final Map<String, JPanel> screens = new LinkedHashMap<>();
    private final Map<String, JButton> menuButtons = new HashMap<>();

    public MainFrame() {
        setTitle("Inventory & Stock Control System");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1150, 700);
        setLocationRelativeTo(null);

        // ---- register screens ----
        screens.put("Dashboard", new DashboardPanel());
        screens.put("Categories", new CrudPanel("Category Details", "categories",
                new String[]{"name", "description"},
                new String[]{"Name", "Description"}, new int[]{0}));
        screens.put("Suppliers", new CrudPanel("Supplier Details", "suppliers",
                new String[]{"name", "contact_person", "phone", "email", "address"},
                new String[]{"Name", "Contact Person", "Phone", "Email", "Address"}, new int[]{0}));
        screens.put("Customers", new CrudPanel("Customer Details", "customers",
                new String[]{"name", "phone", "email", "address"},
                new String[]{"Name", "Phone", "Email", "Address"}, new int[]{0}));
        screens.put("Products", new ProductPanel());
        screens.put("Stock In", new StockInPanel());
        screens.put("Stock Out", new StockOutPanel());
        screens.put("Stock Adjustment", new AdjustmentPanel());
        screens.put("Reports", new ReportPanel());
        if (Session.isAdmin()) {
            screens.put("Users", new UserPanel());
            screens.put("Backup / Restore", new BackupPanel());
        }

        // ---- left menu ----
        JPanel menu = new JPanel(new GridLayout(0, 1, 0, 4));
        menu.setBackground(Theme.SIDEBAR);
        menu.setBorder(BorderFactory.createEmptyBorder(12, 10, 10, 10));
        for (String name : screens.keySet()) {
            content.add(screens.get(name), name);
            JButton b = new JButton(name);
            Theme.styleMenuButton(b, false);
            b.addActionListener(e -> show(name));
            menuButtons.put(name, b);
            menu.add(b);
        }
        JButton btnLogout = new JButton("Logout");
        Theme.styleLogoutButton(btnLogout);
        btnLogout.addActionListener(e -> logout());
        menu.add(btnLogout);

        JPanel menuWrap = new JPanel(new BorderLayout());
        menuWrap.setBackground(Theme.SIDEBAR);
        menuWrap.add(menu, BorderLayout.NORTH);
        menuWrap.setPreferredSize(new Dimension(210, 0));

        // ---- header ----
        JLabel header = new JLabel("  Inventory & Stock Control      |      Welcome, " + Session.fullName + " (" + Session.role + ")");
        header.setFont(new Font("Segoe UI", Font.BOLD, 15));
        header.setOpaque(true);
        header.setBackground(Theme.NAVY);
        header.setForeground(Color.WHITE);
        header.putClientProperty("keep", true);
        header.setBorder(BorderFactory.createEmptyBorder(14, 10, 14, 10));

        add(header, BorderLayout.NORTH);
        add(menuWrap, BorderLayout.WEST);
        add(content, BorderLayout.CENTER);

        // colours / styles for all screens
        Theme.apply(content, Theme.BG);

        show("Dashboard");
    }

    private void show(String name) {
        JPanel p = screens.get(name);
        if (p instanceof Refreshable) {
            ((Refreshable) p).refresh();
        }
        cards.show(content, name);
        for (Map.Entry<String, JButton> e : menuButtons.entrySet()) {
            Theme.styleMenuButton(e.getValue(), e.getKey().equals(name));
        }
    }

    private void logout() {
        log.info("User '{}' logged out", Session.username);
        new LoginFrame().setVisible(true);
        dispose();
    }
}


```

## src\main\java\com\inventory\ui\ProductPanel.java

```java
package com.inventory.ui;

import com.inventory.db.DBHelper;
import com.inventory.util.BarcodeUtil;
import com.inventory.util.Item;
import com.inventory.util.Validator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.File;
import java.sql.SQLException;

/** Product management screen with barcode generation. */
public class ProductPanel extends JPanel implements Refreshable {

    private static final Logger log = LogManager.getLogger(ProductPanel.class);

    private final JTextField txtCode = new JTextField();
    private final JTextField txtName = new JTextField();
    private final JComboBox<Item> cmbCategory = new JComboBox<>();
    private final JComboBox<Item> cmbSupplier = new JComboBox<>();
    private final JTextField txtCost = new JTextField();
    private final JTextField txtPrice = new JTextField();
    private final JTextField txtReorder = new JTextField();
    private final JTextField txtQty = new JTextField("0");
    private final JTextField txtSearch = new JTextField(20);
    private final JLabel lblBarcode = new JLabel("", SwingConstants.CENTER);
    private final DefaultTableModel model;
    private final JTable tbl;
    private int selectedId = -1;

    public ProductPanel() {
        setLayout(new BorderLayout(10, 10));
        setBorder(new EmptyBorder(15, 15, 15, 15));

        txtQty.setEditable(false);   // quantity changes only through Stock In / Out / Adjustment

        JPanel form = new JPanel(new GridLayout(0, 4, 10, 10));
        form.add(new JLabel("Product Code *"));
        form.add(txtCode);
        form.add(new JLabel("Product Name *"));
        form.add(txtName);
        form.add(new JLabel("Category *"));
        form.add(cmbCategory);
        form.add(new JLabel("Supplier *"));
        form.add(cmbSupplier);
        form.add(new JLabel("Cost Price *"));
        form.add(txtCost);
        form.add(new JLabel("Selling Price *"));
        form.add(txtPrice);
        form.add(new JLabel("Reorder Level *"));
        form.add(txtReorder);
        form.add(new JLabel("Current Quantity"));
        form.add(txtQty);

        JButton btnAdd = new JButton("Add");
        JButton btnUpdate = new JButton("Update");
        JButton btnDelete = new JButton("Delete");
        JButton btnClear = new JButton("Clear");
        JButton btnBarcode = new JButton("Generate Barcode");
        JButton btnSaveBarcode = new JButton("Save Barcode PNG");
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
        buttons.add(btnAdd);
        buttons.add(btnUpdate);
        buttons.add(btnDelete);
        buttons.add(btnClear);
        buttons.add(btnBarcode);
        buttons.add(btnSaveBarcode);

        lblBarcode.setPreferredSize(new Dimension(310, 110));
        lblBarcode.setBorder(BorderFactory.createTitledBorder("Barcode"));

        JPanel north = new JPanel(new BorderLayout(10, 5));
        north.setBorder(BorderFactory.createTitledBorder("Product Details"));
        north.add(form, BorderLayout.CENTER);
        north.add(lblBarcode, BorderLayout.EAST);
        north.add(buttons, BorderLayout.SOUTH);

        model = new DefaultTableModel(new String[]{"ID", "Code", "Name", "Category", "Supplier",
                "Cost", "Price", "Qty", "Reorder"}, 0) {
            @Override
            public boolean isCellEditable(int r, int c) {
                return false;
            }
        };
        tbl = new JTable(model);
        tbl.setRowHeight(24);
        tbl.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JButton btnSearch = new JButton("Search");
        JButton btnAll = new JButton("Show All");
        JPanel searchBar = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
        searchBar.add(new JLabel("Search (code / name / category):"));
        searchBar.add(txtSearch);
        searchBar.add(btnSearch);
        searchBar.add(btnAll);

        JPanel center = new JPanel(new BorderLayout());
        center.add(searchBar, BorderLayout.NORTH);
        center.add(new JScrollPane(tbl), BorderLayout.CENTER);

        add(north, BorderLayout.NORTH);
        add(center, BorderLayout.CENTER);

        btnAdd.addActionListener(e -> addProduct());
        btnUpdate.addActionListener(e -> updateProduct());
        btnDelete.addActionListener(e -> deleteProduct());
        btnClear.addActionListener(e -> clearForm());
        btnBarcode.addActionListener(e -> showBarcode());
        btnSaveBarcode.addActionListener(e -> saveBarcode());
        btnSearch.addActionListener(e -> load(txtSearch.getText().trim()));
        txtSearch.addActionListener(e -> load(txtSearch.getText().trim()));
        btnAll.addActionListener(e -> {
            txtSearch.setText("");
            load("");
        });
        tbl.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) fillForm();
        });

        refresh();
    }

    @Override
    public void refresh() {
        loadCombos();
        load("");
    }

    private void loadCombos() {
        try {
            cmbCategory.removeAllItems();
            for (Item i : DBHelper.items("SELECT id, name FROM categories ORDER BY name")) cmbCategory.addItem(i);
            cmbSupplier.removeAllItems();
            for (Item i : DBHelper.items("SELECT id, name FROM suppliers ORDER BY name")) cmbSupplier.addItem(i);
        } catch (SQLException ex) {
            log.error("Could not load combos", ex);
            JOptionPane.showMessageDialog(this, DBHelper.friendlyMessage(ex), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void load(String search) {
        String sql = "SELECT p.id, p.code, p.name, c.name, s.name, p.cost_price, p.unit_price, p.quantity, p.reorder_level "
                + "FROM products p JOIN categories c ON p.category_id = c.id JOIN suppliers s ON p.supplier_id = s.id ";
        try {
            if (search.isEmpty()) {
                DBHelper.loadTable(model, sql + "ORDER BY p.id DESC");
            } else {
                String like = "%" + search + "%";
                DBHelper.loadTable(model, sql + "WHERE p.code LIKE ? OR p.name LIKE ? OR c.name LIKE ? ORDER BY p.id DESC",
                        like, like, like);
            }
        } catch (SQLException ex) {
            log.error("Product load failed", ex);
            JOptionPane.showMessageDialog(this, DBHelper.friendlyMessage(ex), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void selectByLabel(JComboBox<Item> combo, String label) {
        for (int i = 0; i < combo.getItemCount(); i++) {
            if (combo.getItemAt(i).getLabel().equals(label)) {
                combo.setSelectedIndex(i);
                return;
            }
        }
    }

    private void fillForm() {
        int r = tbl.getSelectedRow();
        if (r < 0) return;
        selectedId = Integer.parseInt(model.getValueAt(r, 0).toString());
        txtCode.setText(String.valueOf(model.getValueAt(r, 1)));
        txtName.setText(String.valueOf(model.getValueAt(r, 2)));
        selectByLabel(cmbCategory, String.valueOf(model.getValueAt(r, 3)));
        selectByLabel(cmbSupplier, String.valueOf(model.getValueAt(r, 4)));
        txtCost.setText(String.valueOf(model.getValueAt(r, 5)));
        txtPrice.setText(String.valueOf(model.getValueAt(r, 6)));
        txtQty.setText(String.valueOf(model.getValueAt(r, 7)));
        txtReorder.setText(String.valueOf(model.getValueAt(r, 8)));
        showBarcode();
    }

    private void clearForm() {
        txtCode.setText("");
        txtName.setText("");
        txtCost.setText("");
        txtPrice.setText("");
        txtReorder.setText("");
        txtQty.setText("0");
        lblBarcode.setIcon(null);
        selectedId = -1;
        tbl.clearSelection();
    }

    private String validateInputs() {
        if (Validator.isEmpty(txtCode.getText())) return "Product code is required.";
        if (Validator.isEmpty(txtName.getText())) return "Product name is required.";
        if (cmbCategory.getSelectedItem() == null) return "Please add a category first.";
        if (cmbSupplier.getSelectedItem() == null) return "Please add a supplier first.";
        if (!Validator.isNonNegativeDecimal(txtCost.getText())) return "Cost price must be a number (0 or more).";
        if (!Validator.isNonNegativeDecimal(txtPrice.getText())) return "Selling price must be a number (0 or more).";
        if (!Validator.isNonNegativeInt(txtReorder.getText())) return "Reorder level must be a whole number (0 or more).";
        return null;
    }

    private void addProduct() {
        String error = validateInputs();
        if (error != null) {
            JOptionPane.showMessageDialog(this, error, "Validation", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            DBHelper.execute("INSERT INTO products (code, name, category_id, supplier_id, cost_price, unit_price, reorder_level) "
                            + "VALUES (?, ?, ?, ?, ?, ?, ?)",
                    txtCode.getText().trim(), txtName.getText().trim(),
                    ((Item) cmbCategory.getSelectedItem()).getId(), ((Item) cmbSupplier.getSelectedItem()).getId(),
                    Double.parseDouble(txtCost.getText().trim()), Double.parseDouble(txtPrice.getText().trim()),
                    Integer.parseInt(txtReorder.getText().trim()));
            log.info("Product added: {}", txtCode.getText().trim());
            JOptionPane.showMessageDialog(this, "Product added successfully.");
            clearForm();
            load("");
        } catch (SQLException ex) {
            log.error("Product insert failed", ex);
            JOptionPane.showMessageDialog(this, DBHelper.friendlyMessage(ex), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateProduct() {
        if (selectedId < 0) {
            JOptionPane.showMessageDialog(this, "Select a product from the table first.");
            return;
        }
        String error = validateInputs();
        if (error != null) {
            JOptionPane.showMessageDialog(this, error, "Validation", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            DBHelper.execute("UPDATE products SET code=?, name=?, category_id=?, supplier_id=?, cost_price=?, "
                            + "unit_price=?, reorder_level=? WHERE id=?",
                    txtCode.getText().trim(), txtName.getText().trim(),
                    ((Item) cmbCategory.getSelectedItem()).getId(), ((Item) cmbSupplier.getSelectedItem()).getId(),
                    Double.parseDouble(txtCost.getText().trim()), Double.parseDouble(txtPrice.getText().trim()),
                    Integer.parseInt(txtReorder.getText().trim()), selectedId);
            log.info("Product {} updated", selectedId);
            JOptionPane.showMessageDialog(this, "Product updated successfully.");
            clearForm();
            load("");
        } catch (SQLException ex) {
            log.error("Product update failed", ex);
            JOptionPane.showMessageDialog(this, DBHelper.friendlyMessage(ex), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void deleteProduct() {
        if (selectedId < 0) {
            JOptionPane.showMessageDialog(this, "Select a product from the table first.");
            return;
        }
        if (JOptionPane.showConfirmDialog(this, "Delete the selected product?", "Confirm",
                JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION) return;
        try {
            DBHelper.execute("DELETE FROM products WHERE id = ?", selectedId);
            log.info("Product {} deleted", selectedId);
            clearForm();
            load("");
        } catch (SQLException ex) {
            log.error("Product delete failed", ex);
            JOptionPane.showMessageDialog(this, DBHelper.friendlyMessage(ex), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void showBarcode() {
        String code = txtCode.getText().trim();
        if (code.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter a product code first.");
            return;
        }
        try {
            lblBarcode.setIcon(new ImageIcon(BarcodeUtil.generate(code, 280, 80)));
        } catch (Exception ex) {
            log.error("Barcode generation failed", ex);
            JOptionPane.showMessageDialog(this, "Cannot generate barcode: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void saveBarcode() {
        String code = txtCode.getText().trim();
        if (code.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter a product code first.");
            return;
        }
        JFileChooser fc = new JFileChooser();
        fc.setSelectedFile(new File(code + ".png"));
        if (fc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            try {
                BarcodeUtil.saveAsPng(code, fc.getSelectedFile());
                log.info("Barcode saved for {}", code);
                JOptionPane.showMessageDialog(this, "Barcode saved:\n" + fc.getSelectedFile().getAbsolutePath());
            } catch (Exception ex) {
                log.error("Barcode save failed", ex);
                JOptionPane.showMessageDialog(this, "Cannot save barcode: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}


```

## src\main\java\com\inventory\ui\Refreshable.java

```java
package com.inventory.ui;

/** Screens implementing this reload their data every time they are opened. */
public interface Refreshable {
    void refresh();
}


```

## src\main\java\com\inventory\ui\ReportPanel.java

```java
package com.inventory.ui;

import com.inventory.util.ReportUtil;
import net.sf.jasperreports.engine.JasperPrint;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.io.File;

/** Reports screen: view, export to PDF, export to Excel. */
public class ReportPanel extends JPanel {

    private static final Logger log = LogManager.getLogger(ReportPanel.class);

    private static final String[] NAMES = {"Current Stock Report", "Low Stock Report", "Stock Transactions Report"};
    private static final String[] FILES = {"stock_report.jrxml", "low_stock_report.jrxml", "transactions_report.jrxml"};
    private static final String[] OUT = {"stock_report", "low_stock_report", "transactions_report"};

    private final JComboBox<String> cmbReport = new JComboBox<>(NAMES);

    public ReportPanel() {
        setLayout(new BorderLayout());
        setBorder(new EmptyBorder(15, 15, 15, 15));

        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT, 15, 15));
        p.setBorder(BorderFactory.createTitledBorder("Reports"));
        JButton btnView = new JButton("View Report");
        JButton btnPdf = new JButton("Export to PDF");
        JButton btnExcel = new JButton("Export to Excel");
        p.add(new JLabel("Select Report:"));
        p.add(cmbReport);
        p.add(btnView);
        p.add(btnPdf);
        p.add(btnExcel);
        add(p, BorderLayout.NORTH);

        btnView.addActionListener(e -> view());
        btnPdf.addActionListener(e -> export(true));
        btnExcel.addActionListener(e -> export(false));
    }

    private JasperPrint build() {
        try {
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            return ReportUtil.fill(FILES[cmbReport.getSelectedIndex()]);
        } catch (Exception ex) {
            log.error("Report generation failed", ex);
            JOptionPane.showMessageDialog(this, "Cannot generate report:\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        } finally {
            setCursor(Cursor.getDefaultCursor());
        }
    }

    private void view() {
        JasperPrint print = build();
        if (print != null) ReportUtil.view(print);
    }

    private void export(boolean pdf) {
        JasperPrint print = build();
        if (print == null) return;
        JFileChooser fc = new JFileChooser();
        fc.setSelectedFile(new File(OUT[cmbReport.getSelectedIndex()] + (pdf ? ".pdf" : ".xlsx")));
        if (fc.showSaveDialog(this) != JFileChooser.APPROVE_OPTION) return;
        try {
            if (pdf) {
                ReportUtil.exportPdf(print, fc.getSelectedFile());
            } else {
                ReportUtil.exportExcel(print, fc.getSelectedFile());
            }
            JOptionPane.showMessageDialog(this, "Report exported:\n" + fc.getSelectedFile().getAbsolutePath());
        } catch (Exception ex) {
            log.error("Report export failed", ex);
            JOptionPane.showMessageDialog(this, "Export failed:\n" + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}


```

## src\main\java\com\inventory\ui\StockInPanel.java

```java
package com.inventory.ui;

import com.inventory.db.DBConnection;
import com.inventory.db.DBHelper;
import com.inventory.util.Item;
import com.inventory.util.Session;
import com.inventory.util.Validator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

/** Stock In (goods received from suppliers). Increases product quantity. */
public class StockInPanel extends JPanel implements Refreshable {

    private static final Logger log = LogManager.getLogger(StockInPanel.class);

    private final JComboBox<Item> cmbProduct = new JComboBox<>();
    private final JComboBox<Item> cmbSupplier = new JComboBox<>();
    private final JTextField txtQty = new JTextField();
    private final JTextField txtCost = new JTextField();
    private final JTextField txtDate = new JTextField(LocalDate.now().toString());
    private final JTextField txtRemarks = new JTextField();
    private final JTextField txtSearch = new JTextField(20);
    private final DefaultTableModel model;
    private final JTable tbl;

    public StockInPanel() {
        setLayout(new BorderLayout(10, 10));
        setBorder(new EmptyBorder(15, 15, 15, 15));

        JPanel form = new JPanel(new GridLayout(0, 4, 10, 10));
        form.add(new JLabel("Product *"));
        form.add(cmbProduct);
        form.add(new JLabel("Supplier *"));
        form.add(cmbSupplier);
        form.add(new JLabel("Quantity *"));
        form.add(txtQty);
        form.add(new JLabel("Unit Cost *"));
        form.add(txtCost);
        form.add(new JLabel("Date (yyyy-MM-dd) *"));
        form.add(txtDate);
        form.add(new JLabel("Remarks"));
        form.add(txtRemarks);

        JButton btnSave = new JButton("Save Stock In");
        JButton btnDelete = new JButton("Delete (reverse stock)");
        JButton btnClear = new JButton("Clear");
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
        buttons.add(btnSave);
        buttons.add(btnDelete);
        buttons.add(btnClear);

        JPanel north = new JPanel(new BorderLayout());
        north.setBorder(BorderFactory.createTitledBorder("Stock In (Goods Received)"));
        north.add(form, BorderLayout.CENTER);
        north.add(buttons, BorderLayout.SOUTH);

        model = new DefaultTableModel(new String[]{"ID", "Code", "Product", "Supplier", "Qty",
                "Unit Cost", "Date", "User", "Remarks"}, 0) {
            @Override
            public boolean isCellEditable(int r, int c) {
                return false;
            }
        };
        tbl = new JTable(model);
        tbl.setRowHeight(24);
        tbl.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JButton btnSearch = new JButton("Search");
        JButton btnAll = new JButton("Show All");
        JPanel searchBar = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
        searchBar.add(new JLabel("Search (product / supplier):"));
        searchBar.add(txtSearch);
        searchBar.add(btnSearch);
        searchBar.add(btnAll);

        JPanel center = new JPanel(new BorderLayout());
        center.add(searchBar, BorderLayout.NORTH);
        center.add(new JScrollPane(tbl), BorderLayout.CENTER);

        add(north, BorderLayout.NORTH);
        add(center, BorderLayout.CENTER);

        btnSave.addActionListener(e -> save());
        btnDelete.addActionListener(e -> delete());
        btnClear.addActionListener(e -> clearForm());
        btnSearch.addActionListener(e -> load(txtSearch.getText().trim()));
        txtSearch.addActionListener(e -> load(txtSearch.getText().trim()));
        btnAll.addActionListener(e -> {
            txtSearch.setText("");
            load("");
        });
        cmbProduct.addActionListener(e -> fillDefaultCost());

        refresh();
    }

    @Override
    public void refresh() {
        try {
            cmbProduct.removeAllItems();
            for (Item i : DBHelper.items("SELECT id, CONCAT(code, ' - ', name) FROM products ORDER BY code")) cmbProduct.addItem(i);
            cmbSupplier.removeAllItems();
            for (Item i : DBHelper.items("SELECT id, name FROM suppliers ORDER BY name")) cmbSupplier.addItem(i);
        } catch (SQLException ex) {
            log.error("Combo load failed", ex);
            JOptionPane.showMessageDialog(this, DBHelper.friendlyMessage(ex), "Error", JOptionPane.ERROR_MESSAGE);
        }
        load("");
    }

    private void fillDefaultCost() {
        Item p = (Item) cmbProduct.getSelectedItem();
        if (p == null) return;
        try {
            Object cost = DBHelper.scalar("SELECT cost_price FROM products WHERE id = ?", p.getId());
            if (cost != null) txtCost.setText(cost.toString());
        } catch (SQLException ex) {
            log.error("Could not read cost price", ex);
        }
    }

    private void load(String search) {
        String sql = "SELECT si.id, p.code, p.name, s.name, si.quantity, si.unit_cost, si.received_date, u.username, si.remarks "
                + "FROM stock_in si JOIN products p ON si.product_id = p.id JOIN suppliers s ON si.supplier_id = s.id "
                + "JOIN users u ON si.user_id = u.id ";
        try {
            if (search.isEmpty()) {
                DBHelper.loadTable(model, sql + "ORDER BY si.id DESC");
            } else {
                String like = "%" + search + "%";
                DBHelper.loadTable(model, sql + "WHERE p.code LIKE ? OR p.name LIKE ? OR s.name LIKE ? ORDER BY si.id DESC",
                        like, like, like);
            }
        } catch (SQLException ex) {
            log.error("Stock in load failed", ex);
            JOptionPane.showMessageDialog(this, DBHelper.friendlyMessage(ex), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearForm() {
        txtQty.setText("");
        txtCost.setText("");
        txtDate.setText(LocalDate.now().toString());
        txtRemarks.setText("");
        tbl.clearSelection();
        fillDefaultCost();
    }

    private void save() {
        if (cmbProduct.getSelectedItem() == null || cmbSupplier.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Select a product and a supplier.", "Validation", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (!Validator.isPositiveInt(txtQty.getText())) {
            JOptionPane.showMessageDialog(this, "Quantity must be a whole number greater than 0.", "Validation", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (!Validator.isNonNegativeDecimal(txtCost.getText())) {
            JOptionPane.showMessageDialog(this, "Unit cost must be a valid number.", "Validation", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (!Validator.isValidDate(txtDate.getText())) {
            JOptionPane.showMessageDialog(this, "Date must be in yyyy-MM-dd format.", "Validation", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int productId = ((Item) cmbProduct.getSelectedItem()).getId();
        int supplierId = ((Item) cmbSupplier.getSelectedItem()).getId();
        int qty = Integer.parseInt(txtQty.getText().trim());
        double cost = Double.parseDouble(txtCost.getText().trim());

        // Two SQL statements must succeed together -> JDBC transaction
        try (Connection con = DBConnection.getConnection()) {
            con.setAutoCommit(false);
            try {
                try (PreparedStatement ps = con.prepareStatement(
                        "INSERT INTO stock_in (product_id, supplier_id, quantity, unit_cost, received_date, user_id, remarks) "
                                + "VALUES (?, ?, ?, ?, ?, ?, ?)")) {
                    ps.setInt(1, productId);
                    ps.setInt(2, supplierId);
                    ps.setInt(3, qty);
                    ps.setDouble(4, cost);
                    ps.setDate(5, java.sql.Date.valueOf(LocalDate.parse(txtDate.getText().trim())));
                    ps.setInt(6, Session.userId);
                    ps.setString(7, txtRemarks.getText().trim());
                    ps.executeUpdate();
                }
                try (PreparedStatement ps = con.prepareStatement(
                        "UPDATE products SET quantity = quantity + ?, cost_price = ? WHERE id = ?")) {
                    ps.setInt(1, qty);
                    ps.setDouble(2, cost);
                    ps.setInt(3, productId);
                    ps.executeUpdate();
                }
                con.commit();
            } catch (SQLException ex) {
                con.rollback();
                throw ex;
            }
            log.info("Stock in: product {} qty {}", productId, qty);
            JOptionPane.showMessageDialog(this, "Stock added successfully.");
            clearForm();
            load("");
        } catch (SQLException ex) {
            log.error("Stock in failed", ex);
            JOptionPane.showMessageDialog(this, DBHelper.friendlyMessage(ex), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void delete() {
        int row = tbl.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "Select a record from the table first.");
            return;
        }
        if (JOptionPane.showConfirmDialog(this, "Delete this record and remove the quantity from stock?", "Confirm",
                JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION) return;
        int id = Integer.parseInt(model.getValueAt(row, 0).toString());

        try (Connection con = DBConnection.getConnection()) {
            con.setAutoCommit(false);
            try {
                int productId;
                int qty;
                try (PreparedStatement ps = con.prepareStatement("SELECT product_id, quantity FROM stock_in WHERE id = ?")) {
                    ps.setInt(1, id);
                    try (ResultSet rs = ps.executeQuery()) {
                        if (!rs.next()) throw new SQLException("Record not found");
                        productId = rs.getInt(1);
                        qty = rs.getInt(2);
                    }
                }
                int updated;
                try (PreparedStatement ps = con.prepareStatement(
                        "UPDATE products SET quantity = quantity - ? WHERE id = ? AND quantity >= ?")) {
                    ps.setInt(1, qty);
                    ps.setInt(2, productId);
                    ps.setInt(3, qty);
                    updated = ps.executeUpdate();
                }
                if (updated == 0) {
                    con.rollback();
                    JOptionPane.showMessageDialog(this, "Cannot delete: part of this stock has already been issued.",
                            "Not allowed", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                try (PreparedStatement ps = con.prepareStatement("DELETE FROM stock_in WHERE id = ?")) {
                    ps.setInt(1, id);
                    ps.executeUpdate();
                }
                con.commit();
            } catch (SQLException ex) {
                con.rollback();
                throw ex;
            }
            log.info("Stock in record {} deleted", id);
            load("");
        } catch (SQLException ex) {
            log.error("Stock in delete failed", ex);
            JOptionPane.showMessageDialog(this, DBHelper.friendlyMessage(ex), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}


```

## src\main\java\com\inventory\ui\StockOutPanel.java

```java
package com.inventory.ui;

import com.inventory.db.DBConnection;
import com.inventory.db.DBHelper;
import com.inventory.util.Item;
import com.inventory.util.Session;
import com.inventory.util.Validator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

/** Stock Out (goods issued / sold to customers). Decreases product quantity. */
public class StockOutPanel extends JPanel implements Refreshable {

    private static final Logger log = LogManager.getLogger(StockOutPanel.class);

    private final JComboBox<Item> cmbProduct = new JComboBox<>();
    private final JComboBox<Item> cmbCustomer = new JComboBox<>();
    private final JLabel lblAvailable = new JLabel("Available: -");
    private final JTextField txtQty = new JTextField();
    private final JTextField txtPrice = new JTextField();
    private final JTextField txtDate = new JTextField(LocalDate.now().toString());
    private final JTextField txtRemarks = new JTextField();
    private final JTextField txtSearch = new JTextField(20);
    private final DefaultTableModel model;
    private final JTable tbl;

    public StockOutPanel() {
        setLayout(new BorderLayout(10, 10));
        setBorder(new EmptyBorder(15, 15, 15, 15));

        JPanel form = new JPanel(new GridLayout(0, 4, 10, 10));
        form.add(new JLabel("Product *"));
        form.add(cmbProduct);
        form.add(new JLabel("Customer *"));
        form.add(cmbCustomer);
        form.add(new JLabel("Quantity *"));
        form.add(txtQty);
        form.add(new JLabel("Unit Price *"));
        form.add(txtPrice);
        form.add(new JLabel("Date (yyyy-MM-dd) *"));
        form.add(txtDate);
        form.add(new JLabel("Remarks"));
        form.add(txtRemarks);
        form.add(lblAvailable);

        JButton btnSave = new JButton("Save Stock Out");
        JButton btnDelete = new JButton("Delete (return stock)");
        JButton btnClear = new JButton("Clear");
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
        buttons.add(btnSave);
        buttons.add(btnDelete);
        buttons.add(btnClear);

        JPanel north = new JPanel(new BorderLayout());
        north.setBorder(BorderFactory.createTitledBorder("Stock Out (Goods Issued)"));
        north.add(form, BorderLayout.CENTER);
        north.add(buttons, BorderLayout.SOUTH);

        model = new DefaultTableModel(new String[]{"ID", "Code", "Product", "Customer", "Qty",
                "Unit Price", "Date", "User", "Remarks"}, 0) {
            @Override
            public boolean isCellEditable(int r, int c) {
                return false;
            }
        };
        tbl = new JTable(model);
        tbl.setRowHeight(24);
        tbl.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JButton btnSearch = new JButton("Search");
        JButton btnAll = new JButton("Show All");
        JPanel searchBar = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
        searchBar.add(new JLabel("Search (product / customer):"));
        searchBar.add(txtSearch);
        searchBar.add(btnSearch);
        searchBar.add(btnAll);

        JPanel center = new JPanel(new BorderLayout());
        center.add(searchBar, BorderLayout.NORTH);
        center.add(new JScrollPane(tbl), BorderLayout.CENTER);

        add(north, BorderLayout.NORTH);
        add(center, BorderLayout.CENTER);

        btnSave.addActionListener(e -> save());
        btnDelete.addActionListener(e -> delete());
        btnClear.addActionListener(e -> clearForm());
        btnSearch.addActionListener(e -> load(txtSearch.getText().trim()));
        txtSearch.addActionListener(e -> load(txtSearch.getText().trim()));
        btnAll.addActionListener(e -> {
            txtSearch.setText("");
            load("");
        });
        cmbProduct.addActionListener(e -> productChanged());

        refresh();
    }

    @Override
    public void refresh() {
        try {
            cmbProduct.removeAllItems();
            for (Item i : DBHelper.items("SELECT id, CONCAT(code, ' - ', name) FROM products ORDER BY code")) cmbProduct.addItem(i);
            cmbCustomer.removeAllItems();
            for (Item i : DBHelper.items("SELECT id, name FROM customers ORDER BY name")) cmbCustomer.addItem(i);
        } catch (SQLException ex) {
            log.error("Combo load failed", ex);
            JOptionPane.showMessageDialog(this, DBHelper.friendlyMessage(ex), "Error", JOptionPane.ERROR_MESSAGE);
        }
        load("");
    }

    /** Shows available quantity and the default selling price of the selected product. */
    private void productChanged() {
        Item p = (Item) cmbProduct.getSelectedItem();
        if (p == null) return;
        try {
            Object qty = DBHelper.scalar("SELECT quantity FROM products WHERE id = ?", p.getId());
            Object price = DBHelper.scalar("SELECT unit_price FROM products WHERE id = ?", p.getId());
            lblAvailable.setText("Available: " + qty);
            if (price != null) txtPrice.setText(price.toString());
        } catch (SQLException ex) {
            log.error("Could not read product", ex);
        }
    }

    private void load(String search) {
        String sql = "SELECT so.id, p.code, p.name, c.name, so.quantity, so.unit_price, so.issue_date, u.username, so.remarks "
                + "FROM stock_out so JOIN products p ON so.product_id = p.id JOIN customers c ON so.customer_id = c.id "
                + "JOIN users u ON so.user_id = u.id ";
        try {
            if (search.isEmpty()) {
                DBHelper.loadTable(model, sql + "ORDER BY so.id DESC");
            } else {
                String like = "%" + search + "%";
                DBHelper.loadTable(model, sql + "WHERE p.code LIKE ? OR p.name LIKE ? OR c.name LIKE ? ORDER BY so.id DESC",
                        like, like, like);
            }
        } catch (SQLException ex) {
            log.error("Stock out load failed", ex);
            JOptionPane.showMessageDialog(this, DBHelper.friendlyMessage(ex), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearForm() {
        txtQty.setText("");
        txtDate.setText(LocalDate.now().toString());
        txtRemarks.setText("");
        tbl.clearSelection();
        productChanged();
    }

    private void save() {
        if (cmbProduct.getSelectedItem() == null || cmbCustomer.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Select a product and a customer.", "Validation", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (!Validator.isPositiveInt(txtQty.getText())) {
            JOptionPane.showMessageDialog(this, "Quantity must be a whole number greater than 0.", "Validation", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (!Validator.isNonNegativeDecimal(txtPrice.getText())) {
            JOptionPane.showMessageDialog(this, "Unit price must be a valid number.", "Validation", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (!Validator.isValidDate(txtDate.getText())) {
            JOptionPane.showMessageDialog(this, "Date must be in yyyy-MM-dd format.", "Validation", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int productId = ((Item) cmbProduct.getSelectedItem()).getId();
        int customerId = ((Item) cmbCustomer.getSelectedItem()).getId();
        int qty = Integer.parseInt(txtQty.getText().trim());
        double price = Double.parseDouble(txtPrice.getText().trim());

        try (Connection con = DBConnection.getConnection()) {
            con.setAutoCommit(false);
            try {
                // Reduce stock only if enough quantity is available
                int updated;
                try (PreparedStatement ps = con.prepareStatement(
                        "UPDATE products SET quantity = quantity - ? WHERE id = ? AND quantity >= ?")) {
                    ps.setInt(1, qty);
                    ps.setInt(2, productId);
                    ps.setInt(3, qty);
                    updated = ps.executeUpdate();
                }
                if (updated == 0) {
                    con.rollback();
                    JOptionPane.showMessageDialog(this, "Not enough stock available for this product.",
                            "Insufficient Stock", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                try (PreparedStatement ps = con.prepareStatement(
                        "INSERT INTO stock_out (product_id, customer_id, quantity, unit_price, issue_date, user_id, remarks) "
                                + "VALUES (?, ?, ?, ?, ?, ?, ?)")) {
                    ps.setInt(1, productId);
                    ps.setInt(2, customerId);
                    ps.setInt(3, qty);
                    ps.setDouble(4, price);
                    ps.setDate(5, java.sql.Date.valueOf(LocalDate.parse(txtDate.getText().trim())));
                    ps.setInt(6, Session.userId);
                    ps.setString(7, txtRemarks.getText().trim());
                    ps.executeUpdate();
                }
                con.commit();
            } catch (SQLException ex) {
                con.rollback();
                throw ex;
            }
            log.info("Stock out: product {} qty {}", productId, qty);
            JOptionPane.showMessageDialog(this, "Stock issued successfully.");
            clearForm();
            load("");
        } catch (SQLException ex) {
            log.error("Stock out failed", ex);
            JOptionPane.showMessageDialog(this, DBHelper.friendlyMessage(ex), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void delete() {
        int row = tbl.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "Select a record from the table first.");
            return;
        }
        if (JOptionPane.showConfirmDialog(this, "Delete this record and return the quantity to stock?", "Confirm",
                JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION) return;
        int id = Integer.parseInt(model.getValueAt(row, 0).toString());

        try (Connection con = DBConnection.getConnection()) {
            con.setAutoCommit(false);
            try {
                int productId;
                int qty;
                try (PreparedStatement ps = con.prepareStatement("SELECT product_id, quantity FROM stock_out WHERE id = ?")) {
                    ps.setInt(1, id);
                    try (ResultSet rs = ps.executeQuery()) {
                        if (!rs.next()) throw new SQLException("Record not found");
                        productId = rs.getInt(1);
                        qty = rs.getInt(2);
                    }
                }
                try (PreparedStatement ps = con.prepareStatement("UPDATE products SET quantity = quantity + ? WHERE id = ?")) {
                    ps.setInt(1, qty);
                    ps.setInt(2, productId);
                    ps.executeUpdate();
                }
                try (PreparedStatement ps = con.prepareStatement("DELETE FROM stock_out WHERE id = ?")) {
                    ps.setInt(1, id);
                    ps.executeUpdate();
                }
                con.commit();
            } catch (SQLException ex) {
                con.rollback();
                throw ex;
            }
            log.info("Stock out record {} deleted", id);
            load("");
        } catch (SQLException ex) {
            log.error("Stock out delete failed", ex);
            JOptionPane.showMessageDialog(this, DBHelper.friendlyMessage(ex), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}


```

## src\main\java\com\inventory\ui\Theme.java

```java
package com.inventory.ui;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.FontUIResource;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.util.Enumeration;

/**
 * Central place for all colours and styles of the application.
 * Call Theme.apply(container, background) once after a screen is built.
 */
public class Theme {

    // ---- colour palette ----
    public static final Color BG        = new Color(0xF1F5F9);   // window background
    public static final Color WHITE     = Color.WHITE;
    public static final Color TEXT      = new Color(0x1E293B);
    public static final Color BORDER    = new Color(0xCBD5E1);
    public static final Color NAVY      = new Color(0x1E3A8A);   // header / table header
    public static final Color SIDEBAR   = new Color(0x1E293B);
    public static final Color PRIMARY   = new Color(0x2563EB);   // blue
    public static final Color SUCCESS   = new Color(0x16A34A);   // green
    public static final Color DANGER    = new Color(0xDC2626);   // red
    public static final Color WARNING   = new Color(0xEA580C);   // orange
    public static final Color NEUTRAL   = new Color(0x64748B);   // grey
    public static final Color ROW_ALT   = new Color(0xF8FAFC);
    public static final Color SELECTION = new Color(0xDBEAFE);

    /** Set a nicer default font for all Swing components. Call once at startup. */
    public static void init() {
        Font base = new Font("Segoe UI", Font.PLAIN, 13);
        Enumeration<Object> keys = UIManager.getDefaults().keys();
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            if (key.toString().endsWith(".font")) {
                UIManager.put(key, new FontUIResource(base));
            }
        }
    }

    // ================= main entry =================

    /** Styles every component inside the container (recursively). */
    public static void apply(Container c, Color bg) {
        if (c instanceof JPanel) {
            JPanel p = (JPanel) c;
            Color accent = (Color) p.getClientProperty("accent");
            if (p.getBorder() instanceof TitledBorder) {
                TitledBorder old = (TitledBorder) p.getBorder();
                Color line = accent != null ? accent : BORDER;
                TitledBorder tb = BorderFactory.createTitledBorder(new LineBorder(line, accent != null ? 2 : 1, true), old.getTitle());
                tb.setTitleColor(accent != null ? accent : NAVY);
                tb.setTitleFont(new Font("Segoe UI", Font.BOLD, 13));
                p.setBorder(tb);
                bg = WHITE;
            }
            p.setBackground(bg);
        }
        for (Component k : c.getComponents()) {
            if (k instanceof JButton) {
                styleButton((JButton) k);
            } else if (k instanceof JTable) {
                styleTable((JTable) k);
            } else if (k instanceof JTextField) {
                styleField((JTextField) k);
            } else if (k instanceof JLabel) {
                JLabel l = (JLabel) k;
                if (l.getClientProperty("keep") == null) l.setForeground(TEXT);
            } else if (k instanceof JCheckBox) {
                k.setBackground(bg);
                k.setForeground(TEXT);
            } else if (k instanceof JScrollPane) {
                JScrollPane sp = (JScrollPane) k;
                sp.setBorder(new LineBorder(BORDER));
                sp.getViewport().setBackground(WHITE);
            } else if (k instanceof JTextArea) {
                ((JTextArea) k).setMargin(new Insets(8, 8, 8, 8));
            }
            // do not go inside combo boxes / scroll bars / tables (they contain internal components)
            if (k instanceof Container && !(k instanceof JComboBox) && !(k instanceof JScrollBar)
                    && !(k instanceof JTable) && !(k instanceof JButton)) {
                apply((Container) k, bg);
            }
        }
    }

    // ================= buttons =================

    private static Color colorFor(String text) {
        String t = text == null ? "" : text.toLowerCase();
        if (t.contains("delete") || t.equals("exit")) return DANGER;
        if (t.startsWith("add") || t.startsWith("save") || t.startsWith("apply")) return SUCCESS;
        if (t.contains("restore")) return WARNING;
        if (t.equals("clear") || t.equals("show all")) return NEUTRAL;
        return PRIMARY;   // update, search, view, export, generate, backup, login
    }

    public static void styleButton(JButton b) {
        paintButton(b, colorFor(b.getText()), Color.WHITE);
        b.setBorder(new EmptyBorder(7, 16, 7, 16));
    }

    /** Left menu button. active = currently opened screen. */
    public static void styleMenuButton(JButton b, boolean active) {
        paintButton(b, active ? PRIMARY : SIDEBAR, Color.WHITE);
        b.setHorizontalAlignment(SwingConstants.LEFT);
        b.setBorder(new EmptyBorder(10, 16, 10, 16));
    }

    public static void styleLogoutButton(JButton b) {
        paintButton(b, DANGER, Color.WHITE);
        b.setHorizontalAlignment(SwingConstants.LEFT);
        b.setBorder(new EmptyBorder(10, 16, 10, 16));
    }

    private static void paintButton(JButton b, Color bg, Color fg) {
        b.setUI(new RoundedButtonUI());
        b.setBackground(bg);
        b.setForeground(fg);
        b.setFont(new Font("Segoe UI", Font.BOLD, 13));
        b.setOpaque(false);
        b.setContentAreaFilled(false);
        b.setBorderPainted(false);
        b.setFocusPainted(false);
        b.setRolloverEnabled(true);
        b.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    /** Paints a rounded coloured button (works on every look and feel). */
    private static class RoundedButtonUI extends BasicButtonUI {
        @Override
        public void paint(Graphics g, JComponent c) {
            AbstractButton b = (AbstractButton) c;
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            Color color = b.getBackground();
            if (!b.isEnabled()) {
                color = BORDER;
            } else if (b.getModel().isPressed()) {
                color = color.darker();
            } else if (b.getModel().isRollover()) {
                color = blend(color, Color.WHITE, 0.18f);
            }
            g2.setColor(color);
            g2.fillRoundRect(0, 0, c.getWidth(), c.getHeight(), 10, 10);
            g2.dispose();
            super.paint(g, c);
        }
    }

    private static Color blend(Color a, Color b, float ratio) {
        int r = (int) (a.getRed() * (1 - ratio) + b.getRed() * ratio);
        int g = (int) (a.getGreen() * (1 - ratio) + b.getGreen() * ratio);
        int bl = (int) (a.getBlue() * (1 - ratio) + b.getBlue() * ratio);
        return new Color(r, g, bl);
    }

    // ================= text fields =================

    public static void styleField(JTextField f) {
        f.setBorder(new CompoundBorder(new LineBorder(BORDER, 1, true), new EmptyBorder(5, 8, 5, 8)));
        if (f.isEditable()) {
            f.setBackground(WHITE);
        } else {
            f.setBackground(new Color(0xE2E8F0));   // read-only fields look grey
        }
        f.setForeground(TEXT);
    }

    // ================= tables =================

    public static void styleTable(JTable t) {
        t.setRowHeight(28);
        t.setShowGrid(false);
        t.setIntercellSpacing(new Dimension(0, 0));
        t.setSelectionBackground(SELECTION);
        t.setSelectionForeground(TEXT);
        t.setFillsViewportHeight(true);

        t.setDefaultRenderer(Object.class, new RowRenderer(false));
        t.setDefaultRenderer(Number.class, new RowRenderer(true));
        t.setDefaultRenderer(java.util.Date.class, new RowRenderer(false));

        JTableHeader h = t.getTableHeader();
        h.setReorderingAllowed(false);
        h.setPreferredSize(new Dimension(0, 34));
        h.setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean sel,
                                                           boolean focus, int row, int col) {
                super.getTableCellRendererComponent(table, value, false, false, row, col);
                setBackground(NAVY);
                setForeground(Color.WHITE);
                setFont(new Font("Segoe UI", Font.BOLD, 13));
                setOpaque(true);
                setBorder(new EmptyBorder(0, 8, 0, 8));
                setHorizontalAlignment(SwingConstants.LEFT);
                return this;
            }
        });
    }

    /** Alternating row colours. */
    private static class RowRenderer extends DefaultTableCellRenderer {
        private final boolean right;

        RowRenderer(boolean right) {
            this.right = right;
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean sel,
                                                       boolean focus, int row, int col) {
            super.getTableCellRendererComponent(table, value, sel, false, row, col);
            setBorder(new EmptyBorder(0, 8, 0, 8));
            setHorizontalAlignment(right ? SwingConstants.RIGHT : SwingConstants.LEFT);
            setForeground(TEXT);
            if (!sel) {
                setBackground(row % 2 == 0 ? WHITE : ROW_ALT);
            }
            return this;
        }
    }
}


```

## src\main\java\com\inventory\ui\UserPanel.java

```java
package com.inventory.ui;

import com.inventory.db.DBHelper;
import com.inventory.util.PasswordUtil;
import com.inventory.util.Session;
import com.inventory.util.Validator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.SQLException;

/** User management (Admin only). */
public class UserPanel extends JPanel implements Refreshable {

    private static final Logger log = LogManager.getLogger(UserPanel.class);

    private final JTextField txtUsername = new JTextField();
    private final JTextField txtFullName = new JTextField();
    private final JPasswordField txtPassword = new JPasswordField();
    private final JComboBox<String> cmbRole = new JComboBox<>(new String[]{"ADMIN", "STAFF"});
    private final JCheckBox chkActive = new JCheckBox("Active", true);
    private final JTextField txtSearch = new JTextField(20);
    private final DefaultTableModel model;
    private final JTable tbl;
    private int selectedId = -1;

    public UserPanel() {
        setLayout(new BorderLayout(10, 10));
        setBorder(new EmptyBorder(15, 15, 15, 15));

        JPanel form = new JPanel(new GridLayout(0, 4, 10, 10));
        form.add(new JLabel("Username *"));
        form.add(txtUsername);
        form.add(new JLabel("Full Name *"));
        form.add(txtFullName);
        form.add(new JLabel("Password * (leave blank to keep)"));
        form.add(txtPassword);
        form.add(new JLabel("Role"));
        form.add(cmbRole);
        form.add(new JLabel("Status"));
        form.add(chkActive);

        JButton btnAdd = new JButton("Add");
        JButton btnUpdate = new JButton("Update");
        JButton btnDelete = new JButton("Delete");
        JButton btnClear = new JButton("Clear");
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
        buttons.add(btnAdd);
        buttons.add(btnUpdate);
        buttons.add(btnDelete);
        buttons.add(btnClear);

        JPanel north = new JPanel(new BorderLayout());
        north.setBorder(BorderFactory.createTitledBorder("User Details"));
        north.add(form, BorderLayout.CENTER);
        north.add(buttons, BorderLayout.SOUTH);

        model = new DefaultTableModel(new String[]{"ID", "Username", "Full Name", "Role", "Active"}, 0) {
            @Override
            public boolean isCellEditable(int r, int c) {
                return false;
            }
        };
        tbl = new JTable(model);
        tbl.setRowHeight(24);
        tbl.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JButton btnSearch = new JButton("Search");
        JButton btnAll = new JButton("Show All");
        JPanel searchBar = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
        searchBar.add(new JLabel("Search:"));
        searchBar.add(txtSearch);
        searchBar.add(btnSearch);
        searchBar.add(btnAll);

        JPanel center = new JPanel(new BorderLayout());
        center.add(searchBar, BorderLayout.NORTH);
        center.add(new JScrollPane(tbl), BorderLayout.CENTER);

        add(north, BorderLayout.NORTH);
        add(center, BorderLayout.CENTER);

        btnAdd.addActionListener(e -> addUser());
        btnUpdate.addActionListener(e -> updateUser());
        btnDelete.addActionListener(e -> deleteUser());
        btnClear.addActionListener(e -> clearForm());
        btnSearch.addActionListener(e -> load(txtSearch.getText().trim()));
        txtSearch.addActionListener(e -> load(txtSearch.getText().trim()));
        btnAll.addActionListener(e -> {
            txtSearch.setText("");
            load("");
        });
        tbl.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) fillForm();
        });

        load("");
    }

    @Override
    public void refresh() {
        load("");
    }

    private void load(String search) {
        String sql = "SELECT id, username, full_name, role, active FROM users ";
        try {
            if (search.isEmpty()) {
                DBHelper.loadTable(model, sql + "ORDER BY id");
            } else {
                String like = "%" + search + "%";
                DBHelper.loadTable(model, sql + "WHERE username LIKE ? OR full_name LIKE ? ORDER BY id", like, like);
            }
        } catch (SQLException ex) {
            log.error("User load failed", ex);
            JOptionPane.showMessageDialog(this, DBHelper.friendlyMessage(ex), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void fillForm() {
        int r = tbl.getSelectedRow();
        if (r < 0) return;
        selectedId = Integer.parseInt(model.getValueAt(r, 0).toString());
        txtUsername.setText(String.valueOf(model.getValueAt(r, 1)));
        txtFullName.setText(String.valueOf(model.getValueAt(r, 2)));
        cmbRole.setSelectedItem(String.valueOf(model.getValueAt(r, 3)));
        String active = String.valueOf(model.getValueAt(r, 4));
        chkActive.setSelected(active.equals("1") || active.equalsIgnoreCase("true"));
        txtPassword.setText("");
    }

    private void clearForm() {
        txtUsername.setText("");
        txtFullName.setText("");
        txtPassword.setText("");
        cmbRole.setSelectedIndex(1);
        chkActive.setSelected(true);
        selectedId = -1;
        tbl.clearSelection();
    }

    private String validateInputs(boolean passwordRequired) {
        if (Validator.isEmpty(txtUsername.getText())) return "Username is required.";
        if (Validator.isEmpty(txtFullName.getText())) return "Full name is required.";
        String pw = new String(txtPassword.getPassword());
        if (passwordRequired && pw.isEmpty()) return "Password is required.";
        if (!pw.isEmpty() && pw.length() < 6) return "Password must be at least 6 characters.";
        return null;
    }

    private void addUser() {
        String error = validateInputs(true);
        if (error != null) {
            JOptionPane.showMessageDialog(this, error, "Validation", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            DBHelper.execute("INSERT INTO users (username, password_hash, full_name, role, active) VALUES (?, ?, ?, ?, ?)",
                    txtUsername.getText().trim(), PasswordUtil.hash(new String(txtPassword.getPassword())),
                    txtFullName.getText().trim(), cmbRole.getSelectedItem(), chkActive.isSelected() ? 1 : 0);
            log.info("User added: {}", txtUsername.getText().trim());
            JOptionPane.showMessageDialog(this, "User added successfully.");
            clearForm();
            load("");
        } catch (SQLException ex) {
            log.error("User insert failed", ex);
            JOptionPane.showMessageDialog(this, DBHelper.friendlyMessage(ex), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateUser() {
        if (selectedId < 0) {
            JOptionPane.showMessageDialog(this, "Select a user from the table first.");
            return;
        }
        String error = validateInputs(false);
        if (error != null) {
            JOptionPane.showMessageDialog(this, error, "Validation", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            String pw = new String(txtPassword.getPassword());
            if (pw.isEmpty()) {
                DBHelper.execute("UPDATE users SET username=?, full_name=?, role=?, active=? WHERE id=?",
                        txtUsername.getText().trim(), txtFullName.getText().trim(),
                        cmbRole.getSelectedItem(), chkActive.isSelected() ? 1 : 0, selectedId);
            } else {
                DBHelper.execute("UPDATE users SET username=?, full_name=?, role=?, active=?, password_hash=? WHERE id=?",
                        txtUsername.getText().trim(), txtFullName.getText().trim(),
                        cmbRole.getSelectedItem(), chkActive.isSelected() ? 1 : 0, PasswordUtil.hash(pw), selectedId);
            }
            log.info("User {} updated", selectedId);
            JOptionPane.showMessageDialog(this, "User updated successfully.");
            clearForm();
            load("");
        } catch (SQLException ex) {
            log.error("User update failed", ex);
            JOptionPane.showMessageDialog(this, DBHelper.friendlyMessage(ex), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void deleteUser() {
        if (selectedId < 0) {
            JOptionPane.showMessageDialog(this, "Select a user from the table first.");
            return;
        }
        if (selectedId == Session.userId) {
            JOptionPane.showMessageDialog(this, "You cannot delete your own account.");
            return;
        }
        if (JOptionPane.showConfirmDialog(this, "Delete the selected user?", "Confirm",
                JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION) return;
        try {
            DBHelper.execute("DELETE FROM users WHERE id = ?", selectedId);
            log.info("User {} deleted", selectedId);
            clearForm();
            load("");
        } catch (SQLException ex) {
            log.error("User delete failed", ex);
            JOptionPane.showMessageDialog(this, DBHelper.friendlyMessage(ex)
                    + "\n(Tip: users with stock transactions cannot be deleted - set them inactive instead.)",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}


```

## src\main\java\com\inventory\util\BackupUtil.java

```java
package com.inventory.util;

import com.inventory.db.DBConnection;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/** Database backup and restore using the mysqldump and mysql command line tools. */
public class BackupUtil {

    private static final Logger log = LogManager.getLogger(BackupUtil.class);

    private static String exe(String name) {
        String bin = DBConnection.get("mysql.bin.path", "");
        return bin.isEmpty() ? name : new File(bin, name).getPath();
    }

    private static void addConnectionArgs(List<String> cmd) {
        cmd.add("--host=" + DBConnection.get("db.host", "localhost"));
        cmd.add("--port=" + DBConnection.get("db.port", "3306"));
        cmd.add("--user=" + DBConnection.get("db.user", "root"));
        String pw = DBConnection.get("db.password", "");
        if (!pw.isEmpty()) {
            cmd.add("--password=" + pw);
        }
    }

    public static void backup(File outputFile) throws Exception {
        List<String> cmd = new ArrayList<>();
        cmd.add(exe("mysqldump"));
        addConnectionArgs(cmd);
        cmd.add("--routines");
        cmd.add("--result-file=" + outputFile.getAbsolutePath());
        cmd.add(DBConnection.get("db.name", "inventory_db"));
        run(new ProcessBuilder(cmd), "Backup");
        log.info("Database backup created: {}", outputFile.getAbsolutePath());
    }

    public static void restore(File sqlFile) throws Exception {
        List<String> cmd = new ArrayList<>();
        cmd.add(exe("mysql"));
        addConnectionArgs(cmd);
        cmd.add(DBConnection.get("db.name", "inventory_db"));
        ProcessBuilder pb = new ProcessBuilder(cmd);
        pb.redirectInput(sqlFile);
        run(pb, "Restore");
        log.info("Database restored from: {}", sqlFile.getAbsolutePath());
    }

    private static void run(ProcessBuilder pb, String what) throws Exception {
        pb.redirectErrorStream(true);
        Process p = pb.start();
        String output = new String(p.getInputStream().readAllBytes());
        int code = p.waitFor();
        if (code != 0) {
            log.error("{} failed: {}", what, output);
            throw new Exception(what + " failed. " + output);
        }
    }
}


```

## src\main\java\com\inventory\util\BarcodeUtil.java

```java
package com.inventory.util;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.oned.Code128Writer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

/** Generates Code128 barcodes using ZXing. */
public class BarcodeUtil {

    public static BufferedImage generate(String text, int width, int height) {
        BitMatrix matrix = new Code128Writer().encode(text, BarcodeFormat.CODE_128, width, height);
        return MatrixToImageWriter.toBufferedImage(matrix);
    }

    public static void saveAsPng(String text, File file) throws Exception {
        ImageIO.write(generate(text, 300, 100), "png", file);
    }
}


```

## src\main\java\com\inventory\util\Item.java

```java
package com.inventory.util;

/** (id, label) pair used in combo boxes. */
public class Item {
    private final int id;
    private final String label;

    public Item(int id, String label) {
        this.id = id;
        this.label = label;
    }

    public int getId() { return id; }

    public String getLabel() { return label; }

    @Override
    public String toString() { return label; }
}


```

## src\main\java\com\inventory\util\PasswordUtil.java

```java
package com.inventory.util;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/** SHA-256 password hashing. */
public class PasswordUtil {

    public static String hash(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] bytes = md.digest(password.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
            for (byte b : bytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}


```

## src\main\java\com\inventory\util\ReportUtil.java

```java
package com.inventory.util;

import com.inventory.db.DBConnection;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.view.JasperViewer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.InputStream;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

/** Compiles / fills Jasper reports and exports them to PDF and Excel. */
public class ReportUtil {

    private static final Logger log = LogManager.getLogger(ReportUtil.class);

    /** reportFile example: "stock_report.jrxml" (inside resources/reports). */
    public static JasperPrint fill(String reportFile) throws Exception {
        try (InputStream in = ReportUtil.class.getResourceAsStream("/reports/" + reportFile)) {
            JasperReport report = JasperCompileManager.compileReport(in);
            Map<String, Object> params = new HashMap<>();
            try (Connection con = DBConnection.getConnection()) {
                JasperPrint print = JasperFillManager.fillReport(report, params, con);
                log.info("Report generated: {}", reportFile);
                return print;
            }
        }
    }

    public static void view(JasperPrint print) {
        JasperViewer.viewReport(print, false);
    }

    public static void exportPdf(JasperPrint print, File file) throws Exception {
        JasperExportManager.exportReportToPdfFile(print, file.getAbsolutePath());
        log.info("Report exported to PDF: {}", file.getAbsolutePath());
    }

    public static void exportExcel(JasperPrint print, File file) throws Exception {
        JRXlsxExporter exporter = new JRXlsxExporter();
        exporter.setExporterInput(new SimpleExporterInput(print));
        exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(file));
        exporter.exportReport();
        log.info("Report exported to Excel: {}", file.getAbsolutePath());
    }
}


```

## src\main\java\com\inventory\util\Session.java

```java
package com.inventory.util;

/** Keeps the logged-in user details. */
public class Session {
    public static int userId;
    public static String username;
    public static String fullName;
    public static String role;

    public static boolean isAdmin() {
        return "ADMIN".equals(role);
    }
}


```

## src\main\java\com\inventory\util\Validator.java

```java
package com.inventory.util;

import java.time.LocalDate;

/** Input validation helpers. */
public class Validator {

    public static boolean isEmpty(String s) {
        return s == null || s.trim().isEmpty();
    }

    public static boolean isEmail(String s) {
        return s != null && s.trim().matches("^[\\w.+-]+@[\\w-]+(\\.[\\w-]+)+$");
    }

    public static boolean isPhone(String s) {
        return s != null && s.trim().matches("^[0-9+\\-\\s]{7,15}$");
    }

    /** Whole number greater than zero. */
    public static boolean isPositiveInt(String s) {
        try {
            return Integer.parseInt(s.trim()) > 0;
        } catch (Exception e) {
            return false;
        }
    }

    /** Whole number zero or more. */
    public static boolean isNonNegativeInt(String s) {
        try {
            return Integer.parseInt(s.trim()) >= 0;
        } catch (Exception e) {
            return false;
        }
    }

    /** Decimal number zero or more. */
    public static boolean isNonNegativeDecimal(String s) {
        try {
            return Double.parseDouble(s.trim()) >= 0;
        } catch (Exception e) {
            return false;
        }
    }

    /** Date in yyyy-MM-dd format. */
    public static boolean isValidDate(String s) {
        try {
            LocalDate.parse(s.trim());
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}


```

## src\main\resources\db.properties

```properties
# ---- Database settings (change to match your MySQL) ----
db.host=localhost
db.port=3306
db.name=inventory_db
db.user=root
db.password=Nadu@06&13

# ---- Folder that contains mysqldump / mysql (used by Backup & Restore) ----
# Leave empty if MySQL bin folder is in the system PATH.
# Example (Windows): C:/Program Files/MySQL/MySQL Server 8.0/bin
mysql.bin.path=C:\Program Files\MySQL\MySQL Server 8.4\bin


```

## src\main\resources\log4j2.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<Configuration status="WARN">
    <Appenders>
        <Console name="Console" target="SYSTEM_OUT">
            <PatternLayout pattern="%d{HH:mm:ss} [%-5level] %c{1} - %msg%n"/>
        </Console>
        <File name="File" fileName="logs/inventory.log" append="true">
            <PatternLayout pattern="%d{yyyy-MM-dd HH:mm:ss} [%-5level] %c{1} - %msg%n"/>
        </File>
    </Appenders>
    <Loggers>
        <Root level="info">
            <AppenderRef ref="Console"/>
            <AppenderRef ref="File"/>
        </Root>
    </Loggers>
</Configuration>


```

## src\test\java\com\inventory\util\BarcodeUtilTest.java

```java
package com.inventory.util;

import org.junit.jupiter.api.Test;

import java.awt.image.BufferedImage;

import static org.junit.jupiter.api.Assertions.*;

class BarcodeUtilTest {

    @Test
    void barcodeImageIsGenerated() {
        BufferedImage img = BarcodeUtil.generate("ELE001", 200, 60);
        assertNotNull(img);
        assertTrue(img.getWidth() >= 200);
        assertEquals(60, img.getHeight());
    }
}


```

## src\test\java\com\inventory\util\PasswordUtilTest.java

```java
package com.inventory.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordUtilTest {

    @Test
    void sameInputGivesSameHash() {
        assertEquals(PasswordUtil.hash("admin123"), PasswordUtil.hash("admin123"));
    }

    @Test
    void differentInputGivesDifferentHash() {
        assertNotEquals(PasswordUtil.hash("admin123"), PasswordUtil.hash("admin124"));
    }

    @Test
    void knownHashMatchesDatabaseScript() {
        assertEquals("240be518fabd2724ddb6f04eeb1da5967448d7e831c08c8fa822809f74c720a9", PasswordUtil.hash("admin123"));
    }

    @Test
    void hashLengthIs64() {
        assertEquals(64, PasswordUtil.hash("anything").length());
    }
}


```

## src\test\java\com\inventory\util\ValidatorTest.java

```java
package com.inventory.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @Test
    void emptyStringsAreDetected() {
        assertTrue(Validator.isEmpty(null));
        assertTrue(Validator.isEmpty("   "));
        assertFalse(Validator.isEmpty("abc"));
    }

    @Test
    void emailValidation() {
        assertTrue(Validator.isEmail("user@example.com"));
        assertFalse(Validator.isEmail("user@"));
        assertFalse(Validator.isEmail("not-an-email"));
    }

    @Test
    void phoneValidation() {
        assertTrue(Validator.isPhone("0771234567"));
        assertFalse(Validator.isPhone("12ab"));
    }

    @Test
    void quantityValidation() {
        assertTrue(Validator.isPositiveInt("5"));
        assertFalse(Validator.isPositiveInt("0"));
        assertFalse(Validator.isPositiveInt("-3"));
        assertFalse(Validator.isPositiveInt("abc"));
        assertTrue(Validator.isNonNegativeInt("0"));
    }

    @Test
    void priceValidation() {
        assertTrue(Validator.isNonNegativeDecimal("1250.50"));
        assertFalse(Validator.isNonNegativeDecimal("-1"));
        assertFalse(Validator.isNonNegativeDecimal("abc"));
    }

    @Test
    void dateValidation() {
        assertTrue(Validator.isValidDate("2026-10-08"));
        assertFalse(Validator.isValidDate("08/10/2026"));
    }
}


```

## target\classes\db.properties

```properties
# ---- Database settings (change to match your MySQL) ----
db.host=localhost
db.port=3306
db.name=inventory_db
db.user=root
db.password=Nadu@06&13

# ---- Folder that contains mysqldump / mysql (used by Backup & Restore) ----
# Leave empty if MySQL bin folder is in the system PATH.
# Example (Windows): C:/Program Files/MySQL/MySQL Server 8.0/bin
mysql.bin.path=C:\Program Files\MySQL\MySQL Server 8.4\bin


```

## target\classes\log4j2.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<Configuration status="WARN">
    <Appenders>
        <Console name="Console" target="SYSTEM_OUT">
            <PatternLayout pattern="%d{HH:mm:ss} [%-5level] %c{1} - %msg%n"/>
        </Console>
        <File name="File" fileName="logs/inventory.log" append="true">
            <PatternLayout pattern="%d{yyyy-MM-dd HH:mm:ss} [%-5level] %c{1} - %msg%n"/>
        </File>
    </Appenders>
    <Loggers>
        <Root level="info">
            <AppenderRef ref="Console"/>
            <AppenderRef ref="File"/>
        </Root>
    </Loggers>
</Configuration>


```

## target\maven-archiver\pom.properties

```properties
artifactId=InventorySystem
groupId=com.inventory
version=1.0


```

## target\surefire-reports\TEST-com.inventory.util.BarcodeUtilTest.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<testsuite xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:noNamespaceSchemaLocation="https://maven.apache.org/surefire/maven-surefire-plugin/xsd/surefire-test-report-3.0.xsd" version="3.0" name="com.inventory.util.BarcodeUtilTest" time="0.074" tests="1" errors="0" skipped="0" failures="0">
  <properties>
    <property name="java.specification.version" value="17"/>
    <property name="sun.cpu.isalist" value="amd64"/>
    <property name="sun.jnu.encoding" value="Cp1252"/>
    <property name="java.class.path" value="C:\Users\User\OneDrive\Documents\Java Institute\SAD\InventorySystem\target\test-classes;C:\Users\User\OneDrive\Documents\Java Institute\SAD\InventorySystem\target\classes;C:\Users\User\.m2\repository\com\mysql\mysql-connector-j\8.0.33\mysql-connector-j-8.0.33.jar;C:\Users\User\.m2\repository\com\google\protobuf\protobuf-java\3.21.9\protobuf-java-3.21.9.jar;C:\Users\User\.m2\repository\net\sf\jasperreports\jasperreports\6.20.0\jasperreports-6.20.0.jar;C:\Users\User\.m2\repository\commons-beanutils\commons-beanutils\1.9.4\commons-beanutils-1.9.4.jar;C:\Users\User\.m2\repository\commons-collections\commons-collections\3.2.2\commons-collections-3.2.2.jar;C:\Users\User\.m2\repository\commons-digester\commons-digester\2.1\commons-digester-2.1.jar;C:\Users\User\.m2\repository\commons-logging\commons-logging\1.1.1\commons-logging-1.1.1.jar;C:\Users\User\.m2\repository\org\apache\commons\commons-collections4\4.2\commons-collections4-4.2.jar;C:\Users\User\.m2\repository\com\lowagie\itext\2.1.7.js10\itext-2.1.7.js10.jar;C:\Users\User\.m2\repository\org\bouncycastle\bcprov-jdk15on\1.70\bcprov-jdk15on-1.70.jar;C:\Users\User\.m2\repository\org\bouncycastle\bcutil-jdk15on\1.70\bcutil-jdk15on-1.70.jar;C:\Users\User\.m2\repository\org\jfree\jcommon\1.0.23\jcommon-1.0.23.jar;C:\Users\User\.m2\repository\org\jfree\jfreechart\1.0.19\jfreechart-1.0.19.jar;C:\Users\User\.m2\repository\com\fasterxml\jackson\core\jackson-core\2.13.3\jackson-core-2.13.3.jar;C:\Users\User\.m2\repository\com\fasterxml\jackson\core\jackson-databind\2.13.3\jackson-databind-2.13.3.jar;C:\Users\User\.m2\repository\com\fasterxml\jackson\core\jackson-annotations\2.13.3\jackson-annotations-2.13.3.jar;C:\Users\User\.m2\repository\com\fasterxml\jackson\dataformat\jackson-dataformat-xml\2.13.3\jackson-dataformat-xml-2.13.3.jar;C:\Users\User\.m2\repository\org\codehaus\woodstox\stax2-api\4.2.1\stax2-api-4.2.1.jar;C:\Users\User\.m2\repository\com\fasterxml\woodstox\woodstox-core\6.2.7\woodstox-core-6.2.7.jar;C:\Users\User\.m2\repository\net\sf\jasperreports\jasperreports-fonts\6.20.0\jasperreports-fonts-6.20.0.jar;C:\Users\User\.m2\repository\org\eclipse\jdt\ecj\3.33.0\ecj-3.33.0.jar;C:\Users\User\.m2\repository\org\apache\poi\poi-ooxml\5.2.3\poi-ooxml-5.2.3.jar;C:\Users\User\.m2\repository\org\apache\poi\poi\5.2.3\poi-5.2.3.jar;C:\Users\User\.m2\repository\commons-codec\commons-codec\1.15\commons-codec-1.15.jar;C:\Users\User\.m2\repository\org\apache\commons\commons-math3\3.6.1\commons-math3-3.6.1.jar;C:\Users\User\.m2\repository\com\zaxxer\SparseBitSet\1.2\SparseBitSet-1.2.jar;C:\Users\User\.m2\repository\org\apache\poi\poi-ooxml-lite\5.2.3\poi-ooxml-lite-5.2.3.jar;C:\Users\User\.m2\repository\org\apache\xmlbeans\xmlbeans\5.1.1\xmlbeans-5.1.1.jar;C:\Users\User\.m2\repository\org\apache\commons\commons-compress\1.21\commons-compress-1.21.jar;C:\Users\User\.m2\repository\commons-io\commons-io\2.11.0\commons-io-2.11.0.jar;C:\Users\User\.m2\repository\com\github\virtuald\curvesapi\1.07\curvesapi-1.07.jar;C:\Users\User\.m2\repository\com\google\zxing\core\3.5.2\core-3.5.2.jar;C:\Users\User\.m2\repository\com\google\zxing\javase\3.5.2\javase-3.5.2.jar;C:\Users\User\.m2\repository\com\beust\jcommander\1.82\jcommander-1.82.jar;C:\Users\User\.m2\repository\com\github\jai-imageio\jai-imageio-core\1.4.0\jai-imageio-core-1.4.0.jar;C:\Users\User\.m2\repository\org\apache\logging\log4j\log4j-api\2.20.0\log4j-api-2.20.0.jar;C:\Users\User\.m2\repository\org\apache\logging\log4j\log4j-core\2.20.0\log4j-core-2.20.0.jar;C:\Users\User\.m2\repository\org\junit\jupiter\junit-jupiter\5.10.0\junit-jupiter-5.10.0.jar;C:\Users\User\.m2\repository\org\junit\jupiter\junit-jupiter-api\5.10.0\junit-jupiter-api-5.10.0.jar;C:\Users\User\.m2\repository\org\opentest4j\opentest4j\1.3.0\opentest4j-1.3.0.jar;C:\Users\User\.m2\repository\org\junit\platform\junit-platform-commons\1.10.0\junit-platform-commons-1.10.0.jar;C:\Users\User\.m2\repository\org\apiguardian\apiguardian-api\1.1.2\apiguardian-api-1.1.2.jar;C:\Users\User\.m2\repository\org\junit\jupiter\junit-jupiter-params\5.10.0\junit-jupiter-params-5.10.0.jar;C:\Users\User\.m2\repository\org\junit\jupiter\junit-jupiter-engine\5.10.0\junit-jupiter-engine-5.10.0.jar;C:\Users\User\.m2\repository\org\junit\platform\junit-platform-engine\1.10.0\junit-platform-engine-1.10.0.jar;"/>
    <property name="java.vm.vendor" value="Microsoft"/>
    <property name="sun.arch.data.model" value="64"/>
    <property name="user.variant" value=""/>
    <property name="java.vendor.url" value="https://www.microsoft.com"/>
    <property name="user.timezone" value="Asia/Colombo"/>
    <property name="os.name" value="Windows 11"/>
    <property name="java.vm.specification.version" value="17"/>
    <property name="user.country" value="US"/>
    <property name="sun.java.launcher" value="SUN_STANDARD"/>
    <property name="sun.boot.library.path" value="C:\Users\User\.jdks\ms-17.0.17\bin"/>
    <property name="sun.java.command" value="C:\Users\User\AppData\Local\Temp\surefire13700642978726573695\surefirebooter-20261013204228659_3.jar C:\Users\User\AppData\Local\Temp\surefire13700642978726573695 2026-10-13T20-42-26_130-jvmRun1 surefire-20261013204228659_1tmp surefire_0-20261013204228659_2tmp"/>
    <property name="jdk.debug" value="release"/>
    <property name="surefire.test.class.path" value="C:\Users\User\OneDrive\Documents\Java Institute\SAD\InventorySystem\target\test-classes;C:\Users\User\OneDrive\Documents\Java Institute\SAD\InventorySystem\target\classes;C:\Users\User\.m2\repository\com\mysql\mysql-connector-j\8.0.33\mysql-connector-j-8.0.33.jar;C:\Users\User\.m2\repository\com\google\protobuf\protobuf-java\3.21.9\protobuf-java-3.21.9.jar;C:\Users\User\.m2\repository\net\sf\jasperreports\jasperreports\6.20.0\jasperreports-6.20.0.jar;C:\Users\User\.m2\repository\commons-beanutils\commons-beanutils\1.9.4\commons-beanutils-1.9.4.jar;C:\Users\User\.m2\repository\commons-collections\commons-collections\3.2.2\commons-collections-3.2.2.jar;C:\Users\User\.m2\repository\commons-digester\commons-digester\2.1\commons-digester-2.1.jar;C:\Users\User\.m2\repository\commons-logging\commons-logging\1.1.1\commons-logging-1.1.1.jar;C:\Users\User\.m2\repository\org\apache\commons\commons-collections4\4.2\commons-collections4-4.2.jar;C:\Users\User\.m2\repository\com\lowagie\itext\2.1.7.js10\itext-2.1.7.js10.jar;C:\Users\User\.m2\repository\org\bouncycastle\bcprov-jdk15on\1.70\bcprov-jdk15on-1.70.jar;C:\Users\User\.m2\repository\org\bouncycastle\bcutil-jdk15on\1.70\bcutil-jdk15on-1.70.jar;C:\Users\User\.m2\repository\org\jfree\jcommon\1.0.23\jcommon-1.0.23.jar;C:\Users\User\.m2\repository\org\jfree\jfreechart\1.0.19\jfreechart-1.0.19.jar;C:\Users\User\.m2\repository\com\fasterxml\jackson\core\jackson-core\2.13.3\jackson-core-2.13.3.jar;C:\Users\User\.m2\repository\com\fasterxml\jackson\core\jackson-databind\2.13.3\jackson-databind-2.13.3.jar;C:\Users\User\.m2\repository\com\fasterxml\jackson\core\jackson-annotations\2.13.3\jackson-annotations-2.13.3.jar;C:\Users\User\.m2\repository\com\fasterxml\jackson\dataformat\jackson-dataformat-xml\2.13.3\jackson-dataformat-xml-2.13.3.jar;C:\Users\User\.m2\repository\org\codehaus\woodstox\stax2-api\4.2.1\stax2-api-4.2.1.jar;C:\Users\User\.m2\repository\com\fasterxml\woodstox\woodstox-core\6.2.7\woodstox-core-6.2.7.jar;C:\Users\User\.m2\repository\net\sf\jasperreports\jasperreports-fonts\6.20.0\jasperreports-fonts-6.20.0.jar;C:\Users\User\.m2\repository\org\eclipse\jdt\ecj\3.33.0\ecj-3.33.0.jar;C:\Users\User\.m2\repository\org\apache\poi\poi-ooxml\5.2.3\poi-ooxml-5.2.3.jar;C:\Users\User\.m2\repository\org\apache\poi\poi\5.2.3\poi-5.2.3.jar;C:\Users\User\.m2\repository\commons-codec\commons-codec\1.15\commons-codec-1.15.jar;C:\Users\User\.m2\repository\org\apache\commons\commons-math3\3.6.1\commons-math3-3.6.1.jar;C:\Users\User\.m2\repository\com\zaxxer\SparseBitSet\1.2\SparseBitSet-1.2.jar;C:\Users\User\.m2\repository\org\apache\poi\poi-ooxml-lite\5.2.3\poi-ooxml-lite-5.2.3.jar;C:\Users\User\.m2\repository\org\apache\xmlbeans\xmlbeans\5.1.1\xmlbeans-5.1.1.jar;C:\Users\User\.m2\repository\org\apache\commons\commons-compress\1.21\commons-compress-1.21.jar;C:\Users\User\.m2\repository\commons-io\commons-io\2.11.0\commons-io-2.11.0.jar;C:\Users\User\.m2\repository\com\github\virtuald\curvesapi\1.07\curvesapi-1.07.jar;C:\Users\User\.m2\repository\com\google\zxing\core\3.5.2\core-3.5.2.jar;C:\Users\User\.m2\repository\com\google\zxing\javase\3.5.2\javase-3.5.2.jar;C:\Users\User\.m2\repository\com\beust\jcommander\1.82\jcommander-1.82.jar;C:\Users\User\.m2\repository\com\github\jai-imageio\jai-imageio-core\1.4.0\jai-imageio-core-1.4.0.jar;C:\Users\User\.m2\repository\org\apache\logging\log4j\log4j-api\2.20.0\log4j-api-2.20.0.jar;C:\Users\User\.m2\repository\org\apache\logging\log4j\log4j-core\2.20.0\log4j-core-2.20.0.jar;C:\Users\User\.m2\repository\org\junit\jupiter\junit-jupiter\5.10.0\junit-jupiter-5.10.0.jar;C:\Users\User\.m2\repository\org\junit\jupiter\junit-jupiter-api\5.10.0\junit-jupiter-api-5.10.0.jar;C:\Users\User\.m2\repository\org\opentest4j\opentest4j\1.3.0\opentest4j-1.3.0.jar;C:\Users\User\.m2\repository\org\junit\platform\junit-platform-commons\1.10.0\junit-platform-commons-1.10.0.jar;C:\Users\User\.m2\repository\org\apiguardian\apiguardian-api\1.1.2\apiguardian-api-1.1.2.jar;C:\Users\User\.m2\repository\org\junit\jupiter\junit-jupiter-params\5.10.0\junit-jupiter-params-5.10.0.jar;C:\Users\User\.m2\repository\org\junit\jupiter\junit-jupiter-engine\5.10.0\junit-jupiter-engine-5.10.0.jar;C:\Users\User\.m2\repository\org\junit\platform\junit-platform-engine\1.10.0\junit-platform-engine-1.10.0.jar;"/>
    <property name="sun.cpu.endian" value="little"/>
    <property name="user.home" value="C:\Users\User"/>
    <property name="user.language" value="en"/>
    <property name="java.specification.vendor" value="Oracle Corporation"/>
    <property name="java.version.date" value="2025-10-21"/>
    <property name="java.home" value="C:\Users\User\.jdks\ms-17.0.17"/>
    <property name="file.separator" value="\"/>
    <property name="style.color" value="always"/>
    <property name="basedir" value="C:\Users\User\OneDrive\Documents\Java Institute\SAD\InventorySystem"/>
    <property name="java.vm.compressedOopsMode" value="Zero based"/>
    <property name="line.separator" value="&#10;"/>
    <property name="java.vm.specification.vendor" value="Oracle Corporation"/>
    <property name="java.specification.name" value="Java Platform API Specification"/>
    <property name="surefire.real.class.path" value="C:\Users\User\AppData\Local\Temp\surefire13700642978726573695\surefirebooter-20261013204228659_3.jar"/>
    <property name="user.script" value=""/>
    <property name="sun.management.compiler" value="HotSpot 64-Bit Tiered Compilers"/>
    <property name="java.runtime.version" value="17.0.17+10-LTS"/>
    <property name="user.name" value="User"/>
    <property name="path.separator" value=";"/>
    <property name="os.version" value="10.0"/>
    <property name="java.runtime.name" value="OpenJDK Runtime Environment"/>
    <property name="file.encoding" value="Cp1252"/>
    <property name="java.vm.name" value="OpenJDK 64-Bit Server VM"/>
    <property name="java.vendor.version" value="Microsoft-12574423"/>
    <property name="maven.ext.class.path" value="C:\Program Files\JetBrains\IntelliJ IDEA 2025.2.4\plugins\maven\lib\maven-event-listener.jar"/>
    <property name="localRepository" value="C:\Users\User\.m2\repository"/>
    <property name="java.vendor.url.bug" value="https://github.com/microsoft/openjdk/issues"/>
    <property name="java.io.tmpdir" value="C:\Users\User\AppData\Local\Temp\"/>
    <property name="idea.version" value="2025.2.4"/>
    <property name="java.version" value="17.0.17"/>
    <property name="user.dir" value="C:\Users\User\OneDrive\Documents\Java Institute\SAD\InventorySystem"/>
    <property name="os.arch" value="amd64"/>
    <property name="jansi.passthrough" value="true"/>
    <property name="java.vm.specification.name" value="Java Virtual Machine Specification"/>
    <property name="sun.os.patch.level" value=""/>
    <property name="native.encoding" value="Cp1252"/>
    <property name="java.library.path" value="C:\Users\User\.jdks\ms-17.0.17\bin;C:\WINDOWS\Sun\Java\bin;C:\WINDOWS\system32;C:\WINDOWS;C:\Program Files\Common Files\Oracle\Java\javapath;C:\Program Files (x86)\Common Files\Oracle\Java\javapath;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\WINDOWS\System32\OpenSSH\;C:\Program Files\dotnet\;C:\Program Files\PuTTY\;C:\Program Files\nodejs\;C:\Program Files\Git\cmd;C:\Program Files\WSL\;C:\Users\User\AppData\Local\Microsoft\WindowsApps;C:\Users\User\AppData\Local\Programs\Microsoft VS Code\bin;C:\Users\User\AppData\Roaming\npm;C:\Users\User\AppData\Local\GitHubDesktop\bin;C:\Users\User\AppData\Local\Python\pythoncore-3.14-64\Scripts;;."/>
    <property name="java.vm.info" value="mixed mode, sharing"/>
    <property name="java.vendor" value="Microsoft"/>
    <property name="java.vm.version" value="17.0.17+10-LTS"/>
    <property name="java.specification.maintenance.version" value="1"/>
    <property name="sun.io.unicode.encoding" value="UnicodeLittle"/>
    <property name="maven.repo.local" value="C:\Users\User\.m2\repository"/>
    <property name="java.class.version" value="61.0"/>
  </properties>
  <testcase name="barcodeImageIsGenerated" classname="com.inventory.util.BarcodeUtilTest" time="0.052"/>
</testsuite>

```

## target\surefire-reports\TEST-com.inventory.util.PasswordUtilTest.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<testsuite xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:noNamespaceSchemaLocation="https://maven.apache.org/surefire/maven-surefire-plugin/xsd/surefire-test-report-3.0.xsd" version="3.0" name="com.inventory.util.PasswordUtilTest" time="0.026" tests="4" errors="0" skipped="0" failures="0">
  <properties>
    <property name="java.specification.version" value="17"/>
    <property name="sun.cpu.isalist" value="amd64"/>
    <property name="sun.jnu.encoding" value="Cp1252"/>
    <property name="java.class.path" value="C:\Users\User\OneDrive\Documents\Java Institute\SAD\InventorySystem\target\test-classes;C:\Users\User\OneDrive\Documents\Java Institute\SAD\InventorySystem\target\classes;C:\Users\User\.m2\repository\com\mysql\mysql-connector-j\8.0.33\mysql-connector-j-8.0.33.jar;C:\Users\User\.m2\repository\com\google\protobuf\protobuf-java\3.21.9\protobuf-java-3.21.9.jar;C:\Users\User\.m2\repository\net\sf\jasperreports\jasperreports\6.20.0\jasperreports-6.20.0.jar;C:\Users\User\.m2\repository\commons-beanutils\commons-beanutils\1.9.4\commons-beanutils-1.9.4.jar;C:\Users\User\.m2\repository\commons-collections\commons-collections\3.2.2\commons-collections-3.2.2.jar;C:\Users\User\.m2\repository\commons-digester\commons-digester\2.1\commons-digester-2.1.jar;C:\Users\User\.m2\repository\commons-logging\commons-logging\1.1.1\commons-logging-1.1.1.jar;C:\Users\User\.m2\repository\org\apache\commons\commons-collections4\4.2\commons-collections4-4.2.jar;C:\Users\User\.m2\repository\com\lowagie\itext\2.1.7.js10\itext-2.1.7.js10.jar;C:\Users\User\.m2\repository\org\bouncycastle\bcprov-jdk15on\1.70\bcprov-jdk15on-1.70.jar;C:\Users\User\.m2\repository\org\bouncycastle\bcutil-jdk15on\1.70\bcutil-jdk15on-1.70.jar;C:\Users\User\.m2\repository\org\jfree\jcommon\1.0.23\jcommon-1.0.23.jar;C:\Users\User\.m2\repository\org\jfree\jfreechart\1.0.19\jfreechart-1.0.19.jar;C:\Users\User\.m2\repository\com\fasterxml\jackson\core\jackson-core\2.13.3\jackson-core-2.13.3.jar;C:\Users\User\.m2\repository\com\fasterxml\jackson\core\jackson-databind\2.13.3\jackson-databind-2.13.3.jar;C:\Users\User\.m2\repository\com\fasterxml\jackson\core\jackson-annotations\2.13.3\jackson-annotations-2.13.3.jar;C:\Users\User\.m2\repository\com\fasterxml\jackson\dataformat\jackson-dataformat-xml\2.13.3\jackson-dataformat-xml-2.13.3.jar;C:\Users\User\.m2\repository\org\codehaus\woodstox\stax2-api\4.2.1\stax2-api-4.2.1.jar;C:\Users\User\.m2\repository\com\fasterxml\woodstox\woodstox-core\6.2.7\woodstox-core-6.2.7.jar;C:\Users\User\.m2\repository\net\sf\jasperreports\jasperreports-fonts\6.20.0\jasperreports-fonts-6.20.0.jar;C:\Users\User\.m2\repository\org\eclipse\jdt\ecj\3.33.0\ecj-3.33.0.jar;C:\Users\User\.m2\repository\org\apache\poi\poi-ooxml\5.2.3\poi-ooxml-5.2.3.jar;C:\Users\User\.m2\repository\org\apache\poi\poi\5.2.3\poi-5.2.3.jar;C:\Users\User\.m2\repository\commons-codec\commons-codec\1.15\commons-codec-1.15.jar;C:\Users\User\.m2\repository\org\apache\commons\commons-math3\3.6.1\commons-math3-3.6.1.jar;C:\Users\User\.m2\repository\com\zaxxer\SparseBitSet\1.2\SparseBitSet-1.2.jar;C:\Users\User\.m2\repository\org\apache\poi\poi-ooxml-lite\5.2.3\poi-ooxml-lite-5.2.3.jar;C:\Users\User\.m2\repository\org\apache\xmlbeans\xmlbeans\5.1.1\xmlbeans-5.1.1.jar;C:\Users\User\.m2\repository\org\apache\commons\commons-compress\1.21\commons-compress-1.21.jar;C:\Users\User\.m2\repository\commons-io\commons-io\2.11.0\commons-io-2.11.0.jar;C:\Users\User\.m2\repository\com\github\virtuald\curvesapi\1.07\curvesapi-1.07.jar;C:\Users\User\.m2\repository\com\google\zxing\core\3.5.2\core-3.5.2.jar;C:\Users\User\.m2\repository\com\google\zxing\javase\3.5.2\javase-3.5.2.jar;C:\Users\User\.m2\repository\com\beust\jcommander\1.82\jcommander-1.82.jar;C:\Users\User\.m2\repository\com\github\jai-imageio\jai-imageio-core\1.4.0\jai-imageio-core-1.4.0.jar;C:\Users\User\.m2\repository\org\apache\logging\log4j\log4j-api\2.20.0\log4j-api-2.20.0.jar;C:\Users\User\.m2\repository\org\apache\logging\log4j\log4j-core\2.20.0\log4j-core-2.20.0.jar;C:\Users\User\.m2\repository\org\junit\jupiter\junit-jupiter\5.10.0\junit-jupiter-5.10.0.jar;C:\Users\User\.m2\repository\org\junit\jupiter\junit-jupiter-api\5.10.0\junit-jupiter-api-5.10.0.jar;C:\Users\User\.m2\repository\org\opentest4j\opentest4j\1.3.0\opentest4j-1.3.0.jar;C:\Users\User\.m2\repository\org\junit\platform\junit-platform-commons\1.10.0\junit-platform-commons-1.10.0.jar;C:\Users\User\.m2\repository\org\apiguardian\apiguardian-api\1.1.2\apiguardian-api-1.1.2.jar;C:\Users\User\.m2\repository\org\junit\jupiter\junit-jupiter-params\5.10.0\junit-jupiter-params-5.10.0.jar;C:\Users\User\.m2\repository\org\junit\jupiter\junit-jupiter-engine\5.10.0\junit-jupiter-engine-5.10.0.jar;C:\Users\User\.m2\repository\org\junit\platform\junit-platform-engine\1.10.0\junit-platform-engine-1.10.0.jar;"/>
    <property name="java.vm.vendor" value="Microsoft"/>
    <property name="sun.arch.data.model" value="64"/>
    <property name="user.variant" value=""/>
    <property name="java.vendor.url" value="https://www.microsoft.com"/>
    <property name="user.timezone" value="Asia/Colombo"/>
    <property name="os.name" value="Windows 11"/>
    <property name="java.vm.specification.version" value="17"/>
    <property name="user.country" value="US"/>
    <property name="sun.java.launcher" value="SUN_STANDARD"/>
    <property name="sun.boot.library.path" value="C:\Users\User\.jdks\ms-17.0.17\bin"/>
    <property name="sun.java.command" value="C:\Users\User\AppData\Local\Temp\surefire13700642978726573695\surefirebooter-20261013204228659_3.jar C:\Users\User\AppData\Local\Temp\surefire13700642978726573695 2026-10-13T20-42-26_130-jvmRun1 surefire-20261013204228659_1tmp surefire_0-20261013204228659_2tmp"/>
    <property name="jdk.debug" value="release"/>
    <property name="surefire.test.class.path" value="C:\Users\User\OneDrive\Documents\Java Institute\SAD\InventorySystem\target\test-classes;C:\Users\User\OneDrive\Documents\Java Institute\SAD\InventorySystem\target\classes;C:\Users\User\.m2\repository\com\mysql\mysql-connector-j\8.0.33\mysql-connector-j-8.0.33.jar;C:\Users\User\.m2\repository\com\google\protobuf\protobuf-java\3.21.9\protobuf-java-3.21.9.jar;C:\Users\User\.m2\repository\net\sf\jasperreports\jasperreports\6.20.0\jasperreports-6.20.0.jar;C:\Users\User\.m2\repository\commons-beanutils\commons-beanutils\1.9.4\commons-beanutils-1.9.4.jar;C:\Users\User\.m2\repository\commons-collections\commons-collections\3.2.2\commons-collections-3.2.2.jar;C:\Users\User\.m2\repository\commons-digester\commons-digester\2.1\commons-digester-2.1.jar;C:\Users\User\.m2\repository\commons-logging\commons-logging\1.1.1\commons-logging-1.1.1.jar;C:\Users\User\.m2\repository\org\apache\commons\commons-collections4\4.2\commons-collections4-4.2.jar;C:\Users\User\.m2\repository\com\lowagie\itext\2.1.7.js10\itext-2.1.7.js10.jar;C:\Users\User\.m2\repository\org\bouncycastle\bcprov-jdk15on\1.70\bcprov-jdk15on-1.70.jar;C:\Users\User\.m2\repository\org\bouncycastle\bcutil-jdk15on\1.70\bcutil-jdk15on-1.70.jar;C:\Users\User\.m2\repository\org\jfree\jcommon\1.0.23\jcommon-1.0.23.jar;C:\Users\User\.m2\repository\org\jfree\jfreechart\1.0.19\jfreechart-1.0.19.jar;C:\Users\User\.m2\repository\com\fasterxml\jackson\core\jackson-core\2.13.3\jackson-core-2.13.3.jar;C:\Users\User\.m2\repository\com\fasterxml\jackson\core\jackson-databind\2.13.3\jackson-databind-2.13.3.jar;C:\Users\User\.m2\repository\com\fasterxml\jackson\core\jackson-annotations\2.13.3\jackson-annotations-2.13.3.jar;C:\Users\User\.m2\repository\com\fasterxml\jackson\dataformat\jackson-dataformat-xml\2.13.3\jackson-dataformat-xml-2.13.3.jar;C:\Users\User\.m2\repository\org\codehaus\woodstox\stax2-api\4.2.1\stax2-api-4.2.1.jar;C:\Users\User\.m2\repository\com\fasterxml\woodstox\woodstox-core\6.2.7\woodstox-core-6.2.7.jar;C:\Users\User\.m2\repository\net\sf\jasperreports\jasperreports-fonts\6.20.0\jasperreports-fonts-6.20.0.jar;C:\Users\User\.m2\repository\org\eclipse\jdt\ecj\3.33.0\ecj-3.33.0.jar;C:\Users\User\.m2\repository\org\apache\poi\poi-ooxml\5.2.3\poi-ooxml-5.2.3.jar;C:\Users\User\.m2\repository\org\apache\poi\poi\5.2.3\poi-5.2.3.jar;C:\Users\User\.m2\repository\commons-codec\commons-codec\1.15\commons-codec-1.15.jar;C:\Users\User\.m2\repository\org\apache\commons\commons-math3\3.6.1\commons-math3-3.6.1.jar;C:\Users\User\.m2\repository\com\zaxxer\SparseBitSet\1.2\SparseBitSet-1.2.jar;C:\Users\User\.m2\repository\org\apache\poi\poi-ooxml-lite\5.2.3\poi-ooxml-lite-5.2.3.jar;C:\Users\User\.m2\repository\org\apache\xmlbeans\xmlbeans\5.1.1\xmlbeans-5.1.1.jar;C:\Users\User\.m2\repository\org\apache\commons\commons-compress\1.21\commons-compress-1.21.jar;C:\Users\User\.m2\repository\commons-io\commons-io\2.11.0\commons-io-2.11.0.jar;C:\Users\User\.m2\repository\com\github\virtuald\curvesapi\1.07\curvesapi-1.07.jar;C:\Users\User\.m2\repository\com\google\zxing\core\3.5.2\core-3.5.2.jar;C:\Users\User\.m2\repository\com\google\zxing\javase\3.5.2\javase-3.5.2.jar;C:\Users\User\.m2\repository\com\beust\jcommander\1.82\jcommander-1.82.jar;C:\Users\User\.m2\repository\com\github\jai-imageio\jai-imageio-core\1.4.0\jai-imageio-core-1.4.0.jar;C:\Users\User\.m2\repository\org\apache\logging\log4j\log4j-api\2.20.0\log4j-api-2.20.0.jar;C:\Users\User\.m2\repository\org\apache\logging\log4j\log4j-core\2.20.0\log4j-core-2.20.0.jar;C:\Users\User\.m2\repository\org\junit\jupiter\junit-jupiter\5.10.0\junit-jupiter-5.10.0.jar;C:\Users\User\.m2\repository\org\junit\jupiter\junit-jupiter-api\5.10.0\junit-jupiter-api-5.10.0.jar;C:\Users\User\.m2\repository\org\opentest4j\opentest4j\1.3.0\opentest4j-1.3.0.jar;C:\Users\User\.m2\repository\org\junit\platform\junit-platform-commons\1.10.0\junit-platform-commons-1.10.0.jar;C:\Users\User\.m2\repository\org\apiguardian\apiguardian-api\1.1.2\apiguardian-api-1.1.2.jar;C:\Users\User\.m2\repository\org\junit\jupiter\junit-jupiter-params\5.10.0\junit-jupiter-params-5.10.0.jar;C:\Users\User\.m2\repository\org\junit\jupiter\junit-jupiter-engine\5.10.0\junit-jupiter-engine-5.10.0.jar;C:\Users\User\.m2\repository\org\junit\platform\junit-platform-engine\1.10.0\junit-platform-engine-1.10.0.jar;"/>
    <property name="sun.cpu.endian" value="little"/>
    <property name="user.home" value="C:\Users\User"/>
    <property name="user.language" value="en"/>
    <property name="java.specification.vendor" value="Oracle Corporation"/>
    <property name="java.version.date" value="2025-10-21"/>
    <property name="java.home" value="C:\Users\User\.jdks\ms-17.0.17"/>
    <property name="file.separator" value="\"/>
    <property name="style.color" value="always"/>
    <property name="basedir" value="C:\Users\User\OneDrive\Documents\Java Institute\SAD\InventorySystem"/>
    <property name="java.vm.compressedOopsMode" value="Zero based"/>
    <property name="line.separator" value="&#10;"/>
    <property name="java.vm.specification.vendor" value="Oracle Corporation"/>
    <property name="java.specification.name" value="Java Platform API Specification"/>
    <property name="surefire.real.class.path" value="C:\Users\User\AppData\Local\Temp\surefire13700642978726573695\surefirebooter-20261013204228659_3.jar"/>
    <property name="user.script" value=""/>
    <property name="sun.management.compiler" value="HotSpot 64-Bit Tiered Compilers"/>
    <property name="java.runtime.version" value="17.0.17+10-LTS"/>
    <property name="user.name" value="User"/>
    <property name="path.separator" value=";"/>
    <property name="os.version" value="10.0"/>
    <property name="java.runtime.name" value="OpenJDK Runtime Environment"/>
    <property name="file.encoding" value="Cp1252"/>
    <property name="java.vm.name" value="OpenJDK 64-Bit Server VM"/>
    <property name="java.vendor.version" value="Microsoft-12574423"/>
    <property name="maven.ext.class.path" value="C:\Program Files\JetBrains\IntelliJ IDEA 2025.2.4\plugins\maven\lib\maven-event-listener.jar"/>
    <property name="localRepository" value="C:\Users\User\.m2\repository"/>
    <property name="java.vendor.url.bug" value="https://github.com/microsoft/openjdk/issues"/>
    <property name="java.io.tmpdir" value="C:\Users\User\AppData\Local\Temp\"/>
    <property name="idea.version" value="2025.2.4"/>
    <property name="java.version" value="17.0.17"/>
    <property name="user.dir" value="C:\Users\User\OneDrive\Documents\Java Institute\SAD\InventorySystem"/>
    <property name="os.arch" value="amd64"/>
    <property name="jansi.passthrough" value="true"/>
    <property name="java.vm.specification.name" value="Java Virtual Machine Specification"/>
    <property name="sun.os.patch.level" value=""/>
    <property name="native.encoding" value="Cp1252"/>
    <property name="java.library.path" value="C:\Users\User\.jdks\ms-17.0.17\bin;C:\WINDOWS\Sun\Java\bin;C:\WINDOWS\system32;C:\WINDOWS;C:\Program Files\Common Files\Oracle\Java\javapath;C:\Program Files (x86)\Common Files\Oracle\Java\javapath;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\WINDOWS\System32\OpenSSH\;C:\Program Files\dotnet\;C:\Program Files\PuTTY\;C:\Program Files\nodejs\;C:\Program Files\Git\cmd;C:\Program Files\WSL\;C:\Users\User\AppData\Local\Microsoft\WindowsApps;C:\Users\User\AppData\Local\Programs\Microsoft VS Code\bin;C:\Users\User\AppData\Roaming\npm;C:\Users\User\AppData\Local\GitHubDesktop\bin;C:\Users\User\AppData\Local\Python\pythoncore-3.14-64\Scripts;;."/>
    <property name="java.vm.info" value="mixed mode, sharing"/>
    <property name="java.vendor" value="Microsoft"/>
    <property name="java.vm.version" value="17.0.17+10-LTS"/>
    <property name="java.specification.maintenance.version" value="1"/>
    <property name="sun.io.unicode.encoding" value="UnicodeLittle"/>
    <property name="maven.repo.local" value="C:\Users\User\.m2\repository"/>
    <property name="java.class.version" value="61.0"/>
  </properties>
  <testcase name="knownHashMatchesDatabaseScript" classname="com.inventory.util.PasswordUtilTest" time="0.015"/>
  <testcase name="hashLengthIs64" classname="com.inventory.util.PasswordUtilTest" time="0.001"/>
  <testcase name="sameInputGivesSameHash" classname="com.inventory.util.PasswordUtilTest" time="0.004"/>
  <testcase name="differentInputGivesDifferentHash" classname="com.inventory.util.PasswordUtilTest" time="0.002"/>
</testsuite>

```

## target\surefire-reports\TEST-com.inventory.util.ValidatorTest.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<testsuite xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:noNamespaceSchemaLocation="https://maven.apache.org/surefire/maven-surefire-plugin/xsd/surefire-test-report-3.0.xsd" version="3.0" name="com.inventory.util.ValidatorTest" time="0.015" tests="6" errors="0" skipped="0" failures="0">
  <properties>
    <property name="java.specification.version" value="17"/>
    <property name="sun.cpu.isalist" value="amd64"/>
    <property name="sun.jnu.encoding" value="Cp1252"/>
    <property name="java.class.path" value="C:\Users\User\OneDrive\Documents\Java Institute\SAD\InventorySystem\target\test-classes;C:\Users\User\OneDrive\Documents\Java Institute\SAD\InventorySystem\target\classes;C:\Users\User\.m2\repository\com\mysql\mysql-connector-j\8.0.33\mysql-connector-j-8.0.33.jar;C:\Users\User\.m2\repository\com\google\protobuf\protobuf-java\3.21.9\protobuf-java-3.21.9.jar;C:\Users\User\.m2\repository\net\sf\jasperreports\jasperreports\6.20.0\jasperreports-6.20.0.jar;C:\Users\User\.m2\repository\commons-beanutils\commons-beanutils\1.9.4\commons-beanutils-1.9.4.jar;C:\Users\User\.m2\repository\commons-collections\commons-collections\3.2.2\commons-collections-3.2.2.jar;C:\Users\User\.m2\repository\commons-digester\commons-digester\2.1\commons-digester-2.1.jar;C:\Users\User\.m2\repository\commons-logging\commons-logging\1.1.1\commons-logging-1.1.1.jar;C:\Users\User\.m2\repository\org\apache\commons\commons-collections4\4.2\commons-collections4-4.2.jar;C:\Users\User\.m2\repository\com\lowagie\itext\2.1.7.js10\itext-2.1.7.js10.jar;C:\Users\User\.m2\repository\org\bouncycastle\bcprov-jdk15on\1.70\bcprov-jdk15on-1.70.jar;C:\Users\User\.m2\repository\org\bouncycastle\bcutil-jdk15on\1.70\bcutil-jdk15on-1.70.jar;C:\Users\User\.m2\repository\org\jfree\jcommon\1.0.23\jcommon-1.0.23.jar;C:\Users\User\.m2\repository\org\jfree\jfreechart\1.0.19\jfreechart-1.0.19.jar;C:\Users\User\.m2\repository\com\fasterxml\jackson\core\jackson-core\2.13.3\jackson-core-2.13.3.jar;C:\Users\User\.m2\repository\com\fasterxml\jackson\core\jackson-databind\2.13.3\jackson-databind-2.13.3.jar;C:\Users\User\.m2\repository\com\fasterxml\jackson\core\jackson-annotations\2.13.3\jackson-annotations-2.13.3.jar;C:\Users\User\.m2\repository\com\fasterxml\jackson\dataformat\jackson-dataformat-xml\2.13.3\jackson-dataformat-xml-2.13.3.jar;C:\Users\User\.m2\repository\org\codehaus\woodstox\stax2-api\4.2.1\stax2-api-4.2.1.jar;C:\Users\User\.m2\repository\com\fasterxml\woodstox\woodstox-core\6.2.7\woodstox-core-6.2.7.jar;C:\Users\User\.m2\repository\net\sf\jasperreports\jasperreports-fonts\6.20.0\jasperreports-fonts-6.20.0.jar;C:\Users\User\.m2\repository\org\eclipse\jdt\ecj\3.33.0\ecj-3.33.0.jar;C:\Users\User\.m2\repository\org\apache\poi\poi-ooxml\5.2.3\poi-ooxml-5.2.3.jar;C:\Users\User\.m2\repository\org\apache\poi\poi\5.2.3\poi-5.2.3.jar;C:\Users\User\.m2\repository\commons-codec\commons-codec\1.15\commons-codec-1.15.jar;C:\Users\User\.m2\repository\org\apache\commons\commons-math3\3.6.1\commons-math3-3.6.1.jar;C:\Users\User\.m2\repository\com\zaxxer\SparseBitSet\1.2\SparseBitSet-1.2.jar;C:\Users\User\.m2\repository\org\apache\poi\poi-ooxml-lite\5.2.3\poi-ooxml-lite-5.2.3.jar;C:\Users\User\.m2\repository\org\apache\xmlbeans\xmlbeans\5.1.1\xmlbeans-5.1.1.jar;C:\Users\User\.m2\repository\org\apache\commons\commons-compress\1.21\commons-compress-1.21.jar;C:\Users\User\.m2\repository\commons-io\commons-io\2.11.0\commons-io-2.11.0.jar;C:\Users\User\.m2\repository\com\github\virtuald\curvesapi\1.07\curvesapi-1.07.jar;C:\Users\User\.m2\repository\com\google\zxing\core\3.5.2\core-3.5.2.jar;C:\Users\User\.m2\repository\com\google\zxing\javase\3.5.2\javase-3.5.2.jar;C:\Users\User\.m2\repository\com\beust\jcommander\1.82\jcommander-1.82.jar;C:\Users\User\.m2\repository\com\github\jai-imageio\jai-imageio-core\1.4.0\jai-imageio-core-1.4.0.jar;C:\Users\User\.m2\repository\org\apache\logging\log4j\log4j-api\2.20.0\log4j-api-2.20.0.jar;C:\Users\User\.m2\repository\org\apache\logging\log4j\log4j-core\2.20.0\log4j-core-2.20.0.jar;C:\Users\User\.m2\repository\org\junit\jupiter\junit-jupiter\5.10.0\junit-jupiter-5.10.0.jar;C:\Users\User\.m2\repository\org\junit\jupiter\junit-jupiter-api\5.10.0\junit-jupiter-api-5.10.0.jar;C:\Users\User\.m2\repository\org\opentest4j\opentest4j\1.3.0\opentest4j-1.3.0.jar;C:\Users\User\.m2\repository\org\junit\platform\junit-platform-commons\1.10.0\junit-platform-commons-1.10.0.jar;C:\Users\User\.m2\repository\org\apiguardian\apiguardian-api\1.1.2\apiguardian-api-1.1.2.jar;C:\Users\User\.m2\repository\org\junit\jupiter\junit-jupiter-params\5.10.0\junit-jupiter-params-5.10.0.jar;C:\Users\User\.m2\repository\org\junit\jupiter\junit-jupiter-engine\5.10.0\junit-jupiter-engine-5.10.0.jar;C:\Users\User\.m2\repository\org\junit\platform\junit-platform-engine\1.10.0\junit-platform-engine-1.10.0.jar;"/>
    <property name="java.vm.vendor" value="Microsoft"/>
    <property name="sun.arch.data.model" value="64"/>
    <property name="user.variant" value=""/>
    <property name="java.vendor.url" value="https://www.microsoft.com"/>
    <property name="user.timezone" value="Asia/Colombo"/>
    <property name="os.name" value="Windows 11"/>
    <property name="java.vm.specification.version" value="17"/>
    <property name="user.country" value="US"/>
    <property name="sun.java.launcher" value="SUN_STANDARD"/>
    <property name="sun.boot.library.path" value="C:\Users\User\.jdks\ms-17.0.17\bin"/>
    <property name="sun.java.command" value="C:\Users\User\AppData\Local\Temp\surefire13700642978726573695\surefirebooter-20261013204228659_3.jar C:\Users\User\AppData\Local\Temp\surefire13700642978726573695 2026-10-13T20-42-26_130-jvmRun1 surefire-20261013204228659_1tmp surefire_0-20261013204228659_2tmp"/>
    <property name="jdk.debug" value="release"/>
    <property name="surefire.test.class.path" value="C:\Users\User\OneDrive\Documents\Java Institute\SAD\InventorySystem\target\test-classes;C:\Users\User\OneDrive\Documents\Java Institute\SAD\InventorySystem\target\classes;C:\Users\User\.m2\repository\com\mysql\mysql-connector-j\8.0.33\mysql-connector-j-8.0.33.jar;C:\Users\User\.m2\repository\com\google\protobuf\protobuf-java\3.21.9\protobuf-java-3.21.9.jar;C:\Users\User\.m2\repository\net\sf\jasperreports\jasperreports\6.20.0\jasperreports-6.20.0.jar;C:\Users\User\.m2\repository\commons-beanutils\commons-beanutils\1.9.4\commons-beanutils-1.9.4.jar;C:\Users\User\.m2\repository\commons-collections\commons-collections\3.2.2\commons-collections-3.2.2.jar;C:\Users\User\.m2\repository\commons-digester\commons-digester\2.1\commons-digester-2.1.jar;C:\Users\User\.m2\repository\commons-logging\commons-logging\1.1.1\commons-logging-1.1.1.jar;C:\Users\User\.m2\repository\org\apache\commons\commons-collections4\4.2\commons-collections4-4.2.jar;C:\Users\User\.m2\repository\com\lowagie\itext\2.1.7.js10\itext-2.1.7.js10.jar;C:\Users\User\.m2\repository\org\bouncycastle\bcprov-jdk15on\1.70\bcprov-jdk15on-1.70.jar;C:\Users\User\.m2\repository\org\bouncycastle\bcutil-jdk15on\1.70\bcutil-jdk15on-1.70.jar;C:\Users\User\.m2\repository\org\jfree\jcommon\1.0.23\jcommon-1.0.23.jar;C:\Users\User\.m2\repository\org\jfree\jfreechart\1.0.19\jfreechart-1.0.19.jar;C:\Users\User\.m2\repository\com\fasterxml\jackson\core\jackson-core\2.13.3\jackson-core-2.13.3.jar;C:\Users\User\.m2\repository\com\fasterxml\jackson\core\jackson-databind\2.13.3\jackson-databind-2.13.3.jar;C:\Users\User\.m2\repository\com\fasterxml\jackson\core\jackson-annotations\2.13.3\jackson-annotations-2.13.3.jar;C:\Users\User\.m2\repository\com\fasterxml\jackson\dataformat\jackson-dataformat-xml\2.13.3\jackson-dataformat-xml-2.13.3.jar;C:\Users\User\.m2\repository\org\codehaus\woodstox\stax2-api\4.2.1\stax2-api-4.2.1.jar;C:\Users\User\.m2\repository\com\fasterxml\woodstox\woodstox-core\6.2.7\woodstox-core-6.2.7.jar;C:\Users\User\.m2\repository\net\sf\jasperreports\jasperreports-fonts\6.20.0\jasperreports-fonts-6.20.0.jar;C:\Users\User\.m2\repository\org\eclipse\jdt\ecj\3.33.0\ecj-3.33.0.jar;C:\Users\User\.m2\repository\org\apache\poi\poi-ooxml\5.2.3\poi-ooxml-5.2.3.jar;C:\Users\User\.m2\repository\org\apache\poi\poi\5.2.3\poi-5.2.3.jar;C:\Users\User\.m2\repository\commons-codec\commons-codec\1.15\commons-codec-1.15.jar;C:\Users\User\.m2\repository\org\apache\commons\commons-math3\3.6.1\commons-math3-3.6.1.jar;C:\Users\User\.m2\repository\com\zaxxer\SparseBitSet\1.2\SparseBitSet-1.2.jar;C:\Users\User\.m2\repository\org\apache\poi\poi-ooxml-lite\5.2.3\poi-ooxml-lite-5.2.3.jar;C:\Users\User\.m2\repository\org\apache\xmlbeans\xmlbeans\5.1.1\xmlbeans-5.1.1.jar;C:\Users\User\.m2\repository\org\apache\commons\commons-compress\1.21\commons-compress-1.21.jar;C:\Users\User\.m2\repository\commons-io\commons-io\2.11.0\commons-io-2.11.0.jar;C:\Users\User\.m2\repository\com\github\virtuald\curvesapi\1.07\curvesapi-1.07.jar;C:\Users\User\.m2\repository\com\google\zxing\core\3.5.2\core-3.5.2.jar;C:\Users\User\.m2\repository\com\google\zxing\javase\3.5.2\javase-3.5.2.jar;C:\Users\User\.m2\repository\com\beust\jcommander\1.82\jcommander-1.82.jar;C:\Users\User\.m2\repository\com\github\jai-imageio\jai-imageio-core\1.4.0\jai-imageio-core-1.4.0.jar;C:\Users\User\.m2\repository\org\apache\logging\log4j\log4j-api\2.20.0\log4j-api-2.20.0.jar;C:\Users\User\.m2\repository\org\apache\logging\log4j\log4j-core\2.20.0\log4j-core-2.20.0.jar;C:\Users\User\.m2\repository\org\junit\jupiter\junit-jupiter\5.10.0\junit-jupiter-5.10.0.jar;C:\Users\User\.m2\repository\org\junit\jupiter\junit-jupiter-api\5.10.0\junit-jupiter-api-5.10.0.jar;C:\Users\User\.m2\repository\org\opentest4j\opentest4j\1.3.0\opentest4j-1.3.0.jar;C:\Users\User\.m2\repository\org\junit\platform\junit-platform-commons\1.10.0\junit-platform-commons-1.10.0.jar;C:\Users\User\.m2\repository\org\apiguardian\apiguardian-api\1.1.2\apiguardian-api-1.1.2.jar;C:\Users\User\.m2\repository\org\junit\jupiter\junit-jupiter-params\5.10.0\junit-jupiter-params-5.10.0.jar;C:\Users\User\.m2\repository\org\junit\jupiter\junit-jupiter-engine\5.10.0\junit-jupiter-engine-5.10.0.jar;C:\Users\User\.m2\repository\org\junit\platform\junit-platform-engine\1.10.0\junit-platform-engine-1.10.0.jar;"/>
    <property name="sun.cpu.endian" value="little"/>
    <property name="user.home" value="C:\Users\User"/>
    <property name="user.language" value="en"/>
    <property name="java.specification.vendor" value="Oracle Corporation"/>
    <property name="java.version.date" value="2025-10-21"/>
    <property name="java.home" value="C:\Users\User\.jdks\ms-17.0.17"/>
    <property name="file.separator" value="\"/>
    <property name="style.color" value="always"/>
    <property name="basedir" value="C:\Users\User\OneDrive\Documents\Java Institute\SAD\InventorySystem"/>
    <property name="java.vm.compressedOopsMode" value="Zero based"/>
    <property name="line.separator" value="&#10;"/>
    <property name="java.vm.specification.vendor" value="Oracle Corporation"/>
    <property name="java.specification.name" value="Java Platform API Specification"/>
    <property name="surefire.real.class.path" value="C:\Users\User\AppData\Local\Temp\surefire13700642978726573695\surefirebooter-20261013204228659_3.jar"/>
    <property name="user.script" value=""/>
    <property name="sun.management.compiler" value="HotSpot 64-Bit Tiered Compilers"/>
    <property name="java.runtime.version" value="17.0.17+10-LTS"/>
    <property name="user.name" value="User"/>
    <property name="path.separator" value=";"/>
    <property name="os.version" value="10.0"/>
    <property name="java.runtime.name" value="OpenJDK Runtime Environment"/>
    <property name="file.encoding" value="Cp1252"/>
    <property name="java.vm.name" value="OpenJDK 64-Bit Server VM"/>
    <property name="java.vendor.version" value="Microsoft-12574423"/>
    <property name="maven.ext.class.path" value="C:\Program Files\JetBrains\IntelliJ IDEA 2025.2.4\plugins\maven\lib\maven-event-listener.jar"/>
    <property name="localRepository" value="C:\Users\User\.m2\repository"/>
    <property name="java.vendor.url.bug" value="https://github.com/microsoft/openjdk/issues"/>
    <property name="java.io.tmpdir" value="C:\Users\User\AppData\Local\Temp\"/>
    <property name="idea.version" value="2025.2.4"/>
    <property name="java.version" value="17.0.17"/>
    <property name="user.dir" value="C:\Users\User\OneDrive\Documents\Java Institute\SAD\InventorySystem"/>
    <property name="os.arch" value="amd64"/>
    <property name="jansi.passthrough" value="true"/>
    <property name="java.vm.specification.name" value="Java Virtual Machine Specification"/>
    <property name="sun.os.patch.level" value=""/>
    <property name="native.encoding" value="Cp1252"/>
    <property name="java.library.path" value="C:\Users\User\.jdks\ms-17.0.17\bin;C:\WINDOWS\Sun\Java\bin;C:\WINDOWS\system32;C:\WINDOWS;C:\Program Files\Common Files\Oracle\Java\javapath;C:\Program Files (x86)\Common Files\Oracle\Java\javapath;C:\WINDOWS\system32;C:\WINDOWS;C:\WINDOWS\System32\Wbem;C:\WINDOWS\System32\WindowsPowerShell\v1.0\;C:\WINDOWS\System32\OpenSSH\;C:\Program Files\dotnet\;C:\Program Files\PuTTY\;C:\Program Files\nodejs\;C:\Program Files\Git\cmd;C:\Program Files\WSL\;C:\Users\User\AppData\Local\Microsoft\WindowsApps;C:\Users\User\AppData\Local\Programs\Microsoft VS Code\bin;C:\Users\User\AppData\Roaming\npm;C:\Users\User\AppData\Local\GitHubDesktop\bin;C:\Users\User\AppData\Local\Python\pythoncore-3.14-64\Scripts;;."/>
    <property name="java.vm.info" value="mixed mode, sharing"/>
    <property name="java.vendor" value="Microsoft"/>
    <property name="java.vm.version" value="17.0.17+10-LTS"/>
    <property name="java.specification.maintenance.version" value="1"/>
    <property name="sun.io.unicode.encoding" value="UnicodeLittle"/>
    <property name="maven.repo.local" value="C:\Users\User\.m2\repository"/>
    <property name="java.class.version" value="61.0"/>
  </properties>
  <testcase name="emptyStringsAreDetected" classname="com.inventory.util.ValidatorTest" time="0.002"/>
  <testcase name="priceValidation" classname="com.inventory.util.ValidatorTest" time="0.002"/>
  <testcase name="phoneValidation" classname="com.inventory.util.ValidatorTest" time="0.001"/>
  <testcase name="quantityValidation" classname="com.inventory.util.ValidatorTest" time="0.001"/>
  <testcase name="dateValidation" classname="com.inventory.util.ValidatorTest" time="0.004"/>
  <testcase name="emailValidation" classname="com.inventory.util.ValidatorTest" time="0.001"/>
</testsuite>

```

