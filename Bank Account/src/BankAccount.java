public class BankAccount{
    //data member balance
    private double balance; //hold the amount in the account
    //protected -- scope changes when a class is inherited
    //public scope changes with respect to the instance of the class
    BankAccount(){
        balance = 0.00;
    }
    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit (double amount){
        balance = balance + amount;
    }

    public void withdraw (double amount){
        balance -= amount;
    }
}