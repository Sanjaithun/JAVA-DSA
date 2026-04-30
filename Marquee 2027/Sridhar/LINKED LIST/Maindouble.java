public class Maindouble {
    public static void main(String[] args) {
        Doublelinkedlist list = new Doublelinkedlist();
        list.insertatbegin(3);
        list.insertatbegin(2);
        list.insertatbegin(1);
        list.reverse();
        System.out.println();
        list.print();
        System.out.println();
        System.out.println();
        list.insertatend(10);
        list.print();
        System.out.println();
        list.reverse();
        System.out.println();
        list.insertatpos(3, 4);
        System.out.println();
        list.print();
        System.out.println();
        list.reverse();
        System.out.println();
        System.out.println();
    }
}
