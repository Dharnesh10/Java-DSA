class SumofArrayElements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int res = findSum(arr, arr.length-1);
        System.out.println(res);
    }

    public static int findSum(int[] arr, int len) {

        if(len == 0) {
            return arr[len];
        }

        return arr[len] + findSum(arr, len-1);
    }
}