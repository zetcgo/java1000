package bank;

public class Bank {
    public static void main(String[] args) {
        Account account = new Account(1, "password!@#", "Park");
        account.deposit(100000);
        System.out.println(account.checkBalance("password!@#"));
        account.withdraw(20000, "password!@#");
        System.out.println(account.checkBalance("password!@#"));
    }
}