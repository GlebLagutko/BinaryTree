package gleb;

public class Main {
    public static void main(String[] args){

        BinaryTree<Integer> tree = new BinaryTree<>();
        tree.add(7);
        tree.add(4);
        tree.add(3);
        tree.add(1);
        tree.add(5);
        tree.add(6);
        tree.add(12);
        tree.add(11);
        tree.add(14);
        tree.add(13);
        tree.add(15);
        tree.add(16);
        tree.goLeftRootRight();
        tree.goRootLeftRight();
        tree.gotLeftRightRoot();
        tree.search(5);
        tree.search(17);
        tree.add(17);
        tree.add(0);
    }
}
