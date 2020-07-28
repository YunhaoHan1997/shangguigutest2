package BankAccount;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane","Smith");
        Account account = new Account(1000,2000,1.13);
        customer.setAccount(account);
        account.withdraw(100);
        System.out.println(customer.getAccountbalance());
    }
}
