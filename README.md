# Require4Testing

Require4Testing ist eine Webanwendung zur Organisation manueller Anwendertests. Durch diese Anwendung wird es deb Requirements Engineers, Testmanager, Testfallerstellern und Testern ermöglicht, ihre Aufgaben effizient zu verwalten und zu koordinieren.

## Projektstruktur

require4testing
│ .gitignore
│ pom.xml
│ README.md
│
├───src
│ ├───main
│ │ ├───java
│ │ │ └───com
│ │ │ └───example
│ │ │ ├───beans
│ │ │ │ RequirementBean.java
│ │ │ │ TestlaufBean.java
│ │ │ │ TestfallBean.java
│ │ │ │ TesterBean.java
│ │ │ │ ErgebnisBean.java
│ │ │ │
│ │ │ └───entities
│ │ │ Requirement.java
│ │ │ Testlauf.java
│ │ │ Testfall.java
│ │ │ Tester.java
│ │ │ Ergebnis.java
│ │ │
│ │ ├───resources
│ │ │ └───META-INF
│ │ │ persistence.xml
│ │ │
│ │ └───webapp
│ │ ├───WEB-INF
│ │ │ web.xml
│ │ │
│ │ ├───templates
│ │ │ template.xhtml
│ │ │
│ │ └───pages
│

## Lizenz

Dieses Projekt steht unter der MIT-Linzenz. Siehe die LICENSE.txt-Datei für weitere Details!

## Datenbankeinrichtung

Um die Datenbank für dieses Projekt einzurichten, führen Sie die folgenden Schritte aus:

1. **Erstellen Sie eine neue MySQL-Datenbank:**
    ```sh
    mysql -u root -p
    CREATE DATABASE require4testing;
    ```

2. **Führen Sie das Schema-Skript aus, um die Tabellen zu erstellen:**
    ```sh
    mysql -u root -p require4testing < database/schema.sql
    ```

3. **(Optional) Füllen Sie die Tabellen mit Beispieldaten:**
    ```sh
    mysql -u root -p require4testing < database/data.sql
    ```

