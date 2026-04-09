public class Linkedlist {
    class Node{
        int data;
        Node next;
        Node(int value){
            this.data = value;
            this.next = null;
        }
    }
    Node head = null;
    public void insertatend(int value){
        Node temp = new Node(value);
        Node current = head;
        if(head == null){
            head = temp;
            return;
        }
        while(current.next != null){
            current = current.next;
        }
        current.next = temp;

    }
}
