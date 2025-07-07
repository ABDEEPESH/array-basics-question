class Solution {
    public int minOperations(int[] arr) {
        int operations = 0;
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[left] != arr[right]) {
                arr[left] += arr[left + 1];
                operations++;
                for (int i = left + 1; i < right; i++) arr[i] = arr[i + 1];
                right--;
            } else {
                left++;
                right--;
            }
        }
        return operations;
    }
}
