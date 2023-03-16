# Design Pattern Singleton

Una classe può essere istanziata tutte le volte che vogliamo.

Se decido di avere una sola istanza, come posso vietare la
creazione di più istanze?

Il Design Pattern **Singleton** vieta la creazione di più istanze.

## Caratteristiche del Design Pattern Singleton

* **Intento**
    * Assicurare che una classe abbia una sola istanza e fornire un
    punto di accesso globale all’istanza

* **Motivazione**

    * Alcune classi dovrebbero avere esattamente una istanza in tutta
    l’applicazione.
    * Una variabile globale rende un oggetto accessibile ma non
    proibisce di avere più oggetti per una classe.
    * La classe stessa dovrebbe essere responsabile di tener traccia
    del suo unico punto di accesso.

* **Soluzione**
    * La classe che deve essere un Singleton dovrà implementare
    un’operazione getInstance() sulla classe (ovvero, in Java è un
    metodo static) che ritorna l’unica istanza creata
    * La classe Singleton è responsabile per la creazione dell’istanza
    * Il costruttore della classe Singleton è privato, così da non
    permettere la creazione tramite new ad altre classi

## Considerazioni sul Singleton

Grazie al Design Pattern Singleton, la classe Fib non può avere più di
una istanza a runtime (lo stesso per la classe Logs)

* Si dice che la classe Fib implementa (o svolge) il ruolo di Singleton
* La variante che permette un numero finito di istanze si chiama **Multiton**
* **Principio delle Conseguenze Locali:** un cambiamento in qualche punto
del codice non dovrebbe causare problemi in altri punti.

## Conseguenze del Singleton

* La classe che è un Singleton ha pieno controllo di come e quando i
client accedono al valore della sola istanza.
* Evita che esistano variabili globali che tengono la sola istanza
condivisa.
* Permette di controllare il numero di istanze create in un
programma, facilmente ed in un solo punto.
* La soluzione è più flessibile rispetto a quella di usare static per
tutte le operazioni e le variabili, poiché si può cambiare facilmente
il numero di istanze consentite.
* L’unico frammento di codice da modificare quando si vuol variare
il numero di istanze create è quello della classe che è Singleton,
mentre usando static si dovrebbero modificare tutte le
invocazioni.