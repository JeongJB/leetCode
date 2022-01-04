public class ArrayLearnIntro {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0;
        int cntMax = 0;
        for (int num : nums) {
            if (num == 1) {
                cnt++;
                if (cnt > cntMax) {
                    cntMax = cnt;
                }
            } else {
                cnt = 0;
            }
        }
        return cntMax;
    }

    public int findNumbers(int[] nums) {
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = 0;
            while (nums[i] > 0) {
                num++;
                nums[i] /= 10;
            }
            if (num % 2 == 0) {
                cnt++;
            }
        }
        return cnt;
    }

    public int[] sortedSquares(int[] nums) {
        int ptr = 0;
        int minVal = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (minVal > nums[i] * nums[i]) {
                minVal = nums[i] * nums[i];
                ptr = i;
            }
        }

        int cnt = 0;
        int ptr1 = ptr;
        int ptr2 = ptr;
        int[] arrNum = new int[nums.length];

        arrNum[cnt++] = nums[ptr1] * nums[ptr1];
        ptr1--;
        ptr2++;

        while (cnt < arrNum.length) {
            int res1 = (ptr1 >= 0) ? nums[ptr1] * nums[ptr1] : Integer.MAX_VALUE;
            int res2 = (ptr2 < nums.length) ? nums[ptr2] * nums[ptr2] : Integer.MAX_VALUE;

            if (res1 <= res2) {
                arrNum[cnt++] = res1;
                ptr1--;
            }
            else {
                arrNum[cnt++] = res2;
                ptr2++;
            }
        }

        return arrNum;
    }
}
