package Proxy;

public class BankAccountImpl implements AccountService {
    private double balance;
    public BankAccountImpl(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " into the account. Current balance: $" + balance);
    }

    @Override
    public void withdraw(double amount) {
        if(balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from the account. Current balance: $" + balance);
        } else {
            System.out.println("Insufficient funds! Withdrawal denied.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
