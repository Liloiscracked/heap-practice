public class Test4 {
    public static void main(String[] args) {
        System.out.println("Insert the required maximum key in the following AVL tree:");
        AVLTree<Integer> avlTree3 = new AVLTree<Integer>();
        Integer[]  array2 = new Integer []{32, 26, 54, 14, 30,44,27};
        for(int i = 0; i < array2.length ; i++)
            avlTree3.insertAVL(array2[i]);
        avlTree3.printTree();
        System.out.println("\nInsertion result: ");
        avlTree3.insertAVL(28);
        System.out.println();
        avlTree3.printTree();
        System.out.println("The answer is 28 because it will make node 30 unbalanced and to balance it we will need to rotate left by making 28 a father of 27 and then rotate right by making 28 a father of 27 and 30");
    }
}
