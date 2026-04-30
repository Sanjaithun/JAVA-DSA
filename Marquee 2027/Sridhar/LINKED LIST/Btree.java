public class Btree {
    BTreeNode HeadBtree;

    public Btree() {
        HeadBtree = null;
    }

    void binarytree(int data){
        BTreeNode currenBtree = new BTreeNode(data);
        BTreeNode traverse = HeadBtree;
        if(traverse == null){
            traverse = currenBtree;
            return;
        }while(traverse != null){
        if(data > traverse.data){
            traverse.right = currenBtree;
        }
        else{
            traverse.left = currenBtree;
        }
    }
        return;
    }

    void callinorder(){
         BTreeNode traverse = HeadBtree;
         displayinorder(traverse);
    }

    void displayinorder(BTreeNode traverse){
       if(traverse == null){
        return;
       }
       displayinorder(traverse.left);
       System.out.println(traverse.data);
       displayinorder(traverse.right);

    }

    
}
