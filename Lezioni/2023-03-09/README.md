# Oggetti in Java

* Utilizzo della parola chiave static (variabile di istanza):

```java
 public class PrimoMetodo {

  private static final String msg = "Lezione di Ingegneria del Software";
  private static LocalDate d;

  public static void main(String[] args) {
    System.out.println("Hello World!");
    System.out.println(msg);
    stampaData()
  }

  private static void stampaData() {
    d = LocalDate.now();
    System.out.println(d);
  }
}
```

* Utilizzando gli oggetti:

```Java
public class PrimoMetodo {

  private static final String msg = "Lezione di Ingegneria del Software";
  private LocalDate d;

  public static void main(String[] args) {
    System.out.println("Hello World!");
    System.out.println(msg);
    final PrimoMetodo object = new PrimoMetodo();
    object.stampaData();
  }

  private void stampaData() {
    d = LocalDate.now();
    System.out.println(d);
  }
}
```

## Librerie utili in Java

* **java.io.File**: Serve ad aprire il file (ma non posso leggerlo o scrivere)
* **java.io.FileReader**: Serve a leggere il file aperto precedentemente tramite File(c,n)
* **java.io.IOException**: Gestisce le eccezioni di Input/Outout
* **java.io.LineNumberReader**: Serve a leggere il file riga per riga
* **java.util.ArrayList**: Importa ArrayList implementazione di List
* **java.util.List**: Importa la classe List di Java (List è un interfaccia (classe astratta), non ha alcun metodo implementato)

## Metodi utili in Java

* **add()**: Metodo di List che permette di inserire un elemento alla fine della lista
* **contains()**: Metodo di List che verifica se un elemento è presente o meno all'interno della Lista 
* **Float.parseFloat()**: Serve a convertire una stringa in float
* **Integer.parseInt()**: Serve a convertire una stringa in int

## Parola chiave Throws

Si usa nelle dichiarazioni di metodi per indicare quali eccezioni non sono gestite dal metodo ma passate.