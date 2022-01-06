package ArrayLearn;

import java.util.ArrayList;
import java.util.List;

public class ArrayLearnConclusion {
    public int heightChecker(int[] heights) {
        int[] expected = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            expected[i] = heights[i];
        }

        for (int i = 0; i < expected.length; i++) {
            for (int j = i + 1; j < expected.length; j++) {
                if (expected[i] > expected[j]) {
                    int num = expected[i];
                    expected[i] = expected[j];
                    expected[j] = num;
                }
            }
        }

        int cnt = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                cnt++;
            }
        }
        return cnt;
    }

    public int thirdMax(int[] nums) {
        int[] res = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        int[] idx = {0, 0, 0};
        for (int j = 0; j < res.length; j++) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] >= res[j]) {
                    if (j == 0) {
                        res[j] = nums[i];
                        idx[j] = 1;
                    }
                    else if (nums[i] < res[j - 1]) {
                        res[j] = nums[i];
                        idx[j] = 1;
                    }
                }
            }
        }

        return (idx[2] == 0) ? res[0] : res[2];
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] idx = new int[nums.length + 1];
        ArrayList<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < idx.length; i++) {
            idx[i] = 0;
        }

        for (int i = 0; i < nums.length; i++) {
            idx[nums[i]] = 1;
        }

        for (int i = 1; i < idx.length; i++) {
            if (idx[i] == 0) {
                res.add(i);
            }
        }
        return res;
    }
}
