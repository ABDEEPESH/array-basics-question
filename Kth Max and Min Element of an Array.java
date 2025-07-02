class Solution {
    public int[] findKthMaxMin(int[] arr, int k) {
        Arrays.sort(arr);
        return new int[]{arr[arr.length - k], arr[k - 1]}; // kth max, kth min
    }
}
