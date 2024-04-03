package BST;

public class NullNode extends Node {
    public boolean includes(int value) {
        return false;
    }

    public Node insert(int value) {
        return new BinaryNode(value);
    }

    public void preOrder() {
    }
}