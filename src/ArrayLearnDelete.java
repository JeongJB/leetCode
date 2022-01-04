public class ArrayLearnDelete {
    public int removeElement(int[] nums, int val) {
        int ptr = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[ptr++] = nums[i];
            }
        }
        return ptr;
    }

    public int removeDuplicates(int[] nums) {
        int ptr = 0;
        for (int i = 0; i < nums.length - 1;) {
            if (nums[i] == nums[i + 1]) {
                int num = 1;

                nums[ptr++] = nums[i];
                for (int j = i + 2; j < nums.length; j++) {
                    if (nums[j] == nums[i]) {
                        num++;
                    }
                    else break;
                }
                i += num + 1;

            }
            else {
                nums[ptr++] = nums[i++];
            }
        }

        if (nums.length == 1) {
            nums[ptr++] = nums[nums.length - 1];
        }
        if (nums.length > 0 && nums[ptr - 1] != nums[nums.length - 1]) {
            nums[ptr++] = nums[nums.length - 1];
        }
        return ptr;
    }
}
