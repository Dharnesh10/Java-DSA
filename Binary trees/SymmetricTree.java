class SymmetricTree {
    public static void main(String[] args) {

    }

    public static boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);

        while(!queue.isEmpty()) {
            TreeNode curr1 = queue.poll();
            TreeNode curr2 = queue.poll();

            if(curr1 == null && curr2 == null) {
                continue;
            }

            if(left == null || right == null) {
                return false;
            }

            if(curr1.val != curr2.val) (
                return false;
            )

            queue.add(curr1.left);
            queue.add(curr2.right);
            queue.add(curr1.right);
            queue.add(curr2.left);
        }

        return true;
    }
}