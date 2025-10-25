public class linkedlist {
    Node headNode;

    
    public linkedlist() {
        this.headNode = null;
    }

   public void insertFront(int data){
    Node newNode = new Node(data);
    if (headNode == null)
        headNode = newNode;
    else{
        newNode.next = headNode;
        headNode = newNode;
    }
}
    public int insertEnd(int data){
        Node newNode = new Node(data);
        Node Current = headNode;
        while(Current.next != null){
            Current = Current.next;
        }
        Current.next = newNode;
     return 0;    
    }
    public int insertAtPosition(int position, int data){
        Node newNode = new Node(data);
        Node Current = headNode;
        for(int i = 1 ; i < position ; i++){
            Current = Current.next;
        }
        newNode.next = Current.next;
        Current.next = newNode;
     return 0;    
    }
    public int deleteEnd(){
        Node Current = headNode;
        while(Current.next.next != null){
            Current = Current.next;
        }
        Current.next = null;
     return 0;    
    }
    public int deleteFront(){
        headNode = headNode.next;

     return 0;    
    }
    public int deleteBetween(int position){
        Node Current = headNode;
        for(int i = 1;i < position;i++){
            Current = Current.next;
        }
        Current.next = Current.next.next;
     return 0;    
    }
    public void display(){
        Node Current = headNode;
        while(Current != null){
            System.out.print(+Current.data + " -> ");
            Current = Current.next;
        }
        System.out.println("Null");
    }

}
