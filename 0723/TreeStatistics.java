import java.util.*;

public class TreeStatistics {
    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        // 顯示節點資訊
        public void displayNode() {
            System.out.println("節點值: " + data);
            System.out.println("左子節點: " + (left != null ? left.data : "null"));
            System.out.println("右子節點: " + (right != null ? right.data : "null"));
        }
    }

    public static int sum(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return node.data + sum(node.left) + sum(node.right);
    }

    public static int max(TreeNode node) {
        if (node == null) {
            return Integer.MIN_VALUE;
        }
        return Math.max(node.data, Math.max(max(node.left), max(node.right)));
    }

    public static int min(TreeNode node) {
        if (node == null) {
            return Integer.MAX_VALUE;
        }
        return Math.min(node.data, Math.min(min(node.left), min(node.right)));
    }

    public static int countLeaves(TreeNode node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        return countLeaves(node.left) + countLeaves(node.right);
    }

    public static int depth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(depth(node.left), depth(node.right));
    }

    public static void main(String[] args) {
        // 建立節點
        TreeNode root = new TreeNode(10);
        TreeNode leftChild = new TreeNode(5);
        TreeNode rightChild = new TreeNode(15);

        // 建立樹的連結
        root.left = leftChild;
        root.right = rightChild;

        // 顯示樹的結構
        System.out.println("根節點資訊:");
        root.displayNode();

        System.out.println("\n左子節點資訊:");
        leftChild.displayNode();

        System.out.println("\n右子節點資訊:");
        rightChild.displayNode();

        // 計算樹的統計資訊
        System.out.println("\n樹中所有節點值的總和: " + sum(root));
        System.out.println("樹中的最大值: " + max(root));
        System.out.println("樹中的最小值: " + min(root));
        System.out.println("所有葉節點的數量: " + countLeaves(root));
        System.out.println("樹的深度（高度）: " + depth(root));

        // 建立更複雜的樹
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        leftChild.left = node1;
        leftChild.right = node2;
    }
}
