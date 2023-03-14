# Spaghetti Code

Spaghetti Code è un antipattern, i metodi sviluppati in data 09/03/2023 è **monolitico** ovvero fa troppe cose in un unico flusso (calcola infatti in un solo metodo la somma dei numeri letti ed il massimo).
Non è quindi OO (Object-Oriented) e non è riutilizzabile.

## Caratteristiche dello Spaghetti Code
* Metodi lunghi e senza parametri
* Variabili globali
* Interazioni minime fra oggetti
* Nomi classi e metodi indicano la programmazione procedurale
* Ereditarietà e polimorfismo non usati, riuso impossibile
* Gli ogggetti non mantengono lo stato tra le invocazioni

**Cause:** inesperienza con la programmazione ad oggetti, nessuna progettazione

## Differenze tra CalcolaImporti.java e Pagamenti.java

* Utilizzo del paradigma di programmazione a doggetti (OOP)
* Ogni metodo effettua una sola piccola attività
* I metodi possono essere riutilizzati per altri scopi

## Paradigma Command & Query

* I metodi **Query** restituiscono un risultato e non modificano lo stato del sistema
* I metodi **Command** cambiano lo stato del sistema ma non restituiscono un valore

I metodi query si possono chiamare liberamente, senza preoccupazioni sulla modifica dello stato, mentre si deve stare più attenti quando si chiamano i metodi command.

## Enhanced For
Equivale al metodo foreach() di altri linguaggi di programmazione, serve a scorrere gli elementi di una lista uno per volta ad ogni iterazione.
