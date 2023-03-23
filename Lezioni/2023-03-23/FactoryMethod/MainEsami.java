/**
 * Classe con metodo main
 */
public class MainEsami {
    public static void main(String[] args) {
        Client c = new Client();
        c.registraUnEsame();
        c.sequenzaOperazioni();

        IStudente s1 = c.getStudente();
        s1.nuovoEsame("Geo", 9);
        s1.getMedia();
    }
}