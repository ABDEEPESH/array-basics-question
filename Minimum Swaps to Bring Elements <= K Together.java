class Solution {
    public int minSwaps(int[] arr, int k) {
        int count = 0;
        for (int num : arr) if (num <= k) count++;
        int bad = 0;
        for (int i = 0; i < count; i++) if (arr[i] > k) bad++;
        int minSwaps = bad;
        for (int i = 0, j = count; j < arr.length; i++, j++) {
            if (arr[i] > k) bad--;
            if (arr[j] > k) bad++;
            minSwaps = Math.min(minSwaps, bad);
        }
        return minSwaps;
    }
}
