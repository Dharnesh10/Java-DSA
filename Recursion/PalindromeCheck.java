class PalindromeCheck {
    public static void main(String[] args) {
        // Note: "racecar" is a palindrome; "reacecar" is not!
        boolean res = isPalindrome("racecar"); 
        
        if(res) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }

        char st = str.charAt(0);
        char en = str.charAt(str.length() - 1);

        if (st == en) {
            return isPalindrome(str.substring(1, str.length() - 1));
        }

        return false;
    }
}