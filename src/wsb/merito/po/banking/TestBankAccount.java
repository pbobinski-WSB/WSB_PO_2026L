package wsb.merito.po.banking;

import wsb.merito.po.banking.Account;

public class TestBankAccount {

    public static void main(String[] args) {

        Account account = new Account(100.50);
        System.out.println(account);
        account.withdraw(300);
        account.deposit(-50);
        System.out.println(account);
        account.withdraw(120);
        account.deposit(50);
        System.out.println(account);
    }

}
