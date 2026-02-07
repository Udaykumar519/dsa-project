import java.util.ArrayList;
import java.util.Stack;

public class TreeTraversal {

    // ---------- Inorder (Recursive) ----------
    static void inorder(Node root, ArrayList<Integer> result) {
        if (root == null) return;
        inorder(root.left, result);
        result.add(root.data);
        inorder(root.right, result);
    }

    // ---------- Preorder ----------
    static void preorder(Node root, ArrayList<Integer> result) {
        if (root == null) return;
        result.add(root.data);
        preorder(root.left, result);
        preorder(root.right, result);
    }

    // ---------- Postorder ----------
    static void postorder(Node root, ArrayList<Integer> result) {
        if (root == null) return;
        postorder(root.left, result);
        postorder(root.right, result);
        result.add(root.data);
    }

    // ---------- Inorder using Stack ----------
    static void inorderStack(Node root, ArrayList<Integer> result) {
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
