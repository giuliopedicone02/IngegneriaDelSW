# Spaghetti Code

Spaghetti Code è un antipattern, i metodi sviluppati in data 09/03/2023 sono **monolitici** ovvero fanno troppe cose in un unico flusso (calcolano infatti in un solo metodo la somma dei numeri letti ed il massimo).
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

* Utilizzo del paradigma di programmazione ad oggetti (OOP)
* Ogni metodo effettua una sola piccola attività
* I metodi possono essere riutilizzati per altri scopi

## Paradigma Command & Query

* I metodi **Query** restituiscono un risultato e non modificano lo stato del sistema
* I metodi **Command** cambiano lo stato del sistema ma non restituiscono un valore

I metodi query si possono chiamare liberamente, senza preoccupazioni sulla modifica dello stato, mentre si deve stare più attenti quando si chiamano i metodi command.

## Enhanced For
Equivale al metodo foreach() di altri linguaggi di programmazione, serve a scorrere gli elementi di una lista uno per volta ad ogni iterazione.

## Fase di Test
Il test è un codice che contiene l'invocazione del metodo da testare e che genera un risultato atteso.
Il risultato atteso è possibile confrontarlo con il documento dei requisiti o ricorrendo ad un **oracolo** (nel caso della somma ricorro ad un sistema esterno come la calcolatrice).


## Punti importanti da ricordare

**Correttezza:** è stato possibile eseguire test che verificano il codice.

Soddisfare (e verificare) i requisiti permette di ottenere la qualità del
sistema.

* I test documentano le condizioni sotto le quali il codice funziona e
protegge il codice da modifiche indesiderate.
* I test devono essere
**indipendenti** fra loro ed **autovalutanti**.
* **Test Driven Development (TDD):** scrivere prima il test e poi il codice che
risolve un requisito. Lo sviluppatore sceglie nomi di classi e metodi (progettazione). 
Motto: Red Green Refactor. (**Rosso:** Test non andato a buon fine, **Green:** Tutti i test sono andati a buon fine, **Refactor:** Aggiustare il codice ottimizzandolo)
* **Responsabilità:** i compiti sono suddivisi su vari metodi (e quindi su più
classi), questo permette di ottenere **coesione** del codice.
* **Principio di Singola Responsabilità (SRP):** La singola responsabilità è cruciale
per la comprensione, il riuso, l’ereditarietà (OOP).
* **Astrazioni:** lo sviluppatore OOP costruisce astrazioni. Il nome delle
astrazioni è estremamente importante: **il nome che si dà a classi e metodi ne descrive l’obiettivo**.

## DRY: Dont Repeat Yourself
Tecnica di programmazione che si adotta per evitare di scrivere codice con ripetizioni.

## KISS: Keep It Super Simple
Tecnica di programmazione che si adotta per scrivere codice in modo semplice e leggibile per noi e gli altri sviluppatori.

## YAGNI: You Ain't Gonna Need it
Tecnica di programmazione che si adotta per scrivere solo codice strettamente necessario.