/** Classe Singleton che tiene una lista di interi. */
public class Fib {
    /** obj tiene l’unica istanza di Fib. */
    private static final Fib obj = new Fib();

    private final int[] valori = { 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 };
    private int i;

    private Fib() {
        i = 3;
    }

    /** Restituisce l’unica istanza. */
    public static Fib getInstance() {
        return obj;
    }

    /** Restituisce il prossimo valore della lista. */
    public int getValue() {
        if (i < 11)
            i++;
        return valori[i - 1];
    }

    /** Fa ripartire dal primo elemento della lista. */
    public void revert() {
        i = 0;
    }
}