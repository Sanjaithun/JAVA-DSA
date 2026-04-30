

public class binarytreemain {
    public static void main(String[] args) {
        Btree tree = new Btree();
        int[] datas = {40,20,32,15,63,87};
        for(int i = 0;i<datas.length;i++){
            tree.binarytree(datas[i]);
        }
        tree.callinorder();
         
    }
}
