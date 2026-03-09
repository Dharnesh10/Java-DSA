class ReverseANumber {
    static int reversedNum = 0;
    public static void main(String[] args) {
        int res = reverseNumber(12345);
        System.out.println(res);
    }

    public static int reverseNumber(int n) {
        if(n == 0) {
            return reversedNum;
        }

        reversedNum = (reversedNum*10) + (n%10);

        return reverseNumber(n/10);
    }
}