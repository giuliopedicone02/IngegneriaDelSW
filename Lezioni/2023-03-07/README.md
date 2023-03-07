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

* class: Permette di definire una classe
* public: Accessibile da qualunque altra classe
* private: Accessibile solo all'interno della classe
* static: Indica che l'attributo appartiene alla classe e non all'istanza
* final: Indica che l'attributo è una costante che non potrà essere modificata o ridefinita