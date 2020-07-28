package BankAccount;

public class Customer {
    private String firstName;
    private String lastName;
    private Account account;


    public Customer(String f, String l){

        this.firstName = f;
        this.lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Account getAccount() {
        return account;
    }
    public double getAccountbalance() {
        return account.getBalance();
        //return this.account.getBalance()
    }
    public void setAccount(Account account) {
        this.account = account;
    }
}
