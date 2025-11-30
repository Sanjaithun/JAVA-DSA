public class linkedlist2{

    class Node{

        int value;
        Node next;
        Node(int val){
            this.value = val;
            this.next = null;
        }
    }

    Node HeadNode;

    public linkedlist2() {
        HeadNode = null;
    }

    void insertFront(int val){
        Node newNode = new Node(val);
        if(HeadNode == null){
            HeadNode = newNode;
        }
        else{
            newNode.next = HeadNode;
            HeadNode = newNode;
        }
    }

    void insertEnd(int val){

        Node newNode = new Node(val);
        if(HeadNode == null){
            HeadNode = newNode;
            return;
        }
        Node Current = HeadNode;

        while(Current.next != null){
            Current = Current.next;
        }
        Current.next = newNode;
    }
    
    void insertAtPosition(int pos,int val){

        Node newNode = new Node(val);
        Node CurrentNode = HeadNode;
        
        for(int i = 0;i<pos-1;i++){
            CurrentNode = CurrentNode.next;
        }
        newNode.next = CurrentNode.next;
        CurrentNode.next = newNode;
    }

    void display(){
        Node CurrentNode = HeadNode;
        while(CurrentNode != null){
            System.out.print(CurrentNode.value + " -> ");
            CurrentNode = CurrentNode.next;
    
        }
        System.out.println();
    }

}