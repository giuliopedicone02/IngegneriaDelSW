public class BinaryTree implements Node {
    private static BinaryTree single_instance = null;
    Node root;

    // Costruttore privato per prevenire l'istanziazione
    private BinaryTree() {
        this.root = new NullNode();
    }

    // Metodo statico per creare o ottenere l'istanza
    public static BinaryTree getInstance() {
        if (single_instance == null)
            single_instance = new BinaryTree();
        return single_instance;
    }

    public boolean includes(int value) {
        return root.includes(value);
    }

    public Node insert(int value) {
        root = root.insert(value);
        return this;
    }

    public void preOrder() {
        root.preOrder();
    }
}
