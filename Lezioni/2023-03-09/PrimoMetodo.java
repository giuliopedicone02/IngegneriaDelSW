import java.time.LocalDate;

public class PrimoMetodo {

  private static final String msg = "Lezione di Ingegneria del Software";
  private LocalDate d;

  public static void main(String[] args) {
    System.out.println("Hello World!");
    System.out.println(msg);
    final PrimoMetodo object = new PrimoMetodo();
    object.stampaData();
  }

  private void stampaData() {
    d = LocalDate.now();
    System.out.println(d);
  }
}
