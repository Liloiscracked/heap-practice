public class Test3 {
    public static void main(String[] args) {
        System.out.println("Insert the required maximum key in the following AVL tree:");
        AVLTree<Integer> avlTree3 = new AVLTree<Integer>();
        Integer[]  array2 = new Integer []{32, 26, 54, 14, 30,44,27};
        for(int i = 0; i < array2.length ; i++)
            avlTree3.insertAVL(array2[i]);
        avlTree3.printTree();
        System.out.println("\nInsertion result: ");
        avlTree3.insertAVL(43);
        System.out.println();
        avlTree3.printTree();
        System.out.println("The answer is 43 because it will make node 54 unbalanced and to balance it we will need to rotate right by making 44 a father of 43 and 54");
    }
}
