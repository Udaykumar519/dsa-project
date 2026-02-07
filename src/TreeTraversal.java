import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeTraversal {

    // ---------- Inorder (Recursive) ----------
    static void inOrderTraversal(Node root, ArrayList<Integer> result) {
        if (root == null) return;
        inOrderTraversal(root.left, result);
        result.add(root.data);
        inOrderTraversal(root.right, result);
    }

    // ---------- Preorder ----------
    static void preOrderTraversal(Node root, ArrayList<Integer> result) {
        if (root == null) return;
        result.add(root.data);
        preOrderTraversal(root.left, result);
        preOrderTraversal(root.right, result);
    }

    // ---------- Postorder ----------
    static void postOrderTraversal(Node root, ArrayList<Integer> result) {
        if (root == null) return;
        postOrderTraversal(root.left, result);
        postOrderTraversal(root.right, result);
        result.add(root.data);
    }

    static void levelOrderTraversal(Node root, ArrayList<Integer> result){
        Queue<Node> treeNodeQueue = new LinkedList<>();

        treeNodeQueue.add(root);

        while(!treeNodeQueue.isEmpty()){
            Node treeNode = treeNodeQueue.poll();
            result.add(treeNode.data);

            if (treeNode.left != null){
                treeNodeQueue.add(treeNode.left);
            }

            if (treeNode.right != null){
                treeNodeQueue.add(treeNode.right);
            }
        }
    }

    // ---------- Inorder using Stack ----------
    static void inOrderTraversalStack(Node root, ArrayList<Integer> result) {
        Stack<Node> stack = new Stack<>();
        Node curr = root;

        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            result.add(curr.data);
            curr = curr.right;
        }
    }
}
