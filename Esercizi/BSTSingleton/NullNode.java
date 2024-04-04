public class NullNode implements Node {
    public boolean includes(int value) {
        return false;
    }

    public Node insert(int value) {
        return BinaryNode.getInstance(value);
    }

    public void preOrder() {
    }
}