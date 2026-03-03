import java.util.ArrayList;

class PhoneNumberCombinationLC17 {
    public static void main(String[] args) {
        pad("", "12");
        System.out.println(padRet("", "12"));
    }

    public static void pad(String p, String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }

        int digit = up.charAt(0) - '0'; //converts '2' to 2

        for(int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i); // 0th loop - 97(a), 1st loop - 98(b), 2nd loop - 99(c)
            pad(p + ch, up.substring(1));
        }
    }

    public static ArrayList<String> padRet(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0'; //converts '2' to 2

        ArrayList<String> list = new ArrayList<>();

        for(int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i); // 0th loop - 97(a), 1st loop - 98(b), 2nd loop - 99(c)
            list.addAll(padRet(p + ch, up.substring(1)));
        }
        return list;
    }
}


//LC 17 with proper mapping
// import java.util.ArrayList;
// import java.util.List;

// class PhoneNumberCombinationLC17 {

//     static String[] mapping = {
//         "",     // 0
//         "",     // 1
//         "abc",  // 2
//         "def",  // 3
//         "ghi",  // 4
//         "jkl",  // 5
//         "mno",  // 6
//         "pqrs", // 7
//         "tuv",  // 8
//         "wxyz"  // 9
//     };

//     public static void main(String[] args) {
//         System.out.println(padRet("", "23"));
//     }

//     public static ArrayList<String> padRet(String p, String up) {
//         if (up.isEmpty()) {
//             ArrayList<String> list = new ArrayList<>();
//             list.add(p);
//             return list;
//         }

//         int digit = up.charAt(0) - '0';
//         String letters = mapping[digit];

//         ArrayList<String> list = new ArrayList<>();

//         for (int i = 0; i < letters.length(); i++) {
//             char ch = letters.charAt(i);
//             list.addAll(padRet(p + ch, up.substring(1)));
//         }

//         return list;
//     }
// }