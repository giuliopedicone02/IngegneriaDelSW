public class TestLabel {
    static public void main(String args[]) {
        testGetLabel();
        testChangeLabel();
        testNoChangeLabel();
        testUsed();
    }

    private static void testGetLabel() {
        ILabel s = new Label("LAB");
        if (s.getNextLabel().equals("LAB1"))
            System.out.println("OK Test get label");
        else
            System.out.println("FAILED Test get label");
    }

    private static void testChangeLabel() {
        ILabel s = new Label("LAB");
        s.insertTag("cat");
        if (s.getNextLabel().equals("cat1"))
            System.out.println("OK Test change label");
        else
            System.out.println("FAILED Test change label");
    }

    private static void testNoChangeLabel() {
        ILabel s = new Label("LAB");
        s.insertTag("zebra");
        if (s.getNextLabel().equals("LAB1"))
            System.out.println("OK Test no-change label");
        else
            System.out.println("FAILED Test no-change label");
    }

    private static void testUsed() {
        ILabel s = new Label("LAB");
        if (s.checkUsed(1) && !s.checkUsed(2))
            System.out.println("OK Test used 1");
        else
            System.out.println("FAILED Test used 1");
        s.getNextLabel();
        if (s.checkUsed(2) && !s.checkUsed(3))
            System.out.println("OK Test used 2");
        else
            System.out.println("FAILED Test used 2");
    }
}