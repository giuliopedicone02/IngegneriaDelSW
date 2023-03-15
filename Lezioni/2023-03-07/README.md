# Introduzione a Java

Java è un linguaggio ad oggetti puro.
Il codice che creiamo va **obbligatoriamente** inserito all'interno di una classe.

**Convenzioni:** 
* Il nome della classe deve iniziare con una lettera maiuscola, è preferibile NON utilizzare underscore.
* Gli attributi devono avere sempre tipo di visibilità **private**
* Ogni file deve contenere una ed una sola classe

Per creare un file java è necessario che il nome del file e della classe coincidano (Nell'esempio il file si chiama HelloWorld.java e la classe HelloWorld).

Per compilarlo il comando da scrivere è: javac HelloWorld.java

Per eseguirlo il comando da scrivere è: java HelloWorld.java

## Parole chiave di Java

* class: Permette di definire una classe.
* public: Accessibile da qualunque altra classe.
* private: Accessibile solo all'interno della classe.
* protected: Accessibile all'interno della classe e delle classi derivate.
* static: Indica metodi o variabili appartenenti alla classe e non all'oggetto. Possono essere chiamati senza aver cretao l'oggetto. Hanno accesso solo ad altri metodi o variabili statiche.
* final: Indica che l'attributo è una costante che non potrà essere modificata o ridefinita
* interface: Insieme di metodi astratti che non contengono variabili
* abstract: Classi che non possono essere istanziate


## Override
```Java
class BaseClass {
    public void method() {
        System.out.println("BaseClass method");
    }
}

class DerivedClass extends BaseClass {
    @Override
    public void method() {
        System.out.println("DerivedClass method");
    }
}
```

Metodo sovrascritto da una classe derivata.
Il metodo deve avere la stessa firma del metodo sovrascritto.
È possibile richiamare il metodo sovrascritto con la parola chiave super.<metodo>(args).

## Overload
```Java
class OverloadClass {
    public void method() {
        System.out.println("No parameters");
    }
    public void method(int a) {
        System.out.println("One parameter");
    }
    public void method(int a, int b) {
        System.out.println("Two parameters");
    }
}
```

Indica che un metodo è stato definito più volte con lo stesso nome ma con parametri diversi.