public class Test {
    public static void main(String[] args) {
        System.out.println("Test program");
        System.out.println("DOUBLE RIGHT-LEFT ROTATION EXAMPLE: ");
        System.out.println("Insert 15 in the following AVL tree:");
        AVLTree<Integer> avlTree2 = new AVLTree<Integer>();
        Integer[]  array1 = new Integer []{5, 2, 7, 1, 4,6,9,3,16};
        for(int i = 0; i < array1.length ; i++)
            avlTree2.insertAVL(array1[i]);
        avlTree2.printTree();
        System.out.println("\nInsertion result: ");
        avlTree2.insertAVL(15);
        System.out.println();
        avlTree2.printTree();
    }
}
