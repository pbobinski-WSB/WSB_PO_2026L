package wsb.merito.po.start;

public class Start {

    public static void main(String[] args) {
        System.out.println("Hello");


        Grupa3 grupa3 = new Grupa3(3,"trzy");
        Grupa3 grupa3a = new Grupa3(4,"trzy");

        System.out.println(grupa3);
        System.out.println(grupa3a);
        System.out.println(grupa3a == grupa3);
        System.out.println(grupa3a.equals(grupa3));



    }
}
