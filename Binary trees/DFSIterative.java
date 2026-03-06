class DFSIterative {
    public static void main(String[] args) {

    }

    void DFSPreOrderIterative(Node node) {
        if(node == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(node);

        while(!stack.isEmpty()) {
            Node removed = stack.pop();
            System.out.println(removed.val + " ");
            if(removed.right != null) { //push right first so left will be processed first, as it is pre order
                stack.push(removed.right);
            }
            if(removed.left != null) {
                stack.push(removed.left);
            }
        }
    }

    void DFSInOrderIterative(Node node) {
        Stack<Node> stack = new Stack<>();
        Node current = node;

        while(current != null || !stack.isEmpty()) {
            while(current != null) {
                stack.push(current);
                current = current.left;
            }

            Node removed = stack.pop();
            System.out.print(removed.val + " ");
            current = removed.right;
        }
    }

    void DFSPostOrderIterative(Node node) {
        if(node == null) {
            return;
        }

        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();

        stack1.push(node);

        while(!stack1.isEmpty()) {
            Node removed = stack1.pop();
            stack2.push(removed);

            if(removed.left != null) {
                stack1.push(removed.left);
            }

            if(removed.right != null) {
                stack1.push(removed.right);
            }
        }

        while(!stack2.isEmpty()) {
            System.out.print(stack2.pop().val + " ");
        }
    }
}