/**
 * IStudente svolge il ruolo di Product e rappresenta uno studente.
 */
public interface IStudente {
    /**
     * Registra un nuovo esame, se possibile.
     * 
     * @param m nome materia
     * @param v voto ricevuto all'esame
     */
    public void nuovoEsame(String m, int v);

    /**
     * Calcola e restituisce la media degli esami sostenuti.
     * 
     * @return media esami
     */
    public float getMedia();
}
