import java.util.Scanner;
import java.util.Stack;

public class Tree{
    static Scanner sc = null;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = createTree();
        Node.inorder(root);
        Node.inorderStack(root);
    }

    // Root Node --> Left Node --> Right Node
    static Node createTree(){
        Node root = null;

        System.out.print("Enter data: ");
        int data = sc.nextInt();

        if (data == -1) return null;

        root = new Node(data);

        System.out.println("Enter left for: " + data);
        root.left = createTree();

        System.out.println("Enter right for:" + data);
        root.right = createTree();

        return root;
    }
}

class Node{
    Node left, right;
    int data;

    public Node(int data){
        this.data = data;
    }

    // Left Node --> Root Node --> Right Node
    static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Left Node --> Root Node --> Right Node (using Stack)
    static void inorderStack(Node root) {
        Stack<Node> inrdrStack = new Stack<>();
        Node currentNode = root;
        System.out.println();
        while (currentNode!=null || !inrdrStack.empty()){
            while (currentNode != null){
                inrdrStack.push(currentNode);
                currentNode = currentNode.left;
            }
            currentNode = inrdrStack.pop();
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.right;
        }
    }
}