package bankAccount;

public class SavingsAccount extends BankAccount {
    int interestRate;

    SavingsAccount(String iban, long balance, int interestRate) {
        super(iban, balance);
        this.interestRate = interestRate;
    }

    public void giveInterest() {
        this.balance += (balance * interestRate) / 1000;
    }

    public int getInterestRate() {
        return interestRate;
    }

}
