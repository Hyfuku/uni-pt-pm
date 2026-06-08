package bankAccount;

public class TransferManager {

    public void transfer(CurrentAccount from, CurrentAccount to, long amount) {
        from.withdraw(amount);
        to.deposit(amount);
    }
}
