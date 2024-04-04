public interface Node {
    public abstract boolean includes(int value);

    public abstract Node insert(int value);

    public abstract void preOrder();
}
