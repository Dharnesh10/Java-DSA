// //Print sum of fibonacci nos using recursion
// class Fibonacci {
//     public static void main(String[] args) {
//         int n = 10;
//         int res = Fibo(n);
//         System.out.print(res);
//     }

//     public static int Fibo(int n) {
//         if (n == 0) {
//             return 0;
//         }
//         if (n == 1) {
//             return 1;
//         }
//         return Fibo(n - 1) + Fibo(n - 2);
//     }
// }


//print fibonacci nos using recursion
class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        printFibo(n, 0, 1);
    }

    public static void printFibo(int n, int a, int b) {
        if (n == 0) {
            return;
        }

        System.out.print(a + " ");
        printFibo(n - 1, b, a + b);
    }
}