package Proxy;

public interface AccountService {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}
