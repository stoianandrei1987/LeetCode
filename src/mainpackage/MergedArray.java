package mainpackage;

public class MergedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[m+n];
        int i = 0, j = 0;
        for (int t = 0; t < res.length ; t++) {
            if (j == n || (nums1[i] <= nums2[j] && i<m)) {
                res[t] = nums1[i];

                i++;
            } else if (i == m || (nums1[i] > nums2[j] && j<n)) {
                res[t] = nums2[j];

                j++;
            }
        }

        int count = 0;
        for(int k : res) {
            nums1[count] = k;
            count++;
        }
    }

    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 0, 0, 0};
        int[] num2 = {2, 5, 6};
        merge(num1, 3, num2, 3);
        for (int printInt:num1) {
            System.out.print(printInt + " ");
        };
    }
}
