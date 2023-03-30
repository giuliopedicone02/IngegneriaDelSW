import java.util.Arrays;
import java.util.List;

/** Label e' un Adapter */
public class Label implements ILabel {
    private List<String> l = Arrays.asList("cat", "dog", "sheep");
    private LabelServer ls;
    private String p;

    // si istanzia subito un Adaptee
    public Label(String prefix) {
        p = prefix;
        ls = new LabelServer(p);
    }

    // l'adattamento consiste nel chiamare un metodo con nome diverso sull'Adaptee
    @Override
    public String getNextLabel() {
        return ls.serveNextLabel();
    }

    // l'adattamento consiste nel fornire una funzionalita' diversa rispetto a
    // quella del
    // metodo sull'Adaptee, che implementa solo parzialmente quanto richiesto dal
    // client
    @Override
    public boolean checkUsed(int k) {
        return (ls.getCount() >= k);
    }

    // qui, oltre a chiamare il corrispondente metodo dell'Adaptee, si verifica,
    // tramite
    // la prima condizione sul corpo del metodo, che la precondizione sia
    // soddisfatta,
    // ovvero non cambiare l'etichetta se non si usa un valore fra quelli permessi
    @Override
    public void insertTag(String t) {
        if (l.contains(t))
            ls.change(t);
    }
}