class Solution {
    public void findUnionIntersection(int[] arr1, int[] arr2) {
        int m = arr1.length, n = arr2.length;
        int i = 0, j = 0;
        System.out.print("Union: ");
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) System.out.print(arr1[i++] + " ");
            else if (arr2[j] < arr1[i]) System.out.print(arr2[j++] + " ");
            else { System.out.print(arr1[i++] + " "); j++; }
        }
        while (i < m) System.out.print(arr1[i++] + " ");
        while (j < n) System.out.print(arr2[j++] + " ");
        System.out.print("\nIntersection: ");
        i = 0; j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) i++;
            else if (arr2[j] < arr1[i]) j++;
            else { System.out.print(arr1[i++] + " "); j++; }
        }
    }
}
