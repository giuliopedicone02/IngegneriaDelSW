/** LabelServer e' un Adaptee */
public class LabelServer {
    private int num = 1;
    private String prefix;

    public LabelServer(String p) {
        prefix = p;
    }

    public String serveNextLabel() {
        return prefix + num++;
    }

    public int getCount() {
        return num;
    }

    public void change(String s) {
        prefix = s;
    }
}