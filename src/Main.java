import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int[] arr = {2, 8, 3, -1, -1, 7, -1, -1, 4, -1, 1, 6, -1, -1, -1};
        Node root = Tree.createTree(arr);

        System.out.println("Tree created successfully..!");

        ArrayList<Integer> inorder = new ArrayList<>();
        TreeTraversal.inorder(root, inorder);
        System.out.println("Printing Inorder Traversal...");
        Util.printArrow(inorder);

        ArrayList<Integer> inorderStack = new ArrayList<>();
        TreeTraversal.inorderStack(root, inorderStack);
        System.out.println("Printing Inorder Traversal using Stack...");
        Util.printArrow(inorderStack);

        ArrayList<Integer> preorder = new ArrayList<>();
        TreeTraversal.preorder(root, preorder);
        System.out.println("Printing Preorder Traversal...");
        Util.printArrow(preorder);

        ArrayList<Integer> postorder = new ArrayList<>();
        TreeTraversal.postorder(root, postorder);
        System.out.println("Printing Postorder Traversal...");
        Util.printArrow(postorder);
    }
}