public class Main {
    public static void main(String[] args) {
        Node tree = new BinaryTree();

        // Inserimento di valori
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        // Ricerca di valori
        System.out.println("Il valore 20 è presente: " + tree.includes(20));
        System.out.println("Il valore 65 è presente: " + tree.includes(65));

        // Visita preorder
        System.out.print("Visita Preorder: ");
        tree.preOrder();
        System.out.println();
    }
}