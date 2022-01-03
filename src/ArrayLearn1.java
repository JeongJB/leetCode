public class ArrayLearn1 {
    public int findMaxConsecutiveOnes(int[] nums) {

        int cnt = 0;
        int cntMax = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                cnt++;
                if (cnt > cntMax) {
                    cntMax = cnt;
                }
            }
            else {
                cnt = 0;
            }
        }
        return cntMax;
    }
}
