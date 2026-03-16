package wsb.merito.po.banking;

public class Customer {


    private final String firsName;
    private final String lastName;

    private Account account = null;

    public void setAccount(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public Customer(String firsName, String lastName) {
        this.firsName = firsName;
        this.lastName = lastName;
    }

    public String getFirsName() {
        return firsName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firsName='" + getFirsName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", account=" + account +
                '}';
    }
}
