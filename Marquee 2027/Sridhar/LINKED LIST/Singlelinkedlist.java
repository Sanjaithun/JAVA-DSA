public class Singlelinkedlist {
    Node HeadNode;
    int length;

    public Singlelinkedlist() {
        this.HeadNode = null;
    }

    public void insertatbegin(int data){
        Node current = new Node(data);
        current.next = HeadNode;
        HeadNode = current;
        length++;
    }

    public void insertatend(int data){
        Node current = new Node(data);
        Node traverse = HeadNode;

        if(HeadNode == null){
            current.next = HeadNode;
            HeadNode = current;
            length++;
            return;
        }

        while(traverse.next != null){
            traverse = traverse.next;
        }
        traverse.next = current;
        length++;
    }

    public void insertatposition(int data , int pos){
        Node current = new Node(data);
        Node traverse = HeadNode;
        for(int i = 0;i < pos-1;i++){
            traverse = traverse.next;
        }
        current.next = traverse.next;
        traverse.next = current;
        length++;
    }

    public void print(Singlelinkedlist Nodes){
        Node temp = HeadNode;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public void delectatbegin(){
        HeadNode = HeadNode.next;
        length--;
    }

    public void delectatend(){
        Node traverse = HeadNode;

        while(traverse.next.next != null){
            traverse = traverse.next;
         }
         traverse.next = null;
         length--;
    }

    public void delectatpos(int pos){
        Node traverseNode = HeadNode;
        for(int i = 0;i<pos - 1 ;i++){
            traverseNode = traverseNode.next;
        }
        traverseNode.next = traverseNode.next.next;
        length--;
    }    
}
