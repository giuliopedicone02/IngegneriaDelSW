/** Tiene il nome e cognome della persona. */
public class Persona {
    private String nome;
    private String cognome;

    /**
     * Imposta nome e cognome.
     * 
     * @param nome nome
     * @param cognome cognome
     */
    public Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    /** Stampa nome e cognome. */
    public void printAll() {
        System.out.println("Nome: " + nome + " " + cognome);
    }
}