package wsb.merito.po.banking.tests;



import wsb.merito.po.banking.domain.*;
import wsb.merito.po.banking.reports.CustomerReport;

import java.io.File;
import java.util.*;
import java.util.regex.Pattern;

public class TestBanking
{

    public static List<String> findCustomerFiles (String path) {
        File folder = new File(path);
        List<String> files = new ArrayList<>();
        Pattern template = Pattern.compile("^Klient_[-]?\\d+\\.ser$");
        if (folder.exists() && folder.isDirectory()) {
            File[] files1 = folder.listFiles();
            if (files1 != null) {
                for (File plik : files1) {
                    if (plik.isFile() && template.matcher(plik.getName()).matches()) {
                        files.add(plik.getName());
                    }
                }
            }
        }
        return files;
    }

    public static void main(String[] args) {

        Bank bank = Bank.getBank();

        Customer klient1 = null;
        Customer klient2 = null;
        Account account = null;

        klient1 = new Customer("Simms", "Jane");
        account = new SavingsAccount(500, 2);
        klient1.addAccount(account);
        account = new CheckingAccount(200);
        klient1.addAccount(account);

        bank.addCustomer(klient1);

        klient2 = new Customer("Bryant", "Owen");
        account = new SavingsAccount(200, 5);
        klient2.addAccount(account);
        account = new CheckingAccount(1500);
        klient2.addAccount(account);
        account = new SavingsAccount(200, 10);
        klient2.addAccount(account);
        bank.addCustomer(klient2);

        CustomerReport customerReport = new CustomerReport();
        customerReport.generateReport();

    }


}
