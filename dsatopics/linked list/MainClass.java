public class MainClass{
    public static void main(String[] args) {
        linkedlist obj = new linkedlist();
        obj.insertFront(10);
        obj.insertFront(20);
        obj.insertFront(30);
        obj.insertFront(40);
        obj.insertEnd(50);
        obj.display();
        obj.insertEnd(100);
        obj.insertEnd(110);
        obj.insertAtPosition(2, 25);
        obj.display();
        obj.insertAtPosition(3, 35);
        obj.insertEnd(87);
        obj.display();
        obj.insertAtPosition(4, 45);
        obj.insertEnd(65);
        obj.display();
        obj.insertAtPosition(4, 55);
        obj.display();
        obj.deleteFront();
        obj.deleteEnd();
        obj.deleteBetween(2);
        obj.display();
    }
}
