import java.util.*;

public class F10_BSTRangeSum {
    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    static class BST {
        TreeNode root;

        public BST() {
            root = null;
        }

        public void insert(int data) {
            root = insertRec(root, data);
        }

        private TreeNode insertRec(TreeNode root, int data) {
            if (root == null)
                return new TreeNode(data);

            if (data < root.data) {
                root.left = insertRec(root.left, data);
            } else if (data > root.data) {
                root.right = insertRec(root.right, data);
            }

            return root;
        }

        public boolean search(int data) {
            return searchRec(root, data);
        }

        private boolean searchRec(TreeNode root, int data) {
            if (root == null)
                return false;
            if (root.data == data)
                return true;

            return data < root.data ? searchRec(root.left, data) : searchRec(root.right, data);
        }

        public void delete(int data) {
            root = deleteRec(root, data);
        }

        private TreeNode deleteRec(TreeNode root, int data) {
            if (root == null)
                return null;

            if (data < root.data) {
                root.left = deleteRec(root.left, data);
            } else if (data > root.data) {
                root.right = deleteRec(root.right, data);
            } else {
                if (root.left == null)
                    return root.right;
                if (root.right == null)
                    return root.left;

                root.data = findMin(root.right);
                root.right = deleteRec(root.right, root.data);
            }

            return root;
        }

        private int findMin(TreeNode root) {
            while (root.left != null)
                root = root.left;
            return root.data;
        }

        public void inOrder() {
            inOrderRec(root);
            System.out.println();
        }

        private void inOrderRec(TreeNode root) {
            if (root != null) {
                inOrderRec(root.left);
                System.out.print(root.data + " ");
                inOrderRec(root.right);
            }
        }

        public void levelOrder() {
            if (root == null)
                return;

            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);

            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                System.out.print(node.data + " ");

                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
            }
            System.out.println();
        }

        public int height() {
            return heightRec(root);
        }

        private int heightRec(TreeNode root) {
            if (root == null)
                return 0;
            return 1 + Math.max(heightRec(root.left), heightRec(root.right));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BST bst = new BST();

        System.out.println("Enter numbers to insert into BST (type 'done' to finish):");
        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                bst.insert(sc.nextInt());
            } else if (sc.next().equalsIgnoreCase("done")) {
                break;
            }
        }

        System.out.println("Enter range [L, R]:");
        int L = sc.nextInt();
        int R = sc.nextInt();

        int sum = rangeSum(bst.root, L, R);
        System.out.println("Sum of values in range [" + L + ", " + R + "] is: " + sum);
    }

    private static int rangeSum(TreeNode node, int L, int R) {
        if (node == null) {
            return 0;
        }

        // If current node's value is less than L, then only consider right subtree
        if (node.data < L) {
            return rangeSum(node.right, L, R);
        }
        // If current node's value is greater than R, then only consider left subtree
        else if (node.data > R) {
            return rangeSum(node.left, L, R);
        }
        // Current node's value is within the range [L, R]
        else {
            return node.data + rangeSum(node.left, L, R) + rangeSum(node.right, L, R);
        }
    }
}
