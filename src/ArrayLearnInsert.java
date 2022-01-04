public class ArrayLearnInsert {
    public void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                for (int j = arr.length - 2; j > i; j--) {
                    arr[j + 1] = arr[j];
                }
                arr[++i] = 0;
            }
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ptr1 = 0;
        int ptr2 = 0;
        int ptr = 0;
        int[] nums = new int[m + n];

        while (ptr < m + n) {
            int num1 = (ptr1 == m) ? Integer.MAX_VALUE : nums1[ptr1];
            int num2 = (ptr2 == n) ? Integer.MAX_VALUE : nums2[ptr2];

            if (num1 < num2) {
                nums[ptr++] = nums1[ptr1++];
            }
            else {
                nums[ptr++] = nums2[ptr2++];
            }
        }

        for (int i = 0; i < m + n; i++) {
            nums1[i] = nums[i];
        }
    }
}
