public class CheckingAccount extends BankAccount{
    private int transactionCount;

    public CheckingAccount() {
        transactionCount = 0;
    }

    public CheckingAccount(double initialAmount){
        super(initialAmount);
    }

    public void withdraw(double amount){
        super.withdraw(amount);
        transactionCount++;
    }

    public void deductFees() {
        if (transactionCount > 10) {
            double fee = transactionCount * .10;
            super.withdraw(fee);
        }
    }

    public int getTransactionCount(){
        return transactionCount;
    }
}
