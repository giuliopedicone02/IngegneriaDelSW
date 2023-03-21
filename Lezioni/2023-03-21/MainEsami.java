/**
 * Classe con metodo main che istanzia Studente e Persona e ne chiama i metodi
 */
public class MainEsami {

    public static void main(String[] args) {
        Studente s = new Studente("Alan", "Rossi");
        s.setMatr("M12345");
        s.nuovoEsame("Italiano", 8); // metodo della classe di s
        s.nuovoEsame("Fisica", 7);
        s.printAll(); // metodo della classe di s
        testUno(s);
    }

    /** Mostra il controllo dei tipi quando si usa l'ereditarietà. */
    private static void testUno(Studente s) {
        System.out.println("Dopo l'assegnazione a p di tipo Persona");
        Persona p = s;
        s.nuovoEsame("Inglese", 9);
        // p e' dichiarato di tipo Persona
        // a runtime p punta all'istanza s
        p.printAll();
        // p.getMedia();
    }
}