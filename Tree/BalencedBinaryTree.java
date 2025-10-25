class Node{
        
        Node(int value){
            int data = value;
            Node left = null;
            Node right = null;
        }

    }

public class BalencedBinaryTree{
    
    Node root;

    public BalencedBinaryTree() {
        root = null;
    }

    public void insertkey(int value){
        root = insertkeyPrivate(root , value);
    }

    private Node insertkeyPrivate(Node root , int value){

        if(root == null){
            root = new Node(value);
            return root;
        }
        if(value < root.data){

        }
        return root;

    }

    



}   