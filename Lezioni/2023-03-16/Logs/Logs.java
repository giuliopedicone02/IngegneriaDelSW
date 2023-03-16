import java.util.ArrayList;
import java.util.List;

/** Logs è un Singleton. */
public class Logs {
    /** obj tiene l’istanza l'unica istanza. */
    private static Logs obj;
    /** lista che tiene i dati di tracing da registrare */
    private List<String> l;

    /** il costruttore è privato */
    private Logs() {
        empty();
    }

    /** restituisce l’unica istanza */
    public static Logs getInstance() {
        if (null == obj)
            obj = new Logs(); // crea l’istanza se non presente
        return obj;
    }

    /** accoda un nuovo dato */
    public void record(String s) {
        l.add(s);
    }

    /** restituisce l’ultimo dato registrato */
    public String dumpLast() {
        return l.get(l.size() - 1);
    }

    /** restituisce tutti i dati registrati */
    public String dumpAll() {
        String acc = "";
        for (String s : l) // s tiene ciascun elemento in lista, ad ogni passata
            acc = acc.concat(s);
        return acc;
    }

    /** svuota la lista dei dati di tracing */
    public void empty() {
        l = new ArrayList<>();
    }
}