import java.util.*;

public class BSTRangeQuery {
    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        // 建立測試樹
        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(10);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(15);
        root.right.left = new TreeNode(25);
        root.right.right = new TreeNode(35);

        // 查詢範圍
        int min = 12;
        int max = 27;
        ArrayList<Integer> result = rangeQuery(root, min, max);

        System.out.println("範圍 [" + min + ", " + max + "] 內的節點值: " + result);
    }

    public static ArrayList<Integer> rangeQuery(TreeNode node, int min, int max) {
        ArrayList<Integer> result = new ArrayList<>();
        rangeQueryHelper(node, min, max, result);
        return result;
    }

    private static void rangeQueryHelper(TreeNode node, int min, int max, ArrayList<Integer> result) {
        if (node == null) {
            return;
        }

        // 遞迴左子樹
        if (node.data > min) {
            rangeQueryHelper(node.left, min, max, result);
        }

        // 如果節點值在範圍內，加入結果
        if (node.data >= min && node.data <= max) {
            result.add(node.data);
        }

        // 遞迴右子樹
        if (node.data < max) {
            rangeQueryHelper(node.right, min, max, result);
        }
    }
}