package bank;

class Account {
    private int id;
    private String password;
    private String ownerName;
    private int balance;

    public Account(int id, String password, String ownerName) {
        this.id = id;
        this.ownerName = ownerName;
        this.password = password;
    }

    private boolean isCorrectPassword(String passwordInput) {
        return passwordInput == this.password;
    }

    public void deposit(int won) {
        balance += won;
    }

    public int withdraw(int won, String passwordInput) {
        if (isCorrectPassword(passwordInput)) return balance -= won;
        else throw new RuntimeException("Password Incorrect!");
    }

    public int checkBalance(String passwordInput) {
        if (isCorrectPassword(passwordInput)) return balance;
        else throw new RuntimeException("Password Incorrect!");
    }
}
