/** Client e' una classe che invoca i metodi del Facade Registro */

public class Client {
    private static Libro l1 = new Libro(1);
    private static Libro l2 = new Libro(2);
    private static String nome = "Alan";
    private static Registro r = new Registro();

    public static void main(String[] args) {
        presta(l1);
        presta(l2);
        leggi(l1);
    }

    public static void presta(Libro lib) {
        if (r.prestaLibro(nome, lib))
            System.out.println("Prestito registrato");
    }

    public static void leggi(Libro lib) {
        if (r.leggiLibro(lib))
            System.out.println(nome + " legge " + lib.getTitolo());
    }
}