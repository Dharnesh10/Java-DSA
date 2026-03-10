class XpowN {
    public static void main(String[] args) {
        int res = findPowerOfXtoN(5, 2);
        System.out.println(res);
    }

    public static int findPowerOfXtoN(int x, int n) {
        if(n == 0) {
            return 1;
        }

        return x * findPowerOfXtoN(x, n - 1);
    }
}