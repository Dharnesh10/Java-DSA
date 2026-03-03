// class Subsequence {
//     public static void main(String[] args) {
//         subseq("", "abc");

//     }

//     static void subseq(String p, String up) {
//         if (up.isEmpty()) {
//             System.out.println(p); //if the up is empty it returns with a empty string " "
//             return;
//         }

//         char ch = up.charAt(0);

//         subseq(p + ch, up.substring(1));
//         subseq(p, up.substring(1));
//     }
// }

import java.util.ArrayList;

class Subsequence {

    public static void main(String[] args) {
        ArrayList<String> result = new ArrayList<>();
        subseq("", "abc", result);
        System.out.println(result);
    }

    static void subseq(String p, String up, ArrayList<String> list) {
        if (up.isEmpty()) {
            list.add(p);
            return;
        }

        char ch = up.charAt(0);

        subseq(p + ch, up.substring(1), list);
        subseq(p, up.substring(1), list);
    }
}