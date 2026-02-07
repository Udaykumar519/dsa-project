import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int[] arr = {2, 8, 3, -1, -1, 7, -1, -1, 4, -1, 1, 6, -1, -1, -1};
        Node root = Tree.createTree(arr);

        System.out.println("Tree Created Successfully..!");

        ArrayList<Integer> inOrder = new ArrayList<>();
        TreeTraversal.inOrderTraversal(root, inOrder);
        System.out.println("====Printing Inorder Traversal====");
        Util.printArrow(inOrder);

        ArrayList<Integer> inOrderStack = new ArrayList<>();
        TreeTraversal.inOrderTraversalStack(root, inOrderStack);
        System.out.println("====Printing Inorder Traversal using Stack====");
        Util.printArrow(inOrderStack);

        ArrayList<Integer> preOrder = new ArrayList<>();
        TreeTraversal.preOrderTraversal(root, preOrder);
        System.out.println("====Printing PreOrder Traversal====");
        Util.printArrow(preOrder);

        ArrayList<Integer> postOrder = new ArrayList<>();
        TreeTraversal.postOrderTraversal(root, postOrder);
        System.out.println("====Printing PostOrder Traversal====");
        Util.printArrow(postOrder);

        ArrayList<Integer> levelOrder = new ArrayList<>();
        TreeTraversal.levelOrderTraversal(root, levelOrder);
        System.out.println("====Printing LevelOrder Traversal====");
        Util.printArrow(levelOrder);
    }
}