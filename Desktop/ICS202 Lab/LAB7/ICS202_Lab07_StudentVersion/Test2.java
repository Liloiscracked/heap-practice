public class Test2 {
    public static void main(String[] args) {
        AVLTree<Integer> avlTree2 = new AVLTree<Integer>();
        Integer[]  array1 = new Integer []{7, 2, 15, 1, 3,10,17,5,9,13,18,11};
        for(int i = 0; i < array1.length ; i++)
            avlTree2.insertAVL(array1[i]);
        avlTree2.printTree();
        System.out.println("\nDeletion result of 1");
        avlTree2.deleteAVL(1);
        System.out.println();
        avlTree2.printTree();
    }
}
