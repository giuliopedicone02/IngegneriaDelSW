import java.io.IOException;

/** Classe che contiene il main e che avvia le operazioni di calcolo */
public class MainPagamenti {
    public static void main(final String[] args) {
        Pagamenti p = Pagamenti.getInstance();
        p.svuota();

        try {
            p.leggiFile("./", "importi.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        p.converti();
        p.calcolaSomma();
        p.calcolaMassimo();

        System.out.println("Dimensione: " + p.getDimens());
        System.out.println("Massimo: " + p.getMassimo());
        System.out.println("Totale: " + p.getSomma());
    }

}