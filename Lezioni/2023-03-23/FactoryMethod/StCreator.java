import java.util.HashMap;

/**
 * StCreator svolge il ruolo di ConcreteCreator, e fornisce istanze che
 * rappresentano studenti.
 */
public class StCreator {
    private static boolean attivo = true;
    /** tiene la corrispondenza fra istanza di Sospeso e istanza di Studente */
    private static HashMap<Sospeso, IStudente> bloccati = new HashMap<>();

    /** E' il metodo factory, restituisce una istanza */
    public static IStudente getStudente() {
        if (attivo)
            return new Studente();
        return new Sospeso(0);
    }

    /** Restituisce uno studente sospeso, che non può sostenere esami */
    public static IStudente sospendi(IStudente s) {
        Sospeso sosp = new Sospeso(s.getMedia());
        bloccati.put(sosp, s);
        return sosp;
    }

    /** Restituisce uno studente che può sostenere esami, se prima era sospeso */
    public static IStudente ripristina(IStudente s) {
        return bloccati.remove(s);
    }
}
