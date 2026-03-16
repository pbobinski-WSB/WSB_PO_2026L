package wsb.merito.po.banking;


public class Account {

    private double balance;

    /**
     * Constructs a bank account with a zero balance.
     */
    public Account() {
        balance = 0;
    }

    /**
     * Constructs a bank account with a given balance.
     *
     * @param balance the initial balance
     */
    public Account(double balance) {
        this.balance = balance;
    }

    /**
     * Deposits money into the bank account.
     *
     * @param amount the amount to deposit
     */
    public void deposit (double amount) {
        balance += amount; // balance = balance + amount
    }

    /**
     * Withdraws money from the bank account.
     *
     * @param amount the amount to withdraw
     */
    public void withdraw (double amount) {
        balance -= amount; // balance = balance - amount
    }

    /**
     * Gets the current balance of the bank account.
     *
     * @return the current balance
     */
    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Wartość konta = " + this.balance;
    }

}


