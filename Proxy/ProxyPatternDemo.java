package Proxy;
/**
 * ProxyPatternDemo
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {
        BankAccountImpl realAccount = new BankAccountImpl(1000);
        SecuredAccountProxy securedAccountProxy = new SecuredAccountProxy(realAccount, "password");
        securedAccountProxy.deposit(1000);
        securedAccountProxy.withdraw(200);

        securedAccountProxy.securedWithrow(200, "password");
        securedAccountProxy.securedWithrow(200, "password2");
        securedAccountProxy.getBalance();
        
    }
} 