public class ArrayLearn2 {
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
}
