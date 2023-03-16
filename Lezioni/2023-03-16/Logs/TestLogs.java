public class TestLogs extends MyTestSupport {
    private Logs lg = Logs.getInstance();

    public void testSingl() {
        initLogs();
        Logs lg2 = Logs.getInstance();
        lg2.record("uno");
        lg2.record("due");

        assertEquals(lg.dumpLast(), "due", "test logs singl");
    }

    public void testLast() {
        initLogs();
        assertEquals(lg.dumpLast(), "three ", "test logs last");
    }

    public void testAll() {
        initLogs();
        assertTrue(lg.dumpAll().equals("one two three "), "test logs all");
    }

    private void initLogs() {
        lg.empty();
        lg.record("one ");
        lg.record("two ");
        lg.record("three ");
    }

    public static void main(String[] args) {
        TestLogs tl = new TestLogs();
        tl.testSingl();
        tl.testAll();
        tl.testLast();
    }
}