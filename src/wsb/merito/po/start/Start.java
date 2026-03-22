package wsb.merito.po.start;

import wsb.merito.po.banking.Account;

public class Start {

    public static void main(String[] args) {
        System.out.println("Hello");

/*
        Grupa3 grupa3 = new Grupa3(3,"trzy");
        Grupa3 grupa3a = new Grupa3(4,"trzy");

        System.out.println(grupa3);
        System.out.println(grupa3a);
        System.out.println(grupa3a == grupa3);
        System.out.println(grupa3a.equals(grupa3));


        Grupa1 grupa1 = new Grupa1(1,"jeden");
        Grupa1 grupa1a = new Grupa1(1,"jeden");

        System.out.println(grupa1);
        System.out.println(grupa1a);
        System.out.println(grupa1 == grupa1a);
        System.out.println(grupa1.equals(grupa1a));
*/

        Grupa2 grupa2 = new Grupa2(2, "dwa");
        Grupa2 grupa2a = new Grupa2(2, "dwa");

        System.out.println(grupa2);
        System.out.println(grupa2a);

        System.out.println(grupa2 == grupa2a);
        System.out.println(grupa2.equals(grupa2a));


    }
}
