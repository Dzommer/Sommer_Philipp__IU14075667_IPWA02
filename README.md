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
