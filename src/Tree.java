public class Tree{
    static int index = 0;

    // Root Node --> Left Node --> Right Node
    static Node createTree(int[] arr) {

        // base case
        if (index >= arr.length || arr[index] == -1) {
            index++;
            return null;
        }

        Node root = new Node(arr[index++]);

        root.left = createTree(arr);
        root.right = createTree(arr);

        return root;
    }
}