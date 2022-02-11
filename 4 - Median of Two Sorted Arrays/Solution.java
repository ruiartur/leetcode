class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int i = 0, j = 0, index = 0;
        int[] ra = new int[(nums1.length + nums2.length)];
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                ra[index] = nums1[i];
                i++;
            } else {
                ra[index] = nums2[j];
                j++;
            }
            index++;
        }

        while (i < nums1.length) {
            ra[index] = nums1[i];
            i++;
            index++;
        }

        while (j < nums2.length) {
            ra[index] = nums2[j];
            j++;
            index++;
        }
        int size = ra.length;
        if (size % 2 == 0) {
            int pos1 = size / 2;
            int pos2 = pos1 - 1;
            int res = ra[pos1] + ra[pos2];
            return (res / 2.0);
        } else {
            int pos1 = ((size - 1) / 2);
            return ra[pos1];
        }
}
