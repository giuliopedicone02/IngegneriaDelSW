import java.util.ArrayList;
import java.util.List;

/**
 * Studente svolge il ruolo di ConcreteProduct e rappresenta uno studente la cui
 * carriera è attiva.
 */
public class Studente implements IStudente {
    private List<Esame> esami = new ArrayList<>();

    /**
     * Inserisce un nuovo esame.
     */
    public void nuovoEsame(String m, int v) {
        esami.add(new Esame(m, v));
        System.out.println("Esame " + m + " Registrato");
    }

    /**
     * Calcola e restituisce la media.
     */
    public float getMedia() {
        System.out.println("num esami: " + esami.size());
        if (esami.isEmpty())
            return 0;
        float sum = 0;
        for (Esame e : esami)
            sum += e.voto();
        float media = sum / esami.size();
        System.out.println("media: " + media);
        return media;
    }
}