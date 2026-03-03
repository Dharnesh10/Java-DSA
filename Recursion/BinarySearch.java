class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {23, 45, 56, 23, 8, 12, 88, 9, 14, 73, 20, 11, 5};
        int target = 8; // op: 4
        int len = arr.length;
        int res = Search(arr, 0, len, target);
        System.out.print(res);
    }

    public static int Search(int[] arr, int start, int end, int target) {
        if(start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;

        if(arr[mid] == target) {
            return mid;
        }

        if(arr[mid] > target) {
            return Search(arr, start, end-1, target);
        } else {
            return Search(arr, start+1, end, target);
        }

    }
}