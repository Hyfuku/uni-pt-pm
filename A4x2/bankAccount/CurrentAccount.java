package bankAccount;

public class CurrentAccount extends BankAccount{
    int standardFee;

    CurrentAccount(String iban, int standardFee) {
        super(iban, 0L);
        this.standardFee = standardFee;
    }
    CurrentAccount(String iban, long balance, int standardFee) {
        super(iban, balance);
        this.standardFee = standardFee;
    }

    @Override
    public void withdraw(long withdrawAmount) {
        if (balance - withdrawAmount - standardFee < 0) return;

        this.balance -= withdrawAmount + standardFee;
    }

    public int getFee() {
        return standardFee;
    }
}
