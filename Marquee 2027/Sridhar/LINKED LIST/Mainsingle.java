public class Mainsingle{
    public static void main(String[] args) {
        Singlelinkedlist list = new Singlelinkedlist();
        list.insertatbegin(4);
        list.insertatbegin(3);
        list.insertatbegin(2);
        list.insertatbegin(1);
        list.insertatend(5);
        list.insertatposition(4, 4);
        list.insertatposition(2, 2);
        list.delectatbegin();
        list.delectatend();
        System.out.println(list.length);
        list.delectatpos(2);
        System.out.println(list.length);

        list.print(list);
    }   
}
