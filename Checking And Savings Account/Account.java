public abstract class Account {

    protected int accountNumber;
    private static int accountBase = 10001;
    protected double accountBalance;

    //constructor
    public Account() {
        this.accountNumber = accountBase++;
        this.accountBalance = 0;
    }

    //overloaded constructor
    public Account(double accountBalance){
        this.accountNumber = accountBase++;
        this.accountBalance = accountBalance;
    }


    //getters
    public int getAccountNumber() {
        return accountNumber;
    }
    public double getAccountBalance() {
        return accountBalance;
    }


    //setters
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }


    //withdrawal method
    public void withdrawal(double amount){
        accountBalance -= amount;
    }


    //deposit method
    public void deposit(double amount) {
        accountBalance += amount;
    }

}