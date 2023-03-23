/**
 * Sospeso svolge il ruolo di ConcreteProduct e rappresenta uno studente la cui
 * carriera è stata sospesa.
 */
public class Sospeso implements IStudente {
    private float media;

    /**
     * Prende il valore della media degli esami sostenuti
     * 
     * @param m media esami
     */
    public Sospeso(float m) {
        media = m;
    }

    /** L'esame non potrà essere registrato */
    public void nuovoEsame(String m, int v) {
        System.out.println("Lo studente non può sostenere esami");
    }

    /** Restituisce la media */
    public float getMedia() {
        System.out.println("media: " + media);
        return media;
    }
}
