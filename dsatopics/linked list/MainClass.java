public class MainClass{
    public static void main(String[] args) {
        linkedlist2 obj = new linkedlist2();
        obj.insertFront(10);
        obj.insertFront(20);
        obj.insertFront(30);
        obj.insertFront(40);
        System.out.println("Insert the Front element");
        obj.display();
        obj.insertEnd(50);
        obj.insertEnd(100);
        obj.insertEnd(110);
        obj.insertEnd(87);
        obj.insertEnd(65);
        System.out.println("Insert at End");
        obj.display();
        obj.insertAtPosition(4, 55);
        System.out.println("value at 4");
        obj.display();
        obj.insertAtPosition(2, 25);
        System.out.println("value at 2");
        obj.display();
        obj.insertAtPosition(3, 35);
        System.out.println("value at 3");
        obj.display();
        obj.insertAtPosition(1, 3);
        System.out.println("Insert at Posistions 1");
        obj.display();
        
    }
}
