import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();

        System.out.println(stack.isEmpty());

        stack.push("Minecraft");
        stack.push("Fortnite");
        stack.push("Roblox");
        stack.push("Among Us");

        System.out.println(stack.size());

        System.out.println(stack.peek());

        String myFavGame = stack.pop();
        System.out.println(myFavGame);
        
        System.out.println(stack.search("Fortnite")); // o/p: 3 (returns position from top of stack)
        System.out.println(stack.search("Fallout")); //returns -1 if not found

        //uses of stacks?
        // 1. Undo Mechanism in Text Editors
        // 2. moving back and forth in web browsers
        // 3. calling functions (function call stack)
        // 4. Backtracking algorithms (e.g., maze solving)

    }
}