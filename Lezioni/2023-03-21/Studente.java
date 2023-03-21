import java.util.ArrayList;
import java.util.List;

/**
 * Classe Studente è sottoclasse di Persona.
 */
public class Studente extends Persona {
    private String matr;
    private List<Esame> esami = new ArrayList<>();

    public Studente(String nome, String cognome) {
        super(nome, cognome);
    }

    /**
     * Imposta la matricola.
     */
    public void setMatr(String m) {
        matr = m;
    }

    /**
     * Inserisce un nuovo esame.
     * 
     * @param m nome materia
     * @param v voto ricevuto all'esame
     */
    public void nuovoEsame(String m, int v) {
        Esame e = new Esame(m, v);
        esami.add(e);
    }

    /**
     * Calcola e restituisce la media
     * 
     * @return float la media degli esami
     */
    public float getMedia() {
        if (esami.isEmpty())
            return 0;
        float sum = 0;
        for (Esame e : esami)
            sum += e.voto();
        return sum / esami.size();
    }

    /** Scrive la lista degli esami sostenuti. */
    @Override
    public void printAll() {
        super.printAll();
        System.out.println("matr: " + matr);
        for (Esame e : esami)
            System.out.println(e.materia() + ": " + e.voto());
        System.out.println("media: " + getMedia());
    }
}