public class ArrayLearnInPlace {
    public int[] replaceElements(int[] arr) {
        int[] res = new int[arr.length];
        int numMax = -1;
        res[arr.length - 1] = numMax;

        for (int i = res.length - 2; i >= 0; i--) {
            if (arr[i + 1] > numMax) {
                res[i] = arr[i + 1];
                numMax = arr[i + 1];
            }
            else {
                res[i] = numMax;
            }
        }
        return res;
    }

    public int removeDuplicates(int[] nums) {
        int ptr1 = 1;
        for (int ptr2 = 1; ptr2 < nums.length; ptr2++) {
            if (nums[ptr2] != nums[ptr2 - 1]) {
                nums[ptr1] = nums[ptr2];
                ptr1++;
            }
        }

        return (nums.length == 0) ? 0 : ptr1;
    }
}
