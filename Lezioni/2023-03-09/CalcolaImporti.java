/**
 * Lista dei requisiti:
 * Dati vari file contenenti valori numerici, con un valore per ciascuna riga di file
 *
 * 1. Leggere da ciascun file la lista di valori
 * 2. Tenere solo i valori non duplicati
 * 3. Calcolare la somma dei numeri letti dal file
 * 4. Calcolare il massimo fra i numeri letti
 */

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

public class CalcolaImporti {

  private final List<String> importi = new ArrayList<>();
  private float totale, massimo;

  /**
   * legge linea per linea il file, aggiunge in lista e calcola totale
   *
   * @param c cartella
   * @param n nomeFile
   */

  public float calcola(final String c, final String n) throws IOException {
    final LineNumberReader f = new LineNumberReader(
      new FileReader(new File(n))
    );

    totale = massimo = 0;

    while (true) {
      final String riga = f.readLine(); // legge una riga dal file

      if (riga == null) {
        break;
      }

      if (!importi.contains(riga)) { //Se il valore non è un duplicato...
        importi.add(riga); // aggiungi il valore in lista

        float x = Float.parseFloat(riga);
        totale += x;

        if (massimo < x) {
          massimo = x;
        }
      }
    }

    f.close();
    return totale;
  }
}
