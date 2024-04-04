public class BinaryTree implements Node {
    Node root;

    // Costruttore senza parametri per creare un albero vuoto
    public BinaryTree() {
        this.root = new NullNode();
    }

    // Costruttore con un parametro per creare un albero con un valore iniziale
    public BinaryTree(int value) {
        this.root = new BinaryNode(value);
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
