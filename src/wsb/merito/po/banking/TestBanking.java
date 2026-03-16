package wsb.merito.po.banking;

public class TestBanking
{

    public static void main(String[] args) {


        Customer klient = null;
        Account account = null;

        klient = new Customer("Simms", "Jane");
        account = new Account(500);
        klient.setAccount(account);

        System.out.println(klient);

        klient = new Customer("Bryant", "Owen");
        account = new Account(200);
        klient.setAccount(account);

        System.out.println(klient);

    }


}
