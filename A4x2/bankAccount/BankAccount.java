package bankAccount;

public abstract class BankAccount {
    String iban;
    long balance;

    BankAccount(String iban) {
        this.iban = iban;
        this.balance = 0L;
    }

    BankAccount(String iban, long balance) {
        this.iban = iban;
        this.balance = balance;
    }

    public void withdraw(long withdrawAmount) {
        if ((this.balance - withdrawAmount) < 0) {
            this.balance = 0L;
            return;
        }

        this.balance -= withdrawAmount;
    }

    public void deposit(long depositAmount) {
        this.balance += depositAmount;
    }

    public long getAccountBalance() {
        return this.balance;
    }

    public String getAccountId() {
        return this.iban;
    }

    @Override
    public String toString() {
        String fmtBalance = String.format("%d,%02d EUR", balance / 100, balance % 100);
        return String.format("BankAccount[iban=%s, balance=%s]", this.iban, fmtBalance);
    }

}
