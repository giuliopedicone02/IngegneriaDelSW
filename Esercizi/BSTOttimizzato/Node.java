public interface Node {
    boolean includes(int value);

    Node insert(int value);

    void preOrder();
}
