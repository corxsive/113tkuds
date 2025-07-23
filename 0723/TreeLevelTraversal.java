import java.util.*;

public class TreeLevelTraversal {
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
            // System.out.println("左子節點: " + (left != null ? left.data : "null"));
            // System.out.println("右子節點: " + (right != null ? right.data : "null"));
        }
    }

    public static void main(String[] args) {
        // 建立節點
        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(30);
        root.right = new TreeNode(70);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(40);
        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(80);
        root.right.right.right = new TreeNode(100);

        List<List<TreeNode>> levels = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean leftToRight = true; // 標記當前層的遍歷
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<TreeNode> currentLevel = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                if (node != null) {
                    currentLevel.add(node);
                    if (node.left != null)
                        queue.add(node.left);
                    if (node.right != null)
                        queue.add(node.right);
                }
            }
            if (!currentLevel.isEmpty()) {
                if (!leftToRight) {
                    Collections.reverse(currentLevel); // 反轉當前層的節點順序
                }
                levels.add(currentLevel);
            }
            leftToRight = !leftToRight; // 交替方向
        }
        // 印出每一層的最後一個節點
        for (List<TreeNode> level : levels) {
            if (!level.isEmpty()) {
                TreeNode lastNode = level.get(level.size() - 1);
                System.out.println("最後一個節點: " + lastNode.data);
            }
        }
    }
}
