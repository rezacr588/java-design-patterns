package Proxy;

public class SecuredAccountProxy implements AccountService{
    private BankAccountImpl realAccount;
    private String password;
    public SecuredAccountProxy(BankAccountImpl bAccountImpl, String passString) {
        this.password = passString;
        this.realAccount = bAccountImpl;
    }

    private boolean authenticate(String inputPassword) {
        return password.equals(inputPassword);
    }

    private void log(String opString, double amount) {
        System.out.println("LOG: Operation: " + opString + ", Amount: $" + amount);
    }

    @Override
    public void deposit(double amount) {
        log("Deposit", amount);
        realAccount.deposit(amount);
    }
    
    @Override
    public void withdraw(double amount) {
        log("Withrow", amount);
        realAccount.withdraw(amount);
    }

    @Override
    public double getBalance() {
        return realAccount.getBalance();
    }

    public void securedWithrow(double amount, String inputPassword) {
        if(authenticate(inputPassword)) {
            withdraw(amount);
        } else {
            System.out.println("Access denied! Incorrect password.");
        }
    }
}
