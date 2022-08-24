public class AccountTest {
    public static void main(String[] args) {
        BankAccount bank1 = new BankAccount(1000);
        bank1.deposit(100);
        System.out.println(bank1.getBalance());
        System.out.printf("The Current Balance is: $%.2f%n",bank1.getBalance());
        System.out.println("Looks like you have some work to do");
    }
}
