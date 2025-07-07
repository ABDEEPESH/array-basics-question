class Solution {
    public void threeWayPartition(int[] arr, int lowVal, int highVal) {
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] < lowVal) swap(arr, low++, mid++);
            else if (arr[mid] > highVal) swap(arr, mid, high--);
            else mid++;
        }
    }
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
