class BasicProgram {
    public static void main(String[] args) {
        int n = 5;
        System.out.print(sumNumbers(n));
    }

    public static int sumNumbers(int n) {
        int sum = 0;
        if(n == 0) {
            return 0;
        }
        return n + sumNumbers(n-1);
    }
}