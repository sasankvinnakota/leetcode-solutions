class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] arr = new int[m + n];
        int n1c = 0, n2c = 0;
        int i = 0;

        if (n > m) {
            while (n1c < n && n2c<m) {
                if (nums1[n1c] < nums2[n2c]) {
                    arr[i] = nums1[n1c];
                    n1c++;
                    i++;
                } else {
                    arr[i] = nums2[n2c];
                    n2c++;
                    i++;
                }
            }
        } else {
            while (n2c < m && n1c<n) {
                if (nums1[n1c] < nums2[n2c]) {
                    arr[i] = nums1[n1c];
                    n1c++;
                    i++;
                } else {
                    arr[i] = nums2[n2c];
                    n2c++;
                    i++;
                }
            }
        }

        while (n1c < n) {
            arr[i] = nums1[n1c];
            n1c++;
            i++;
        }

        while (n2c < m) {
            arr[i] = nums2[n2c];
            n2c++;
            i++;
        }

        int len = arr.length;
        double median = 0;
        if (len % 2 == 0) {
            median = (arr[len / 2] + arr[len / 2 - 1]) / 2.0;
        } else {
            median = arr[len / 2];
        }

        return median;
    }
}