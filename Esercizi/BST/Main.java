package BST;

public class Main {
    public static void main(String[] args) {
        BinaryNode root = new BinaryNode(50);

        // Inserimento di valori
        root.insert(30);
        root.insert(70);
        root.insert(20);
        root.insert(40);
        root.insert(60);
        root.insert(80);

        // Ricerca di valori
        System.out.println("Il valore 20 è presente: " + root.includes(20));
        System.out.println("Il valore 65 è presente: " + root.includes(65));

        // Visita preorder
        System.out.print("Visita Preorder: ");
        root.preOrder();
        System.out.println();
    }
}
