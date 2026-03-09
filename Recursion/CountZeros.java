class CountZeros {
    static int count = 0;
    public static void main(String[] args) {
        int res = countOfZeros(204010);
        System.out.println(res);
    }

    public static int countOfZeros(int num) {
        if(num == 0) {
            return count;
        }

        if(num % 10 == 0) {
            count++;
        }

        return countOfZeros(num / 10);
    }
}