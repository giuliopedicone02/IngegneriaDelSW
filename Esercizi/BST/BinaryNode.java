package BST;

public class BinaryNode extends Node {
    Node left = new NullNode();
    Node right = new NullNode();
    int key;

    public BinaryNode(int value) {
        key = value;
    }

    public boolean includes(int value) {
        if (key == value)
            return true;
        else if (value < key)
            return left.includes(value);
        else
            return right.includes(value);
    }

    public Node insert(int value) {
        if (value <= key) {
            left = left.insert(value);
        } else {
            right = right.insert(value);
        }
        return this;
    }

    public void preOrder() {
        System.out.print(key + " ");
        left.preOrder();
        right.preOrder();
    }
}