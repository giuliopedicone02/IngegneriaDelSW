public class Account {
    protected float balance;

    public void setBalance(float amount) {
        System.out.println("in Account set-balance");
        if (check(amount))
            balance += amount;
    }

    public boolean check(float amount) {
        System.out.println("in Account check");
        return (balance + amount) >= 0;
    }
}