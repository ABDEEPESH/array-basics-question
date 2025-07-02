class Solution {
    public void moveNegatives(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            if (arr[left] < 0) left++;
            else swap(arr, left, right--);
        }
    }
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
