import java.util.*;

class CreateTree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int value) {
            this.val = value;
        }
    }

    public static TreeNode getTreeFromUser() {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();

        if(val == -1) return null;
        TreeNode root = new TreeNode(val);

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            TreeNode curr = queue.poll();

            System.out.println("Enter Left Value else for null enter -1: ");
            int leftVal = sc.nextInt();
            if(leftVal != -1) {
                curr.left = new TreeNode(leftVal);
                queue.add(curr.left);
            }

            System.out.println("Enter Right Value else for null enter -1: ");
            int rightVal = sc.nextInt();
            if(rightVal != -1) {
                curr.right = new TreeNode(rightVal);
                queue.add(curr.right);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        System.out.print(getTreeFromUser().val);
    }
}