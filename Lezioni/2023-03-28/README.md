## Varianti del Factory Method

- Il ruolo Creator e ConcreteCreator sono svolti dalla stessa classe
- Il factoryMethod() è un metodo static
- Il factoryMethod() ha un parametro che permette al client di suggerire la classe
da usare per creare l’istanza
- Il factoryMethod() usa la Riflessione Computazionale, quindi Class.forName()
e newInstance(), per eliminare le dipendenze dai ConcreteProduct, la classe
istanziata sarà nota a runtime

## Conseguenze

- **Vantaggio:** Indipendenza dall'implementazione
- Il codice delle classi dell’applicazione conosce solo l’interfaccia Product e può
lavorare con qualsiasi ConcreteProduct. 
- I ConcreteProduct sono facilmente
intercambiabili
- Se si implementa una sottoclasse di Creator per ciascun ConcreteProduct da
istanziare si ha una proliferazione di classi

## Dependency Injection

Il design pattern factory method può essere usato per inserire le dipendenze (Dependency Injection) necessarie alle istanze di ConcreteProduct.

La tecnica di Dependency Injection permette di **separare la costruzione delle istanze dal loro uso**

L’oggetto che fa Dependency Injection si occupa di connettere (**wiring**) varie istanze.

# Design Pattern Abstract Factory

**Intento**

    Fornire un'interfaccia per creare famiglie di oggetti che hanno qualche relazione senza specificare le loro classi concrete.

**Problema**

    Il sistema complessivo dovrebbe essere indipendente dalle classi usate, così da essere configurabile con una di varie famiglie di classi. Le classi di una famiglia dovrebbero essere usate insieme.

**Soluzione**

* **Abstract Factory:** Interfaccia astratta per creare famiglie di oggetti
* **Concrete Factory:** Classi che implementano operazioni per creare ciascuna famiglia di oggetti
* **Abstract Product:** Interfaccia per una famiglia di oggetti
* **Product:** Definisce un oggetto, creato da un ConcreteFactory che implementa l'interfaccia AbstractFactory
* **Client:** usa solo interfacce dichiarate da AbstractFactory e
AbstractProduct

**Conseguenze**

* Permette di usare classi costistentemente
* Le famiglie di classi sono facilmente intercambiabili
* Non è immediato supportare nuove classi Product, poichè bisogna aggiugngere un metodo su Abstractfactory e su ogni ConcreteFactory

## Object Pool

Un **object pool** è un deposito di istanze già create, una istanza sarà
estratta dal pool quando una classe client ne fa richiesta.


* Il pool può **crescere** o può avere **dimensioni fisse**. 
* **Dimensioni fisse:** se non ci sono oggetti disponibili al momento della richiesta, non ne creo di nuovi


```java

import java.util.ArrayList;
import java.util.List;
// CreatorPool è un ConcreteCreator e implementa un Object Pool
public class CreatorPool {
 private List<Shape> pool = new ArrayList<>();
 // metodo factory che ritorna un oggetto prelevato dal pool
 public Shape getShape() {
 if (pool.size() > 0)
 return pool.remove(0);
 return new Circle();
 }
 // inserisce un oggetto nel pool
 public void releaseShape(Shape s) {
 pool.add(s);
 }
}

```