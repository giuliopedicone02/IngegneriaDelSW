public class AccTest {
    public static void main(String[] args) {
        System.out.println("start Acc Test ... ");
        System.out.println("creating an instance of Saving Account");
        Account acc = new SavingAccount();
        System.out.println("calling set-balance");
        acc.setBalance(1234);
    }
}
