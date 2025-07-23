public class BSTKthElement {
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

    public static int kthSmallest(TreeNode root, int k) {
        int[] count = { 0 }; // 使用陣列來保持計數狀態
        return kthSmallestUtil(root, k, count);
    }

    private static int kthSmallestUtil(TreeNode node, int k, int[] count) {
        if (node == null) {
            return -1; // 如果節點為空，返回-1表示未找到
        }

        // 遞迴遍歷左子樹
        int left = kthSmallestUtil(node.left, k, count);
        if (left != -1) {
            return left; // 如果在左子樹中找到了第k小的元素，直接返回
        }

        // 計數當前節點
        count[0]++;
        if (count[0] == k) {
            return node.data; // 如果計數達到k，返回當前節點的值
        }

        // 遞迴遍歷右子樹
        return kthSmallestUtil(node.right, k, count);
    }

    public static void main(String[] args) {
        // 建立BST
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(8);

        // 顯示節點資訊
        root.displayNode();

        // 查找第k小的元素
        int k = 3; // 查找第3小的元素
        int result = kthSmallest(root, k);
        System.out.println("第 " + k + " 小的元素是: " + result);
    }
}
