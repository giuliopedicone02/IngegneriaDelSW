public class SavingAccount extends Account {
    public boolean check(float amount) {
        System.out.println("in SavingAccount check");
        return (balance + amount) >= 1000;
    }
}