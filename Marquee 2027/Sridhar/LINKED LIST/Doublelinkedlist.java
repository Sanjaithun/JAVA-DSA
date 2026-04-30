
public class Doublelinkedlist {
    
    DNode HeaDNode;
    int length;

    public Doublelinkedlist() {
        this.HeaDNode = null;
    }

    public void insertatbegin(int data){
        DNode current = new DNode(data);
        DNode temp = HeaDNode;
        if(temp == null){
            HeaDNode = current;
            length++;
            return;
        }
        current.next = HeaDNode;
        HeaDNode.prev = current;
        HeaDNode = current;
        return;
    }

    public void reverse(){
        DNode traverse = HeaDNode;
        while(traverse.next != null){
            traverse = traverse.next;
        }
        while(traverse != null){
            System.out.print(traverse.data + " -> ");
            traverse = traverse.prev;
        }
        System.out.print("null");
    }

    public void print(){
        DNode traverse = HeaDNode;
        while(traverse != null){
            System.out.print(traverse.data + " -> ");
            traverse = traverse.next;
        }
        System.out.print("null");
    }

    public void insertatend(int data){
        DNode traverse = HeaDNode;
        DNode current = new DNode(data);

        while(traverse.next != null){
            traverse = traverse.next;
        }
        traverse.next = current;
        current.prev = traverse;
    }

    public void insertatpos(int pos , int data){
        DNode traverse = HeaDNode;
        DNode current = new DNode(data);

        for(int i = 0;i<pos - 1;i++){
            traverse = traverse.next;
        }
        current.next = traverse.next;
        traverse.next = current;
        current.prev = traverse;
        current.next.prev = current;
    }



    
}
